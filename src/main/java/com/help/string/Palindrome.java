package com.help.string;

public class Palindrome {

		private String chaine;
		
		public Palindrome() {
			super();
		}

		public Palindrome(String chaine) {
			this.chaine = chaine;
		}


		public boolean checkCaseOn(){
			int taille = this.chaine.length();
			int i=0;
			int j = taille-1;
			while(i<taille/2 && this.chaine.charAt(i) == this.chaine.charAt(j)){
				i++;
				j--;
			}
			return (i>=taille/2);
		}
		
		public boolean checkCaseOff(){
			int taille = this.chaine.length();
			int i=0;
			int j = taille-1;
			while(i<taille/2 && this.chaine.toLowerCase().charAt(i) == this.chaine.toLowerCase().charAt(j)){
				i++;
				j--;
			}
			return (i>=taille/2);
		}
		
		
		public String getChaine() {
			return chaine;
		}

		public void setChaine(String chaine) {
			this.chaine = chaine;
		}


				
		
}
