package estudedanca2.model.rn;

import org.hibernate.HibernateException;

import estudedanca2.model.dao.EstudanteDAO;
import estudedanca2.model.impl.EstudanteDaoImpl;
import estudedanca2.model.vo.Estudante;

public class EstudanteRN {
	
	private EstudanteDAO estudanteDAO;

	public EstudanteRN() {
		estudanteDAO = new EstudanteDaoImpl();
	}
	
	public void salvar(Estudante estudante) {
		try {
			estudanteDAO.insert(estudante);
		} catch (HibernateException he) {
			System.err.println(he);
		}
	}
	

}
