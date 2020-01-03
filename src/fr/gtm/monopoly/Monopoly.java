package fr.gtm.monopoly;

import java.util.ArrayList;
import java.util.List;

public class Monopoly {
	private Plateau plateau= new Plateau();
	private List<Joueur> joueurs = new ArrayList<Joueur>();
	private Gobelet gobelet = new Gobelet();
	
	public void add(Joueur...joueurs) {
		for(Joueur j : joueurs) {
			this.joueurs.add(j);
			j.getPion().setPosition(plateau.getCaseDepart());
		}
	}
	
	public void demarrer() {
		System.out.println("Monopoly: lancement du jeu");
		for(int i =0; i<10;i++) {
			System.out.println("======Tour "+(i+1)+"======" );
			for(Joueur j : joueurs) {
				System.out.print("->>> "+j.getNom()+" joue, il tire un ");
				j.jouer(gobelet);
				System.out.println(" ");
			}
		}
	}
}
