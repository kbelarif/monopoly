package fr.gtm.monopoly;

public class Plateau {

		private Case[] cases = new Case[40]; 
		
		public Plateau() {
			creerCases();
			lierCases();
		}

		private void creerCases() {
			cases[0] = new Depart();
			for(int i=1; i<cases.length;i++) {
				cases[i] = new Case("case "+i);
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