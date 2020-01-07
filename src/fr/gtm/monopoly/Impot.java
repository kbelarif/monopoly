package fr.gtm.monopoly;

public class Impot extends Case {

	public Impot() {
		super("Case Impot");
	}
	
	public void arreter(Pion p) {
		p.getJoueur().setSolde(Math.max(p.getJoueur().getSolde() -500, p.getJoueur().getSolde() - p.getJoueur().getSolde()/10));
		System.out.println("solde: "+p.getJoueur().getSolde());
	}

}
