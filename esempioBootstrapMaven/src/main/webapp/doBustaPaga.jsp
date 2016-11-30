<%@page import="it.alfasoft.andrea.model.BustaPaga"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="it.alfasoft.andrea.servizi.Servizio"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



<% 
Servizio s=new Servizio();

String nome=request.getParameter("name");
String cognome=request.getParameter("surname");
String d=request.getParameter("dataEmissione");
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
Date data=sdf.parse(d);
double importo=Double.parseDouble(request.getParameter("importo"));

// System.out.println(nome);
// System.out.println(cognome);
// System.out.println(data);

BustaPaga bp=new BustaPaga(nome,cognome,data,importo);

// String pathJasper=request.getServletContext().getRealPath("Busta.jasper");
String pathJasper=request.getServletContext().getRealPath("NuovoBusta.jasper");
String pathJasperImm=request.getServletContext().getRealPath("logo.jpg");	

 s.creaPdf(bp,pathJasper,pathJasperImm);
 
 response.sendRedirect("BustaPaga.jsp");
 



 %>


