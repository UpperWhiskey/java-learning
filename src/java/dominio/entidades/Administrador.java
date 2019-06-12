package dominio.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Type;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "administrador")
@NamedQueries({
    @NamedQuery(name = "Administrador.findAll", query = "SELECT a FROM Administrador a"),
    @NamedQuery(name = "Administrador.findById", query = "SELECT a FROM Administrador a WHERE a.id = :id"),
    @NamedQuery(name = "Administrador.findByNome", query = "SELECT a FROM Administrador a WHERE a.nome = :nome"),
    @NamedQuery(name = "Administrador.findByEmail", query = "SELECT a FROM Administrador a WHERE a.email = :email"),
    @NamedQuery(name = "Administrador.findBySenha", query = "SELECT a FROM Administrador a WHERE a.senha = :senha"),
    @NamedQuery(name = "Administrador.findByEmailAndSenha", query = "SELECT a FROM Administrador a WHERE a.email = :email and a.senha = :senha")
})
public class Administrador implements Serializable {

    protected Administrador() { }
    
    public Administrador(String nome, String email, String senha) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.eventos = new ArrayList<Evento>();
    }
    
    private static final long serialVersionUID = 1L;
    @Id
    @Type(type="uuid-char")
    private UUID id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;
    @Column(name = "senha")
    private String senha;
    @OneToMany()
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Evento> eventos;
    @Column(name = "receita")
    private double receita;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }
    
    public void addEvento(Evento evento) {
        this.eventos.add(evento);
    }

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita) {
        this.receita = receita;
    }
    
    public void addReceita(double acrescimo) {
        this.receita += acrescimo;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrador)) {
            return false;
        }
        Administrador other = (Administrador) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.entidades.Administrador[ id=" + getId() + " ]";
    }
}
