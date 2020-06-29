package gestion.docs.adm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the SCENARIOS_ETAPES database table.
 * 
 */
@Entity
@Table(name="SCENARIOS_ETAPES")
@NamedQuery(name="ScenariosEtape.findAll", query="SELECT s FROM ScenariosEtape s")
public class ScenariosEtape implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_SCENARIO_ETAPE")
	private long idScenarioEtape;

	private String corps;

	@Column(name="CORPS_ALERTE")
	private String corpsAlerte;

	@Column(name="CUTICRE")
	private String cuticre;

	@Column(name="CUTIMOD")
	private String cutimod;

	@Temporal(TemporalType.DATE)
	private Date datecre;

	@Temporal(TemporalType.DATE)
	private Date datemod;

	@Column(name="DUREE_TRT_MAX")
	private BigDecimal dureeTrtMax;

	@Column(name="DUREE_VIE_MIN_REQ")
	private BigDecimal dureeVieMinReq;

	@Column(name="FLG_ETAPE_FIN")
	private BigDecimal flgEtapeFin;

	@Column(name="FLG_SUPP")
	private BigDecimal flgSupp;

	@Column(name="ID_ETAPE")
	private BigDecimal idEtape;

	@Column(name="ID_PROFIL")
	private BigDecimal idProfil;

	@Column(name="ID_SCENARIO")
	private BigDecimal idScenario;

	private String objet;

	@Column(name="OBJET_ALERTE")
	private String objetAlerte;

	//bi-directional many-to-one association to DemandesDocsAmdinistratif
	@OneToMany(mappedBy="scenariosEtape")
	private List<DemandesDocsAmdinistratif> demandesDocsAmdinistratifs;

	//uni-directional many-to-one association to Rhnom
	@ManyToOne
	@JoinColumn(name="ID_TYP_USER")
	private Rhnom typeUtilisateur;

	//uni-directional many-to-one association to Rhnom
	@ManyToOne
	@JoinColumn(name="ID_PRG")
	private Rhnom idPrg;

	//bi-directional many-to-one association to ScenariosTransition
	@OneToMany(mappedBy="scenariosEtape")
	private List<ScenariosTransition> scenariosTransitions;

	public ScenariosEtape() {
	}

	public long getIdScenarioEtape() {
		return this.idScenarioEtape;
	}

	public void setIdScenarioEtape(long idScenarioEtape) {
		this.idScenarioEtape = idScenarioEtape;
	}

	public String getCorps() {
		return this.corps;
	}

	public void setCorps(String corps) {
		this.corps = corps;
	}

	public String getCorpsAlerte() {
		return this.corpsAlerte;
	}

	public void setCorpsAlerte(String corpsAlerte) {
		this.corpsAlerte = corpsAlerte;
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

	public BigDecimal getDureeTrtMax() {
		return this.dureeTrtMax;
	}

	public void setDureeTrtMax(BigDecimal dureeTrtMax) {
		this.dureeTrtMax = dureeTrtMax;
	}

	public BigDecimal getDureeVieMinReq() {
		return this.dureeVieMinReq;
	}

	public void setDureeVieMinReq(BigDecimal dureeVieMinReq) {
		this.dureeVieMinReq = dureeVieMinReq;
	}

	public BigDecimal getFlgEtapeFin() {
		return this.flgEtapeFin;
	}

	public void setFlgEtapeFin(BigDecimal flgEtapeFin) {
		this.flgEtapeFin = flgEtapeFin;
	}

	public BigDecimal getFlgSupp() {
		return this.flgSupp;
	}

	public void setFlgSupp(BigDecimal flgSupp) {
		this.flgSupp = flgSupp;
	}

	public BigDecimal getIdEtape() {
		return this.idEtape;
	}

	public void setIdEtape(BigDecimal idEtape) {
		this.idEtape = idEtape;
	}

	public BigDecimal getIdProfil() {
		return this.idProfil;
	}

	public void setIdProfil(BigDecimal idProfil) {
		this.idProfil = idProfil;
	}

	public BigDecimal getIdScenario() {
		return this.idScenario;
	}

	public void setIdScenario(BigDecimal idScenario) {
		this.idScenario = idScenario;
	}

	public String getObjet() {
		return this.objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public String getObjetAlerte() {
		return this.objetAlerte;
	}

	public void setObjetAlerte(String objetAlerte) {
		this.objetAlerte = objetAlerte;
	}

	public List<DemandesDocsAmdinistratif> getDemandesDocsAmdinistratifs() {
		return this.demandesDocsAmdinistratifs;
	}

	public void setDemandesDocsAmdinistratifs(List<DemandesDocsAmdinistratif> demandesDocsAmdinistratifs) {
		this.demandesDocsAmdinistratifs = demandesDocsAmdinistratifs;
	}

	public DemandesDocsAmdinistratif addDemandesDocsAmdinistratif(DemandesDocsAmdinistratif demandesDocsAmdinistratif) {
		getDemandesDocsAmdinistratifs().add(demandesDocsAmdinistratif);
		demandesDocsAmdinistratif.setScenariosEtape(this);

		return demandesDocsAmdinistratif;
	}

	public DemandesDocsAmdinistratif removeDemandesDocsAmdinistratif(DemandesDocsAmdinistratif demandesDocsAmdinistratif) {
		getDemandesDocsAmdinistratifs().remove(demandesDocsAmdinistratif);
		demandesDocsAmdinistratif.setScenariosEtape(null);

		return demandesDocsAmdinistratif;
	}

	public Rhnom getTypeUtilisateur() {
		return this.typeUtilisateur;
	}

	public void setTypeUtilisateur(Rhnom typeUtilisateur) {
		this.typeUtilisateur = typeUtilisateur;
	}

	public Rhnom getIdPrg() {
		return this.idPrg;
	}

	public void setIdPrg(Rhnom idPrg) {
		this.idPrg = idPrg;
	}

	public List<ScenariosTransition> getScenariosTransitions() {
		return this.scenariosTransitions;
	}

	public void setScenariosTransitions(List<ScenariosTransition> scenariosTransitions) {
		this.scenariosTransitions = scenariosTransitions;
	}

	public ScenariosTransition addScenariosTransition(ScenariosTransition scenariosTransition) {
		getScenariosTransitions().add(scenariosTransition);
		scenariosTransition.setScenariosEtape(this);

		return scenariosTransition;
	}

	public ScenariosTransition removeScenariosTransition(ScenariosTransition scenariosTransition) {
		getScenariosTransitions().remove(scenariosTransition);
		scenariosTransition.setScenariosEtape(null);

		return scenariosTransition;
	}

}