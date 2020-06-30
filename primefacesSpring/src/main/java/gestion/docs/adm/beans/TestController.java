package gestion.docs.adm.beans;

import java.util.ArrayList;
import java.util.List;

import gestion.docs.adm.service.DocumentService;
import gestion.docs.adm.service.DocumentServiceImpl;
import gestion.docs.adm.models.Rhnom;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ManagedBean
@SessionScoped
public class TestController {
	
	@ManagedProperty(value = "#{documentService}")
	DocumentService documentService;

	private List<Rhnom> list = new ArrayList<Rhnom>();
    private List<String> list2 = new ArrayList<String>();
    private List<String> list3 = new ArrayList<String>();

	public String name ="iheb";
	

	//DAO LIST
public List<Rhnom> getList() {		
	try {
		list = documentService.getTypesDocuments();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return list;
	}		
 //DAO STATIC LIST
	public List<String> getList2() {
		
		try {
			list2 = documentService.getStaticList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list2;
}


	
public List<String> getList3() {
	list3.add("s1");
	list3.add("s2");
	list3.add("s3");
	System.out.println("returned list");
		return list3;
	}

	public void setList3(List<String> list3) {
		this.list3 = list3;
	}

public void setList2(List<String> list2) {
	this.list2 = list2;
}
	public void setList(List<Rhnom> list) {
	this.list = list;
}





	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public DocumentService getDocumentService() {
		return documentService;
	}

	public void setDocumentService(DocumentService documentService) {
		this.documentService = documentService;
	}
	
	
	
}
