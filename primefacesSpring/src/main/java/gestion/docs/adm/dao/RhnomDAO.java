package gestion.docs.adm.dao;

import java.util.List;

import gestion.docs.adm.models.Rhnom;

public interface RhnomDAO {

public Rhnom getRhnomById();
public Rhnom SearchRhnomByCriteria();
public List<Rhnom> ListRhnomByCriteria();
public List<Rhnom> ListAllRhnom();
}
