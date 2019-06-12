package controle.evento;

import dominio.entidades.Evento;
import dominio.entidades.Ingresso;
import static infraestrutura.dao.EventoDAO.CadastrarEvento;
import static infraestrutura.dao.EventoDAO.ConsultarEventos;
import static infraestrutura.dao.EventoDAO.getEvento;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet("/evento/criar")
public class CriarEvento extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    public CriarEvento(){
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sessao = request.getSession();
        
        if (sessao.getAttribute("id") == null) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/criar-evento.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String nome = request.getParameter("nome");
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String dataString = request.getParameter("data");
            Date data = (Date)formatter.parse(dataString);
            
            Evento evento = new Evento(data, nome);
            
            CadastrarEvento(evento);
            
            List<Evento> eventos = ConsultarEventos();

            request.setAttribute("eventos", eventos);
            request.getRequestDispatcher("/eventos-disponiveis-adm.jsp").forward(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(CriarEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
