package it.alfasoft.andrea.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;

import it.alfasoft.andrea.dao.FatturaDao;
import it.alfasoft.andrea.model.Fattura;

public class MainLetturaBlob {

	public static void main(String[] args) {
		
		FatturaDao fDao=new FatturaDao();
		
		Fattura f=fDao.leggiFatturaConCodice("aaa");
		
		//Convertire Blob in pdf
		Blob b=f.getAllegatoPdf();
		
		try {
			byte[]byteArray= b.getBytes(1, (int) b.length());
			
			try {
				FileOutputStream outputStream=new FileOutputStream("C:\\Users\\Andrea\\Desktop\\Report\\MioFileDaDatabase.pdf");
				
				outputStream.write(byteArray);
				
				outputStream.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
