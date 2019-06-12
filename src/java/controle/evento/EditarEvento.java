package controle.evento;

import dominio.entidades.Evento;
import static infraestrutura.dao.EventoDAO.AtualizarEvento;
import static infraestrutura.dao.EventoDAO.ConsultarEventos;
import static infraestrutura.dao.EventoDAO.getEvento;
import java.io.IOException;
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
@WebServlet("/evento/editar")
public class EditarEvento extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    public EditarEvento(){
        super();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sessao = request.getSession();
        
        if (sessao.getAttribute("id") == null) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else {
            UUID id = UUID.fromString(request.getParameter("id"));
            Evento evento = getEvento(id);
            request.setAttribute("evento", evento);
            request.getRequestDispatcher("/editar-evento.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            UUID id = UUID.fromString(request.getParameter("id"));
            String nome = request.getParameter("nome");
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String dataString = request.getParameter("data");
            Date data = (Date)formatter.parse(dataString);
            
            Evento evento = getEvento(id);
            
            evento.setData(data);
            evento.setNome(nome);
            
            AtualizarEvento(evento);
            
            List<Evento> eventos = ConsultarEventos();
            
            request.setAttribute("eventos", eventos);
            request.getRequestDispatcher("/eventos-disponiveis-adm.jsp").forward(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(EditarEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
