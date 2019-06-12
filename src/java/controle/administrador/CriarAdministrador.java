package controle.administrador;

import dominio.entidades.Administrador;
import static infraestrutura.dao.AdministradorDAO.CadastrarAdministrador;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

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

@WebServlet("/administrador/criar")
public class CriarAdministrador extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    public CriarAdministrador(){
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String nome = request.getParameter("nome");
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            
            Administrador administrador = new Administrador(nome, email, senha);
            CadastrarAdministrador(administrador);
            
            request.setAttribute("administrador", administrador);
            
            HttpSession sessao = request.getSession();
            sessao.setAttribute("id", administrador.getId());
            request.setAttribute("administrador", administrador);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}