package estudedanca2.model.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import estudedanca2.model.dao.ConexaoHIbernate;
import estudedanca2.model.dao.ProfessorDao;
import estudedanca2.model.vo.Professor;

public class ProfessorDaoIMpl implements ProfessorDao {
	
	EntityManager manager;

	

	public ProfessorDaoIMpl() {
		manager = ConexaoHIbernate.getInstance();
	}

	public void insert(Professor obj) {
		manager.getTransaction().begin();
		manager.persist(obj);
		manager.getTransaction().commit();

	}

	public void update(Professor obj) {
		manager.getTransaction().begin();
		manager.persist(obj);
		manager.getTransaction().commit();

	}

	public void deleteById(Long id) {
		manager.getTransaction().begin();
		manager.remove(id);
		manager.getTransaction().commit();
	}

	public Professor findById(Long id) {
		Professor professor;
		
		Query query = manager.createQuery("SELECT c FROM professor c WHERE c.codigo = " + id);
        professor = (Professor)query.getSingleResult();
        
		return professor;
	}

	public List<Professor> findAll() {
		List<Professor> professores;

		Query query = manager.createQuery("SELECT t FROM professor t");
		professores = query.getResultList();

		return professores;
	}

}
