package gestion.docs.adm.dao;

import gestion.docs.adm.models.Rhnom;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RhnomDAOImpl implements RhnomDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public RhnomDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Rhnom getRhnomById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rhnom SearchRhnomByCriteria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rhnom> ListRhnomByCriteria() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Rhnom> ListAllRhnom() {
		  System.out.println("*** returning roles");
	        try {
	        	return sessionFactory.getCurrentSession().createQuery("from Rhnom").list();
	        } catch (RuntimeException re) {
	        	System.out.printf("*** return Rhnom failed", re);
	            throw re;
	        }   }

	
}
