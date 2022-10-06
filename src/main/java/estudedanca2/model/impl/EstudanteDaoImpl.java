package estudedanca2.model.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import estudedanca2.model.dao.ConexaoHIbernate;
import estudedanca2.model.dao.EstudanteDAO;
import estudedanca2.model.vo.Estudante;

public class EstudanteDaoImpl implements EstudanteDAO {

	EntityManager manager;

	public EstudanteDaoImpl() {
		manager = ConexaoHIbernate.getInstance();
	}

	public void insert(Estudante obj) {
		manager.getTransaction().begin();
		manager.persist(obj);
		manager.getTransaction().commit();

	}

	public void update(Estudante obj) {
		manager.getTransaction().begin();
		manager.persist(obj);
		manager.getTransaction().commit();

	}

	public void deleteById(Long id) {
		manager.getTransaction().begin();
		manager.remove(id);
		manager.getTransaction().commit();

	}

	public Estudante findById(Long id) {
		Estudante estudante;

		Query query = manager.createQuery("SELECT c FROM professor c WHERE c.codigo = " + id);
		estudante = (Estudante) query.getSingleResult();

		return estudante;
	}

	public List<Estudante> findAll() {
		List<Estudante> estudantes;

		Query query = manager.createQuery("SELECT t FROM professor t");
		estudantes = query.getResultList();

		return estudantes;
	}

}
