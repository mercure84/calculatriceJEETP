package com.calculatrice.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.calculatrice.beans.Retour;

/**
 * Servlet implementation class calculatrice
 */
@WebServlet("/calculatrice")
public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Calculatrice() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int nombre1 = 5;
		int nombre2 = 8;
		request.setAttribute("nombre1", nombre1);
		request.setAttribute("nombre2", nombre2);

		// création d'un objet "dataResultat" qui sera transmis à la jsp
		
		Retour data = new Retour();
		String message = data.retourFinal();
		request.setAttribute("message", message);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// conversion des paramètres en nombres, traitement du cas si un champs est vide, le nombre devient 0
		int postNb1;
		int postNb2;
		try {
		postNb1 = Integer.parseInt(request.getParameter("nombre1"));
		}
		
		catch (NumberFormatException e) {
			postNb1 = 0;
		}
		try {
				postNb2 = Integer.parseInt(request.getParameter("nombre2"));}
		catch (NumberFormatException e){
			postNb2 = 0;
			
		}

		
		// création d'un chaine "opérateur" 
		String operateur = request.getParameter("operation") ;
		

		// création d'un objet "data" qui sera transmis à la jsp
		
		Retour data = new Retour();
		data.setAfficherCalcul(true);
		data.setNb1(postNb1);
		data.setNb2(postNb2);
		data.setOperateur(operateur);
		String message = data.retourFinal();
		
		// transmision de l'object à la jsp 
		request.setAttribute("message", message);
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
		
		
		
	}

}