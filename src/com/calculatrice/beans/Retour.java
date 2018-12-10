package com.calculatrice.beans;

public class Retour {
	private boolean afficherCalcul = false;
	private boolean erreur = false;
	private int nb1 = 0;
	private int nb2 = 0;
	private int resultat = 0;
	private String operateur ="rien";
	private String signe;
	
	public String retourFinal() {
		
		String message="" ;
		// calcul selon opérateur
		
		switch (operateur) {
		case "add" :
			signe = " + ";
			resultat = nb1 + nb2;
			break;
		case "sous":
			signe = " - ";
			resultat = nb1 - nb2;
			break;
		case "divi" :
			signe = " / ";
			// traitement du cas de la division par zero ==> génère une erreur que l'on catch 
			try {
			resultat = nb1 / nb2;}
			catch (Exception e) {
			erreur = true ;}
			break;
		case "multi":
			signe = " * ";
			resultat = nb1 * nb2;
			break;
		case "rien":
			afficherCalcul = false;
			break;
		}
		if (!afficherCalcul) {
			message = " ";
		}else {
		if (erreur) {
			
			message = "Division par zero impossible !";
			
		} else {
			
			message = String.valueOf(nb1) + signe + String.valueOf(nb2) + " = " + resultat;
		}
		}
		return message ;
		
	};
	
	
	public String getSigne() {
		return signe;
	}


	public void setSigne(String signe) {
		this.signe = signe;
	}


	public boolean isAfficherCalcul() {
		return afficherCalcul;
	}
	public void setAfficherCalcul(boolean afficherCalcul) {
		this.afficherCalcul = afficherCalcul;
	}
	public boolean isErreur() {
		return erreur;
	}
	public void setErreur(boolean erreur) {
		this.erreur = erreur;
	}
	public int getNb1() {
		return nb1;
	}
	public void setNb1(int nb1) {
		this.nb1 = nb1;
	}
	public int getNb2() {
		return nb2;
	}
	public void setNb2(int nb2) {
		this.nb2 = nb2;
	}
	public int getResultat() {
		return resultat;
	}
	public void setResultat(int resultat) {
		this.resultat = resultat;
	}
	public String getOperateur() {
		return operateur;
	}
	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}
	
	
	
	

}
