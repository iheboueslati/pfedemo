package gestion.docs.adm.models;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the RHNOM database table.
 * 
 */
@Entity
@NamedQuery(name="Rhnom.findAll", query="SELECT r FROM Rhnom r")
public class Rhnom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IDNOM")
	private long idnom;

	@Column(name="CACC")
	private String cacc;

	@Column(name="CNOM")
	private String cnom;

	@Column(name="CUTICRE")
	private String cuticre;

	@Column(name="CUTIMOD")
	private String cutimod;

	@Temporal(TemporalType.DATE)
	private Date datecre;

	@Temporal(TemporalType.DATE)
	private Date datemod;

	@Column(name="FLG_TECH")
	private BigDecimal flgTech;

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

	public Rhnom() {
	}

	public long getIdnom() {
		return this.idnom;
	}

	public void setIdnom(long idnom) {
		this.idnom = idnom;
	}

	public String getCacc() {
		return this.cacc;
	}

	public void setCacc(String cacc) {
		this.cacc = cacc;
	}

	public String getCnom() {
		return this.cnom;
	}

	public void setCnom(String cnom) {
		this.cnom = cnom;
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

	public BigDecimal getFlgTech() {
		return this.flgTech;
	}

	public void setFlgTech(BigDecimal flgTech) {
		this.flgTech = flgTech;
	}

	public String getLib1() {
		return this.lib1;
	}

	public void setLib1(String lib1) {
		this.lib1 = lib1;
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

	public BigDecimal getMnt1() {
		return this.mnt1;
	}

	public void setMnt1(BigDecimal mnt1) {
		this.mnt1 = mnt1;
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

	public BigDecimal getTau1() {
		return this.tau1;
	}

	public void setTau1(BigDecimal tau1) {
		this.tau1 = tau1;
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

}