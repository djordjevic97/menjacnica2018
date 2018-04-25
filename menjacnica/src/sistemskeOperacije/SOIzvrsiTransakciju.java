package sistemskeOperacije;

import java.util.LinkedList;

import menjacnica.Valuta;

public class SOIzvrsiTransakciju {

	public static double izvrsi(Valuta valuta, boolean prodaja, double iznos, LinkedList<Valuta> kursnaLista) {
		if (prodaja)
			return iznos*valuta.getProdajni();
		else
			return iznos*valuta.getKupovni();

	}

}
