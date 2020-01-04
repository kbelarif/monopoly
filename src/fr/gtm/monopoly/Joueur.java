package fr.gtm.monopoly;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
	private String nom;
	private Pion pion;
	private int solde;
	public List<Propriete> getProprietes() {
		return proprietes;
	}

	public void setProprietes(List<Propriete> proprietes) {
		this.proprietes = proprietes;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	private List<Propriete> proprietes = new ArrayList<Propriete>();
	public Pion getPion() {
		return pion;
	}

	public int getSolde() {
		return solde;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Joueur(String nom) {
		this.nom = nom;
	}
	
	public Joueur(String nom, Pion pion) {
		super();
		this.nom = nom;
		this.pion = pion;
	}
	
	public Joueur(String nom, Pion pion, int solde) {
		super();
		this.nom = nom;
		this.pion = pion;
		this.solde = solde;
	}

	public void setPion(Pion p1) {
		this.pion =p1;
		
	}

	public void jouer(Gobelet gobelet) {
		gobelet.lancer();
		int r = gobelet.getValeur();
		System.out.println(r+". ");
		pion.avancer(r);
	}
	

}