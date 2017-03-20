package com.help.tri;


public class Node {

		private int valeur;
		private Node gauche;
		private Node droite;
		
		public Node(){
			valeur=0;
			gauche=null;
			droite=null;
		}
		public Node(int value){
			valeur=value;
			gauche=null;
			droite=null;
		}
		
		public int getValeur() {
			return valeur;
		}
		public void setValeur(int valeur) {
			this.valeur = valeur;
		}
		public Node getGauche() {
			return gauche;
		}
		public void setGauche(Node gauche) {
			this.gauche = gauche;
		}
		public Node getDroite() {
			return droite;
		}
		public void setDroite(Node droite) {
			this.droite = droite;
		}
	
}
