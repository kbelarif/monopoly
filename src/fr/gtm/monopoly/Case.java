package fr.gtm.monopoly;

public class Case {
	
	private String nom;
	private Case suivante;
	
	public Case(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Case getSuivante() {
		return suivante;
	}
	public void setSuivante(Case suivante) {
		this.suivante = suivante;
	}
	public void survoler(Pion p) {
		//p.setPosition(p.getPosition().getSuivante());
		
	}
	
	public void arreter(Pion p) {
		//p.setPosition(p.getPosition().getSuivante());
	}
	
}
