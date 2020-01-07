package fr.gtm.monopoly;

import java.util.ArrayList;
import java.util.List;

public class Monopoly {
	private Plateau plateau= new Plateau();
	private List<Joueur> joueurs = new ArrayList<Joueur>();
	private Gobelet gobelet = new Gobelet();
	//private Banque banque = new Banque(5000);
	int sommeDepart;
	private Joueur vainqueur;
	
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
		int i=0;
		while(joueurs.size()>1) {
			System.out.println("======Tour "+(i+1)+"======" );
			for(int k=0; k<joueurs.size();k++) {
				Joueur j = joueurs.get(k);
				System.out.print("->>> "+j.getNom()+" joue, il tire un ");
				j.jouer(gobelet);
				
				System.out.println(" ");
				if(j.getSolde()<0) {
					System.out.println("le joueur "+j.getNom()+" a été supprimé");
					retirer(j);
				}
			}
			i++;
		}
		vainqueur = joueurs.get(0);
		System.out.println("Le vainquer est "+vainqueur.getNom());
	}

	private void retirer(Joueur j) {
		for(Propriete prop : j.getProprietes()) {
			prop.setProprio(null);
		}
		this.joueurs.remove(j);
	}
}
