package gestion.docs.adm.models;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;


/**
 * The persistent class for the DET_DEM_DOCS_ADMINISTRATIFS database table.
 * 
 */
@Entity
@Table(name="DET_DEM_DOCS_ADMINISTRATIFS")
@NamedQuery(name="DetDemDocsAdministratif.findAll", query="SELECT d FROM DetDemDocsAdministratif d")
public class DetDemDocsAdministratif implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DET_DEM_DOC_ADMINISTRATIF")
	private long idDetDemDocAdministratif;

	//CHOUF KIFEH (MOMKEN FEL BD in 0000 9999 ) deja number 4 & 2 
	@Column(name="ANNEE")
	private BigDecimal annee;
	@Column(name="MOIS")
	private BigDecimal mois;

	public DetDemDocsAdministratif() {
	}

	public long getIdDetDemDocAdministratif() {
		return this.idDetDemDocAdministratif;
	}

	public void setIdDetDemDocAdministratif(long idDetDemDocAdministratif) {
		this.idDetDemDocAdministratif = idDetDemDocAdministratif;
	}

	public BigDecimal getAnnee() {
		return this.annee;
	}

	public void setAnnee(BigDecimal annee) {
		this.annee = annee;
	}

	public BigDecimal getMois() {
		return this.mois;
	}

	public void setMois(BigDecimal mois) {
		this.mois = mois;
	}

}