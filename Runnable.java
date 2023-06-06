package Sajat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Runnable {

	public static void main(String[] args) {
		Sajt[] sajt = new Sajt[4];
		ArrayList<Sajt> sajt2 = new ArrayList<>();
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		try {
			for (int i = 0; i < 2; i++) {

				double tomeg = random.nextDouble(100) + 100;
				System.out.println("Adja meg az egysegarat: ");
				int egysegAr = readInt(sc);
				System.out.println("Adja meg a markat: ");
				String marka = sc.nextLine();
				System.out.println("Adja meg a gyartasi idot: ");
				String date = sc.next();
				LocalDate parsedDate = LocalDate.parse(date);
				System.out.println("Adja meg a tipust: ");
				String inputTipus = sc.next();
				Tipus tipus = Tipus.valueOf(inputTipus.toUpperCase());
				System.out.println("Adja meg a zsirtartalmat: ");
				double zsirTartalom = sc.nextDouble();
				sajt[i] = new Sajt(egysegAr, marka, parsedDate, tomeg, tipus, zsirTartalom);
				sajt2.add(sajt[i]);

			}

			for (int i = 2; i < 4; i++) {
				double tomeg = random.nextDouble(100) + 10;
				System.out.println("Adja meg az egysegarat: ");
				int egysegAr = readInt(sc);
				System.out.println("Adja meg a markat: ");
				String marka = sc.next();
				System.out.println("Adja meg a tipust: ");
				String inputTipus = sc.next();
				Tipus tipus = Tipus.valueOf(inputTipus.toUpperCase());

				sajt[i] = new Sajt(egysegAr, marka, tomeg, tipus);

			}
		} catch (IllegalArgumentException e) {
			System.out.println("Rossz Input" + e.getMessage());
		}
		tombKiir(sajt);
		System.out.println(CountEhetoE(sajt));

		Comparator<Sajt> byMarka = (p1, p2) -> p1.getMarka().compareTo(p2.getMarka());
		Collections.sort(sajt2, byMarka);
		System.out.println("Dynamic array: ");
		for (int i = 0; i < sajt2.size(); i++) {
			Sajt element = sajt2.get(i);
			System.out.println(element);
		}

	}

	public static int readInt(Scanner sc) {
		int value = 0;
		do {
			if (!sc.hasNextInt()) {
				System.out.println("Hibas Input");
				sc.next();
			}
			value = sc.nextInt();
			sc.nextLine();
		} while (value < 2000 || value > 8000);

		return value;
	}

	public static void tombKiir(Sajt[] p1) {
		for (int i = 0; i < 4; i++) {
			System.out.println(p1[i]);
		}
	}

	public static int CountEhetoE(Sajt[] p1) {
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (p1[i].EhetoE() == true) {
				count++;
			}
		}
		return count;
	}

}
