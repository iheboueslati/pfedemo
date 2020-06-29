package gestion.docs.adm.service;

import gestion.docs.adm.models.Rhnom;

import java.util.List;

public interface DocumentService {

public List<Rhnom> getTypesDocuments();	
public void printTypesDocuments();
public List<String> getStaticList();
}
