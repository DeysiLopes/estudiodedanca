package estudedanca2.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.HibernateException;

public class ConexaoHIbernate {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	
	public static EntityManager getInstance() {
		if (manager == null) {
			synchronized (ConexaoHIbernate.class) {
				if (manager == null) {
					try {
						factory = Persistence.createEntityManagerFactory("estudiodedanca");
						manager = factory.createEntityManager();
					} catch (HibernateException he) {
						System.err.println(he.getMessage());
					}
				}
			}
		}
		return manager;
	}
	
	public static void close() {
        manager.close();
        factory.close();
    }

}
