package Sajat;

import java.time.LocalDate;

public abstract class Tejtermek {
	private int egysegAr;
	private String marka;
	private LocalDate gyartasiIdo;
	private LocalDate lejaratiIdo;

	public Tejtermek(int egysegAr, String marka, LocalDate gyartasiIdo) {

		this.egysegAr = egysegAr;
		this.marka = marka;
		this.gyartasiIdo = gyartasiIdo;
		this.lejaratiIdo = gyartasiIdo.plusDays(7);
	}

	public final boolean EhetoE() {
		if (this.lejaratiIdo.isBefore(LocalDate.now())) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "Tejtermek [egysegAr=" + egysegAr + ", marka=" + marka + ", gyartasiIdo=" + gyartasiIdo
				+ ", lejaratiIdo=" + lejaratiIdo + " Eheto-e: " + this.EhetoE();
	}
	
	public abstract int getEladasiAr();

	public int getEgysegAr() {
		return egysegAr;
	}

	public void setEgysegAr(int egysegAr) {
		this.egysegAr = egysegAr;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public LocalDate getGyartasiIdo() {
		return gyartasiIdo;
	}

	public void setGyartasiIdo(LocalDate gyartasiIdo) {
		this.gyartasiIdo = gyartasiIdo;
	}

	public LocalDate getLejaratiIdo() {
		return lejaratiIdo;
	}

	public void setLejaratiIdo(LocalDate lejaratiIdo) {
		this.lejaratiIdo = lejaratiIdo;
	}
	
	

}
