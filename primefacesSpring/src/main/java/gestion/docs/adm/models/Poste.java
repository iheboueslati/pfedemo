package gestion.docs.adm.models;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the POSTES database table.
 * 
 */
@Entity
@Table(name="POSTES")
@NamedQuery(name="Poste.findAll", query="SELECT p FROM Poste p")
public class Poste implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_POSTE")
	private long idPoste;

	@Column(name="CODE_GEST")
	private BigDecimal codeGest;

	@Column(name="CUTICRE")
	private String cuticre;
	@Column(name="CUTIMOD")
	private String cutimod;

	@Temporal(TemporalType.DATE)
	private Date datecre;

	@Temporal(TemporalType.DATE)
	private Date datemod;

	@Column(name="FLG_EVAL_OBJ")
	private BigDecimal flgEvalObj;

	@Column(name="FLG_OBJ_MODIF")
	private BigDecimal flgObjModif;

	@Column(name="FLG_OBJ_PREDEF")
	private BigDecimal flgObjPredef;

	@Column(name="FLG_PREV_OBJ")
	private BigDecimal flgPrevObj;

	@Column(name="FLG_REAL_MODIF")
	private BigDecimal flgRealModif;

	@Column(name="FLG_RESPONSABILITE")
	private BigDecimal flgResponsabilite;

	@Column(name="FLG_SHOW_REAL")
	private BigDecimal flgShowReal;

	@Column(name="FLG_SUPP")
	private BigDecimal flgSupp;

	@Column(name="ID_ROLE")
	private BigDecimal idRole;

	private String mission;

	@Column(name="NBRE_EFFECTIF")
	private BigDecimal nbreEffectif;

	//bi-directional many-to-one association to BusinessUnit
	@ManyToOne
	@JoinColumn(name="ID_BU")
	private BusinessUnit businessUnit;

	//bi-directional many-to-one association to Utilisateur
	@OneToMany(mappedBy="poste")
	private List<Utilisateur> utilisateurs;

	public Poste() {
	}

	public long getIdPoste() {
		return this.idPoste;
	}

	public void setIdPoste(long idPoste) {
		this.idPoste = idPoste;
	}

	public BigDecimal getCodeGest() {
		return this.codeGest;
	}

	public void setCodeGest(BigDecimal codeGest) {
		this.codeGest = codeGest;
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

	public BigDecimal getFlgEvalObj() {
		return this.flgEvalObj;
	}

	public void setFlgEvalObj(BigDecimal flgEvalObj) {
		this.flgEvalObj = flgEvalObj;
	}

	public BigDecimal getFlgObjModif() {
		return this.flgObjModif;
	}

	public void setFlgObjModif(BigDecimal flgObjModif) {
		this.flgObjModif = flgObjModif;
	}

	public BigDecimal getFlgObjPredef() {
		return this.flgObjPredef;
	}

	public void setFlgObjPredef(BigDecimal flgObjPredef) {
		this.flgObjPredef = flgObjPredef;
	}

	public BigDecimal getFlgPrevObj() {
		return this.flgPrevObj;
	}

	public void setFlgPrevObj(BigDecimal flgPrevObj) {
		this.flgPrevObj = flgPrevObj;
	}

	public BigDecimal getFlgRealModif() {
		return this.flgRealModif;
	}

	public void setFlgRealModif(BigDecimal flgRealModif) {
		this.flgRealModif = flgRealModif;
	}

	public BigDecimal getFlgResponsabilite() {
		return this.flgResponsabilite;
	}

	public void setFlgResponsabilite(BigDecimal flgResponsabilite) {
		this.flgResponsabilite = flgResponsabilite;
	}

	public BigDecimal getFlgShowReal() {
		return this.flgShowReal;
	}

	public void setFlgShowReal(BigDecimal flgShowReal) {
		this.flgShowReal = flgShowReal;
	}

	public BigDecimal getFlgSupp() {
		return this.flgSupp;
	}

	public void setFlgSupp(BigDecimal flgSupp) {
		this.flgSupp = flgSupp;
	}

	public BigDecimal getIdRole() {
		return this.idRole;
	}

	public void setIdRole(BigDecimal idRole) {
		this.idRole = idRole;
	}

	public String getMission() {
		return this.mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}

	public BigDecimal getNbreEffectif() {
		return this.nbreEffectif;
	}

	public void setNbreEffectif(BigDecimal nbreEffectif) {
		this.nbreEffectif = nbreEffectif;
	}

	public BusinessUnit getBusinessUnit() {
		return this.businessUnit;
	}

	public void setBusinessUnit(BusinessUnit businessUnit) {
		this.businessUnit = businessUnit;
	}

	public List<Utilisateur> getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public Utilisateur addUtilisateur(Utilisateur utilisateur) {
		getUtilisateurs().add(utilisateur);
		utilisateur.setPoste(this);

		return utilisateur;
	}

	public Utilisateur removeUtilisateur(Utilisateur utilisateur) {
		getUtilisateurs().remove(utilisateur);
		utilisateur.setPoste(null);

		return utilisateur;
	}

}