package fr.gtm.monopoly;

public final class Depart extends Case{

	public Depart() {
		
		super("Case Depart");		
	}
	
	public void survoler(Pion p) {
		p.getJoueur().setSolde(p.getJoueur().getSolde() + 200);
		
	}
	
	public void arreter(Pion p) {
		p.getJoueur().setSolde(p.getJoueur().getSolde() + 400);
	}

}
