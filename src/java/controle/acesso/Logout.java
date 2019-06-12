package controle.acesso;

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
@WebServlet("/acesso/logout")
public class Logout extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    public Logout(){
        super();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sessao = request.getSession();
        
        if (sessao.getAttribute("id") != null) {
            sessao.invalidate();
        }
        request.getRequestDispatcher("/inicio.jsp").forward(request, response);
    }
}