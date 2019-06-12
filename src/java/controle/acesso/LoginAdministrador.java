package controle.acesso;

import dominio.entidades.Administrador;
import dominio.entidades.Evento;
import dominio.entidades.Ingresso;
import static infraestrutura.dao.AdministradorDAO.loginAdministrador;
import static infraestrutura.dao.EventoDAO.ConsultarEventos;
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
@WebServlet("/acesso/login/administrador")
public class LoginAdministrador extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    public LoginAdministrador(){
        super();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sessao = request.getSession();
        
        if (sessao.getAttribute("id") != null) {
            request.getRequestDispatcher("/index").forward(request, response);
        } else {
            request.getRequestDispatcher("/login-administrador.jsp").forward(request, response);
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        Administrador administrador = loginAdministrador(email, senha);

        if (administrador == null) {
            request.setAttribute("erro", "Não identificamos nenhum usuário ou senha com os valores informados. Tente novamente ou cadastre-se");
            request.getRequestDispatcher("/login-administrador.jsp").forward(request, response);
        } else {
            HttpSession sessao = request.getSession();
            List<Evento> eventos = ConsultarEventos();
            sessao.setAttribute("id", administrador.getId());
            request.setAttribute("eventos", eventos);
            request.getRequestDispatcher("/eventos-disponiveis-adm.jsp").forward(request, response);
        }
    }
}