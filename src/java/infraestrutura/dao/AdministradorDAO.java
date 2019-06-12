package infraestrutura.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.entidades.Administrador;

public class AdministradorDAO {

    public static void CadastrarAdministrador(Administrador administrador) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(administrador);

        em.getTransaction().commit();

        em.close();
    }
    public static void AtualizarAdministrador(Administrador administrador) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(administrador);

        em.getTransaction().commit();

        em.close();
    }

    public static List<Administrador> ConsultarAdministradores() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");
        
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        List<Administrador> administradores = em.createNamedQuery("Administrador.findAll").getResultList();

        return administradores;
    }

    public static Administrador loginAdministrador(String email, String senha) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");
        
        EntityManager em = emf.createEntityManager();

        List<Administrador> administradores;

        em.getTransaction().begin();

        Query q = em.createNamedQuery("Administrador.findByEmailAndSenha");
        q.setParameter("email", email);
        q.setParameter("senha", senha);
        em.getTransaction().commit();
        administradores = q.getResultList();

        em.close();

        if (administradores.isEmpty()) {
            return null;
        }

        return administradores.get(0);
    }

    public static void removerAdministrador(Administrador administrador) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Administrador resultado = em.find(Administrador.class, administrador.getId());
        em.remove(resultado);

        em.getTransaction().commit();
        em.close();
    }
}