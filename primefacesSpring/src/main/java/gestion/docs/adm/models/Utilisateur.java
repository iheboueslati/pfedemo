package gestion.docs.adm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the UTILISATEURS database table.
 * 
 */
@Entity
@Table(name="UTILISATEURS")
@NamedQuery(name="Utilisateur.findAll", query="SELECT u FROM Utilisateur u")
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String matricule;

	@Column(name="\"ADMIN\"")
	private BigDecimal admin;

	@Temporal(TemporalType.DATE)
	private Date datecre;

	@Temporal(TemporalType.DATE)
	private Date datemod;

	@Column(name="LOGIN")
	private String login;

	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="SUSPENDU")
	private BigDecimal suspendu;

	//bi-directional many-to-one association to Poste
	@ManyToOne
	@JoinColumn(name="IDPOSTE")
	private Poste poste;

	//uni-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="CUTICRE")
	private Utilisateur cuticre;

	//uni-directional many-to-one association to Utilisateur
	
	@Column(name="CUTIMOD")
	private Utilisateur cutimod;

	public Utilisateur() {
	}

	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public BigDecimal getAdmin() {
		return this.admin;
	}

	public void setAdmin(BigDecimal admin) {
		this.admin = admin;
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

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigDecimal getSuspendu() {
		return this.suspendu;
	}

	public void setSuspendu(BigDecimal suspendu) {
		this.suspendu = suspendu;
	}

	public Poste getPoste() {
		return this.poste;
	}

	public void setPoste(Poste poste) {
		this.poste = poste;
	}

	public Utilisateur getCuticre() {
		return this.cuticre;
	}

	public void setCuticre(Utilisateur cuticre) {
		this.cuticre = cuticre;
	}

	public Utilisateur getCutimod() {
		return this.cutimod;
	}

	public void setCutimod(Utilisateur cutimod) {
		this.cutimod = cutimod;
	}

}