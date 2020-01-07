package fr.gtm.monopoly;

public class TaxedeLuxe extends Case{

	public TaxedeLuxe() {
		super("Case Taxe de Luxe");
	}
	
	public void arreter(Pion p) {
		p.getJoueur().setSolde(p.getJoueur().getSolde() - 350);
		System.out.println("solde: "+p.getJoueur().getSolde());
	}
}
