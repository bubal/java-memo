package com.help.tri;

public class ArbreTri {

	private int tableauIn[];
	private int tableauOut[];
	private Node arbre;
	private int index;

	public ArbreTri(int [] tab){

		this.tableauIn = tab;
		this.arbre = new Node();
		this.arbre.setValeur(tab[0]);

		for(int i = 1; i < tab.length; i++){
			Node node = new Node(tab[i]);
			ajouter(node,arbre);
		}
	}


	/* 
	 * Méthode d'ajout récursive :
	 * Si la valeur du noeud est supérieur à la valeur de la racine courante, 
	 * on l'insère à droite sinon à gauche
	 */
	private void ajouter (Node node, Node racine){

		if (node.getValeur()>racine.getValeur()){
			if (racine.getDroite()==null){
				racine.setDroite(node);
			}
			else ajouter(node, racine.getDroite());
		}
		else {
			if (racine.getGauche()==null){
				racine.setGauche(node);
			}
			else ajouter(node,racine.getGauche());
		}
	}


	/*
	 * Méthode récursive de parcours de la structure arborescente :
	 * pour le sens croissant on parcours de gauche à droite
	 * pour le sens décroissant on parcours de droite à gauche
	 */
	private void parcourir(Node racine){
		if (racine!=null){
			parcourir(racine.getGauche());
			this.tableauOut[index++]=racine.getValeur();
			parcourir(racine.getDroite());
		}
	}

	public int[] getTableauIn() {
		return tableauIn;
	}

	public void setTableauIn(int[] tableauIn) {
		this.tableauIn = tableauIn;
	}

	public int[] getTableauOut() {
		this.index = 0;
		tableauOut = new int[tableauIn.length];
		parcourir(this.arbre);
		return tableauOut;
	}

	public void setTableauOut(int[] tableauOut) {
		this.tableauOut = tableauOut;
	}

}
