package fr.gtm.monopoly;

public class Impot extends Case {

	public Impot() {
		super("Case Impot");
	}
	
	public void arreter(Pion p) {
		p.getJoueur().setSolde(Math.min(p.getJoueur().getSolde() -500, p.getJoueur().getSolde()/10));
	}

}
