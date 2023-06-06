package Sajat;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Sajt extends Tejtermek {
	private double tomeg;
	private Tipus tipus;
	private double zsirTartalom;
	private int eladasiAr;

	public Sajt(int egysegAr, String marka, LocalDate gyartasiIdo, double tomeg, Tipus tipus, double zsirtartalom) {
		super(egysegAr, marka, gyartasiIdo);
		this.tomeg = tomeg;
		this.tipus = tipus;
		this.zsirTartalom = zsirtartalom;
		this.eladasiAr = getEladasiAr();
	}

	public Sajt(int egysegAr, String marka, double tomeg, Tipus tipus) {
		this(egysegAr, marka, LocalDate.now(), tomeg, tipus, 21/100);
	}

	@Override
	public String toString() {
		return  super.toString() + "tomeg=" + tomeg + ", tipus=" + tipus + ", zsirTartalom=" + zsirTartalom + ", eladasiAr="
				+ getEladasiAr();
	}

	@Override
	public int getEladasiAr() {
		double tipusSzorzo = 0;
		switch (tipus) {
		case DARABOLT:
			tipusSzorzo = 1;
		case OMLESZTETT:
			tipusSzorzo = 1.4;
		case SZELETELT:
			tipusSzorzo = 1.2;
		}
		this.eladasiAr = (int) (getEgysegAr() * this.tomeg * this.zsirTartalom / 21 * tipusSzorzo);
		return eladasiAr;
	}

	public double getTomeg() {
		return tomeg;
	}

	public void setTomeg(double tomeg) {
		this.tomeg = tomeg;
	}

	public Tipus getTipus() {
		return tipus;
	}

	public void setTipus(Tipus tipus) {
		this.tipus = tipus;
	}

	public double getZsirTartalom() {
		return zsirTartalom;
	}

	public void setZsirTartalom(double zsirTartalom) {
		this.zsirTartalom = zsirTartalom;
	}

	public void setEladasiAr(int eladasiAr) {
		this.eladasiAr = eladasiAr;
	}

	

	

}
