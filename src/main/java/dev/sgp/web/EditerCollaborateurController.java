package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// recupere la valeur d'un parametre dont le nom est matricule
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		
		resp.setContentType("text/html");
		
		if (matricule == null) {
			
			resp.setStatus(400);
			
			resp.getWriter().write("<h1>400</h1><br><br>un matricule est attendu<br><br>");
			
			resp.getWriter().write("<a href=\"http://localhost:8080/sgp/collaborateurs/editer?matricule=M01&titre=Mr&nom=Robert&prenom=Alain\">tester avec un matricule connu</a>");
			
		}
		else if (matricule != null) {
			
			resp.setStatus(201);
			
			resp.getWriter().write("<h1>200</h1><br><br>");
			resp.getWriter().write("<ul>");
			resp.getWriter().write("<li>Matricule : " + matricule + "</li>");
			resp.getWriter().write("<li>Titre : " + titre + "</li>");
			resp.getWriter().write("<li>Nom : " + nom + "</li>");
			resp.getWriter().write("<li>Prenom : " + prenom + "</li>");
			resp.getWriter().write("</ul>");
			
		}
		
		// code HTML ecrit dans le corps de la reponse
		//resp.getWriter().write("<h1>Liste des collaborateurs</h1>" + "<ul>" + "<li>avecPhoto=" + avecPhotoParam
				//+ "</li>" + "<li>departement=" + departementParam + "</li>" + "</ul>");
	}
}
