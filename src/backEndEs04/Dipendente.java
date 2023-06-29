package backEndEs04;

public class Dipendente {
	private double stipendioBase = 1000;
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;

	public Dipendente(String matr, Dipartimento dip) {
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
		this.matricola = matr;
		this.dipartimento = dip;
	}

	public Dipendente(String matr, double ora, Livello liv, Dipartimento dip) {
		this.matricola = matr;
		this.stipendio = stipendio(liv);
		this.importoOrarioStraordinario = ora;
		this.livello = liv;
		this.dipartimento = dip;
	}

	public double getStpendioBase() {
		return stipendioBase;
	}

	public String getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public void setImportoOrarioStraordinario(double ora) {
		this.importoOrarioStraordinario = ora;
	}

	public Livello getLivello() {
		return livello;
	}

	public Dipartimento getDipartimento() {
		return dipartimento;
	}

	public void setDipartimento(Dipartimento dip) {
		this.dipartimento = dip;
	}

	public void stampaDipendente() {
		System.out.println("Dati dipendente");
		System.out.println("matricola dipendente: " + getMatricola());
		System.out.println("stipendio: " + getStipendio());
		System.out.println("Straordinario: " + getImportoOrarioStraordinario());
		System.out.println("livello: " + getLivello());
		System.out.println("dipartimento: " + getDipartimento());

	}

	public double stipendio(Livello liv) {
		switch (liv) {
		case OPERAIO:
			stipendio = stipendioBase;
			break;

		case IMPIEGATO:
			stipendio = stipendioBase * 1.2;
			break;

		case QUADRO:
			stipendio = stipendioBase * 1.5;
			break;

		case DIRIGENTE:
			stipendio = stipendioBase * 2;

		default:
			System.out.println("livello non definito");
		}
		return stipendio;
	}

	public void promuovi() {
		switch (livello) {
		case OPERAIO:
			livello = Livello.IMPIEGATO;
			stipendio = stipendioBase * 1.2;
			break;

		case IMPIEGATO:
			livello = Livello.QUADRO;
			stipendio = stipendioBase * 1.5;
			break;

		case QUADRO:
			livello = Livello.DIRIGENTE;
			stipendio = stipendioBase * 2;
			break;

		default:
			System.out.println("livello non definito");
		}

	}

	public static void calcolaPaga(Dipendente dip) {
		System.out.println("Stipendio mensile: " + dip.getStipendio());
	}

	public static void calcolaPaga(Dipendente dip, int ore) {
		double straordinario = dip.getStipendio() + (ore + dip.getImportoOrarioStraordinario());
		System.out.println("Stipendio mensile: " + straordinario);
	}
}
