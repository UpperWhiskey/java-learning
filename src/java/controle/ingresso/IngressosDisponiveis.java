package controle.ingresso;

import dominio.entidades.Ingresso;
import static infraestrutura.dao.IngressoDAO.ConsultarIngressosDisponiveis;
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
@WebServlet("/ingressos-disponiveis")
public class IngressosDisponiveis extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    public IngressosDisponiveis(){
        super();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sessao = request.getSession();
        
        if (sessao.getAttribute("id") == null) {
            request.getRequestDispatcher("/inicio.jsp").forward(request, response);
        } else {
            List<Ingresso> ingressosDisponiveis = ConsultarIngressosDisponiveis();
            request.setAttribute("ingressos", ingressosDisponiveis);
            request.getRequestDispatcher("/ingressos-disponiveis.jsp").forward(request, response);
        }
    }
}