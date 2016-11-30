package it.alfasoft.andrea.servizi;

import it.alfasoft.andrea.model.BustaPaga;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;



public class Servizio {
	
	public void creaPdf(BustaPaga bp,String pathJasper, String pathJasperImm){
		
		String nomeFile = "BustaPaga" + bp.getCognome().toUpperCase() + ".pdf";
		
		String percorso = "C:\\Users\\Andrea\\Desktop\\Report\\";

		String fileFinale = percorso + nomeFile;

		try {

			// una mappa per mandare i parametri a Jasper
			Map<String, Object> parameters = new HashMap<String, Object>();

			
			parameters.put("nome",bp.getNome());
		    parameters.put("cognome",bp.getCognome());
		    parameters.put("dataEmissione",bp.getDataEmissione());
		    parameters.put("importo",bp.getImporto());		    
		    parameters.put("Logo", pathJasperImm);
		    
			// file compilato di jasper (.jasper) di Jasper Report per creare
			// PDF
			JasperPrint jasperPrint = JasperFillManager.fillReport(pathJasper,
					 parameters, new JREmptyDataSource());

			// outputStream per creare PDF
			OutputStream outputStream = new FileOutputStream(new File(
					fileFinale));

			// scrivo in un file PDF
			JasperExportManager.exportReportToPdfStream(jasperPrint,
					outputStream);
			System.out.println("il File.pdf e' stato creato");

		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


