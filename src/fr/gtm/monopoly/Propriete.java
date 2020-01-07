package fr.gtm.monopoly;

public abstract class Propriete extends Case{
	
	private int prixAchat;
	private int loyer;
	private Joueur proprio;
	
	public Propriete(String nom) {
		super(nom);
	}
	
	public int getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(int prixAchat) {
		this.prixAchat = prixAchat;
	}

	public int getLoyer() {
		return loyer;
	}

	public void setLoyer(int loyer) {
		this.loyer = loyer;
	}

	public Joueur getProprio() {
		return proprio;
	}

	public void setProprio(Joueur proprio) {
		this.proprio = proprio;
	}
	
	
	public void arreter(Pion p) {
		super.arreter(p);
		if(this.proprio == null && p.getJoueur().getSolde() - this.getPrixAchat()>=0) {
			this.setProprio(p.getJoueur());
			p.getJoueur().addProprietes(this);
			p.getJoueur().setSolde(p.getJoueur().getSolde() - this.getPrixAchat());
			System.out.println("le joueur achete");
			System.out.println("solde: "+p.getJoueur().getSolde());
		}else if(this.getProprio() != p.getJoueur() && this.getProprio() != null){
			
			p.getJoueur().setSolde(p.getJoueur().getSolde() - this.getLoyer());
			this.getProprio().setSolde(this.getProprio().getSolde() + this.getLoyer());
			System.out.println("le joueur loue");
			System.out.println("solde: "+p.getJoueur().getSolde());
		}
	}
}
