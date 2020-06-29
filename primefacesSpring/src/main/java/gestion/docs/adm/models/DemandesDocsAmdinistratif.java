package gestion.docs.adm.models;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;


/**
 * The persistent class for the DEMANDES_DOCS_AMDINISTRATIFS database table.
 * 
 */
@Entity
@Table(name="DEMANDES_DOCS_AMDINISTRATIFS")
@NamedQuery(name="DemandesDocsAmdinistratif.findAll", query="SELECT d FROM DemandesDocsAmdinistratif d")
public class DemandesDocsAmdinistratif implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DEMANDE_DOC_ADMINISTRATIF")
	private long idDemandeDocAdministratif;

	@Column(name="FLG_DOC_PHY")
	private BigDecimal flgDocPhy;

	@Column(name="FLG_LANGUE")
	private BigDecimal flgLangue;

	@Column(name="FLG_MODULE")
	private String flgModule;

	@Column(name="ID_AGENT")
	private String idAgent;

	@Column(name="ID_DOSSIER")
	private BigDecimal idDossier;

	@Column(name="ID_MODULE")
	private BigDecimal idModule;

	@Column(name="ID_POSTE_SIGNATAIRE")
	private BigDecimal idPosteSignataire;


	@Column(name="LIB1")
	private String lib1;

	@Column(name="LIB2")
	private String lib2;

	@Column(name="LIB3")
	private String lib3;

	@Column(name="LIB4")
	private String lib4;

	@Column(name="LIB5")
	private String lib5;
	@Column(name="LIB6")
	private String lib6;

	@Column(name="LIB7")
	private String lib7;

	@Column(name="LIB8")
	private String lib8;

	@Column(name="LIB9")
	private String lib9;

	@Column(name="LIB10")
	private String lib10;

	@Column(name="MNT1")
	private BigDecimal mnt1;
	@Column(name="MNT2")
	private BigDecimal mnt2;
	@Column(name="MNT3")
	private BigDecimal mnt3;
	@Column(name="MNT4")
	private BigDecimal mnt4;
	@Column(name="MNT5")
	private BigDecimal mnt5;

	@Column(name="MNT6")
	private BigDecimal mnt6;
	@Column(name="MNT7")
	private BigDecimal mnt7;
	@Column(name="MNT8")
	private BigDecimal mnt8;
	@Column(name="MNT9")
	private BigDecimal mnt9;
	@Column(name="MNT10")
	private BigDecimal mnt10;
	
	@Column(name="OBSERVATION")
	private String observation;

	@Column(name="TAU1")
	private BigDecimal tau1;
	@Column(name="TAU2")
	private BigDecimal tau2;
	@Column(name="TAU3")
	private BigDecimal tau3;
	@Column(name="TAU4")
	private BigDecimal tau4;
	@Column(name="TAU5")
	private BigDecimal tau5;
	@Column(name="TAU6")
	private BigDecimal tau6;
	@Column(name="TAU7")
	private BigDecimal tau7;
	@Column(name="TAU8")
	private BigDecimal tau8;
	@Column(name="TAU9")
	private BigDecimal tau9;
	@Column(name="TAU10")
	private BigDecimal tau10;

	//uni-directional many-to-one association to Rhnom
	@ManyToOne
	@JoinColumn(name="TYPE_DOC_ADMINISTRATIF")
	private Rhnom typeDocument;

	//uni-directional many-to-one association to Rhnom
	@ManyToOne
	@JoinColumn(name="CRITERE")
	private Rhnom critereDocument;

	//uni-directional many-to-one association to Rhnom
	@ManyToOne
	@JoinColumn(name="MODE_RECEPTION")
	private Rhnom modeReception;

	//bi-directional many-to-one association to ScenariosEtape
	@ManyToOne
	@JoinColumn(name="ETAPE_SCENARIO")
	private ScenariosEtape scenariosEtape;

	public DemandesDocsAmdinistratif() {
	}

	public long getIdDemandeDocAdministratif() {
		return this.idDemandeDocAdministratif;
	}

	public void setIdDemandeDocAdministratif(long idDemandeDocAdministratif) {
		this.idDemandeDocAdministratif = idDemandeDocAdministratif;
	}

	public BigDecimal getFlgDocPhy() {
		return this.flgDocPhy;
	}

	public void setFlgDocPhy(BigDecimal flgDocPhy) {
		this.flgDocPhy = flgDocPhy;
	}

	public BigDecimal getFlgLangue() {
		return this.flgLangue;
	}

	public void setFlgLangue(BigDecimal flgLangue) {
		this.flgLangue = flgLangue;
	}

	public String getFlgModule() {
		return this.flgModule;
	}

	public void setFlgModule(String flgModule) {
		this.flgModule = flgModule;
	}

	public String getIdAgent() {
		return this.idAgent;
	}

	public void setIdAgent(String idAgent) {
		this.idAgent = idAgent;
	}

	public BigDecimal getIdDossier() {
		return this.idDossier;
	}

	public void setIdDossier(BigDecimal idDossier) {
		this.idDossier = idDossier;
	}

	public BigDecimal getIdModule() {
		return this.idModule;
	}

	public void setIdModule(BigDecimal idModule) {
		this.idModule = idModule;
	}

	public BigDecimal getIdPosteSignataire() {
		return this.idPosteSignataire;
	}

	public void setIdPosteSignataire(BigDecimal idPosteSignataire) {
		this.idPosteSignataire = idPosteSignataire;
	}

	public String getLib1() {
		return this.lib1;
	}

	public void setLib1(String lib1) {
		this.lib1 = lib1;
	}

	public String getLib10() {
		return this.lib10;
	}

	public void setLib10(String lib10) {
		this.lib10 = lib10;
	}

	public String getLib2() {
		return this.lib2;
	}

	public void setLib2(String lib2) {
		this.lib2 = lib2;
	}

	public String getLib3() {
		return this.lib3;
	}

	public void setLib3(String lib3) {
		this.lib3 = lib3;
	}

	public String getLib4() {
		return this.lib4;
	}

	public void setLib4(String lib4) {
		this.lib4 = lib4;
	}

	public String getLib5() {
		return this.lib5;
	}

	public void setLib5(String lib5) {
		this.lib5 = lib5;
	}

	public String getLib6() {
		return this.lib6;
	}

	public void setLib6(String lib6) {
		this.lib6 = lib6;
	}

	public String getLib7() {
		return this.lib7;
	}

	public void setLib7(String lib7) {
		this.lib7 = lib7;
	}

	public String getLib8() {
		return this.lib8;
	}

	public void setLib8(String lib8) {
		this.lib8 = lib8;
	}

	public String getLib9() {
		return this.lib9;
	}

	public void setLib9(String lib9) {
		this.lib9 = lib9;
	}

	public BigDecimal getMnt1() {
		return this.mnt1;
	}

	public void setMnt1(BigDecimal mnt1) {
		this.mnt1 = mnt1;
	}

	public BigDecimal getMnt10() {
		return this.mnt10;
	}

	public void setMnt10(BigDecimal mnt10) {
		this.mnt10 = mnt10;
	}

	public BigDecimal getMnt2() {
		return this.mnt2;
	}

	public void setMnt2(BigDecimal mnt2) {
		this.mnt2 = mnt2;
	}

	public BigDecimal getMnt3() {
		return this.mnt3;
	}

	public void setMnt3(BigDecimal mnt3) {
		this.mnt3 = mnt3;
	}

	public BigDecimal getMnt4() {
		return this.mnt4;
	}

	public void setMnt4(BigDecimal mnt4) {
		this.mnt4 = mnt4;
	}

	public BigDecimal getMnt5() {
		return this.mnt5;
	}

	public void setMnt5(BigDecimal mnt5) {
		this.mnt5 = mnt5;
	}

	public BigDecimal getMnt6() {
		return this.mnt6;
	}

	public void setMnt6(BigDecimal mnt6) {
		this.mnt6 = mnt6;
	}

	public BigDecimal getMnt7() {
		return this.mnt7;
	}

	public void setMnt7(BigDecimal mnt7) {
		this.mnt7 = mnt7;
	}

	public BigDecimal getMnt8() {
		return this.mnt8;
	}

	public void setMnt8(BigDecimal mnt8) {
		this.mnt8 = mnt8;
	}

	public BigDecimal getMnt9() {
		return this.mnt9;
	}

	public void setMnt9(BigDecimal mnt9) {
		this.mnt9 = mnt9;
	}

	public String getObservation() {
		return this.observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public BigDecimal getTau1() {
		return this.tau1;
	}

	public void setTau1(BigDecimal tau1) {
		this.tau1 = tau1;
	}

	public BigDecimal getTau10() {
		return this.tau10;
	}

	public void setTau10(BigDecimal tau10) {
		this.tau10 = tau10;
	}

	public BigDecimal getTau2() {
		return this.tau2;
	}

	public void setTau2(BigDecimal tau2) {
		this.tau2 = tau2;
	}

	public BigDecimal getTau3() {
		return this.tau3;
	}

	public void setTau3(BigDecimal tau3) {
		this.tau3 = tau3;
	}

	public BigDecimal getTau4() {
		return this.tau4;
	}

	public void setTau4(BigDecimal tau4) {
		this.tau4 = tau4;
	}

	public BigDecimal getTau5() {
		return this.tau5;
	}

	public void setTau5(BigDecimal tau5) {
		this.tau5 = tau5;
	}

	public BigDecimal getTau6() {
		return this.tau6;
	}

	public void setTau6(BigDecimal tau6) {
		this.tau6 = tau6;
	}

	public BigDecimal getTau7() {
		return this.tau7;
	}

	public void setTau7(BigDecimal tau7) {
		this.tau7 = tau7;
	}

	public BigDecimal getTau8() {
		return this.tau8;
	}

	public void setTau8(BigDecimal tau8) {
		this.tau8 = tau8;
	}

	public BigDecimal getTau9() {
		return this.tau9;
	}

	public void setTau9(BigDecimal tau9) {
		this.tau9 = tau9;
	}

	public Rhnom getTypeDocument() {
		return this.typeDocument;
	}

	public void setTypeDocument(Rhnom typeDocument) {
		this.typeDocument = typeDocument;
	}

	public Rhnom getCritereDocument() {
		return this.critereDocument;
	}

	public void setCritereDocument(Rhnom critereDocument) {
		this.critereDocument = critereDocument;
	}

	public Rhnom getModeReception() {
		return this.modeReception;
	}

	public void setModeReception(Rhnom modeReception) {
		this.modeReception = modeReception;
	}

	public ScenariosEtape getScenariosEtape() {
		return this.scenariosEtape;
	}

	public void setScenariosEtape(ScenariosEtape scenariosEtape) {
		this.scenariosEtape = scenariosEtape;
	}

}