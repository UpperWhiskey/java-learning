package dominio.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Type;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "evento")
@NamedQueries({
    @NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e"),
    @NamedQuery(name = "Evento.findById", query = "SELECT e FROM Evento e WHERE e.id = :id")
})
public class Evento implements Serializable {

    protected Evento() { }
    
    public Evento(Date data, String nome) {
        this.id = UUID.randomUUID();
        this.data = data;
        this.nome = nome;
        this.ingressos = new ArrayList<Ingresso>();
    }
    
    private static final long serialVersionUID = 1L;
    @Id
    @Type(type="uuid-char")
    private UUID id;
    @Temporal(TemporalType.DATE)
    @Column(name = "data")
    private Date data;
    @OneToMany()
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Ingresso> ingressos;
    @Column(name = "nome")
    private String nome;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }
    
    public void addIngresso(Ingresso ingresso){
        this.ingressos.add(ingresso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.entidades.Evento[ id=" + id + " ]";
    }
    
}
