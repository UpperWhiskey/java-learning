package controle.acesso;

import dominio.entidades.Cliente;
import dominio.entidades.Ingresso;
import static infraestrutura.dao.ClienteDAO.loginCliente;
import static infraestrutura.dao.IngressoDAO.ConsultarIngressosDisponiveis;
import static infraestrutura.dao.IngressoDAO.ConsultarIngressosIndisponiveis;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Leonardo
 */
@WebServlet("/acesso/login/cliente")
public class LoginCliente extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    public LoginCliente(){
        super();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sessao = request.getSession();
        
        if (sessao.getAttribute("id") != null) {
            request.getRequestDispatcher("/index").forward(request, response);
        } else {
            request.getRequestDispatcher("/login-cliente.jsp").forward(request, response);
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        Cliente cliente = loginCliente(email, senha);

        if (cliente == null) {
            request.setAttribute("erro", "Não identificamos nenhum usuário ou senha com os valores informados. Tente novamente ou cadastre-se");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            HttpSession sessao = request.getSession();
            List<Ingresso> ingressos = ConsultarIngressosDisponiveis();
            sessao.setAttribute("id", cliente.getId());
            request.setAttribute("ingressos", ingressos);
            request.getRequestDispatcher("/ingressos-disponiveis-cliente.jsp").forward(request, response);
        }
    }
}