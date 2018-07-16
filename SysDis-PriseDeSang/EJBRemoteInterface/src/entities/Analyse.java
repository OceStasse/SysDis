package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "analyse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Analyse.findAll", query = "SELECT a FROM Analyse a")
    , @NamedQuery(name = "Analyse.findByIdAnalyse", query = "SELECT a FROM Analyse a WHERE a.idAnalyse = :idAnalyse")
    , @NamedQuery(name = "Analyse.findByItemAnalyse", query = "SELECT a FROM Analyse a WHERE a.itemAnalyse = :itemAnalyse")
    , @NamedQuery(name = "Analyse.findByValeur", query = "SELECT a FROM Analyse a WHERE a.valeur = :valeur")})
public class Analyse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAnalyse")
    private Integer idAnalyse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "itemAnalyse")
    private String itemAnalyse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Valeur")
    private int valeur;

    public Analyse() {
    }

    public Analyse(Integer idAnalyse) {
        this.idAnalyse = idAnalyse;
    }

    public Analyse(Integer idAnalyse, String itemAnalyse, int valeur) {
        this.idAnalyse = idAnalyse;
        this.itemAnalyse = itemAnalyse;
        this.valeur = valeur;
    }

    public Integer getIdAnalyse() {
        return idAnalyse;
    }

    public void setIdAnalyse(Integer idAnalyse) {
        this.idAnalyse = idAnalyse;
    }

    public String getItemAnalyse() {
        return itemAnalyse;
    }

    public void setItemAnalyse(String itemAnalyse) {
        this.itemAnalyse = itemAnalyse;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnalyse != null ? idAnalyse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Analyse)) {
            return false;
        }
        Analyse other = (Analyse) object;
        if ((this.idAnalyse == null && other.idAnalyse != null) || (this.idAnalyse != null && !this.idAnalyse.equals(other.idAnalyse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Analyse[ idAnalyse=" + idAnalyse + " ]";
    }

}
