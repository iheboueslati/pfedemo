package gestion.docs.adm.models;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the BUSINESS_UNITS database table.
 * 
 */
@Entity
@Table(name="BUSINESS_UNITS")
@NamedQuery(name="BusinessUnit.findAll", query="SELECT b FROM BusinessUnit b")
public class BusinessUnit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_BU")
	private long idBu;

	@Column(name="ADRESSE")
	private String adresse;
	@Column(name="CUTICRE")
	private String cuticre;
	@Column(name="CUTIMOD")
	private String cutimod;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_AFFECT")
	private Date dateAffect;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_CONSTITUTION")
	private Date dateConstitution;

	@Temporal(TemporalType.DATE)
	private Date datecre;

	@Temporal(TemporalType.DATE)
	private Date datemod;
	@Column(name="DENOMINATION")
	private String denomination;

	@Column(name="FLG_ACTIF")
	private BigDecimal flgActif;

	@Column(name="FLG_INTERIM")
	private BigDecimal flgInterim;

	@Column(name="FLG_NOTIF_ASSIDUITE")
	private BigDecimal flgNotifAssiduite;

	@Column(name="FLG_REGION")
	private BigDecimal flgRegion;

	@Column(name="FLG_STRUCTURE")
	private BigDecimal flgStructure;

	@Column(name="FLG_SUP_MOY")
	private BigDecimal flgSupMoy;

	@Column(name="FLG_SUP_MOY_REGION")
	private BigDecimal flgSupMoyRegion;

	@Column(name="FLG_SUP_MOY_STRUCTURE")
	private BigDecimal flgSupMoyStructure;

	@Column(name="FLG_SUPP")
	private BigDecimal flgSupp;

	@Column(name="FLG_UPDATE_HIS")
	private BigDecimal flgUpdateHis;

	@Column(name="ID_BU_PARENT")
	private BigDecimal idBuParent;

	@Column(name="ID_CLASSE")
	private BigDecimal idClasse;

	@Column(name="ID_ENTITE_JURIDIQUE")
	private BigDecimal idEntiteJuridique;

	@Column(name="ID_RESPONSABLE")
	private String idResponsable;

	@Column(name="LAT_PARTIE_ENT")
	private BigDecimal latPartieEnt;

	@Column(name="LATITUDE")
	private String latitude;

	@Column(name="LNG_PARTIE_ENT")
	private BigDecimal lngPartieEnt;
	
	@Column(name="LONGITUDE")
	private String longitude;

	@Column(name="ORDRE")
	private BigDecimal ordre;

	//bi-directional many-to-one association to Poste
	@OneToMany(mappedBy="businessUnit")
	private List<Poste> postes;

	public BusinessUnit() {
	}

	public long getIdBu() {
		return this.idBu;
	}

	public void setIdBu(long idBu) {
		this.idBu = idBu;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCuticre() {
		return this.cuticre;
	}

	public void setCuticre(String cuticre) {
		this.cuticre = cuticre;
	}

	public String getCutimod() {
		return this.cutimod;
	}

	public void setCutimod(String cutimod) {
		this.cutimod = cutimod;
	}

	public Date getDateAffect() {
		return this.dateAffect;
	}

	public void setDateAffect(Date dateAffect) {
		this.dateAffect = dateAffect;
	}

	public Date getDateConstitution() {
		return this.dateConstitution;
	}

	public void setDateConstitution(Date dateConstitution) {
		this.dateConstitution = dateConstitution;
	}

	public Date getDatecre() {
		return this.datecre;
	}

	public void setDatecre(Date datecre) {
		this.datecre = datecre;
	}

	public Date getDatemod() {
		return this.datemod;
	}

	public void setDatemod(Date datemod) {
		this.datemod = datemod;
	}

	public String getDenomination() {
		return this.denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public BigDecimal getFlgActif() {
		return this.flgActif;
	}

	public void setFlgActif(BigDecimal flgActif) {
		this.flgActif = flgActif;
	}

	public BigDecimal getFlgInterim() {
		return this.flgInterim;
	}

	public void setFlgInterim(BigDecimal flgInterim) {
		this.flgInterim = flgInterim;
	}

	public BigDecimal getFlgNotifAssiduite() {
		return this.flgNotifAssiduite;
	}

	public void setFlgNotifAssiduite(BigDecimal flgNotifAssiduite) {
		this.flgNotifAssiduite = flgNotifAssiduite;
	}

	public BigDecimal getFlgRegion() {
		return this.flgRegion;
	}

	public void setFlgRegion(BigDecimal flgRegion) {
		this.flgRegion = flgRegion;
	}

	public BigDecimal getFlgStructure() {
		return this.flgStructure;
	}

	public void setFlgStructure(BigDecimal flgStructure) {
		this.flgStructure = flgStructure;
	}

	public BigDecimal getFlgSupMoy() {
		return this.flgSupMoy;
	}

	public void setFlgSupMoy(BigDecimal flgSupMoy) {
		this.flgSupMoy = flgSupMoy;
	}

	public BigDecimal getFlgSupMoyRegion() {
		return this.flgSupMoyRegion;
	}

	public void setFlgSupMoyRegion(BigDecimal flgSupMoyRegion) {
		this.flgSupMoyRegion = flgSupMoyRegion;
	}

	public BigDecimal getFlgSupMoyStructure() {
		return this.flgSupMoyStructure;
	}

	public void setFlgSupMoyStructure(BigDecimal flgSupMoyStructure) {
		this.flgSupMoyStructure = flgSupMoyStructure;
	}

	public BigDecimal getFlgSupp() {
		return this.flgSupp;
	}

	public void setFlgSupp(BigDecimal flgSupp) {
		this.flgSupp = flgSupp;
	}

	public BigDecimal getFlgUpdateHis() {
		return this.flgUpdateHis;
	}

	public void setFlgUpdateHis(BigDecimal flgUpdateHis) {
		this.flgUpdateHis = flgUpdateHis;
	}

	public BigDecimal getIdBuParent() {
		return this.idBuParent;
	}

	public void setIdBuParent(BigDecimal idBuParent) {
		this.idBuParent = idBuParent;
	}

	public BigDecimal getIdClasse() {
		return this.idClasse;
	}

	public void setIdClasse(BigDecimal idClasse) {
		this.idClasse = idClasse;
	}

	public BigDecimal getIdEntiteJuridique() {
		return this.idEntiteJuridique;
	}

	public void setIdEntiteJuridique(BigDecimal idEntiteJuridique) {
		this.idEntiteJuridique = idEntiteJuridique;
	}

	public String getIdResponsable() {
		return this.idResponsable;
	}

	public void setIdResponsable(String idResponsable) {
		this.idResponsable = idResponsable;
	}

	public BigDecimal getLatPartieEnt() {
		return this.latPartieEnt;
	}

	public void setLatPartieEnt(BigDecimal latPartieEnt) {
		this.latPartieEnt = latPartieEnt;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLngPartieEnt() {
		return this.lngPartieEnt;
	}

	public void setLngPartieEnt(BigDecimal lngPartieEnt) {
		this.lngPartieEnt = lngPartieEnt;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getOrdre() {
		return this.ordre;
	}

	public void setOrdre(BigDecimal ordre) {
		this.ordre = ordre;
	}

	public List<Poste> getPostes() {
		return this.postes;
	}

	public void setPostes(List<Poste> postes) {
		this.postes = postes;
	}

	public Poste addPoste(Poste poste) {
		getPostes().add(poste);
		poste.setBusinessUnit(this);

		return poste;
	}

	public Poste removePoste(Poste poste) {
		getPostes().remove(poste);
		poste.setBusinessUnit(null);

		return poste;
	}

}