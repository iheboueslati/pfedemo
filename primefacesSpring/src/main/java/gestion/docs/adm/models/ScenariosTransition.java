package gestion.docs.adm.models;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SCENARIOS_TRANSITIONS database table.
 * 
 */
@Entity
@Table(name="SCENARIOS_TRANSITIONS")
@NamedQuery(name="ScenariosTransition.findAll", query="SELECT s FROM ScenariosTransition s")
public class ScenariosTransition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_SCENARIO_TRANSITION")
	private long idScenarioTransition;

	@Column(name="CUTICRE")
	private String cuticre;

	@Column(name="CUTIMOD")
	private String cutimod;

	@Temporal(TemporalType.DATE)
	private Date datecre;

	@Temporal(TemporalType.DATE)
	private Date datemod;

	@Column(name="FLG_SUPP")
	private BigDecimal flgSupp;

	@Column(name="ID_RESSOURCE")
	private BigDecimal idRessource;

	@Column(name="ID_SCENARIO_ETAPE")
	private BigDecimal idScenarioEtape;

	@Column(name="MSG_ERR")
	private String msgErr;

	//uni-directional many-to-one association to Rhnom
	@ManyToOne
	@JoinColumn(name="ID_TYP_TRANSITION")
	private Rhnom idTypeTransition;

	//uni-directional many-to-one association to Rhnom
	@ManyToOne
	@JoinColumn(name="ID_PRG")
	private Rhnom idPrg;

	//bi-directional many-to-one association to ScenariosEtape
	@ManyToOne
	@JoinColumn(name="ID_SCENARIO_ETAPE_TRANSITION")
	private ScenariosEtape scenariosEtapeTransition;
	
	//bi-directional many-to-one association to ScenariosEtape
	@ManyToOne
	@JoinColumn(name="ID_SCENARIO_ETAPE")
	private ScenariosEtape scenariosEtape;

	public ScenariosTransition() {
	}

	public long getIdScenarioTransition() {
		return this.idScenarioTransition;
	}

	public void setIdScenarioTransition(long idScenarioTransition) {
		this.idScenarioTransition = idScenarioTransition;
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

	public BigDecimal getFlgSupp() {
		return this.flgSupp;
	}

	public void setFlgSupp(BigDecimal flgSupp) {
		this.flgSupp = flgSupp;
	}

	public BigDecimal getIdRessource() {
		return this.idRessource;
	}

	public void setIdRessource(BigDecimal idRessource) {
		this.idRessource = idRessource;
	}

	public BigDecimal getIdScenarioEtape() {
		return this.idScenarioEtape;
	}

	public void setIdScenarioEtape(BigDecimal idScenarioEtape) {
		this.idScenarioEtape = idScenarioEtape;
	}

	public String getMsgErr() {
		return this.msgErr;
	}

	public void setMsgErr(String msgErr) {
		this.msgErr = msgErr;
	}

	public Rhnom getIdTypeTransition() {
		return this.idTypeTransition;
	}

	public void setIdTypeTransition(Rhnom idTypeTransition) {
		this.idTypeTransition = idTypeTransition;
	}

	public Rhnom getIdPrg() {
		return this.idPrg;
	}

	public void setIdPrg(Rhnom idPrg) {
		this.idPrg = idPrg;
	}

	public ScenariosEtape getScenariosEtape() {
		return this.scenariosEtape;
	}

	public void setScenariosEtape(ScenariosEtape scenariosEtape) {
		this.scenariosEtape = scenariosEtape;
	}

	public ScenariosEtape getScenariosEtapeTransition() {
		return scenariosEtapeTransition;
	}

	public void setScenariosEtapeTransition(ScenariosEtape scenariosEtapeTransition) {
		this.scenariosEtapeTransition = scenariosEtapeTransition;
	}

	
}