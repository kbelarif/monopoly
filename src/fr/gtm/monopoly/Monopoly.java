package fr.gtm.monopoly;

import java.util.ArrayList;
import java.util.List;

public class Monopoly {
	private Plateau plateau= new Plateau();
	private List<Joueur> joueurs = new ArrayList<Joueur>();
	private Gobelet gobelet = new Gobelet();
	private Banque banque = new Banque(5000);
	int sommeDepart;
	
	public void add(Joueur...joueurs) {
		for(Joueur j : joueurs) {
			this.joueurs.add(j);
			j.getPion().setPosition(plateau.getCaseDepart());
		}
	}
	
	public void demarrer() {
		System.out.println("Monopoly: lancement du jeu");
		System.out.println("==========================");
		System.out.println("Initialisation des soldes");
		for(Joueur j:joueurs) {
			banque.verserArgent(j,sommeDepart);
		}
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
