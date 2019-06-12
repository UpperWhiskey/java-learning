package controle.acesso;

import dominio.entidades.Administrador;
import static infraestrutura.dao.AdministradorDAO.CadastrarAdministrador;
import static infraestrutura.dao.AdministradorDAO.loginAdministrador;
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

@WebServlet("/acesso/cadastro/administrador")
public class CadastroAdministrador extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    public CadastroAdministrador(){
        super();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sessao = request.getSession();
        
        if (sessao.getAttribute("id") != null) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/cadastro-administrador.jsp").forward(request, response);
        } 
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        Administrador administrador = loginAdministrador(email, senha);
        
        if (administrador != null) {
            request.setAttribute("erro", "Identificamos que já existe um registro com esses dados no sistema. Tente cadastrar um novo usuário ou realize o login");
            request.getRequestDispatcher("/login-administrador.jsp").forward(request, response);
        } else {
            administrador = new Administrador(nome, email, senha);
            CadastrarAdministrador(administrador);
            
            HttpSession sessao = request.getSession();
            sessao.setAttribute("id", administrador.getId());
            request.setAttribute("administrador", administrador);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }
}