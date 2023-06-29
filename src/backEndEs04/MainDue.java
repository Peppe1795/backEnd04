package backEndEs04;

public class MainDue {

	public static void main(String[] args) {
		Dipendente dipendente1 = new Dipendente("ab1511155", Dipartimento.PRODUZIONE);
		Dipendente dipendente2 = new Dipendente("ab1511155", Dipartimento.PRODUZIONE);
		Dipendente dipendente3 = new Dipendente("nb7827878", 0, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente dipendente4 = new Dipendente("nb8727882", 0, Livello.DIRIGENTE, Dipartimento.VENDITE);

		dipendente1.promuovi();
		dipendente3.promuovi();
		dipendente1.stampaDipendente();
		dipendente2.stampaDipendente();
		dipendente3.stampaDipendente();
		dipendente4.stampaDipendente();

	}

}
