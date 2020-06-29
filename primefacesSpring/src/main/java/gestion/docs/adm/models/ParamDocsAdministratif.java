package gestion.docs.adm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PARAM_DOCS_ADMINISTRATIFS database table.
 * 
 */
@Entity
@Table(name="PARAM_DOCS_ADMINISTRATIFS")
@NamedQuery(name="ParamDocsAdministratif.findAll", query="SELECT p FROM ParamDocsAdministratif p")
public class ParamDocsAdministratif implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PARAM_ID")
	private long paramId;

	@Column(name="COL_ID")
	private String colId;

	@Column(name="COL_LENGTH")
	private BigDecimal colLength;

	@Column(name="COL_LIB")
	private String colLib;

	@Column(name="COL_PATTERN")
	private String colPattern;

	@Column(name="COL_TYPE")
	private String colType;

	@Column(name="MAX_VALUE")
	private BigDecimal maxValue;

	@Column(name="MIN_VALUE")
	private BigDecimal minValue;

	@Column(name="ORDRE")
	private BigDecimal ordre;

	//uni-directional many-to-one association to Rhnom
	@ManyToOne
	@JoinColumn(name="TYPE_ID")
	private Rhnom idTypeDocument;

	public ParamDocsAdministratif() {
	}

	public long getParamId() {
		return this.paramId;
	}

	public void setParamId(long paramId) {
		this.paramId = paramId;
	}

	public String getColId() {
		return this.colId;
	}

	public void setColId(String colId) {
		this.colId = colId;
	}

	public BigDecimal getColLength() {
		return this.colLength;
	}

	public void setColLength(BigDecimal colLength) {
		this.colLength = colLength;
	}

	public String getColLib() {
		return this.colLib;
	}

	public void setColLib(String colLib) {
		this.colLib = colLib;
	}

	public String getColPattern() {
		return this.colPattern;
	}

	public void setColPattern(String colPattern) {
		this.colPattern = colPattern;
	}

	public String getColType() {
		return this.colType;
	}

	public void setColType(String colType) {
		this.colType = colType;
	}

	public BigDecimal getMaxValue() {
		return this.maxValue;
	}

	public void setMaxValue(BigDecimal maxValue) {
		this.maxValue = maxValue;
	}

	public BigDecimal getMinValue() {
		return this.minValue;
	}

	public void setMinValue(BigDecimal minValue) {
		this.minValue = minValue;
	}

	public BigDecimal getOrdre() {
		return this.ordre;
	}

	public void setOrdre(BigDecimal ordre) {
		this.ordre = ordre;
	}

	public Rhnom getIdTypeDocument() {
		return this.idTypeDocument;
	}

	public void setIdTypeDocument(Rhnom idTypeDocument) {
		this.idTypeDocument = idTypeDocument;
	}

}