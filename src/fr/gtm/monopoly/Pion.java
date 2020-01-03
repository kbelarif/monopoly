package fr.gtm.monopoly;

public class Pion {
	private String nom;
	private Joueur joueur;
	private Case  position;
	
	public Pion(String nom) {
		this.nom = nom;
	}
	public Case getPosition() {
		return position;
	}
	public void setPosition(Case position) {
		this.position = position;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Joueur getJoueur() {
		return joueur;
	}
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	public void avancer(int r) {
	for (int i = 0; i<r-1; i++) {
		position.survoler(this);
		System.out.println("Le Pion "+this.nom+" survole la "+this.getPosition().getNom());
	}
	position.arreter(this);
	System.out.println("Le Pion "+this.getNom()+" s'arrête à la "+this.getPosition().getNom());
}

}
