package infraestrutura.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.entidades.Cliente;

public class ClienteDAO {

    public static void CadastrarCliente(Cliente cliente) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(cliente);

        em.getTransaction().commit();

        em.close();
    }
    
    public static void AtualizarCliente(Cliente cliente) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(cliente);

        em.getTransaction().commit();

        em.close();
    }

    public static List<Cliente> ConsultarClientes() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");
        
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        List<Cliente> clientes = em.createNamedQuery("Cliente.findAll").getResultList();

        return clientes;
    }

    public static Cliente loginCliente(String email, String senha) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");
        
        EntityManager em = emf.createEntityManager();

        List<Cliente> clientes;

        em.getTransaction().begin();

        Query q = em.createNamedQuery("Cliente.findByEmailAndSenha");
        q.setParameter("email", email);
        q.setParameter("senha", senha);
        em.getTransaction().commit();
        clientes = q.getResultList();

        em.close();

        if (clientes.isEmpty()) {
            return null;
        }

        return clientes.get(0);
    }
    public static Cliente getCliente(String email) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");
        
        EntityManager em = emf.createEntityManager();

        List<Cliente> clientes;

        em.getTransaction().begin();

        Query q;
        q = em.createNamedQuery("Cliente.findByEmail");
        q.setParameter("email", email);
        em.getTransaction().commit();
        clientes = q.getResultList();

        em.close();

        if (clientes.isEmpty()) {
            return null;
        }

        return clientes.get(0);
    }

    public static void removerCliente(Cliente cliente) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assessment_TarantiPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Cliente resultado = em.find(Cliente.class, cliente.getId());
        em.remove(resultado);

        em.getTransaction().commit();
        em.close();
    }
}