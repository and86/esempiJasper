package it.alfasoft.rossella.dao;

import hibernateUtil.HibernateUtil;
import it.alfasoft.rossella.model.BustaPaga;
import it.alfasoft.rossella.model.BustaPagaService;
import it.alfasoft.rossella.model.Fattura;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BustaPagaDao {
	
	 // 1 create
	
		public boolean createBusta(BustaPagaService bp) {
			boolean res = false;

			Session session = HibernateUtil.openSession();
			Transaction tx = null;
			try {
				tx = session.getTransaction();
				
				tx.begin();
				session.persist(bp);
				tx.commit();
				
				res = true;
			} catch (Exception ex) {
				tx.rollback();
			} finally {
				session.close();
			}
			return res;

		}
	
	//2b read tutti
	@SuppressWarnings("unchecked")
	public List<BustaPagaService> readTutteBustePaga(){
	
	List<BustaPagaService> lista = new ArrayList<BustaPagaService>();

	Session session = HibernateUtil.openSession();
	Transaction tx = null;
	
	try {	
		tx = session.getTransaction();
		tx.begin();
		
		Query query = session.createQuery("From BustaPaga");
		
		lista= query.list();
			
		tx.commit();
		
	} catch (Exception ex) {
		tx.rollback();
	} finally {
		session.close();			
	}
	
	return lista;
	}

}
