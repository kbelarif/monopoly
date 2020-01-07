package fr.gtm.monopoly;

public class Plateau {

		private Case[] cases = new Case[40]; 
		
		public Plateau() {
			creerCases();
			lierCases();
		}

		private void creerCases() {
			
			for(int i=0; i<cases.length;i++) {
				switch(i) {
				case 0: cases[i] = new Depart(); break;
				case 3: cases[i] = new Impot(); break;
				case 37: cases[i] = new TaxedeLuxe(); break;
				default: cases[i] = new Terrain("terrain "+i); break;
				}
				
			}
			
		}

		private void lierCases() {
			for(int i=0; i<cases.length -1; i++) {
				cases[i].setSuivante(cases[i+1]);
			}
			cases[cases.length -1].setSuivante(cases[0]);
		}
		
		public Case getCaseDepart() {
			return cases[0];
		}
}