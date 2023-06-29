package backEndEs04;

public class Main {

	public static void main(String[] args) {
		Dipendente dipendente1 = new Dipendente("ab1511155", Dipartimento.VENDITE);
		Dipendente dipendente2 = new Dipendente("nb6545445", 0, Livello.DIRIGENTE, Dipartimento.AMMINISTRAZIONE);

		dipendente1.stampaDipendente();
		dipendente1.promuovi();
		dipendente1.stampaDipendente();
		dipendente1.calcolaPaga(dipendente1);
		dipendente1.calcolaPaga(dipendente1, 20);

	}

}
