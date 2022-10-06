package estudedanca2.model.dao;

import java.util.List;

import estudedanca2.model.vo.Professor;

public interface ProfessorDao {

	
	void insert(Professor obj);
	void update(Professor obj);
	void deleteById(Long id);
	Professor findById(Long id);
	List<Professor> findAll();

}
