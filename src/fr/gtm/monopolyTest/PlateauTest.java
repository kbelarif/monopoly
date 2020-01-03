package fr.gtm.monopolyTest;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.gtm.monopoly.Case;
import fr.gtm.monopoly.Plateau;

public class PlateauTest {

	@Test
	public void test() {
		Plateau plateau = new Plateau();
		Case c = plateau.getCaseDepart();
		int cpt = 0;
		do {
			cpt++;
			c = c.getSuivante();
		}while(c != plateau.getCaseDepart());
		assertEquals(cpt,40);
}
}
