package controle.ingresso;

import dominio.entidades.Ingresso;
import dominio.entidades.Evento;
import static infraestrutura.dao.IngressoDAO.CadastrarIngresso;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leonardo
 */
@WebServlet("/ingresso")
public class CriarIngresso extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    public CriarIngresso(){
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }
}
