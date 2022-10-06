package estudedanca2.model.dao;

import java.util.List;

import estudedanca2.model.vo.Estudante;

public interface EstudanteDAO {

	
	void insert(Estudante obj);
	void update(Estudante obj);
	void deleteById(Long id);
	Estudante findById(Long id);
	List<Estudante> findAll();
}
