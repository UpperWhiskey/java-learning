package infraestrutura.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.entidades.Evento;
import java.util.UUID;

public class EventoDAO {

    public static void CadastrarEvento(Evento evento) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(evento);

        em.getTransaction().commit();

        em.close();
    }

    public static void AtualizarEvento(Evento evento) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.merge(evento);

        em.getTransaction().commit();

        em.close();
    }

    public static List<Evento> ConsultarEventos() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");
        
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        List<Evento> eventos = em.createNamedQuery("Evento.findAll").getResultList();

        return eventos;
    }

    public static Evento getEvento(UUID id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");
        
        EntityManager em = emf.createEntityManager();

        List<Evento> eventos;

        em.getTransaction().begin();

        Query q;
        q = em.createNamedQuery("Evento.findById");
        q.setParameter("id", id);
        em.getTransaction().commit();
        eventos = q.getResultList();

        em.close();

        if (eventos.isEmpty()) {
            return null;
        }

        return eventos.get(0);
    }

    public static void removerEvento(Evento evento) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Evento resultado = em.find(Evento.class, evento.getId());
        em.remove(resultado);

        em.getTransaction().commit();
        em.close();
    }
}