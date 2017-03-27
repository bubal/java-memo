package com.help.tri;

public class TestTri {

	public static void main(String[] args) {
		
		int tableau[]={15,3,52,81,41,0,-2,3,9};
		int tabout[];
		
		ArbreTri arbrenbr = new ArbreTri(tableau);
		
		tabout = arbrenbr.getTableauOut();
		
		System.out.println("Tri par ordre croissant : ");
		
		for (int i=0; i<tabout.length;i++){
			System.out.println(tabout[i]);
		}
	}

}
