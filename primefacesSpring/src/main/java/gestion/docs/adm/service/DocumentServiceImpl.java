package gestion.docs.adm.service;

import gestion.docs.adm.dao.RhnomDAO;
import gestion.docs.adm.models.Rhnom;

import java.util.ArrayList;
import java.util.List;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DocumentServiceImpl implements DocumentService {

	@Autowired
	private RhnomDAO rhnomDao;
	

	@SuppressWarnings("serial")
	@Override
	public List<String> getStaticList (){
		List<String> list2 = new ArrayList<String>() {{
			add("s1");
			add("s2");
			add("s3");
		}};
		return list2;
	}
	
	
	@Override
	public void printTypesDocuments() {
        List<Rhnom> list  = new ArrayList<Rhnom>();
 list = rhnomDao.ListAllRhnom() ;
 for(Rhnom model : list) {
     System.out.println(model.getLib1());
 }      
	}


	@Override
	public List<Rhnom> getTypesDocuments() {
		// TODO Auto-generated method stub
		return null;
	}

}
