package it.alfasoft.andrea.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.util.Date;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import hibernateUtil.HibernateUtil;
import it.alfasoft.andrea.dao.FatturaDao;
import it.alfasoft.andrea.model.Fattura;

public class Main {

	public static void main(String[] args) {
				
		Date d=new Date();
		Fattura f=new Fattura(d,"aaa",123);
		
		FatturaDao fDao=new FatturaDao();
		
		//Prendo un .pdf e lo faccio diventare un file formato blob
		File file=new File("C:\\Users\\Andrea\\Desktop\\Report\\BustaPagaGALL.pdf");
		
		Session session = HibernateUtil.openSession();	//apro una sessione in hibernate
		try {
			FileInputStream inputStream=new FileInputStream(file);
			
			Blob blob= Hibernate.getLobCreator(session)
								.createBlob(inputStream, file.length());
			
			session.close();
			
			f.setAllegatoPdf(blob);			
			fDao.creaFattura(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
