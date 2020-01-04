package fr.gtm.monopoly;

public class Banque {
	private int capital;

	public Banque(int capital) {
		super();
		this.capital = capital;
	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public void verserArgent(Joueur j, int somme) {
		if(this.getCapital() - somme >=0) {
			this.setCapital(this.getCapital() - somme);
		    j.setSolde(j.getSolde() + somme);
		} else {
			System.out.println("Le capital de la banque est insuffisant!!!");
		}
		
		
	}
	
	
}
