package dominio.entidades;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "ingresso")
@NamedQueries({
    @NamedQuery(name = "Ingresso.findAll", query = "SELECT i FROM Ingresso i"),
    @NamedQuery(name = "Ingresso.findById", query = "SELECT i FROM Ingresso i WHERE i.id = :id"),
    @NamedQuery(name = "Ingresso.findDisponiveis", query = "SELECT i FROM Ingresso i WHERE i.disponibilidade = true"),
    @NamedQuery(name = "Ingresso.findIndisponiveis", query = "SELECT i FROM Ingresso i WHERE i.disponibilidade = false")
})
public class Ingresso implements Serializable {

    protected Ingresso() { }
    
    public Ingresso(UUID eventoId, double valor) {
        this.id = UUID.randomUUID();
        this.eventoId = eventoId;
        this.valor = valor;
        this.disponibilidade = true;
    }

    private static final long serialVersionUID = 1L;
    @Id
    @Type(type="uuid-char")
    private UUID id;
    @Column(name = "evento")
    @Type(type="uuid-char")
    private UUID eventoId;
    @Column(name = "valor")
    private double valor;
    @Column(name = "disponibilidade")
    private boolean disponibilidade;
    
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getEvento() {
        return eventoId;
    }

    public void setEvento(UUID eventoId) {
        this.eventoId = eventoId;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
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
        if (!(object instanceof Ingresso)) {
            return false;
        }
        Ingresso other = (Ingresso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.entidades.Ingresso[ id=" + id + " ]";
    }
}
