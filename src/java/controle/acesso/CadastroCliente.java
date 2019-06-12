package controle.acesso;

import dominio.entidades.Cliente;
import static infraestrutura.dao.ClienteDAO.CadastrarCliente;
import static infraestrutura.dao.ClienteDAO.loginCliente;
import java.io.IOException;
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
@WebServlet("/acesso/cadastro/cliente")
public class CadastroCliente extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    public CadastroCliente(){
        super();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sessao = request.getSession();
        
        if (sessao.getAttribute("id") != null) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/cadastro-cliente.jsp").forward(request, response);
        } 
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        Cliente cliente = loginCliente(email, senha);
        
        if (cliente != null) {
            request.setAttribute("erro", "Identificamos que já existe um registro com esses dados no sistema. Tente cadastrar um novo usuário ou realize o login");
            request.getRequestDispatcher("/login-cliente.jsp").forward(request, response);
        } else {
            cliente = new Cliente(nome, email, senha);
            CadastrarCliente(cliente);
            
            HttpSession sessao = request.getSession();
            sessao.setAttribute("id", cliente.getId());
            request.setAttribute("cliente", cliente);
            request.getRequestDispatcher("/ingressos-disponiveis").forward(request, response);
        }
    }
}