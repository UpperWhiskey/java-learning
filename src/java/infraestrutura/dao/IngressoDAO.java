package infraestrutura.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.entidades.Ingresso;
import java.util.UUID;

public class IngressoDAO {

    public static void CadastrarIngresso(Ingresso ingresso) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(ingresso);

        em.getTransaction().commit();

        em.close();
    }

    public static List<Ingresso> ConsultarIngressos() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");
        
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        List<Ingresso> ingressos = em.createNamedQuery("Ingresso.findAll").getResultList();

        return ingressos;
    }
    
    public static List<Ingresso> ConsultarIngressosDisponiveis(){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");
        
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        List<Ingresso> ingressos = em.createNamedQuery("Ingresso.findDisponiveis").getResultList();

        return ingressos;
    }
    
    public static List<Ingresso> ConsultarIngressosIndisponiveis(){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");
        
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        List<Ingresso> ingressos = em.createNamedQuery("Ingresso.findIndisponiveis").getResultList();

        return ingressos;
    }

    public static Ingresso getIngresso(UUID id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");
        
        EntityManager em = emf.createEntityManager();

        List<Ingresso> ingressos;

        em.getTransaction().begin();

        Query q;
        q = em.createNamedQuery("Ingresso.findById");
        q.setParameter("id", id);
        em.getTransaction().commit();
        ingressos = q.getResultList();

        em.close();

        if (ingressos.isEmpty()) {
            return null;
        }

        return ingressos.get(0);
    }

    public static void removerIngresso(Ingresso ingresso) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Ingresso resultado = em.find(Ingresso.class, ingresso.getId());
        em.remove(resultado);

        em.getTransaction().commit();
        em.close();
    }
}