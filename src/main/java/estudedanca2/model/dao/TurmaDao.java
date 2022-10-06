package estudedanca2.model.dao;

import java.util.List;

import estudedanca2.model.vo.Turma;

public interface TurmaDao{

	void insert(Turma obj);
	void update(Turma obj);
	void deleteById(Long id);
	Turma findById(Long id);
	List<Turma> findAll();

}
