package backEndEs04;

public class Main {

	public static void main(String[] args) {
		Dipendente dipendente = new Dipendente("ab1511155", Dipartimento.VENDITE);

		dipendente.stampaDipendente();
		dipendente.promuovi();
		dipendente.stampaDipendente();
		dipendente.calcolaPaga(dipendente);
		dipendente.calcolaPaga(dipendente, 20);

	}

}
