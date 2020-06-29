package gestion.docs.adm.dao;

import java.util.List;

import gestion.docs.adm.models.ParamDocsAdministratif;

public interface ParamDocsAdministratifDAO {

public ParamDocsAdministratif getParamAdministratifById();
public List<ParamDocsAdministratif> ListParamAdministratifByCriteria();
public List<ParamDocsAdministratif> ListAllAdministratif();
}
