package pl.Czasu.Krysztaly;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class MetodyIOdnosniki {

	// Losowanie Statusu urodzenia, podzielone na 3 klasy, z uwzględnieniem kasty rycerskiej wymagającej Statusu urodzenia w klasie wyższej
	protected static String sp(int test, int test2){
		Random losuj = new Random();
		int los = losuj.nextInt(100) + 1;
		if (los < 85 && (test == 7 || test == 8 || test == 9 || test == 10 || test == 11 || test == 12 || test2 == 7 || test2 == 8 || test2 == 9 || test2 == 10 || test2 == 11 || test2 == 12)) {
			los =  85;
			}
		String slowo = "";
		if(los <= 5) {
			return slowo = "Niższa Klasa Niższa";
		} else if (los > 5 && los <= 10) {
			return slowo = "Średnia Klasa Niższa";
		} else if (los > 10 && los <= 15) {
			return slowo = "Wyższa Klasa Niższa";
		} else if (los > 15 && los <= 35) {
			return slowo = "Niższa Klasa Średnia";
		} else if (los > 35 && los <= 55) {
			return slowo = "Średnia Klasa Średnia";
		} else if (los > 55 && los <= 75) {
			return slowo = "Wyższa Klasa Średnia";
		} else if (los > 75 && los <= 85) {
			return slowo = "Niższa Klasa Wyższa";
		} else if (los > 85 && los <= 90) {
			return slowo = "Średnia Klasa Wyższa";
		} else if (los > 90 && los <= 95) {
			return slowo = "Wyższa Klasa Wyższa";
		} else if ( los > 95) {
			return slowo = "Elita Władzy";
		}
		return slowo;	
	}
	
	// Dodatkowy mnożnik do Żywotności i Siły Fizycznej po przekroczeniu odpowiednich wartości
	protected static int superio(int liczba) {
		int mnoznik = 1;
		if(liczba > 200) {
			mnoznik = 2;
		} else if(liczba > 600) {
			mnoznik = 3;
		} else if(liczba > 2400) {
			mnoznik = 4;
		}
				
		return mnoznik;
	}
	
	
	protected static String wypisz(String[] dane) {
		String slowo = "";
		if(!(dane == null)) {
			for(int i = 0; i < dane.length; i++) {
				slowo += dane[i] + " ";		
			}
		}
		return slowo;
	}
	
	protected static void extracted() {
		throw new IllegalArgumentException("Nadnaturalna i Nienaturalna wykluczają się");
	}
	
	public static boolean zawiera(String[] t, String a) {
		for(String z : t) {
			if(!(z == null) && z.equals(a)) {
				return true;
			}
		}
		return false;
	}
	/**
	protected static String[] Zawody(String status, int ile) {
		if(ile > 0) {
			String[] dane = new String[ile];
			if(status.equals("Niższa Klasa Niższa") ||
					status.equals("Średnia Klasa Niższa") ||
						status.equals("Wyższa Klasa Niższa")) {
				if(status.equals("Niższa Klasa Niższa")){
					for(int i = 0; i < ile; i++ ) {
						dane[i] = LosowanieZawodow.NZawody(zawodyN());
					}
				} else if(status.equals("Średnia Klasa Niższa")) {
					for(int i = 0; i < ile; i++ ) {
						dane[i] = LosowanieZawodow.NZawody(zawodyS());
					}
				} else if(status.equals("Wyższa Klasa Niższa")) {
					for(int i = 0; i < ile; i++ ) {
						dane[i] = LosowanieZawodow.NZawody(zawodyW());
					}
				}
			} else if(status.equals("Niższa Klasa Średnia") ||
						status.equals("Średnia Klasa Średnia") ||
							status.equals("Wyższa Klasa Średnia")){
				if(status.equals("Niższa Klasa Średnia")){
					for(int i = 0; i < ile; i++ ) {
						dane[i] = LosowanieZawodow.SZawody(zawodyN());
					}
				} else if(status.equals("Średnia Klasa Średnia")){
					for(int i = 0; i < ile; i++ ) {
						dane[i] = LosowanieZawodow.SZawody(zawodyS());
					}
				} else if(status.equals("Wyższa Klasa Średnia")){
					for(int i = 0; i < ile; i++ ) {
						dane[i] = LosowanieZawodow.SZawody(zawodyW());
					}
				}
			} else if(status.equals("Niższa Klasa Wyższa") ||
						status.equals("Średnia Klasa Wyższa") ||
							status.equals("Wyższa Klasa Wyższa") ||
								status.equals("Elita Władzy")){
				if(status.equals("Niższa Klasa Wyższa")){
					for(int i = 0; i < ile; i++ ) {
						dane[i] = LosowanieZawodow.WZawody(zawodyN());
					}
				} else if(status.equals("Średnia Klasa Wyższa")){
					for(int i = 0; i < ile; i++ ) {
						dane[i] = LosowanieZawodow.WZawody(zawodyS());
					}
				} else if(status.equals("Wyższa Klasa Wyższa")){
					for(int i = 0; i < ile; i++ ) {
						dane[i] = LosowanieZawodow.WZawody(zawodyW());
					}
				} else if(status.equals("Elita Władzy")){
					for(int i = 0; i < ile; i++ ) {
						dane[i] = LosowanieZawodow.WZawody(zawodyE());
					}
				}
			}
			return dane;
		}
		return null;
	}
	**/
	
	// Losowanie zawodów z podziałem na Status urodzenia
	protected static ArrayList<String> Zawody(String status, int ile) {
		if(ile > 0) {
			ArrayList<String> dane = new ArrayList<>();
			if(status.equals("Niższa Klasa Niższa") ||
					status.equals("Średnia Klasa Niższa") ||
						status.equals("Wyższa Klasa Niższa")) {
				if(status.equals("Niższa Klasa Niższa")){
					for(int i = 0; i < ile; i++ ) {
						dane.add(LosowanieZawodow.NZawody(zawodyN()));
					}
				} else if(status.equals("Średnia Klasa Niższa")) {
					for(int i = 0; i < ile; i++ ) {
						dane.add(LosowanieZawodow.NZawody(zawodyS()));
					}
				} else if(status.equals("Wyższa Klasa Niższa")) {
					for(int i = 0; i < ile; i++ ) {
						dane.add(LosowanieZawodow.NZawody(zawodyW()));
					}
				}
			} else if(status.equals("Niższa Klasa Średnia") ||
						status.equals("Średnia Klasa Średnia") ||
							status.equals("Wyższa Klasa Średnia")){
				if(status.equals("Niższa Klasa Średnia")){
					for(int i = 0; i < ile; i++ ) {
						dane.add(LosowanieZawodow.SZawody(zawodyN()));
					}
				} else if(status.equals("Średnia Klasa Średnia")){
					for(int i = 0; i < ile; i++ ) {
						dane.add(LosowanieZawodow.SZawody(zawodyS()));
					}
				} else if(status.equals("Wyższa Klasa Średnia")){
					for(int i = 0; i < ile; i++ ) {
						dane.add(LosowanieZawodow.SZawody(zawodyW()));
					}
				}
			} else if(status.equals("Niższa Klasa Wyższa") ||
						status.equals("Średnia Klasa Wyższa") ||
							status.equals("Wyższa Klasa Wyższa") ||
								status.equals("Elita Władzy")){
				if(status.equals("Niższa Klasa Wyższa")){
					for(int i = 0; i < ile; i++ ) {
						dane.add(LosowanieZawodow.WZawody(zawodyN()));
					}
				} else if(status.equals("Średnia Klasa Wyższa")){
					for(int i = 0; i < ile; i++ ) {
						dane.add(LosowanieZawodow.WZawody(zawodyS()));
					}
				} else if(status.equals("Wyższa Klasa Wyższa")){
					for(int i = 0; i < ile; i++ ) {
						dane.add(LosowanieZawodow.WZawody(zawodyW()));
					}
				} else if(status.equals("Elita Władzy")){
					for(int i = 0; i < ile; i++ ) {
						dane.add(LosowanieZawodow.WZawody(zawodyE()));
					}
				}
			}
			return dane;
		}
		return null;
	}
	
	protected static int zawodyN() {
		Random losuj = new Random();
		int los = losuj.nextInt(100) - 9;
			if(los < 1) {
				los = 1;
			}
		return los;
	}
	
	protected static int zawodyS() {
		Random losuj = new Random();
		int los = losuj.nextInt(100) + 1;
		return los;
	}
	
	protected static int zawodyW() {
		Random losuj = new Random();
		int los = losuj.nextInt(100) + 11;
			if(los > 100) {
				los = 100;
			}
		return los;
	}
	
	protected static int zawodyE() {
		Random losuj = new Random();
		int los = losuj.nextInt(100) + 21;
			if(los > 79) {
				los = 100;
			}
		return los;
	}
	
	protected static int zawody96() {
		Random losuj = new Random();
		int los = losuj.nextInt(95) + 1;
		return los;
	}
	
	// Losowanie zdolności nadnaturalnych
	protected static String[] ZdNad() {
		int ileNadnaturalnych = Nadnaturalna();
		if (ileNadnaturalnych > 0) {
			String[] nadnaturalne = new String[ileNadnaturalnych];
			for(int i = 0; i < ileNadnaturalnych; i++ ) {
				nadnaturalne[i] = ZdolnoscNadnaturalnaINienaturalna.ZdolNad(k100());
			}
			return nadnaturalne;
		}
		return null; 
	}
	
	// Losowanie ułomności
	protected static String[] ZdNie() {
		int ileNienaturalnych = Nienaturalna();
		if (ileNienaturalnych > 0) {
			String[] nienaturalne = new String[ileNienaturalnych];
			for(int i = 0; i < ileNienaturalnych; i++ ) {
				nienaturalne[i] = ZdolnoscNadnaturalnaINienaturalna.ZdolNie(k100());
			}
			return nienaturalne;
		}
		return null;
	}
	
	// Test czy postać będzie posiadać zdolność nadnaturalną
	protected static int Nadnaturalna() {
		int ile = 0;
		int los = k100(); 
			if(los < 11) {
				ile++;
				while((los = k100()) < 6) {
					ile++;
				}
			}
		return ile;
	}
	
	// Test czy postać będzie posiadać ułomność
	protected static int Nienaturalna() {
		int ile = 0;
		int los = k100(); 
			if(los < 21) {
				ile++;
				los = k100();
					if(los < 16) {
						ile++;
						los = k100();
						if(los < 11) {
							ile++;
								while((los = k100()) < 6) {
									ile++;
								}
						}
				}
			}
		return ile;
	}
	
	protected static int premiowy() {
		Random losuj = new Random();
		int los = losuj.nextInt(10) + 1;
		int dodatek = 0;
		if(los == 10) {
			dodatek = los + losuj.nextInt(10) + 1;
			return dodatek;
			}
		dodatek = los;
		return dodatek;
	}
	
	protected static int k5() {
		Random losuj = new Random();
		int los = losuj.nextInt(5) + 1;
		return los;
	}
	
	protected static int k10() {
		Random losuj = new Random();
		int los = losuj.nextInt(10) + 1;
		return los;
	}
	
	protected static int k50() {
		Random losuj = new Random();
		int los = losuj.nextInt(50) + 1;
		return los;
	}
	
	protected static int k100() {
		Random losuj = new Random();
		int los = losuj.nextInt(100) + 1;
		return los;
	}
	
	protected static int bazowaPF(int inteligencja, int madrosc, int zywotnosc) {
		int baza = 0;
		int i = (int)inteligencja / 10;
		int m = (int)madrosc / 10;
		int z = (int)zywotnosc / 20;
		baza = i + m + z;
		return baza;	
	}
	
	protected static int bazowaF(int zywotnosc, int sila) {
		int baza = 0;
		int z = (int)zywotnosc / 10;
		int s = (int)sila / 10;
		baza = z + s;
		return baza;	
	}
	
	protected static int rodzajBroni() {
		Random losuj = new Random();
		int los = losuj.nextInt(40) + 1;
		return los;
	}

	// Losowanie broni jakich postać będzie używać w walce
	protected static String[] LosowanieBroni(int ile, String rasa, String funkcja) {
		String tymczasowy;
		String[] dane = new String[ile];
				for(int i = 0; i < ile; i++ ) {
					tymczasowy = Bieglosci.TypBroni(rodzajBroni());	
						while(zawiera(dane, tymczasowy)) {
							tymczasowy = Bieglosci.TypBroni(rodzajBroni());
						}
						while(!(zawiera(Bieglosci.BronieRasy(rasa), tymczasowy) && zawiera(Bieglosci.BronieFunkcji(funkcja, i), tymczasowy))) {
							tymczasowy = Bieglosci.TypBroni(rodzajBroni());	
					}
						dane[i] = tymczasowy;
			}
		return dane;
	}
	
	// Losowanie biegłości dla każdej broni jaka została wylosowana z uwzględnieniem minimalnej biegłości dla wybranej profesji
	protected static int[] LosowanieBieglosci(int ile, int minibieglosc) {
		int tymczasowy;
		int[] dane = new int[ile];
				for(int i = 0; i < ile; i++ ) {
					tymczasowy = k100();	
						if(tymczasowy < minibieglosc) {
							tymczasowy = minibieglosc;
						}
						dane[i] = tymczasowy;
			}
		return dane;
	}
	
	// Test czy postać posiada zdolność nadnaturalną Fechmistrz, w tym wypadku wybrana grupa broni wartość biegłości
	protected static int[] testFechmistrz(String[] bron, int[] bieglosc) {
		String[] Fechmistrz = {"Miecze ciężkie", "Miecze lekkie", "Noże", "Rapiery i Szpady", "Szable", "Szlapary", "Sztylety"};
		int[] dane = new int[bieglosc.length];
				for(int i = 0; i < bieglosc.length; i++ ) {
					if(zawiera(Fechmistrz, bron[i])) {
						dane[i] = ZdolnoscNadnaturalnaINienaturalna.Fechmistrz();
					} else {
						dane[i] = bieglosc[i];
					}
			}
		return dane;
	}
	
	protected static int[] rozwojBieglosci(int[] bieglosc, int dodatek) {
		int[] suma = new int[bieglosc.length];
		for(int i = 0; i < bieglosc.length; i++) {
			suma[i] = bieglosc[i] + dodatek;
		}
		return suma;
	}
	
	protected static int[] DodatkiBieglosci(String[] bron, int[] bieglosc, int dodatekFunkcji, int numerRasy) {
		int dodatekRasy;	
		int[] suma = new int[bieglosc.length];
			for(int i = 0; i < bieglosc.length; i++) {
				dodatekRasy = Bieglosci.DodatekRasy(numerRasy, bron[i]);
				suma[i] = bieglosc[i] + dodatekFunkcji + dodatekRasy;
			}
			return suma;
	}
	
	protected static int[] DodatekZawod(String[] bron, int[] bieglosc, String[] zawod) {
		int dodatekZawod = 0;
		int[] suma = new int[bieglosc.length];
			for(int i = 0; i < bieglosc.length; i++) {
				suma[i] = bieglosc[i];
				for(int j = 0; j < zawod.length; j++) {
					dodatekZawod = Bieglosci.DodatekZawodu(zawod[j], bron[i]);
					suma[i] += dodatekZawod;
				}		
			}
		return suma;
	}
	
	protected static int rozwojPostaci(int dodatek1, int dodatek2, int poziom, int poziom2) {
		int liczba = 0;
		int domyslne = 0;
		if(poziom2 < poziom) {
			dodatek2 = domyslne;
		}
		if(dodatek1 >= dodatek2) {
			liczba = dodatek1;
		} else if (dodatek1 < dodatek2) {
			liczba = dodatek2;
		}	
		return liczba;
	}
	
	protected static String[] razem(String[] bron, int[] bieglosc, int ile) {
		String napis = "";
		String[] calosc = new String[ile];
			for(int i = 0; i < ile; i++) {
				napis = i + 1 + ": " + bron[i] + " - " + bieglosc[i] + " ";
				calosc[i] = napis;
		}
		return calosc;
	}
	
	protected static int wieksze(int funkcja1, int funkcja2) {
		int wartosc = 0;
		if(funkcja1 >= funkcja2) {
			wartosc = funkcja1;
		} else if(funkcja1 < funkcja2){
			wartosc = funkcja2;
		}
		return wartosc;
	}
	
	protected static String ktoraFunkcja(int ilosc1, int ilosc2, String nazwa, String nazwa2) {
		String str = "";
		if(ilosc1 >= ilosc2) {
			str = nazwa;
		} else if(ilosc1 < ilosc2) {
			str = nazwa2;
		}
		return str;
	}
	
	protected static int wiekZFunkcji(int numerFunkcji2) {
		int lata1 = 2 + k5();
		int lata2 = 4 + k10();
		int wiek = 0;
		if(numerFunkcji2 == 35) {
			wiek = lata1;
		} else if(numerFunkcji2 < 35) {
			wiek = lata1 + lata2;
		}
		return wiek;
	}
	
	protected static int wiekZaZawody(ArrayList<String> zawody) {
		int ile = zawody.size();
		return ile * 2;
	}
	
	protected static int wiekZZawodow(ArrayList<String> zawody) {
		int wiek = 0;
		LinkedList<String> lista = new LinkedList<>();
			lista.add("Rzezbiarz"); lista.add("Rolnik"); lista.add("Kat"); lista.add("Bibliotekarz"); lista.add("Myśliwy");
		for(int i = 0; i < zawody.size(); i++) {
			for(int j = 0; j < lista.size(); j++) {
				if(zawody.get(i).equals(lista.get(j))) {
					wiek+=2;
				}
			}
		}
		return wiek;
	}
	
	protected static String[] SprawdzTo(String[] dane) {
		String[] rezultat = {"brak"};
		String[] wynik = {};
		if( dane == null) {
			wynik = rezultat;
		} else {
			wynik = dane;
		}
		return wynik;
	}
	
	public static String[] SprawdzTo(ArrayList<String> dane) {
		String[] rezultat = {"brak"};
		String[] wynik = {};
		if( dane == null) {
			wynik = rezultat;
		} else {
			wynik = dane.toArray(new String[dane.size()]);
		}
		return wynik;
	}
/**	
	protected static String[] WybranaFunkcjaJedynak(int numerRasy) {
		ArrayList<String> zrzut = WyborRasyPlciFunkcjiPoziomu.ListaP(numerRasy);
		String[] lista = zrzut.toArray(new String[zrzut.size()]);
		return lista;
	}
	**/
	protected static String[] WybranaFunkcja(int numerRasy) {
		ArrayList<String> zrzut = WyborRasyPlciFunkcjiPoziomu.Lista(numerRasy);
		String[] lista = zrzut.toArray(new String[zrzut.size()]);
		return lista;
	}

	protected static String[] WybranaFunkcja2(int numerRasy, int numerFunkcji) {
		ArrayList<String> zrzut = WyborRasyPlciFunkcjiPoziomu.Lista(numerRasy);
		String[] lista = zrzut.toArray(new String[zrzut.size()]);
		String[] lista2 = WyborRasyPlciFunkcjiPoziomu.ListaFunkcji(numerFunkcji);
		ArrayList<String> listaKoncowa = new ArrayList<String>();
		for(int i = 0; i < lista.length; i++) {
			for(int j = 0; j < lista2.length; j++) {
				if(lista[i].equals(lista2[j])) {
					listaKoncowa.add(lista[i]);
				}
			}
		}
		listaKoncowa.add("brak");
		String[] listaOstateczna = listaKoncowa.toArray(new String[listaKoncowa.size()]);
		return listaOstateczna;
	}
	
	protected static String[] WybranaFunkcjaBrak() {
		ArrayList<String> zrzut = WyborRasyPlciFunkcjiPoziomu.ListaB();
		String[] lista = zrzut.toArray(new String[zrzut.size()]);
		return lista;
	}
	
	protected static int Blogoslawienstwo(int liczba1, int liczba2, String slowo) {
		int liczba = 0;
		if(slowo.equals("Błogosławieństwo")) {
			if(liczba1 >= liczba2) {
				liczba = liczba1;
			} else if(liczba1 < liczba2) {
				liczba = liczba2;
			} 
		} else {
			liczba = liczba1;
		}
		return liczba;
	}
	
	protected static String Blogo(String[] nadna) {
		String slowo = "brak";
		String wynik = "";
		String test = "Błogosławieństwo";
		if(nadna == null) {
			wynik = slowo;
		} else {
			for (int i = 0; i < nadna.length; i++) {
				if(test.equals(nadna[i])) {
					wynik = nadna[i];
					break;	
				} else {
					wynik = slowo;
				}
			} 
		}
		return wynik;
	}

	
}
