package estudedanca2.model.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import estudedanca2.model.dao.ConexaoHIbernate;
import estudedanca2.model.dao.TurmaDao;
import estudedanca2.model.vo.Turma;

public class TurmaDaoImpl implements TurmaDao {

	EntityManager manager;

	public TurmaDaoImpl() {
		manager = ConexaoHIbernate.getInstance();
	}

	public void insert(Turma obj) {
		manager.getTransaction().begin();
		manager.persist(obj);
		manager.getTransaction().commit();

	}

	public void update(Turma obj) {
		manager.getTransaction().begin();
		manager.persist(obj);
		manager.getTransaction().commit();

	}

	public void deleteById(Long id) {
		manager.getTransaction().begin();
		manager.remove(id);
		manager.getTransaction().commit();

	}

	public Turma findById(Long id) {
		Turma turma;
		
		Query query = manager.createQuery("SELECT c FROM turma c WHERE c.codigo = " + id);
        turma = (Turma)query.getSingleResult();
        
		return turma;
	}

	public List<Turma> findAll() {
		List<Turma> turmas;

		Query query = manager.createQuery("SELECT t FROM turma t");
		turmas = query.getResultList();

		return turmas;
	}

}
