import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;


public class Main {
	
	public static void main(String[] args) throws JRException, IOException {
		// Compile jrxml file.
		JasperReport jasperReport = JasperCompileManager
									.compileReport("C:\\Users\\Andrea\\Desktop\\Blank_A4.jrxml");
		// Parameters for report
		Map<String, Object> parameters = new HashMap<String, Object>();
		// DataSource
		// This is simple example, no database.
		// then using empty datasource.
		JRDataSource dataSource = new JREmptyDataSource();
				
		
//		Connection conn = null;
//        try {
//        Class.forName("oracle.jdbc.driver.OracleDriver");
//        conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jasper", "jasper");
//        } catch (SQLException ex) {
//        } catch (ClassNotFoundException ex) {
//
//        }
		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
		parameters, dataSource);

		// Make sure the output directory exists.
		File outDir = new File("C:\\Users\\Andrea\\Desktop\\ReportJas");
		outDir.mkdirs();
		// Export to PDF.
		JasperExportManager.exportReportToPdfFile(jasperPrint,
		"C:\\Users\\Andrea\\Desktop\\ReportJas\\prova.pdf");
		System.out.println("Done!");
		}
		}