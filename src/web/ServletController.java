package web;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import DAO.Admin_login_data_base;

import DAO.Axe_recherche_data_base;
import DAO.Axe_recherche_equipe_data_base;
import DAO.Conference_data_base;
import DAO.Encadrement_data_base;
import DAO.Equipe_data_base;
import DAO.Labo_data_base;
import DAO.ProjetRecherche_data_base;
import DAO.Pub_data_base;
import DAO.SingletonConnection;
import DAO.Soutenance_data_base;
import DAO.chercheur_data_base;
import DAO.login_data_base;
import metier.entites.AdminLogin;
import metier.entites.Axe_recherche;
import metier.entites.Axe_recherche_equipe;
import metier.entites.Conference;
import metier.entites.Encadrement;
import metier.entites.Equipe;
import metier.entites.Labo;
import metier.entites.PDFChercheur;
import metier.entites.PDFPub;
import metier.entites.ProjetRecherche;
import metier.entites.Publication;
import metier.entites.Soutenance;
import metier.entites.chercheur_Model;
import metier.entites.login;


@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 50, // 10MB
maxRequestSize = 1024 * 1024 * 500) // 50MB



/**
 * Servlet implementation class servletController
 */


public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletController() {
		super();
		// TODO Auto-generated constructor stub
	}
	//private chercheur_data_base 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	chercheur_data_base metier;
	Model m = new Model() ;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String path = request.getServletPath();
		System.out.println("path : " + path);
		
		
		

		if(path.equals("/architectui-html-free/addEncadrement.php")) {
			
			Conference_data_base conf = new Conference_data_base(SingletonConnection.getConnection());
			List<Conference> conferences= conf.ListesConferences(); 
			System.out.println("liste : "+conferences);
			request.setAttribute("conferences", conferences);
			
			
			Encadrement_data_base enc = new Encadrement_data_base(SingletonConnection.getConnection());
			List<Encadrement> encadrements= enc.ListesEncadrements(); 
			System.out.println("liste : "+encadrements);
			request.setAttribute("encadrements", encadrements);
			
			chercheur_data_base e= new chercheur_data_base(SingletonConnection.getConnection());
			System.out.println("liste : "+e);
			request.setAttribute("e", e);
		
			
			request.getRequestDispatcher("/architectui-html-free/add-encadrement.jsp").forward(request, response);

		}
		
		  if(path.equals("/architectui-html-free/getFileEncad.php") || path.equals("/TemplateAdmin/kiaalap-master/getFileEncad.php")){ 
			  int id_encadrement = Integer.parseInt(request.getParameter("id_encadrement"));
		 ServletOutputStream sos;
		 response.setContentType("application/pdf");
		 response.setHeader("Content-disposition", "inline;filename="+id_encadrement+".pdf");
		 sos=response.getOutputStream();
		 byte[] bytes = Encadrement_data_base.getJustificatif_Encad_encad(id_encadrement);
		 sos.write(bytes);
		 
		 sos.close();
		  }
		 
		  if(path.equals("/architectui-html-free/getFileEncad2.php") || path.equals("/TemplateAdmin/kiaalap-master/getFileEncad2.php")){ 
			  int id_encadrement = Integer.parseInt(request.getParameter("id_encadrement"));
		 ServletOutputStream sos;
		 response.setContentType("application/pdf");
		 response.setHeader("Content-disposition", "inline;filename="+id_encadrement+".pdf");
		 sos=response.getOutputStream();
		 byte[] bytes = Encadrement_data_base.getEncad(id_encadrement);
		 sos.write(bytes);
		 
		 sos.close();
		  }
		 
		 
		  
		//**************************projet de recherche ****************************************************
		if(path.equals("/architectui-html-free/addProjetRecherche.php")) {

			ProjetRecherche_data_base prj = new ProjetRecherche_data_base(SingletonConnection.getConnection());
			List<ProjetRecherche> projetRecherche= prj.LesProjet(); 
		
			request.setAttribute("projetRecherche", projetRecherche);
			
			
			
			chercheur_data_base e= new chercheur_data_base(SingletonConnection.getConnection());
			
			request.setAttribute("e", e);
			
			
			
			request.getRequestDispatcher("add-projetrecherche.jsp").forward(request, response);
		}
		
		if(path.equals("/architectui-html-free/getFilePrj.php") || path.equals("/TemplateAdmin/kiaalap-master/getFilePrj.php")){ 
			  int id_projet_recherche= Integer.parseInt(request.getParameter("id_projet_recherche"));
		 ServletOutputStream sos;
		 response.setContentType("application/pdf");
		 response.setHeader("Content-disposition", "inline;filename="+id_projet_recherche+".pdf");
		 sos=response.getOutputStream();
		 byte[] bytes = ProjetRecherche_data_base.getJustificatif_Projet_prj(id_projet_recherche);
		 sos.write(bytes);
		 
		 sos.close();
		  }
		
		if(path.equals("/architectui-html-free/getFilePrj2.php") || path.equals("/TemplateAdmin/kiaalap-master/getFilePrj2.php")){ 
			  int id_projet_recherche= Integer.parseInt(request.getParameter("id_projet_recherche"));
		 ServletOutputStream sos;
		 response.setContentType("application/pdf");
		 response.setHeader("Content-disposition", "inline;filename="+id_projet_recherche+".pdf");
		 sos=response.getOutputStream();
		 byte[] bytes = ProjetRecherche_data_base.getProjet(id_projet_recherche);
		 sos.write(bytes);
		 
		 sos.close();
		  }
		 
		//**************************Soutenance******************************************************
		
		if(path.equals("/architectui-html-free/addSoutenance.php") || path.equals("/TemplateAdmin/kiaalap-master/addSoutenance.php") ) {
			
			chercheur_data_base cher = new chercheur_data_base(SingletonConnection.getConnection());
			List<chercheur_Model> chercheurs= cher.LesChercheur(); 
			System.out.println("liste : "+chercheurs);
			request.setAttribute("chercheurs", chercheurs);
		
			chercheur_data_base e= new chercheur_data_base(SingletonConnection.getConnection());
			System.out.println("liste : "+e);
			request.setAttribute("e", e);
			
			HttpSession session = request.getSession();
			String username = (String) session.getAttribute("username");
			String password = (String) session.getAttribute("password");
			
			chercheur_Model m = chercheur_data_base.getIdChercheurParPassAndUser(username,password);
			int id_chercheur = m.getId_chercheur();
			
			
			List<Soutenance> soutenances= Soutenance_data_base.soutParIdChercheur(id_chercheur); 
			System.out.println("liste : "+soutenances);
			request.setAttribute("soutenances", soutenances);
			
			request.getRequestDispatcher("add-soutenance.jsp").forward(request, response);

	}
		
		 if(path.equals("/architectui-html-free/getFileSout.php") || path.equals("/TemplateAdmin/kiaalap-master/getFileSout.php")){ 
			  int id_soutenance= Integer.parseInt(request.getParameter("id_soutenance"));
		 ServletOutputStream sos;
		 response.setContentType("application/pdf");
		 response.setHeader("Content-disposition", "inline;filename="+id_soutenance+".pdf");
		 sos=response.getOutputStream();
		 byte[] bytes = Soutenance_data_base.getJustifiactif_Sout_sout(id_soutenance);
		 sos.write(bytes);
		 
		 sos.close();
		  }
		 
		 if(path.equals("/architectui-html-free/getFileSout2.php") || path.equals("/TemplateAdmin/kiaalap-master/getFileSout2.php")){ 
			  int id_soutenance= Integer.parseInt(request.getParameter("id_soutenance"));
		 ServletOutputStream sos;
		 response.setContentType("application/pdf");
		 response.setHeader("Content-disposition", "inline;filename="+id_soutenance+".pdf");
		 sos=response.getOutputStream();
		 byte[] bytes = Soutenance_data_base.getSout(id_soutenance);
		 sos.write(bytes);
		 
		 sos.close();
		  }
		 
		 //*******************confere**************************************
		if(path.equals("/architectui-html-free/addConference.php")) {
		
			chercheur_data_base e= new chercheur_data_base(SingletonConnection.getConnection());
			request.setAttribute("e", e);
			
			HttpSession session = request.getSession();
			String username = (String) session.getAttribute("username");
			String password = (String) session.getAttribute("password");
			
			chercheur_Model m = chercheur_data_base.getIdChercheurParPassAndUser(username,password);
			int id_chercheur = m.getId_chercheur();
			
			
			List<Conference> conferences = Conference_data_base.ConfParIdChercheur(id_chercheur); 
			System.out.println("liste : "+conferences);
			request.setAttribute("conferences", conferences);
			response.sendRedirect(request.getContextPath() + "/architectui-html-free/addConference.php");
	}
		
		 if(path.equals("/architectui-html-free/getFileConf.php") || path.equals("/TemplateAdmin/kiaalap-master/getFileConf.php")){ 
			  
			  int id_conference = Integer.parseInt(request.getParameter("id_conference"));
		 ServletOutputStream sos;
		 response.setContentType("application/pdf");
		 response.setHeader("Content-disposition", "inline;filename="+id_conference+".pdf");
		 sos=response.getOutputStream();
		 byte[] bytes = Conference_data_base.getJustifiactif_Conf_conf(id_conference);
		 sos.write(bytes);
		 
		 sos.close();
		  }
		 
		 if(path.equals("/architectui-html-free/getFileConf2.php") || path.equals("/TemplateAdmin/kiaalap-master/getFileConf2.php")){ 
			  
			  int id_conference = Integer.parseInt(request.getParameter("id_conference"));
		 ServletOutputStream sos;
		 response.setContentType("application/pdf");
		 response.setHeader("Content-disposition", "inline;filename="+id_conference+".pdf");
		 sos=response.getOutputStream();
		 byte[] bytes = Conference_data_base.getConf(id_conference);
		 sos.write(bytes);
		 
		 sos.close();
		  }
		 
		 if(path.equals("/TemplateAdmin/kiaalap-master/allConfChercheur.php")) {
			  System.out.println("*******************************************************************************" );
			  int id_chercheur = Integer.parseInt(request.getParameter("id_chercheur"));
			  
			  List<Conference> conferences= Conference_data_base.ConfParIdChercheur(id_chercheur);
			  System.out.println("liste : "+conferences);
			  request.setAttribute("conferences", conferences);
			  
			  
			 
			  
			  request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/all-chercheur_equipe.jsp").forward(request,response);
			  }
		//***********************Pub************************************
		if(path.equals("/architectui-html-free/addPub.php")) {
			chercheur_data_base cher = new chercheur_data_base(SingletonConnection.getConnection());
			List<chercheur_Model> chercheurs= cher.LesChercheur(); 
			System.out.println("liste : "+chercheurs);
			request.setAttribute("chercheurs", chercheurs);
			
			
			
			chercheur_data_base e= new chercheur_data_base(SingletonConnection.getConnection());
			System.out.println("liste : "+e);
			request.setAttribute("e", e);
			
			HttpSession session = request.getSession();
			String username = (String) session.getAttribute("username");
			String password = (String) session.getAttribute("password");
			
			chercheur_Model m = chercheur_data_base.getIdChercheurParPassAndUser(username,password);
			int id_chercheur = m.getId_chercheur();
			
			
			List<Publication> publications= Pub_data_base.pubParIdChercheur(id_chercheur); 
			System.out.println("liste : "+publications);
			request.setAttribute("publications", publications);
			
			request.getRequestDispatcher("add-pub.jsp").forward(request, response);
		}
		
		
		  if(path.equals("/architectui-html-free/getFilePub.php") || path.equals("/TemplateAdmin/kiaalap-master/getFilePub.php")){ 
			  int id_pub = Integer.parseInt(request.getParameter("id_pub"));
		 ServletOutputStream sos;
		 response.setContentType("application/pdf");
		 response.setHeader("Content-disposition", "inline;filename="+id_pub+".pdf");
		 sos=response.getOutputStream();
		 byte[] bytes = Pub_data_base.getJustifiactif_Pub_pub(id_pub);
		 sos.write(bytes);
		 
		 sos.close();
		  }
		  
		  if(path.equals("/architectui-html-free/getFilePub2.php") || path.equals("/TemplateAdmin/kiaalap-master/getFilePub2.php")){ 
			  int id_pub = Integer.parseInt(request.getParameter("id_pub"));
		 ServletOutputStream sos;
		 response.setContentType("application/pdf");
		 response.setHeader("Content-disposition", "inline;filename="+id_pub+".pdf");
		 sos=response.getOutputStream();
		 byte[] bytes = Pub_data_base.getPub(id_pub);
		 sos.write(bytes);
		 
		 sos.close();
		  }
		  
		  if(path.equals("/TemplateAdmin/kiaalap-master/deletePub1.php")){ 
			  int id_pub = Integer.parseInt(request.getParameter("id_pub"));
		  try {
		  Pub_data_base.deletePublication(id_pub);
		  }
		  catch(Exception e) {
		  e.printStackTrace(); }
		  response.sendRedirect(request.getContextPath() +"/TemplateAdmin/kiaalap-master/addPub.php"); }
		 
		
		  if(path.equals("/TemplateAdmin/kiaalap-master/allAxeR.php")) {
		  Axe_recherche_data_base c = new Axe_recherche_data_base(SingletonConnection.getConnection());
		  List<Axe_recherche> Axe_recherche= c.ListeAxeRecherche();
		  request.setAttribute("Axe_recherche", Axe_recherche);
		  
		  Equipe_data_base q= new Equipe_data_base(SingletonConnection.getConnection());
		  
		  request.setAttribute("q", q);
		  
		  request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/all-axeR.jsp").forward(request, response); 
		  }
		  
		  
		 
		  
		  //***************************************delete pub*************************************
		  if(path.equals("/architectui-html-free/deletePub1.php")){ 
			  int id_pub = Integer.parseInt(request.getParameter("id_pub"));
		  try {
		  Pub_data_base.deletePublication(id_pub);
		  }
		  catch(Exception e) {
		  e.printStackTrace(); }
		  response.sendRedirect(request.getContextPath() +"/architectui-html-free/addPub.php"); }
		 
		  if(path.equals("/architectui-html-free/deleteConference1.php")){
				int id_conference = Integer.parseInt(request.getParameter("id_conference"));
				try {
					Conference_data_base.deleteConference(id_conference);
				}catch(Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect(request.getContextPath() + "/architectui-html-free/addConference.php");
			}
		//*****************************************logout*********************************************
			if(path.equals("/architectui-html-free/logout.php")) {
				HttpSession  session = request.getSession();
				session.invalidate();
			
				request.getRequestDispatcher("/architectui-html-free/index.jsp").forward(request, response);
			}
			
			
			if(path.equals("/architectui-html-free/actualites.php")) {
				
				
				Pub_data_base c = new Pub_data_base(SingletonConnection.getConnection());
				List<Publication> publications= Pub_data_base.LesPublications(); 
				System.out.println("liste : "+publications);
				request.setAttribute("publications", publications);
				
				ProjetRecherche_data_base prj = new ProjetRecherche_data_base(SingletonConnection.getConnection());
				List<ProjetRecherche> projetRecherche= prj.LesProjet(); 
				System.out.println("liste : "+projetRecherche);
				request.setAttribute("projetRecherche", projetRecherche);
				
				Soutenance_data_base sout = new Soutenance_data_base(SingletonConnection.getConnection());
				List<Soutenance> soutenances= sout.ListesSoutenances(); 
				System.out.println("liste : "+soutenances);
				request.setAttribute("soutenances", soutenances);
				
				Conference_data_base conf = new Conference_data_base(SingletonConnection.getConnection());
				List<Conference> conferences= conf.ListesConferences(); 
				System.out.println("liste : "+conferences);
				request.setAttribute("conferences", conferences);
				
				
				Encadrement_data_base enc = new Encadrement_data_base(SingletonConnection.getConnection());
				List<Encadrement> encadrements= enc.ListesEncadrements(); 
				System.out.println("liste : "+encadrements);
				request.setAttribute("encadrements", encadrements);
				
				chercheur_data_base e= new chercheur_data_base(SingletonConnection.getConnection());
				System.out.println("liste : "+e);
				request.setAttribute("e", e);
			
				request.getRequestDispatcher("/architectui-html-free/actualites.jsp").forward(request, response);
			}
			
	//*****************************************************coté Admin *******************************************************************
			if(path.equals("/TemplateAdmin/kiaalap-master/addEquipe.php")) {
				
				Labo_data_base c = new Labo_data_base(SingletonConnection.getConnection());
				//List<Labo> labos = c.LaboNom(); 
				//request.setAttribute("labos", labos);
				
				
				chercheur_data_base cher = new chercheur_data_base(SingletonConnection.getConnection());
				List<chercheur_Model> chercheurs= cher.LesChercheur(); 
				request.setAttribute("chercheurs", chercheurs);
				
				request.getRequestDispatcher("add-equipe.jsp").forward(request, response);
			}
			
			
			


			
//**********************************************axe recherche ****************************************************************
			if(path.equals("/TemplateAdmin/kiaalap-master/deleteAxeR.php")){
				int id = Integer.parseInt(request.getParameter("id_axe"));
				try {
					Axe_recherche_data_base.deleteAxe_recherche(id);
				}catch(Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allAxeR.php");
			}
			
			
			
			if(path.equals("/TemplateAdmin/kiaalap-master/editAxeR.php")){
				System.out.println("***");
				String idAxeR= request.getParameter("id_axe");
				System.out.println("idAxeR: " + idAxeR);
				int id_axe = Integer.parseInt(idAxeR);
				
				System.out.println(id_axe);
				//m.setCpt(id);
				Axe_recherche c = Axe_recherche_data_base.getAxeRParId(id_axe);
				
				
					request.setAttribute("AxeRModel", c);
					
				
					System.out.println(c.getNom_axe());
				
					 request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/edit-axeR.jsp").forward(request, response);
			}
			
			
				
				

				if(path.equals("/TemplateAdmin/kiaalap-master/addChercheurEquipe.php")) {
				
					Axe_recherche_data_base c = new Axe_recherche_data_base(SingletonConnection.getConnection());
					List<Axe_recherche> Axe_recherche= c.ListeAxeRecherche(); 
					System.out.println("liste : "+Axe_recherche);
					request.setAttribute("Axe_recherche", Axe_recherche);
				
				request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/add-axeR.jsp").forward(request, response);
			}
				
				
			
				//***********************axe recherche equipe *************************************
				if(path.equals("/TemplateAdmin/kiaalap-master/addAxeREquipe.php")) {
					
					Axe_recherche_data_base c = new Axe_recherche_data_base(SingletonConnection.getConnection());
					List<Axe_recherche> Axe_recherche= c.ListeAxeRecherche(); 
					System.out.println("liste : "+Axe_recherche);
					request.setAttribute("Axe_recherche", Axe_recherche);
					
							  Equipe_data_base q= new
							  Equipe_data_base(SingletonConnection.getConnection());
							  System.out.println("liste : "+q);
							  request.setAttribute("q", q);
							  
				
				request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/add-axeR.jsp").forward(request, response);
			}
				
				
			/*
			 * if(path.equals("/TemplateAdmin/kiaalap-master/allAxeREquipe.php")) {
			 * 
			 * Equipe_data_base e= new
			 * Equipe_data_base(SingletonConnection.getConnection());
			 * request.setAttribute("e", e);
			 * 
			 * int id_equipe = Integer.parseInt(request.getParameter("id_equipe"));
			 * Axe_recherche_data_base a = new
			 * Axe_recherche_data_base(SingletonConnection.getConnection());
			 * 
			 * List<Axe_recherche> axesREquipe= a.NomChercheurParIdEquipe(id_equipe);
			 * request.setAttribute("axesREquipe", axesREquipe);
			 * 
			 * request.getRequestDispatcher(
			 * "/TemplateAdmin/kiaalap-master/all-chercheur_equipe.jsp").forward(request,
			 * response); }
			 */
				//******************************prof****************************************s
			if(path.equals("/TemplateAdmin/kiaalap-master/addProfessor.php")) {
				chercheur_data_base ch = new chercheur_data_base(SingletonConnection.getConnection());
				List<String> responsablite_chercheur = ch.Respnsabilte_chercheur(); 
				System.out.println("liste : "+responsablite_chercheur);
				request.setAttribute("responsablite_chercheur", responsablite_chercheur);


				List<String> responsabilite_pedagogique_chercheur = ch.RespnsabiltePedago_chercheur(); 
				System.out.println("liste : "+responsabilite_pedagogique_chercheur);
				request.setAttribute("responsabilite_pedagogique_chercheur", responsabilite_pedagogique_chercheur);
							 
				

				System.out.println("type chercheur !!!");
				List<String> type_chercheur = ch.type_chercheur(); 
				System.out.println("liste : "+type_chercheur);
				request.setAttribute("type_chercheur", type_chercheur);
				
				Equipe_data_base eq = new Equipe_data_base (SingletonConnection.getConnection());
				List<Equipe> equipes= eq.ListesEquipes(); 
				System.out.println("liste : "+equipes);
				request.setAttribute("equipes", equipes);
				
				Labo_data_base c = new Labo_data_base(SingletonConnection.getConnection());
				List<Labo> labos = c.LaboNom(); 
				System.out.println("liste : "+labos);
				request.setAttribute("labos", labos);
				
				
				
				request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/add-professor.jsp").forward(request, response);

				


			}
			
			if(path.equals("/TemplateAdmin/kiaalap-master/deleteProfessor.php")){
				int id_chercheur = Integer.parseInt(request.getParameter("id_chercheur"));
				try {
					chercheur_data_base.deleteChercheur(id_chercheur);
				}catch(Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allProfessor.php");
			}
			
			
			if(path.equals("/TemplateAdmin/kiaalap-master/editProfessor.php")){
				System.out.println("***");
				String idCher= request.getParameter("id_chercheur");
				System.out.println("idCher : " + idCher);
				int id_chercheur = Integer.parseInt(idCher);
				
				System.out.println(id_chercheur);
				//m.setCpt(id);
				chercheur_Model c = chercheur_data_base.getCherchParId(id_chercheur);
				
				
					request.setAttribute("chercheur_Model", c);
					
				
					System.out.println(c.getNom_chercheur());
				
					 request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/edit-professor.jsp").forward(request, response);
			}
			
			
			if(path.equals("/TemplateAdmin/kiaalap-master/allProfessor.php")) {
				chercheur_data_base cher = new chercheur_data_base(SingletonConnection.getConnection());
				List<chercheur_Model> chercheurs= cher.LesChercheur(); 
				System.out.println("liste : "+chercheurs);
				request.setAttribute("chercheurs", chercheurs);
				
				
				  Labo_data_base c = new Labo_data_base(SingletonConnection.getConnection());
				  List<Labo> labos = c.LaboNom();
				  System.out.println("liste : "+labos);
				  request.setAttribute("labos", labos);
				  
				  Equipe_data_base e= new Equipe_data_base(SingletonConnection.getConnection());
				  System.out.println("liste : "+e);
				  request.setAttribute("e", e);
				  
				 
				
				request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/all-professor.jsp").forward(request, response);
			}
			
			
			//********************************chercheur par equipe *****************************************
			
			if(path.equals("/TemplateAdmin/kiaalap-master/allChercheurEquipe.php")) {

				  Equipe_data_base e= new Equipe_data_base(SingletonConnection.getConnection());
				  request.setAttribute("e", e);
				  
				int id_equipe = Integer.parseInt(request.getParameter("id_equipe"));
				chercheur_data_base cher = new chercheur_data_base(SingletonConnection.getConnection());

				List<chercheur_Model> chercheurs= cher.NomChercheurParIdEquipe(id_equipe); 
				request.setAttribute("chercheurs", chercheurs);
				

				 
				Axe_recherche_data_base a = new Axe_recherche_data_base(SingletonConnection.getConnection());

				List<Axe_recherche> axes= Axe_recherche_data_base.ListeAxeParEquipe(id_equipe); 
				request.setAttribute("axes", axes);
				
				
				m.setCpt_equipe(id_equipe);
				request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/all-chercheur_equipe.jsp").forward(request, response);
				
			}
			
			if(path.equals("/TemplateAdmin/kiaalap-master/ajouterAUneEquipe.php")) {

				  Equipe_data_base e= new Equipe_data_base(SingletonConnection.getConnection());
				  request.setAttribute("e", e);
				  
				
				int id_equipe = Integer.parseInt(request.getParameter("id_equipe"));
				chercheur_data_base cher = new chercheur_data_base(SingletonConnection.getConnection());
				List<chercheur_Model> chercheurs= chercheur_data_base.NomChercheurParIdEquipe(id_equipe); 
				m.setCpt_equipe(id_equipe);
				
				List<chercheur_Model> chercheurSansEq= cher.chercheurSansEq(); 
				System.out.println("liste : "+chercheurSansEq);
				request.setAttribute("chercheurSansEq", chercheurSansEq);
				
				Axe_recherche_data_base a = new Axe_recherche_data_base(SingletonConnection.getConnection());
				List<Axe_recherche> axes= a.NomAxe(); 
				m.setCpt_equipe(id_equipe);
				
					
				
					request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/addChercheur_equipe.jsp").forward(request, response);
				}
				
			if(path.equals("/TemplateAdmin/kiaalap-master/addAxeREquipe2.php")) {
				int id_equipe = Integer.parseInt(request.getParameter("id_equipe"));
				m.setCpt_equipe(id_equipe);
				
				Axe_recherche_data_base cher = new Axe_recherche_data_base(SingletonConnection.getConnection());

				List<Axe_recherche> axes= cher.NomAxe(); 
				request.setAttribute("axes", axes);
				request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/addAxeREquipe.jsp").forward(request, response);

				//this.getServletContext().getRequestDispatcher("/TemplateAdmin/kiaalap-master/addAxeREquipe.jsp");
			}
			
			
			
			
			
			if(path.equals("/TemplateAdmin/kiaalap-master/deleteChercheurEquipe.php")){
				//int id_equipe = Integer.parseInt(request.getParameter("id_equipe"));
				int id_chercheur = Integer.parseInt(request.getParameter("id_chercheur"));
				try {
					chercheur_data_base.SetnullChercheur(id_chercheur);
				}catch(Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allEquipe.php");
			}
			
			if(path.equals("/TemplateAdmin/kiaalap-master/deleteAxeEquipe.php")){
				//int id_equipe = Integer.parseInt(request.getParameter("id_equipe"));
				int id_axe = Integer.parseInt(request.getParameter("id_axe"));
				System.out.println(id_axe);
				System.out.println(m.getCpt_equipe());

				Axe_recherche_data_base.SetnullAxe(id_axe,m.getCpt_equipe());
				try {
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allEquipe.php");
			}
			
			
			
			
			
			/*
			 * if(path.equals("/TemplateAdmin/kiaalap-master/deleteChercheurEquipe.php")){
			 * 
			 * int id_chercheur = Integer.parseInt(request.getParameter("id_chercheur"));
			 * System.out.println(id_chercheur); try {
			 * chercheur_data_base.updateChercheurEquipe(id_chercheur); }catch(Exception e)
			 * { e.printStackTrace(); }
			 * request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/allEquipe.php").
			 * forward(request, response); }
			 */
//********************************Pub par chercheur *****************************************
			
			if(path.equals("/TemplateAdmin/kiaalap-master/allPub.php")) {
				System.out.println("*******************************Professeur************************************************");
				Pub_data_base pub = new Pub_data_base(SingletonConnection.getConnection());
				List<Publication> publications= pub.LesPublications(); 
				System.out.println("liste : "+publications);
				request.setAttribute("publications", publications);
				
				
				chercheur_data_base cher = new chercheur_data_base(SingletonConnection.getConnection());
				List<chercheur_Model> chercheurs= cher.LesChercheur(); 
				System.out.println("liste : "+chercheurs);
				request.setAttribute("chercheurs", chercheurs);
				  
				  chercheur_data_base e= new chercheur_data_base(SingletonConnection.getConnection());
				  System.out.println("liste : "+e);
				  request.setAttribute("e", e);
				  
				 
				
				request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/all-pub.jsp").forward(request, response);
			}
			
			if(path.equals("/TemplateAdmin/kiaalap-master/deletePub.php")){
				int id_pub = Integer.parseInt(request.getParameter("id_pub"));
				try {
					Pub_data_base.deletePublication(id_pub);
				}catch(Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allPub.php");
			}
			
			
			  if(path.equals("/TemplateAdmin/kiaalap-master/allPubChercheur.php")) {
			  System.out.println("*******************************************************************************" );
			  int id_chercheur = Integer.parseInt(request.getParameter("id_chercheur"));
			  
			  List<Publication> publications= Pub_data_base.pubParIdChercheur(id_chercheur);
			  System.out.println("liste : "+publications);
			  request.setAttribute("publications", publications);
			  
			  
			  Equipe_data_base e= new
			  Equipe_data_base(SingletonConnection.getConnection());
			  System.out.println("liste : "+e); request.setAttribute("e", e);
			  
			  
			  
			  request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/all-chercheur_equipe.jsp").forward(request,response);
			  }
			  
				/*
				 * if(path.equals("/TemplateAdmin/kiaalap-master/deletePubChercheur.php")){
				 * 
				 * int id_chercheur = Integer.parseInt(request.getParameter("id_chercheur"));
				 * System.out.println(id_chercheur); try {
				 * chercheur_data_base.updateChercheurEquipe(id_chercheur); }catch(Exception e)
				 * { e.printStackTrace(); }
				 * request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/allEquipe.php").
				 * forward(request, response); }
				 */
			
//********************************equipe par labo *****************************************
			
			if(path.equals("/TemplateAdmin/kiaalap-master/allEquipeLabo.php")) {
				  Equipe_data_base e= new Equipe_data_base(SingletonConnection.getConnection());
				  request.setAttribute("e", e);
				 
				  
				int id_labo = Integer.parseInt(request.getParameter("id_labo"));
				chercheur_data_base q= new chercheur_data_base(SingletonConnection.getConnection());
				
				List<Equipe> equipes= Equipe_data_base.NomEquipeParIdLabo(id_labo); 
				System.out.println("liste : "+equipes);
				request.setAttribute("equipes", equipes);
				
			

				
				
				request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/all-equipe_labo.jsp").forward(request, response);
			}
			
			if(path.equals("/TemplateAdmin/kiaalap-master/deleteEquipeLabo.php")){
				
					 int id_equipe = Integer.parseInt(request.getParameter("id_equipe"));
					 System.out.println(id_equipe);
						try {
							Equipe_data_base.updateEquipeLabo(id_equipe);
						}catch(Exception e) {
							e.printStackTrace();
						}
						 request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/allLabo.php").forward(request, response);			
						 }
			
			//**********************Axe de recherche d'une equipe ********************
			
			
			
			//********************************Conference*****************************************
			if(path.equals("/TemplateAdmin/kiaalap-master/deleteConference.php")){
				int id = Integer.parseInt(request.getParameter("idConf"));
				try {
					Conference_data_base.deleteConference(id);
				}catch(Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allConference.php");
			}
			
			
			
			if(path.equals("/TemplateAdmin/kiaalap-master/allConference.php")) {
				System.out.println("*******************************************************************************");
				Conference_data_base c = new Conference_data_base(SingletonConnection.getConnection());
				List<Conference> conferences= c.ListesConferences(); 
				request.setAttribute("conferences", conferences);
				
				
				List<String> TypeConf = c.ConferenceParType(); 
				request.setAttribute("TypeConf", TypeConf);
				
				
				List<String> IntituleConf = c.ConferenceParIntitule(); 
				request.setAttribute("IntituleConf", IntituleConf);
				
				chercheur_data_base cher= new chercheur_data_base(SingletonConnection.getConnection());
				request.setAttribute("cher", cher);
				
				request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/all-conference.jsp").forward(request, response);
			}
			
			
			//***********************projet de recherche*********************************************
			if(path.equals("/TemplateAdmin/kiaalap-master/deleteProjetDRecherche.php")){
				int id = Integer.parseInt(request.getParameter("idProjet"));
				try {
					ProjetRecherche_data_base.deleteProjetRecherche(id);
				}catch(Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allProjetrecherche.php");
			}
			
			if(path.equals("/architectui-html-free/deleteProjetDRecherche1.php")){
				int id_projet_recherche = Integer.parseInt(request.getParameter("id_projet_recherche"));
				try {
					ProjetRecherche_data_base.deleteProjetRecherche(id_projet_recherche);
				}catch(Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect(request.getContextPath() + "/architectui-html-free/addProjetRecherche.php");
			}
			
			if(path.equals("/TemplateAdmin/kiaalap-master/allProjetrecherche.php")) {
				System.out.println("*******************************************************************************");
				ProjetRecherche_data_base c = new ProjetRecherche_data_base(SingletonConnection.getConnection());
				List<ProjetRecherche> projetDRecherche= c.ListeDProjetDRecherche(); 
				System.out.println("liste : "+projetDRecherche);
				request.setAttribute("projetDRecherche", projetDRecherche);
				
				chercheur_data_base cher= new chercheur_data_base(SingletonConnection.getConnection());
				System.out.println("liste : "+cher);
				request.setAttribute("cher", cher);
				
				request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/all-Projet_recherche.jsp").forward(request, response);
			}
			//********************************************soutenance*******************************************************
			if(path.equals("/TemplateAdmin/kiaalap-master/deleteSoutenance.php")){
				int id = Integer.parseInt(request.getParameter("idSout"));
				try {
					Soutenance_data_base.deleteSoutenance(id);
				}catch(Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allSoutenance.php");
			}
			
			if(path.equals("/architectui-html-free/deleteSoutenance1.php")){
				int id = Integer.parseInt(request.getParameter("id_soutenance"));
				try {
					Soutenance_data_base.deleteSoutenance(id);
				}catch(Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect(request.getContextPath() + "/architectui-html-free/addSoutenance.php");
			}
			 
			if(path.equals("/TemplateAdmin/kiaalap-master/allSoutenance.php")) {
				System.out.println("*******************************************************************************");
				Soutenance_data_base c = new Soutenance_data_base(SingletonConnection.getConnection());
				List<Soutenance> soutenances= c.ListesSoutenances(); 
				System.out.println("liste : "+soutenances);
				request.setAttribute("soutenances", soutenances);
				
				
				List<String> TypeSout = c.SoutenanceParType(); 
				System.out.println("liste : "+TypeSout);
				request.setAttribute("TypeSout", TypeSout);
				
				
				List<String> IntituleSout = c.SoutenanceParIntitule(); 
				System.out.println("liste : "+IntituleSout);
				request.setAttribute("IntituleSout", IntituleSout);
				
				chercheur_data_base cher= new chercheur_data_base(SingletonConnection.getConnection());
				System.out.println("liste : "+cher);
				request.setAttribute("cher", cher);
				
				
				request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/all-soutenance.jsp").forward(request, response);
			}
			//********************************************encadrement*******************************************************
			if(path.equals("/TemplateAdmin/kiaalap-master/deleteEncadrement.php")){
				int id = Integer.parseInt(request.getParameter("idEnca"));
				try {
					Encadrement_data_base.deleteEncadrement(id);
				}catch(Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allEncadrement.php");
			}
			
			if(path.equals("/architectui-html-free/deleteEncadrement1.php")){
				int id_encadrement = Integer.parseInt(request.getParameter("id_encadrement"));
				try {
					Encadrement_data_base.deleteEncadrement(id_encadrement);
				}catch(Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect(request.getContextPath() + "/architectui-html-free/addEncadrement.php");
			}
			
			if(path.equals("/TemplateAdmin/kiaalap-master/allEncadrement.php")) {
				System.out.println("*******************************************************************************");
				Encadrement_data_base e = new Encadrement_data_base(SingletonConnection.getConnection());
				
				List<Encadrement> encadrements= e.ListesEncadrements(); 
				System.out.println("liste : "+encadrements);
				request.setAttribute("encadrements", encadrements);
				
				
				List<String> TypeEncadr = e.EncadrementParType(); 
				System.out.println("liste : "+TypeEncadr);
				request.setAttribute("TypeEncadr", TypeEncadr);
				
				
				List<String> IntituleEncad = e.EncadrementParIntitule(); 
				System.out.println("liste : "+IntituleEncad);
				request.setAttribute("IntituleEncad", IntituleEncad);
				
				List<String> NiveauEncad = e.EncadrementParNiveau(); 
				System.out.println("liste : "+NiveauEncad);
				request.setAttribute("NiveauEncad", NiveauEncad);
				
				List<String> Encadrement = e.Encadrement(); 
				request.setAttribute("Encadrement", Encadrement);
				
				chercheur_data_base cher = new chercheur_data_base(SingletonConnection.getConnection());
				List<chercheur_Model> chercheurs= cher.LesChercheur(); 
				System.out.println("liste : "+chercheurs);
				request.setAttribute("chercheurs", chercheurs);
				
				 
				 System.out.println("liste : "+cher);
				 request.setAttribute("cher", cher);
				
				
				request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/all-encadrement.jsp").forward(request, response);
			}
			//***********************Equipe**********************************************
			
			if(path.equals("/TemplateAdmin/kiaalap-master/deleteEquipe.php")){
				int id = Integer.parseInt(request.getParameter("id_equipe"));
				try {
					Equipe_data_base.deleteEquipe(id);
				}catch(Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allEquipe.php");
			}
			
			if(path.equals("/TemplateAdmin/kiaalap-master/allEquipe.php")) {
				Equipe_data_base eq = new Equipe_data_base(SingletonConnection.getConnection());
				
				List<Equipe> equipes= eq.ListesEquipes(); 
				request.setAttribute("equipes", equipes);
				
				
				chercheur_data_base cher = new chercheur_data_base(SingletonConnection.getConnection());
				List<chercheur_Model> chercheurs= cher.LesChercheur(); 

				request.setAttribute("chercheurs", chercheurs);
				
				chercheur_data_base q= new chercheur_data_base(SingletonConnection.getConnection());
				request.setAttribute("q", q);
				
				
				request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/all-equipe.jsp").forward(request, response);
			}
			if(path.equals("/TemplateAdmin/kiaalap-master/editEquipe.php")){
				System.out.println("***");
				String idEquipe= request.getParameter("id_equipe");
				System.out.println("idEquipe : " + idEquipe);
				int id_equipe = Integer.parseInt(idEquipe);
				
				System.out.println(id_equipe);
				//m.setCpt(id);
				Equipe equipeModel = Equipe_data_base.getEquipeParId(id_equipe);
				
				
					request.setAttribute("equipeModel", equipeModel);
					
				
					System.out.println(equipeModel.getNom_equipe());
					
				
					 request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/edit-equipe.jsp").forward(request, response);
			}
			
			//***************************Labos********************************************
			
			if(path.equals("/TemplateAdmin/kiaalap-master/deleteLabo.php")){
				int id = Integer.parseInt(request.getParameter("id_labo"));
				try {
					Labo_data_base.deleteLabo(id);
				}catch(Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allLabo.php");
			}
			
			if(path.equals("/TemplateAdmin/kiaalap-master/allLabo.php")) {
				System.out.println("********************************labos***********************************************");
				
				  Labo_data_base c = new Labo_data_base(SingletonConnection.getConnection());
				  List<Labo> labos = c.LaboNom();
				  System.out.println("liste : "+labos);
				  request.setAttribute("labos", labos);
		
				request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/all-labo.jsp").forward(request, response);
			}
			
			if(path.equals("/TemplateAdmin/kiaalap-master/editLabo.php")){
				System.out.println("***");
				String idLabo= request.getParameter("id_labo");
				System.out.println("idLabo : " + idLabo);
				int id_labo = Integer.parseInt(idLabo);
				
				System.out.println(id_labo);
				//m.setCpt(id);
				Labo laboModel = Labo_data_base.getLaboParId(id_labo);
				
				
					request.setAttribute("laboModel", laboModel);
					
				
					System.out.println(laboModel.getNom_labo());
					
				
					 request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/edit-labo.jsp").forward(request, response);
			}
			
			
			
//**************************************les chercheurs par equipe ***********************
			
			if(path.equals("/TemplateAdmin/kiaalap-master/deleteChercheur.php")){
				int id = Integer.parseInt(request.getParameter("id_chercheur"));
				try {
					Equipe_data_base.deleteEquipe(id);
				}catch(Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allChercheurDEquipe.php");
			}
			
			//************************log out***********************************
			if(path.equals("/TemplateAdmin/kiaalap-master/logout.php")) {
				HttpSession  session = request.getSession();
				session.invalidate();
				response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/login.jsp");
			
			}
			
			if(request.getServletPath().equals("/TemplateAdmin/kiaalap-master/pdf.php")) {
				try {
	                response.setContentType("application/pdf");
	                DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
	                String currentDateTime = dateFormatter.format(new java.util.Date());
	                String headerKey = "Content-Disposition";
	                String headerValue = "attachment; filename=liste " + currentDateTime + ".pdf";
	                response.setHeader(headerKey, headerValue);
	                chercheur_data_base cher = new chercheur_data_base(SingletonConnection.getConnection());
	                List<chercheur_Model> listUsers = cher.LesChercheur();
	                PDFChercheur exporter = new PDFChercheur(listUsers);
	                exporter.export1(response);
	            }
				catch(Exception e) {
					response.sendRedirect("page_404.jsp");
	                e.printStackTrace();
	            }
			}
			else
				if(request.getServletPath().equals("/TemplateAdmin/kiaalap-master/ChercheurParEquipe.php")) {
					try {
						System.out.println("hh");
	                    response.setContentType("application/pdf");
	                    DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
	                    String currentDateTime = dateFormatter.format(new java.util.Date());
	                    String headerKey = "Content-Disposition";
	                    m.setPdfChEq(96);
	                    String nom=Equipe_data_base.getEquipeParId(m.getPdfChEq()).getNom_equipe();
	                    System.out.println(nom);
	                    String headerValue = "attachment; filename=chercheur d'equipe "+nom+" " + currentDateTime + ".pdf";
	                    response.setHeader(headerKey, headerValue);
	                    List<chercheur_Model> listCHEq =chercheur_data_base.NomChercheurParIdEquipe(m.getPdfChEq());
	                    PDFChercheur exporter = new PDFChercheur(listCHEq);
	                    exporter.export2(response);
	                }
					catch(Exception e) {
						response.sendRedirect("page_404.jsp");
	                    e.printStackTrace();
	                }
				}
			
			
			
				else 
					 if(request.getServletPath().equals("/TemplateAdmin/kiaalap-master/pdfPub.php")) {
						try {
			                response.setContentType("application/pdf");
			                DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
			                String currentDateTime = dateFormatter.format(new java.util.Date());
			                String headerKey = "Content-Disposition";
			                String headerValue = "attachment; filename=liste " + currentDateTime + ".pdf";
			                response.setHeader(headerKey, headerValue);
			                int id_chercheur =135;
			                Pub_data_base p = new Pub_data_base(SingletonConnection.getConnection());
			                List<Publication> listPub = p.pubParIdChercheur(id_chercheur);
			                PDFPub exporter = new PDFPub(listPub);
			                exporter.export(response);
			            }
						catch(Exception e) {
							response.sendRedirect("page_404.jsp");
			                e.printStackTrace();
			            }
					}
					 else 
						 if(request.getServletPath().equals("/TemplateAdmin/kiaalap-master/pdfPubALL.php")) {
								try {
					                response.setContentType("application/pdf");
					                DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
					                String currentDateTime = dateFormatter.format(new java.util.Date());
					                String headerKey = "Content-Disposition";
					                String headerValue = "attachment; filename=liste " + currentDateTime + ".pdf";
					                response.setHeader(headerKey, headerValue);
					                int id_chercheur =135;
					                Pub_data_base p = new Pub_data_base(SingletonConnection.getConnection());
					                List<Publication> listPub = p.LesPublications();
					                PDFPub exporter = new PDFPub(listPub);
					                exporter.export(response);
					            }
								catch(Exception e) {
									response.sendRedirect("page_404.jsp");
					                e.printStackTrace();
					            }
							}
							/*
							 * else if(request.getServletPath().equals(
							 * "/TemplateAdmin/kiaalap-master/pdfG.php.php")) { try {
							 * response.setContentType("application/pdf"); DateFormat dateFormatter = new
							 * SimpleDateFormat("yyyy-MM-ddHH:mm:ss"); String currentDateTime =
							 * dateFormatter.format(new java.util.Date()); String headerKey =
							 * "Content-Disposition"; String headerValue = "attachment; filename=liste " +
							 * currentDateTime + ".pdf"; response.setHeader(headerKey, headerValue); int
							 * id_chercheur =135; Pub_data_base p = new
							 * Pub_data_base(SingletonConnection.getConnection()); List<Publication> listPub
							 * = p.LesPublications(); Soutenance_data_base s = new
							 * Soutenance_data_base(SingletonConnection.getConnection()); List<Soutenance>
							 * listSout = s.ListesSoutenances(); PDFG exporter1 = new PDFG(listPub); PDFG
							 * exporter2 = new PDFG(listSout); exporter1.export(response); } catch(Exception
							 * e) { response.sendRedirect("page_404.jsp"); e.printStackTrace(); } }
							 */
						 else 
							 
							 if(request.getServletPath().equals("/TemplateAdmin/kiaalap-master/pdfPubDate.php")) {
									try {
						                response.setContentType("application/pdf");
						                DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
						                String currentDateTime = dateFormatter.format(new java.util.Date());
						                String headerKey = "Content-Disposition";
						                String headerValue = "attachment; filename=liste " + currentDateTime + ".pdf";
						                response.setHeader(headerKey, headerValue);
						                //String d = request.getParameter("d");
						                Pub_data_base p = new Pub_data_base(SingletonConnection.getConnection());
						                List<Publication> listPub = p.listAllPubMc("2021");
						                System.out.println(listPub);
						                PDFPub exporter = new PDFPub(listPub);
						                exporter.export(response);
						            }
									catch(Exception e) {
										response.sendRedirect("page_404.jsp");
						                e.printStackTrace();
						            }
								}
			if(path.equals("/TemplateAdmin/kiaalap-master/ajouterAUnLabo.php")) {
				  Labo_data_base r= new Labo_data_base(SingletonConnection.getConnection());
				  request.setAttribute("labo", r);
				  

				
				int id_labo = Integer.parseInt(request.getParameter("id_labo"));
				
				//int id_labo=15;
				Equipe_data_base cher = new Equipe_data_base(SingletonConnection.getConnection());
				List<Equipe> equipes= Equipe_data_base.NomEquipeParIdLabo(id_labo); 
				m.setId_labo(id_labo);
				
				List<Equipe> EquipeSansLabo= cher.EquipeSansLabo(); 
				
				request.setAttribute("EquipeSansLabo", EquipeSansLabo);
				
				m.setId_labo(id_labo);
				
					request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/addEquipe_labo.jsp").forward(request, response);
				}
			//**********************************************************************************************************************
			
			if(request.getServletPath().equals("/TemplateAdmin/kiaalap-master/word1.php") ) {
		        try { 
		        FileWriter fstream = new FileWriter("D:/Rapport_d'activites_general.doc"); 
		        BufferedWriter out = new BufferedWriter(fstream); 
		               String str = "" +
		        "<meta http-equiv='Content-Type' content='text/html; charset=ISO-8859-1' />" +
		                        "<center>" + "<br><hr width='700' ><br>" +  "<table border='0' width='700' height='100' cellpadding='3' style='border-collapse:collapse;' bgcolor='F1AB81'>" + 
		                        "<tr>" +   "<td align='center' style='border:1px solid black'><b><h1>Rapport de tous les activites du Laboratoire de Recherche</h1></b></td>" +
		                        "</tr>" + "</table>" +  "<br><hr width='700' ><br><br>" +  
		                        "<img src=\"PFE/WebContent/images/logo2.png\" alt=\"\" />" +
		                        " "+"<table border='0' width='700' height='100' cellpadding='3' style='border-collapse:collapse;'  >" + 
		                                "<tr>" +   "<td align='left' style='border:0px solid white'><p style='font-size:14px;' >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
		                                "Les activités scientifiques prenez un rôle important pour les chercheurs (doctorants, docteur, enseignant) dans le laboratoire scientifiques, " +
		                        "et parmi les éléments de ses activités que peut être gérer par chercheurs: <br>" +
		                        "Une thèse de doctorat est une épreuve que vous permet d’obtenir un diplôme de doctorant, " +
		                        "et Le Projet de Fin d'Etudes (PFE) est un projet final qui se fait à la fin d'un cycle d'études académiques." +
		                        "</p></td>" +
		                                "</tr>" + "</table>"+" <br><br> ";
		               
		               
		                   // affichage les equipes    
		               String str1 = "" + "<table border='0' width='700' cellpadding='3' style='border-collapse:collapse;' bgcolor='D4D5CF'>" + 
		                        "<tr>" +   "<td align='center' style='border:1px solid black'><b><h2>Les equipes</h2></b></td>" +  "</tr>" + "</table>" + 
		                        "" + "<table border='0' width='700' cellpadding='3' style='border-collapse:collapse;'>" +  "<tr bgcolor='#F4FB91' align='center'>" +
		                        "<td style='border:1px solid black'><b>ID d'equipe</b></td>" +   
		                        "<td style='border:1px solid black'><b>Nom d'Equipe</b></td>" +  "</tr>" ;
		            // affichage projets de recherches
		               String str2 = "" + "<table border='0' width='700' cellpadding='3' style='border-collapse:collapse;' bgcolor='D4D5CF'>" + 
		                        "<tr>" +   "<td align='center' style='border:1px solid black'><b><h2>Les Projets de Recherches</h2></b></td>" +  "</tr>" + "</table>" + 
		                          "<table border='0' width='700' cellpadding='3' style='border-collapse:collapse;'>" +  "<tr bgcolor='#F4FB91' align='center'>" +
		                        "<td style='border:1px solid black'><b>Intitule de Projet</b></td>" +   
		                        "<td style='border:1px solid black'><b>Duree</b></td>" +  "</tr>" ;
		            // affichage des Publications scientifiques
		               String str3 = "" + "<table border='0' width=700'  cellpadding='3' style='border-collapse:collapse;' bgcolor='D4D5CF'>" + 
		                       "<tr>" +   "<td align='center' style='border:1px solid black'><b><h2>Les Publications scientifiques</h2> </b></td>" +  "</tr>" + "</table>" + 
		                       "" + "<table border='0' width='700' cellpadding='3' style='border-collapse:collapse;'>" +  "<tr bgcolor='#F4FB91' align='center'>" +
		                       "<td style='border:1px solid black'><b>Intitule de Publications </b></td>" +  
		                       "<td style='border:1px solid black'><b>Auteurs </b></td>" +  
		                       "<td style='border:1px solid black'><b>Abstract</b></td>" +  "</tr>" ;        
		            // affichage Theses soutenues
		               String str5 = "" + "<table border='0' width='700' cellpadding='3' style='border-collapse:collapse;' bgcolor='D4D5CF'>" + 
		                       "<tr>" +   "<td align='center' style='border:1px solid black'><b><h2>Les Theses soutenues</h2> </b></td>" +  "</tr>" + "</table>" + 
		                       "" + "<table border='0' width='700' cellpadding='3' style='border-collapse:collapse;'>" +  "<tr bgcolor='#F4FB91' align='center'>" +
		                       "<td style='border:1px solid black'><b>Intitule de Projet</b></td>" +   
		                       "<td style='border:1px solid black'><b>ccccc</b></td>" +  "</tr>" ;
		            // affichage les Membres
		               String str4 = "" + "<table border='0' width='700' cellpadding='3' style='border-collapse:collapse;' bgcolor='D4D5CF'>" + 
		                       "<tr>" +   "<td align='center' style='border:1px solid black'><b><h2>Les Membres</h2> </b></td>" +  "</tr>" + "</table>" + 
		                       "" + "<table border='0' width='700' cellpadding='3' style='border-collapse:collapse;'>" +  "<tr bgcolor='#F4FB91' align='center'>" +
		                       "<td style='border:1px solid black'><b>Nom & Prenom </b></td>" +   
		                       "<td style='border:1px solid black'><b>Profil</b></td>" +
		                       "<td style='border:1px solid black'><b>Adresse </b></td>" + "</tr>" ;
		               
		               String str15 = ""  + 
		                        "<table border='0' width='700' cellpadding='3' style='border-collapse:collapse;'>" +  "<tr>" +   
		                        "<td align='left'><input type='submit' value='Previous' id='modifPrevious'/></td>" +   
		                        "<td align='right'><input type='submit' value='  Next  ' id='modifNext'/></td>" +  "</tr>" + 
		                        "</table>" + "<br/>" + "</center>"; 
		               
		               String s = ""  + "</table>" + "<br/>" ; 
		        
		        out.write(str);
		        // affichage des membres
		        chercheur_data_base ch = new chercheur_data_base(SingletonConnection.getConnection());
		        List<chercheur_Model> D = chercheur_data_base.LesChercheur();
		           out.write(str4);
		        for(chercheur_Model d:D) {
		        out.write(  "" + 
		            "<tr>" +   "<td style='border:1px solid black'>" +  d.getNom_chercheur() + d.getPrenom_chercheur() + "</td>" +   
		            "<td style='border:1px solid black'> " + d.getType_chercheur() +" </td>" +
		            "<td style='border:1px solid black'>" +  d.getResponsablite_chercheur() + "</td>" + "</tr>"  );
		        }out.write(s);
		        
		            // affichage les equipes 
		        Equipe_data_base a = new Equipe_data_base(SingletonConnection.getConnection());
		          List<Equipe> A=Equipe_data_base.ListesEquipes();
		            out.write(str1);
		        for(Equipe x:A) {
		        out.write(  "" + 
		                "<tr>" +   "<td style='border:1px solid black'>" +  x.getId_equipe() + "</td>" +  
		                "<td style='border:1px solid black'> " + x.getNom_equipe() +" </td>" +  "</tr>"   );
		        }out.write(s);
		        
		                   // affichage projets de recherches
		        ProjetRecherche_data_base pr = new ProjetRecherche_data_base(SingletonConnection.getConnection());
		               List<ProjetRecherche> B=ProjetRecherche_data_base.ListeDProjetDRecherche();
		               out.write(str2); 
		           for(ProjetRecherche b:B) {
		           out.write(  "" + 
		                "<tr>" +   "<td style='border:1px solid black'>" +  b.getTitre_projet_recherch() + "</td>" +  
		                "<td style='border:1px solid black'> "+ b.getBudget_projet_recherche() +" </td>" +  "</tr>"  );
		        }out.write(s);
		        
		        
		               // affichage des Publications
		        Pub_data_base pub = new Pub_data_base(SingletonConnection.getConnection());
		           List<Publication> C=Pub_data_base.LesPublications();
		           out.write(str3);
		            for(Publication c:C) {
		                out.write(  "" + 
		           "<tr>" +   "<td style='border:1px solid black'>" +  c.getTitre_pub() + "</td>" +  
		             "<td style='border:1px solid black'> " + chercheur_data_base.getCherchParId(c.getId_chercheur()) +" </td>"  +
		             "<td style='border:1px solid black'>" +  c.getAbstract_pub() + "</td>" + "</tr>"  );
		        }out.write(s);
		        
		                  // affichage Theses soutenues
		        Soutenance_data_base ep = new Soutenance_data_base(SingletonConnection.getConnection());
		            List<Soutenance> E = Soutenance_data_base.ListesSoutenances();
		           out.write(str5);
		        for(Soutenance c:E) {
		        out.write(  "" + 
		            "<tr>" +   "<td style='border:1px solid black'>" +  c.getType_soutenance() + c.getLieu_soutenance() + "</td>" +  
		            "<td style='border:1px solid black'> " + c.getIntitule_soutenance() +" </td>" +  "</tr>"  );
		        }out.write(s);
		        
		        out.write(str15);
		        out.close(); } 
		        catch (Exception e) {  System.err.println("Error: " + e.getMessage()); }   
		        
		        request.setAttribute("msg", "Le Telechargement doit terminer avec succes (voir dans votre disque local D)");
		                 response.sendRedirect("/TemplateAdmin/kiaalap-master/index.jsp");
		         }
			////µµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµ
			if(request.getServletPath().equals("/TemplateAdmin/kiaalap-master/rech_act.php") ) {   
				System.out.println("***");
				  try { 
				  String MC = request.getParameter("cle_act");
				  FileWriter fstream = new FileWriter("D:/Rapport_d'activites_general d'année "+ MC +".doxc"); 
				  BufferedWriter out = new BufferedWriter(fstream);
				         
				       
				         String str = "" +
				  "<meta http-equiv='Content-Type' content='text/html; charset=ISO-8859-1' />" +
				                  "<center>" + "<br><hr width='700' ><br>" +  "<table border='0' width='700' height='100' cellpadding='3' style='border-collapse:collapse;' bgcolor='F1AB81'>" + 
				                  "<tr>" +   "<td align='center' style='border:1px solid black'><b><h1>Rapport de tous les activites du Laboratoire de Recherche dans l'Année "+ MC +"</h1></b></td>" +
				                  "</tr>" + "</table>" +  "<br><hr width='700' ><br><br>" +
				                  "" +
				                  " "+"<table border='0' width='700' height='100' cellpadding='3' style='border-collapse:collapse;'  >" + 
				                          "<tr>" +   "<td align='left' style='border:0px solid white'><p style='font-size:14px;' >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
				                          "Les activités scientifiques prenez un rôle important pour les chercheurs (doctorants, docteur, enseignant) dans le laboratoire scientifiques, " +
				                  "et parmi les éléments de ses activités que peut être gérer par chercheurs: <br>" +
				                  "Une thèse de doctorat est une épreuve que vous permet d’obtenir un diplôme de doctorant, " +
				                  "et Le Projet de Fin d'Etudes (PFE) est un projet final qui se fait à la fin d'un cycle d'études académiques." +
				                  "</p></td>" +
				                          "</tr>" + "</table>"+" <br><br> ";
				        String s = ""  + "</table>" + "<br/>" ; 
				 
				    out.write(str);
				     
				   
				         
				         // affichage des Publications scientifiques
				         String str3 = "" + "<table border='0' width=700'  cellpadding='3' style='border-collapse:collapse;' bgcolor='D4D5CF'>" + 
				                 "<tr>" +   "<td align='center' style='border:1px solid black'><b><h2>Les Publications scientifiques d'annee "+ MC +"</h2> </b></td>" +  "</tr>" + "</table>" + 
				                 "" + "<table border='0' width='700' cellpadding='4' style='border-collapse:collapse;'>" +  "<tr bgcolor='#F4FB91' align='center'>" +
				                 "<td style='border:1px solid black'><b>Intitule de Publications </b></td>" +  
				                 "<td style='border:1px solid black'><b>Auteurs </b></td>" +  
				                 "<td style='border:1px solid black'><b>Abstract</b></td>" +
				                "<td style='border:1px solid black'><b>Annee </b></td>" + "</tr>" ; 
				         Pub_data_base publ = new Pub_data_base(SingletonConnection.getConnection());
				         List<Publication> C=Pub_data_base.PublicationParMc(MC);
				   out.write(str3);
				    for(Publication c:C) {
				        out.write(  "" + 
				   "<tr>" +   "<td style='border:1px solid black'>" +  c.getTitre_pub() + "</td>" +  
				     "<td style='border:1px solid black'> " + chercheur_data_base.getCherchParId(c.getId_chercheur()) +" </td>"  +      
				     "<td style='border:1px solid black'>" +  c.getAbstract_pub() + "</td>" +
				     "<td style='border:1px solid black'> " + c.getD() +" </td>"  +"</tr>"  );
				}out.write(s);



				    
				         

				         
				         String str15 = ""  + 
				                  "<table border='0' width='700' cellpadding='3' style='border-collapse:collapse;'>" +  "<tr>" +   
				                  "<td align='left'><input type='submit' value='Previous' id='modifPrevious'/></td>" +   
				                  "<td align='right'><input type='submit' value='  Next  ' id='modifNext'/></td>" +  "</tr>" + 
				                  "</table>" + "<br/>" + "</center>"; 
				 
				            
				  
				  out.write(str15);
				  out.close(); } 
				  catch (Exception e) {  System.err.println("Error: " + e.getMessage()); }   
				  request.setAttribute("msg", "Le Telechargement doit terminer avec succes (voir dans votre disque local D)");
				         response.sendRedirect("/TemplateAdmin/kiaalap-master/index.jsp");
				  
				  }

	}
		  
		         //===================================================================//
		         //===================================================================//
		         //===================================================================//
		         //===================================================================//       //===================================================================//

		     


			
	
	
					/*
					 * if(path.equals("/TemplateAdmin/kiaalap-master/allChercheurEquipe.php")) {
					 * 
					 * Equipe_data_base e= new
					 * Equipe_data_base(SingletonConnection.getConnection());
					 * request.setAttribute("e", e);
					 * 
					 * int id_equipe = Integer.parseInt(request.getParameter("id_equipe"));
					 * Axe_recherche_data_base a = new
					 * Axe_recherche_data_base(SingletonConnection.getConnection());
					 * 
					 * List<Axe_recherche> axes=
					 * Axe_recherche_data_base.ListeAxeParEquipe(id_equipe);
					 * request.setAttribute("axes", axes);
					 * 
					 * this.getServletContext().getRequestDispatcher(
					 * "/TemplateAdmin/kiaalap-master/all-chercheur_equipe.jsp").forward(request,
					 * response); } }
					 */
	
	/**
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("***********************************************************");

		String path = request.getServletPath();
		System.out.println("path : " + path);
		
		//************************************************partie util***********************************************************
		
		
		if(path.equals("/architectui-html-free/registration.php")) {
			System.out.println("path="+path);
			System.out.println("****");
			String nom_chercheur = request.getParameter("nom_chercheur");
			String prenom_chercheur = request.getParameter("prenom_chercheur");

			String mdp = request.getParameter("mdp");
			String type_chercheur = request.getParameter("type_chercheur");
		
			
			String email_chercheur = request.getParameter("email_chercheur");
			/*
			 * if (!email_chercheur.matches("(.*)edu.umi.ac.ma")) {
			 * request.setAttribute("msg1", "sasissez un email academique");
			 * //this.getServletContext().getRequestDispatcher(
			 * "/architectui-html-free/forms-controls.JS").forward(request, response); }
			 */

			int tel_chercheur = Integer.parseInt(request.getParameter("tel_chercheur"));
			byte[]  photo_chercheur=null;
			String responsablite_chercheur = request.getParameter("responsablite_chercheur");
			String responsabilite_pedagogique_chercheur = request.getParameter("responsabilite_pedagogique_chercheur");
			final Part filePart = request.getPart("photo_chercheur");
			InputStream pdfFileBytes = filePart.getInputStream();
			if (filePart.getSize()>0) {
			final byte[] bytes = new byte[pdfFileBytes.available()];
			pdfFileBytes.read(bytes);
	
			chercheur_Model userModel = new chercheur_Model(nom_chercheur,prenom_chercheur,mdp,type_chercheur,email_chercheur,tel_chercheur,photo_chercheur,responsablite_chercheur,responsabilite_pedagogique_chercheur);
			chercheur_data_base regUser = new chercheur_data_base(SingletonConnection.getConnection());
			userModel.setPhoto_chercheur(bytes);

			if (regUser.saveUser1(userModel)) {
				
				response.sendRedirect(request.getContextPath() + "/architectui-html-free/forms-validation.jsp");
			}
			else {
				System.out.println("erreur");
			}


		}

		}
		
		if(path.equals("/architectui-html-free/Login.php")) {
			System.out.println("*************************************login************************************************");
			String nom_chercheur = request.getParameter("username");
			String mdp = request.getParameter("password");
			
			

			chercheur_Model login = new chercheur_Model();
			

			login.setNom_chercheur(nom_chercheur);
			login.setMdp(mdp);
			
			
			try {
				if (login_data_base.validate(login)) {
					HttpSession session = request.getSession();
					session.setAttribute("username",nom_chercheur);
					session.setAttribute("password", mdp);
					chercheur_data_base ch = new chercheur_data_base(SingletonConnection.getConnection());
					List<String> type_chercheur = ch.type_chercheur(); 
					System.out.println("liste : "+type_chercheur);
					session.setAttribute("type_chercheur", type_chercheur);
					
					
				
					response.sendRedirect(request.getContextPath() + "/architectui-html-free/actualites.php");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

		
		
		if(path.equals("/architectui-html-free/pub.php")) {
			


			String titre_pub = request.getParameter("titre_pub");
			String abstract_pub = request.getParameter("abstract_pub");
			byte[] justificatif_pub = null;
			Date date_publication = Date.valueOf(request.getParameter("date_publication"));
			String type_publication = request.getParameter("type_publication");
			int id_chercheur =Integer.parseInt(request.getParameter("nom_chercheur"));
			byte[] pdfPub = null;
			
			final Part filePart1 = request.getPart("justificatif_pub");
			final Part filePart2 = request.getPart("pdfPub");
			InputStream pdfFileBytes1 = filePart1.getInputStream();
			InputStream pdfFileBytes2 = filePart2.getInputStream();
			if ((filePart1.getSize()>0) && (filePart2.getSize()>0)) {
				
			final byte[] bytes1 = new byte[pdfFileBytes1.available()];
			final byte[] bytes2 = new byte[pdfFileBytes2.available()];
			pdfFileBytes1.read(bytes1);
			pdfFileBytes2.read(bytes2);
	
			Publication pub = new Publication(titre_pub,abstract_pub,justificatif_pub,type_publication,id_chercheur,date_publication,pdfPub);
			Pub_data_base pubModel = new  Pub_data_base(SingletonConnection.getConnection());
			pub.setJustificatif_pub(bytes1);
			pub.setJustificatif_pub(bytes2);
			
			if (pubModel.savePub(pub)) {
				request.getRequestDispatcher("index.jsp").forward(request, response);
				System.out.println("c fait ");
			} else {
				String errorMessage = "User Available";
				HttpSession regSession = request.getSession();
				regSession.setAttribute("RegError", errorMessage);
				request.getRequestDispatcher("registration.jsp").forward(request, response);
			}

		}
		}
		
		// ********************************************************partie admin****************************************************
		if(path.equals("/TemplateAdmin/kiaalap-master/AdminLogin.php")) {
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				
				//String role = request.getParameter("role");

				
				//System.out.println("role : " + role);
				

				AdminLogin admiLogin = new AdminLogin();
				

				admiLogin.setUsername(username);
				admiLogin.setPassword(password);
				//admiLogin.setRole(role);
				
				Admin_login_data_base admin = new Admin_login_data_base();
				try {
					if (admin.validate(admiLogin)) {
						HttpSession session = request.getSession();
						session.setAttribute("username",username);
						session.setAttribute("password", password);
						String user = admiLogin.getUsername();
						String roleA = admin.getRoleAdmin();
						System.out.println("RoleA : " + roleA);
						session.setAttribute("user",user);
						session.setAttribute("roleA",roleA);
						System.out.println("********");
						//response.sendRedirect("/architectui-html-free/index.jsp");
						request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/index.jsp").forward(request, response);
						
					} else {

						System.out.println("try again");

					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

//*********************************************axe recherche ******************************************************
		
		if(path.equals("/TemplateAdmin/kiaalap-master/addAxeR1.php")) {

			String nom_axe = request.getParameter("nom_axe");
			

			Axe_recherche axeR= new Axe_recherche(nom_axe);
			Axe_recherche_data_base AxeRModel = new  Axe_recherche_data_base(SingletonConnection.getConnection());
			
			AxeRModel.saveAxe_recherche(axeR);
			response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allAxeR.php");
			}
		
		
		if(path.equals("/TemplateAdmin/kiaalap-master/updateAxeR.php")){
			int id_axe = Integer.parseInt(request.getParameter("id_axe"));
		
			System.out.println("id_axe: " + id_axe);
			String nom_axe = request.getParameter("nom_axe");
			
			
			Axe_recherche c = new Axe_recherche(id_axe,nom_axe);
			
			System.out.println("Axe_rechercheModel : " + c);		
			
			Axe_recherche_data_base l = new  Axe_recherche_data_base(SingletonConnection.getConnection());
			Axe_recherche_data_base.updateAxe_recherche(c, id_axe);
			response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allAxeR.php");
		}
		
		//*********************************************axe recherche ******************************************************
		
				if (path.equals("/TemplateAdmin/kiaalap-master/addAxeREquipe3.php")) {
					
					int id_axe = Integer.parseInt(request.getParameter("id_axe"));
					Axe_recherche ch = new Axe_recherche();
					ch.setId_axe(m.getId_axeR());
					
					Axe_recherche_data_base.updateAxeEquipe(id_axe, m.getCpt_equipe());

					response.sendRedirect(request.getContextPath() +"/TemplateAdmin/kiaalap-master/allEquipe.php");
				
				}
				
				//*********************logout******************
				if(path.equals("/TemplateAdmin/kiaalap-master/logout.php")) {
					HttpSession  session = request.getSession();
					session.invalidate();
					response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/AdminLogin.jsp");
				
				}
		//************************labo*********************************************************************************************
		if(path.equals("/TemplateAdmin/kiaalap-master/addLabo.php")) {
			String nom_labo = request.getParameter("nom_labo");


			Labo Labo= new Labo(nom_labo);
			Labo_data_base LaboModel = new Labo_data_base(SingletonConnection.getConnection());
			if (LaboModel.saveLab(Labo)) {
				response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allLabo.php");
			} 

		}
		
		
		
				if(path.equals("/TemplateAdmin/kiaalap-master/updateLabo.php")){
					int id_labo = Integer.parseInt(request.getParameter("id_labo"));
				
					System.out.println("id_labo : " + id_labo);
					String nom_labo = request.getParameter("nom_labo");
					
					
					Labo c = new Labo(id_labo,nom_labo);
					
					System.out.println("Labo Model : " + c);		
					
					Labo_data_base l = new  Labo_data_base(SingletonConnection.getConnection());
					Labo_data_base.updateLabo(c, id_labo);
					response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allLabo.php");
				}
				
				
				
		//====================================equipe===========================================================================
		if(path.equals("/TemplateAdmin/kiaalap-master/addEquipe1.php")) {

			
			String nom_equipe = request.getParameter("nom_equipe"); 
			String chef_equipe = request.getParameter("chef_equipe"); 
			String ACRO_equipe = request.getParameter("ACRO_equipe"); 
			//int id_labo =Integer.parseInt(request.getParameter("nom_labo"));
			int id_chercheur =Integer.parseInt(request.getParameter("nom_chercheur"));
			
			

			Equipe equi = new Equipe(nom_equipe,ACRO_equipe,chef_equipe,id_chercheur);
			Equipe_data_base equiModel = new Equipe_data_base(SingletonConnection.getConnection());


			if (equiModel.saveEquipe(equi)) {

				System.out.println("c fait "); 
				response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allEquipe.php");
			}



		}

				
		
		if (path.equals("/TemplateAdmin/kiaalap-master/ajouterAUneEquipe1.php")) {
			int id_chercheur = Integer.parseInt(request.getParameter("id_chercheur"));
			chercheur_Model ch = new chercheur_Model();
			ch.setId_equipe(m.getCpt_equipe());
			
			chercheur_data_base.updateChercheurEquipe(id_chercheur, ch);

			response.sendRedirect(request.getContextPath() +"/TemplateAdmin/kiaalap-master/allEquipe.php");
		
		}
		
		if(path.equals("/TemplateAdmin/kiaalap-master/updateEquipe.php")){
			int id_equipe = Integer.parseInt(request.getParameter("id_equipe"));
		
			System.out.println("id_equipe : " + id_equipe);
			
			int id_chercheur = Integer.parseInt(request.getParameter("id_chercheur"));
			
			String nom_equipe = request.getParameter("nom_equipe");
			String ACRO_equipe = request.getParameter("ACRO_equipe");
			String chef_equipe = request.getParameter("chef_equipe");
			Equipe equipeModel= new Equipe(id_equipe,nom_equipe,ACRO_equipe,id_chercheur,chef_equipe);
			
			
			Equipe_data_base ch = new Equipe_data_base(SingletonConnection.getConnection());
			
			
			Equipe_data_base.updateEquipe(equipeModel, id_equipe);
			response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allEquipe.php");
			
			
		}
		//************************prof************************************************************
		if(path.equals("/TemplateAdmin/kiaalap-master/updateProfessor.php")){
			int id_chercheur = Integer.parseInt(request.getParameter("id_chercheur"));
		
			System.out.println("id_chercheur : " + id_chercheur);
			
			int id_equipe = Integer.parseInt(request.getParameter("id_equipe"));
			int id_labo= Integer.parseInt(request.getParameter("id_labo"));
			String nom_chercheur = request.getParameter("nom_chercheur");
			String prenom_chercheur = request.getParameter("prenom_chercheur");
			String mdp = request.getParameter("mdp");
			String type_chercheur = request.getParameter("type_chercheur");
			String email_chercheur = request.getParameter("email_chercheur");
			int tel_chercheur = Integer.parseInt(request.getParameter("tel_chercheur"));
			
			String responsablite_chercheur = request.getParameter("responsablite_chercheur");
			String responsabilite_pedagogique_chercheur = request.getParameter("responsabilite_pedagogique_chercheur");
			
			
			
			
			chercheur_Model c = new chercheur_Model(id_chercheur,nom_chercheur,prenom_chercheur,mdp,type_chercheur,email_chercheur,tel_chercheur,responsablite_chercheur,responsabilite_pedagogique_chercheur,id_equipe,id_labo);
			
			System.out.println("chercheur Model : " + c);		
			
			chercheur_data_base ch = new  chercheur_data_base(SingletonConnection.getConnection());
			
			
			chercheur_data_base.updateChercheur(c, id_chercheur);
			response.sendRedirect(request.getContextPath() + "/TemplateAdmin/kiaalap-master/allProfessor.php");
			
			
		
		}
		
		if(path.equals("/TemplateAdmin/kiaalap-master/addProfessor1.php")) {
			

			String nom_chercheur = request.getParameter("nom_chercheur");
			String prenom_chercheur = request.getParameter("prenom_chercheur");
			String mdp = request.getParameter("mdp");
			String type_chercheur = request.getParameter("type_chercheur");
			String email_chercheur = request.getParameter("email_chercheur");
			int tel_chercheur = Integer.parseInt(request.getParameter("tel_chercheur"));
			byte[]  photo_chercheur=null;
			String responsablite_chercheur = request.getParameter("responsablite_chercheur");
			String responsabilite_pedagogique_chercheur = request.getParameter("responsabilite_pedagogique_chercheur");
			//int id_equipe = Integer.parseInt(request.getParameter("nom_equipe"));
			//int id_labo = Integer.parseInt(request.getParameter("nom_labo"));	
			//int id_labo =0;
			chercheur_Model c = new chercheur_Model(nom_chercheur,prenom_chercheur,mdp,type_chercheur,email_chercheur,tel_chercheur,photo_chercheur,responsablite_chercheur,responsabilite_pedagogique_chercheur);
			chercheur_data_base ch = new chercheur_data_base(SingletonConnection.getConnection());
			
	
			if (ch.saveUser1(c)) {
				 request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/index.jsp").forward(request, response);
			} 
				}
		

		
//======================================================utilisateur===================================================================================
		
		if(path.equals("/architectui-html-free/addEncadrement1.php")) {

			
			HttpSession session = request.getSession();
			String username = (String) session.getAttribute("username");
			String password = (String) session.getAttribute("password");
			
			chercheur_Model m = chercheur_data_base.getIdChercheurParPassAndUser(username,password);
			int id_chercheur = m.getId_chercheur();
			
			System.out.println("*******************ajouter un encadrement*****************");
			String  type_encadrement =request.getParameter("type_encadrement"); 
			String  intitule_encadrement = request.getParameter("intitule_encadrement");
			String niveau_encadrement = request.getParameter("niveau_encadrement");
			byte[] justificatif = null;
			byte[] pdfEncadr = null;
			Date date_encadrement = Date.valueOf(request.getParameter("date_encadrement"));
			String  encadrement = null;

			final Part filePart1 = request.getPart("justificatif");
			final Part filePart2  = request.getPart("pdfEncadr");
			
			InputStream pdfFileBytes1 = null;
			InputStream pdfFileBytes2 = null;
			if ((filePart1.getSize()>0)&&(filePart2.getSize()>0)) {
			pdfFileBytes1 = filePart1.getInputStream();
			pdfFileBytes2 = filePart2.getInputStream();
			final byte[] bytes1 = new byte[pdfFileBytes1.available()];
			final byte[] bytes2 = new byte[pdfFileBytes2.available()];
			pdfFileBytes1.read(bytes1);
			pdfFileBytes2.read(bytes2);
		
			Encadrement ancadr = new Encadrement(type_encadrement,intitule_encadrement,niveau_encadrement,justificatif,pdfEncadr,id_chercheur,date_encadrement,encadrement);
			Encadrement_data_base encadrModel = new Encadrement_data_base(SingletonConnection.getConnection());
				
			ancadr.setJustificatif(bytes1);
			ancadr.setPdfEncadre(bytes2);
				
			if (encadrModel.saveEncadrement(ancadr)) {
				System.out.println("c fait "); 
				response.sendRedirect(request.getContextPath() + "/architectui-html-free/addEncadrement.php");
			} 
				}
		}
		
		
		
		if(path.equals("/architectui-html-free/addProjetRecherche1.php")) {

			
			HttpSession session = request.getSession();
			String username = (String) session.getAttribute("username");
			String password = (String) session.getAttribute("password");
			
			chercheur_Model m = chercheur_data_base.getIdChercheurParPassAndUser(username,password);
			int id_chercheur = m.getId_chercheur();
			
			String  titre_projet_recherch =request.getParameter("titre_projet_recherch"); 
			String  description_projet_recherche = request.getParameter("description_projet_recherche");
			double Budget_projet_recherche = Double.parseDouble(request.getParameter("budget_projet_recherche"));
			byte[] justificatif_projet_recherche = null;
			byte[] pdfProjet = null;
			
			

			
			final Part filePart1 = request.getPart("justificatif_projet_recherche");
			final Part filePart2 = request.getPart("pdfProjet");
			InputStream pdfFileBytes1 = filePart1.getInputStream();
			InputStream pdfFileBytes2 = filePart2.getInputStream();
			if ((filePart1.getSize()>0) && (filePart2.getSize()>0)) {
				
			final byte[] bytes1 = new byte[pdfFileBytes1.available()];
			final byte[] bytes2 = new byte[pdfFileBytes2.available()];
			pdfFileBytes1.read(bytes1);
			pdfFileBytes2.read(bytes2);
	
			ProjetRecherche prj = new ProjetRecherche(titre_projet_recherch,description_projet_recherche,Budget_projet_recherche,justificatif_projet_recherche,pdfProjet,id_chercheur);
			ProjetRecherche_data_base prjtModel = new ProjetRecherche_data_base(SingletonConnection.getConnection());
			prj.setJustificatif_projet_recherche(bytes1);
			prj.setPdfProjet(bytes2);

			if (prjtModel.saveProjetRecherche(prj)) {

				
				System.out.println("c fait "); 
				response.sendRedirect(request.getContextPath() + "/architectui-html-free/addProjetRecherche.php");
			}

		}
		}
		if(path.equals("/architectui-html-free/addSoutenance1.php")) {
			
			HttpSession session = request.getSession();
			String username = (String) session.getAttribute("username");
			String password = (String) session.getAttribute("password");
			
			chercheur_Model m = chercheur_data_base.getIdChercheurParPassAndUser(username,password);
			int id_chercheur = m.getId_chercheur();
			String type_soutenance = request.getParameter("type_soutenance");
			
			String intitule_soutenance = request.getParameter("intitule_soutenance");
			
			byte[] justificatif_soutenance = null;
			byte[] pdfSout= null;
			String lieu_soutenance = request.getParameter("lieu_soutenance");
			
			Date date_soutenance =Date.valueOf(request.getParameter("date_soutenance"));
			
			
			
			final Part filePart1 = request.getPart("justificatif_soutenance");
			final Part filePart2 = request.getPart("pdfSout");
			InputStream pdfFileBytes1 = filePart1.getInputStream();
			InputStream pdfFileBytes2 = filePart2.getInputStream();
				if ((filePart1.getSize()>0) && (filePart2.getSize()>0)) {
				final byte[] bytes1 = new byte[pdfFileBytes1.available()];
				final byte[] bytes2 = new byte[pdfFileBytes1.available()];
				pdfFileBytes1.read(bytes1);
				pdfFileBytes2.read(bytes2);
				
				
				Soutenance sout = new Soutenance(type_soutenance,intitule_soutenance,justificatif_soutenance, lieu_soutenance,id_chercheur,date_soutenance,pdfSout);
				
				Soutenance_data_base soutModel = new  Soutenance_data_base(SingletonConnection.getConnection());
				
				sout.setJustificatif_soutenance(bytes1);
				sout.setPdfSout(bytes2);
				
			if (soutModel.saveSoutenance(sout)) {
				response.sendRedirect(request.getContextPath() + "/architectui-html-free/addSoutenance.php");
				System.out.println("c fait ");
			} 
				}
		}
			
		if(path.equals("/architectui-html-free/addConference1.php")) {
			System.out.println("********************************ajouter Conference***********************************************");
			HttpSession session = request.getSession();
			String username = (String) session.getAttribute("username");
			String password = (String) session.getAttribute("password");
			
			chercheur_Model m = chercheur_data_base.getIdChercheurParPassAndUser(username,password);
			int id_chercheur = m.getId_chercheur();
			String type_conference = request.getParameter("type_conference");
			System.out.println("typeConf : " + type_conference);
			
			String intitule_conference = request.getParameter("intitule_conference");
			
			byte[] justificatif_conference = null;
			byte[] pdfConf = null;
			String lieu_conference = request.getParameter("lieu_conference");
			//int id_chercheur = Integer.parseInt(request.getParameter("nom_chercheur"));
			
			Date date_conference =Date.valueOf(request.getParameter("date_conference"));
			final Part filePart1 = request.getPart("conferencefile");
			final Part filePart2 = request.getPart("pdfConffile");
			
			InputStream pdfFileBytes1 = null;
			InputStream pdfFileBytes2 = null;
			if ((filePart1 !=null) && (filePart2 != null)) {
			pdfFileBytes1 = filePart1.getInputStream();
			pdfFileBytes2 = filePart2.getInputStream();
			final byte[] bytes1 = new byte[pdfFileBytes1.available()];
			final byte[] bytes2 = new byte[pdfFileBytes2.available()];
			pdfFileBytes1.read(bytes1);
			pdfFileBytes2.read(bytes2);
		
				Conference conf = new Conference(type_conference,intitule_conference,bytes1, lieu_conference,id_chercheur,date_conference,bytes2);
				
				System.out.println("Conférence : " + conf);
				
				Conference_data_base confModel = new  Conference_data_base(SingletonConnection.getConnection());
			
				
			if (confModel.saveConf(conf)) {
				response.sendRedirect(request.getContextPath() + "/architectui-html-free/addSoutenance.php");
			} 
				}
		}
		
		if(path.equals("/architectui-html-free/addPub1.php")) {
			HttpSession session = request.getSession();
			String username = (String) session.getAttribute("username");
			String password = (String) session.getAttribute("password");
			
			chercheur_Model m = chercheur_data_base.getIdChercheurParPassAndUser(username,password);
			int id_chercheur = m.getId_chercheur();
			
			String titre_pub = request.getParameter("titre_pub");
			
			String abstract_pub = request.getParameter("abstract_pub");
			
			byte[] justificatif_pub = null;
			String type_publication = request.getParameter("type_publication");
			
			Date date_publication = Date.valueOf(request.getParameter("date_publication"));
			byte[] pdfPub = null;
			
			final Part filePart1 = request.getPart("justificatif_pub");
			final Part filePart2 = request.getPart("pdfPub");
			InputStream pdfFileBytes1 = filePart1.getInputStream();
			InputStream pdfFileBytes2 = filePart2.getInputStream();
			if ((filePart1.getSize()>0) && (filePart2.getSize()>0)) {
				
			final byte[] bytes1 = new byte[pdfFileBytes1.available()];
			final byte[] bytes2 = new byte[pdfFileBytes2.available()];
			pdfFileBytes1.read(bytes1);
			pdfFileBytes2.read(bytes2);
	
			Publication pub= new Publication(titre_pub,abstract_pub,justificatif_pub,type_publication,id_chercheur,date_publication,pdfPub);
			Pub_data_base pubModel = new  Pub_data_base(SingletonConnection.getConnection());
			pub.setJustificatif_pub(bytes1);
			pub.setPdfPub(bytes2);
			
				
			if (pubModel.savePub(pub)) {
				response.sendRedirect(request.getContextPath() + "/architectui-html-free/addPub.php");
				System.out.println("c fait ");
			} 
				}
		}
		
		if(path.equals("/TemplateAdmin/kiaalap-master/laboParMc.php")) {
		String mc=request.getParameter("mc");
		System.out.println(mc);
		List<Labo> listlabo=Labo_data_base.LaboParMc(mc);
		
		
		request.setAttribute("labos", listlabo);
		
		request.getRequestDispatcher("/TemplateAdmin/kiaalap-master/allLabo.php").forward(request, response);
		}
		
		if (path.equals("/TemplateAdmin/kiaalap-master/ajouterAUnLabo1.php")) {
			int id_equipe = Integer.parseInt(request.getParameter("id_equipe"));
			Equipe ch = new Equipe();
			ch.setId_labo(m.getId_labo());
			
			Equipe_data_base.updateEquipeLabo(id_equipe, ch);

			response.sendRedirect(request.getContextPath() +"/TemplateAdmin/kiaalap-master/allLabo.php");
		
		}
		
		
		
	
		}
	
}
	
	

	




