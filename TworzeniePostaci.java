package pl.Czasu.Krysztaly;

import java.util.ArrayList;


public class TworzeniePostaci {

	private String Rasa, Plec, Status_urodzenia;
	private int Wzrost, Waga, Wiek, Zywotnosc, Sila_Fizyczna, Zrecznosc, Szybkosc,
	Inteligencja, Madrosc, Umiejetnosci_Magiczne, Charyzma, Prezencja,
	Wiara, Zauwazenie, Bazowa_odpornosc_Psychiczno_Fizyczna, Odpornosc_na_Iluzje, 
	Odpornosc_na_Sugestie, 	Odpornosc_na_Zaklecia, Odpornosc_na_Szok, Odpornosc_na_Energie,
	Bazowa_odpornosc_Fizyczna, Odpornosc_na_Trucizny, Odpornosc_na_Gazy, Odpornosc_na_Temperature,
	Odpornosc_na_Elektrycznosc, Odpornosc_na_Polimorfie, Ilosc_Bieglosci, Minimalna_Bieglosc, Dodatek_do_Bieglosci;
	private String[] Funkcja, Nadnaturalne, Nienaturalne, Bronie, Umiejetnosc_wladania_bronia;
	private ArrayList<String> Zawod;
	private int[] Bieglosc;

	public TworzeniePostaci() {
	}
	
	public TworzeniePostaci(int Zywotnosc, int Sila_Fizyczna, int Zrecznosc, int Szybkosc,
			int Inteligencja, int Madrosc, int Umiejetnosci_Magiczne, int Charyzma, int Prezencja,
			int Wiara, int Zauwazenie, int Bazowa_odpornosc_Psychiczno_Fizyczna, int Odpornosc_na_Iluzje, 
			int Odpornosc_na_Sugestie, int Odpornosc_na_Zaklecia, int Odpornosc_na_Szok,
			int Odpornosc_na_Energie, int Bazowa_odpornosc_Fizyczna, int Odpornosc_na_Trucizny,
			int Odpornosc_na_Gazy, int Odpornosc_na_Temperature, int Odpornosc_na_Elektrycznosc, 
			int Odpornosc_na_Polimorfie, int Ilosc_Bieglosci, int Minimalna_Bieglosc, int Dodatek_do_Bieglosci){
		
		this.Zywotnosc = Zywotnosc;
		this.Sila_Fizyczna = Sila_Fizyczna;
		this.Zrecznosc = Zrecznosc;
		this.Szybkosc = Szybkosc;
		this.Inteligencja = Inteligencja;
		this.Madrosc = Madrosc;
		this.Umiejetnosci_Magiczne = Umiejetnosci_Magiczne;
		this.Charyzma = Charyzma;
		this.Prezencja = Prezencja;
		this.Wiara = Wiara;
		this.Zauwazenie = Zauwazenie;
		this.Bazowa_odpornosc_Psychiczno_Fizyczna = Bazowa_odpornosc_Psychiczno_Fizyczna;
		this.Odpornosc_na_Iluzje = Odpornosc_na_Iluzje;
		this.Odpornosc_na_Sugestie = Odpornosc_na_Sugestie;
		this.Odpornosc_na_Zaklecia = Odpornosc_na_Zaklecia;
		this.Odpornosc_na_Szok = Odpornosc_na_Szok;
		this.Odpornosc_na_Energie = Odpornosc_na_Energie;
		this.Bazowa_odpornosc_Fizyczna = Bazowa_odpornosc_Fizyczna;
		this.Odpornosc_na_Trucizny = Odpornosc_na_Trucizny;
		this.Odpornosc_na_Gazy = Odpornosc_na_Gazy;
		this.Odpornosc_na_Temperature = Odpornosc_na_Temperature;
		this.Odpornosc_na_Elektrycznosc = Odpornosc_na_Elektrycznosc;
		this.Odpornosc_na_Polimorfie = Odpornosc_na_Polimorfie;
		this.Ilosc_Bieglosci = Ilosc_Bieglosci;
		this.Minimalna_Bieglosc = Minimalna_Bieglosc;
		this.Dodatek_do_Bieglosci = Dodatek_do_Bieglosci;
	
	}
	
	public TworzeniePostaci(String Rasa,String Plec,String[] Funkcja,String Status_urodzenia, String[] Nadnaturalne,
			String[] Nienaturalne, int Wzrost, int Waga, int Wiek, int Zywotnosc, int Sila_Fizyczna,
			int Zrecznosc, int Szybkosc, int Inteligencja, int Madrosc, int Umiejetnosci_Magiczne, 
			int Charyzma, int Prezencja, int Wiara, int Zauwazenie, int Bazowa_odpornosc_Psychiczno_Fizyczna,
			int Odpornosc_na_Iluzje, int Odpornosc_na_Sugestie, int Odpornosc_na_Zaklecia, 
			int Odpornosc_na_Szok, int Odpornosc_na_Energie, int Bazowa_odpornosc_Fizyczna, 
			int Odpornosc_na_Trucizny, int Odpornosc_na_Gazy, int Odpornosc_na_Temperature,
			int Odpornosc_na_Elektrycznosc, int Odpornosc_na_Polimorfie){
		
		this.Rasa = Rasa;
		this.Plec = Plec;
		this.Funkcja = Funkcja;
		this.Status_urodzenia = Status_urodzenia;
		this.Nadnaturalne = Nadnaturalne;
		this.Nienaturalne = Nienaturalne;
		this.Wzrost = Wzrost;
		this.Waga = Waga;
		this.Wiek = Wiek;
		this.Zywotnosc = Zywotnosc;
		this.Sila_Fizyczna = Sila_Fizyczna;
		this.Zrecznosc = Zrecznosc;
		this.Szybkosc = Szybkosc;
		this.Inteligencja = Inteligencja;
		this.Madrosc = Madrosc;
		this.Umiejetnosci_Magiczne = Umiejetnosci_Magiczne;
		this.Charyzma = Charyzma;
		this.Prezencja = Prezencja;
		this.Wiara = Wiara;
		this.Zauwazenie = Zauwazenie;
		this.Bazowa_odpornosc_Psychiczno_Fizyczna = Bazowa_odpornosc_Psychiczno_Fizyczna;
		this.Odpornosc_na_Iluzje = Odpornosc_na_Iluzje;
		this.Odpornosc_na_Sugestie = Odpornosc_na_Sugestie;
		this.Odpornosc_na_Zaklecia = Odpornosc_na_Zaklecia;
		this.Odpornosc_na_Szok = Odpornosc_na_Szok;
		this.Odpornosc_na_Energie = Odpornosc_na_Energie;
		this.Bazowa_odpornosc_Fizyczna = Bazowa_odpornosc_Fizyczna;
		this.Odpornosc_na_Trucizny = Odpornosc_na_Trucizny;
		this.Odpornosc_na_Gazy = Odpornosc_na_Gazy;
		this.Odpornosc_na_Temperature = Odpornosc_na_Temperature;
		this.Odpornosc_na_Elektrycznosc = Odpornosc_na_Elektrycznosc;
		this.Odpornosc_na_Polimorfie = Odpornosc_na_Polimorfie;
	}
	
	public String getRasa() {
		return Rasa;
	}


	public void setRasa(String rasa) {
		Rasa = rasa;
	}


	public String getPlec() {
		return Plec;
	}


	public void setPlec(String plec) {
		Plec = plec;
	}


	public String[] getFunkcja() {
		return Funkcja;
	}


	public void setFunkcja(String[] funkcja) {
		Funkcja = funkcja;
	}


	public String getStatus_urodzenia() {
		return Status_urodzenia;
	}


	public void setStatus_urodzenia(String status_urodzenia) {
		Status_urodzenia = status_urodzenia;
	}
	
	public String[] getNadnaturalne() {
		return Nadnaturalne;
	}

	public void setNadnaturalne(String[] nadnaturalne) {
		Nadnaturalne = nadnaturalne;
	}

	public String[] getNienaturalne() {
		return Nienaturalne;
	}

	public void setNienaturalne(String[] nienaturalne) {
		Nienaturalne = nienaturalne;
	}

	public int getWzrost() {
		return Wzrost;
	}


	public void setWzrost(int wzrost) {
		Wzrost = wzrost;
	}


	public int getWaga() {
		return Waga;
	}


	public void setWaga(int waga) {
		Waga = waga;
	}


	public int getWiek() {
		return Wiek;
	}


	public void setWiek(int wiek) {
		Wiek = wiek;
	}


	public int getZywotnosc() {
		return Zywotnosc;
	}


	public void setZywotnosc(int zywotnosc) {
		Zywotnosc = zywotnosc;
	}


	public int getSila_Fizyczna() {
		return Sila_Fizyczna;
	}


	public void setSila_Fizyczna(int sila_Fizyczna) {
		Sila_Fizyczna = sila_Fizyczna;
	}


	public int getZrecznosc() {
		return Zrecznosc;
	}


	public void setZrecznosc(int zrecznosc) {
		Zrecznosc = zrecznosc;
	}


	public int getSzybkosc() {
		return Szybkosc;
	}


	public void setSzybkosc(int szybkosc) {
		Szybkosc = szybkosc;
	}


	public int getInteligencja() {
		return Inteligencja;
	}


	public void setInteligencja(int inteligencja) {
		Inteligencja = inteligencja;
	}


	public int getMadrosc() {
		return Madrosc;
	}


	public void setMadrosc(int madrosc) {
		Madrosc = madrosc;
	}


	public int getUmiejetnosci_Magiczne() {
		return Umiejetnosci_Magiczne;
	}


	public void setUmiejetnosci_Magiczne(int umiejetnosci_Magiczne) {
		Umiejetnosci_Magiczne = umiejetnosci_Magiczne;
	}


	public int getCharyzma() {
		return Charyzma;
	}


	public void setCharyzma(int charyzma) {
		Charyzma = charyzma;
	}


	public int getPrezencja() {
		return Prezencja;
	}


	public void setPrezencja(int prezencja) {
		Prezencja = prezencja;
	}


	public int getWiara() {
		return Wiara;
	}


	public void setWiara(int wiara) {
		Wiara = wiara;
	}


	public int getZauwazenie() {
		return Zauwazenie;
	}


	public void setZauwazenie(int zauwazenie) {
		Zauwazenie = zauwazenie;
	}


	public int getBazowa_odpornosc_Psychiczno_Fizyczna() {
		return Bazowa_odpornosc_Psychiczno_Fizyczna;
	}


	public void setBazowa_odpornosc_Psychiczno_Fizyczna(int bazowa_odpornosc_Psychiczno_Fizyczna) {
		Bazowa_odpornosc_Psychiczno_Fizyczna = bazowa_odpornosc_Psychiczno_Fizyczna;
	}


	public int getOdpornosc_na_Iluzje() {
		return Odpornosc_na_Iluzje;
	}


	public void setOdpornosc_na_Iluzje(int odpornosc_na_Iluzje) {
		Odpornosc_na_Iluzje = odpornosc_na_Iluzje;
	}


	public int getOdpornosc_na_Sugestie() {
		return Odpornosc_na_Sugestie;
	}


	public void setOdpornosc_na_Sugestie(int odpornosc_na_Sugestie) {
		Odpornosc_na_Sugestie = odpornosc_na_Sugestie;
	}


	public int getOdpornosc_na_Zaklecia() {
		return Odpornosc_na_Zaklecia;
	}


	public void setOdpornosc_na_Zaklecia(int odpornosc_na_Zaklecia) {
		Odpornosc_na_Zaklecia = odpornosc_na_Zaklecia;
	}


	public int getOdpornosc_na_Szok() {
		return Odpornosc_na_Szok;
	}


	public void setOdpornosc_na_Szok(int odpornosc_na_Szok) {
		Odpornosc_na_Szok = odpornosc_na_Szok;
	}


	public int getOdpornosc_na_Energie() {
		return Odpornosc_na_Energie;
	}


	public void setOdpornosc_na_Energie(int odpornosc_na_Energie) {
		Odpornosc_na_Energie = odpornosc_na_Energie;
	}


	public int getBazowa_odpornosc_Fizyczna() {
		return Bazowa_odpornosc_Fizyczna;
	}


	public void setBazowa_odpornosc_Fizyczna(int bazowa_odpornosc_Fizyczna) {
		Bazowa_odpornosc_Fizyczna = bazowa_odpornosc_Fizyczna;
	}


	public int getOdpornosc_na_Trucizny() {
		return Odpornosc_na_Trucizny;
	}


	public void setOdpornosc_na_Trucizny(int odpornosc_na_Trucizny) {
		Odpornosc_na_Trucizny = odpornosc_na_Trucizny;
	}


	public int getOdpornosc_na_Gazy() {
		return Odpornosc_na_Gazy;
	}


	public void setOdpornosc_na_Gazy(int odpornosc_na_Gazy) {
		Odpornosc_na_Gazy = odpornosc_na_Gazy;
	}


	public int getOdpornosc_na_Temperature() {
		return Odpornosc_na_Temperature;
	}


	public void setOdpornosc_na_Temperature(int odpornosc_na_Temperature) {
		Odpornosc_na_Temperature = odpornosc_na_Temperature;
	}


	public int getOdpornosc_na_Elektrycznosc() {
		return Odpornosc_na_Elektrycznosc;
	}


	public void setOdpornosc_na_Elektrycznosc(int odpornosc_na_Elektrycznosc) {
		Odpornosc_na_Elektrycznosc = odpornosc_na_Elektrycznosc;
	}


	public int getOdpornosc_na_Polimorfie() {
		return Odpornosc_na_Polimorfie;
	}


	public void setOdpornosc_na_Polimorfie(int odpornosc_na_Polimorfie) {
		Odpornosc_na_Polimorfie = odpornosc_na_Polimorfie;
	}

	public ArrayList<String> getZawod() {
		return Zawod;
	}

	public void setZawod(ArrayList<String> zawod) {
		Zawod = zawod;
	}
	
	public String[] getBronie() {
		return Bronie;
	}

	public void setBronie(String[] bronie) {
		Bronie = bronie;
	}	

	public int getIlosc_Bieglosci() {
		return Ilosc_Bieglosci;
	}

	public void setIlosc_Bieglosci(int ilosc_Bieglosci) {
		Ilosc_Bieglosci = ilosc_Bieglosci;
	}

	public int getMinimalna_Bieglosc() {
		return Minimalna_Bieglosc;
	}

	public void setMinimalna_Bieglosc(int minimalna_Bieglosc) {
		Minimalna_Bieglosc = minimalna_Bieglosc;
	}

	public int getDodatek_do_Bieglosci() {
		return Dodatek_do_Bieglosci;
	}

	public void setDodatek_do_Bieglosci(int dodatek_do_Bieglosci) {
		Dodatek_do_Bieglosci = dodatek_do_Bieglosci;
	}

	public int[] getBieglosc() {
		return Bieglosc;
	}

	public void setBieglosc(int[] bieglosc) {
		Bieglosc = bieglosc;
	}

	public String[] getUmiejetnosc_wladania_bronia() {
		return Umiejetnosc_wladania_bronia;
	}

	public void setUmiejetnosc_wladania_bronia(String[] umiejetnosc_wladania_bronia) {
		Umiejetnosc_wladania_bronia = umiejetnosc_wladania_bronia;
	}
	
	
	protected static TworzeniePostaci Wspolczynniki(int numerRasy, int numerPlci) {
		switch((numerRasy * 10) + numerPlci) {
		case 11: return new TworzeniePostaci(100, 50 + MetodyIOdnosniki.k100() , 35 + MetodyIOdnosniki.k50(), 25 + MetodyIOdnosniki.k50(), 60 + MetodyIOdnosniki.k50(), 70 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k100(), 40 + MetodyIOdnosniki.k50(), 20 + MetodyIOdnosniki.k50(), 10 + MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 10, 0, 20, 10, 10, MetodyIOdnosniki.premiowy(), 0, 0, 0, 10, 0, 0, 0, 0);
		case 12: return new TworzeniePostaci(90, 40 + MetodyIOdnosniki.k100(), 35 + MetodyIOdnosniki.k50(), 25 + MetodyIOdnosniki.k50(), 60 + MetodyIOdnosniki.k50(), 70 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k100(), 40 + MetodyIOdnosniki.k50(), 40 + MetodyIOdnosniki.k50(), 10 + MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 10, 0, 20, 10, 10, MetodyIOdnosniki.premiowy(), 0, 0, 0, 10, 0, 0, 0, 0);
		case 21: return new TworzeniePostaci(90, 40 + MetodyIOdnosniki.k100(), 40 + MetodyIOdnosniki.k50(), 35 + MetodyIOdnosniki.k50(), 70 + MetodyIOdnosniki.k50(), 80 + MetodyIOdnosniki.k50(), 45 + MetodyIOdnosniki.k5(), 35 + MetodyIOdnosniki.k50(), 30 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 10, 10, 10, 0, 10, MetodyIOdnosniki.premiowy(), 0, 0, 0, 10, 10, 0, 0, 0);
		case 22: return new TworzeniePostaci(80, 40 + MetodyIOdnosniki.k100(), 40 + MetodyIOdnosniki.k50(), 40 + MetodyIOdnosniki.k50(), 75 + MetodyIOdnosniki.k50(), 55 + MetodyIOdnosniki.k50(), 45 + MetodyIOdnosniki.k5(), 35 + MetodyIOdnosniki.k50(), 45 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 10, 10, 10, 0, 10, MetodyIOdnosniki.premiowy(), 0, 0, 0, 10, 10, 0, 0, 0);
		case 31: return new TworzeniePostaci(80, 30 + MetodyIOdnosniki.k100(), 50 + MetodyIOdnosniki.k50(), 40 + MetodyIOdnosniki.k50(), 80 + MetodyIOdnosniki.k50(), 60 + MetodyIOdnosniki.k50(), 50 + MetodyIOdnosniki.k5(), 40 + MetodyIOdnosniki.k50(), 50 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 20, 20, 0, 0, 10, MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 10, 0, 0, 0);
		case 32: return new TworzeniePostaci(65, 25 + MetodyIOdnosniki.k100(), 50 + MetodyIOdnosniki.k50(), 45 + MetodyIOdnosniki.k50(), 80 + MetodyIOdnosniki.k50(), 50 + MetodyIOdnosniki.k50(), 40 + MetodyIOdnosniki.k5(), 40 + MetodyIOdnosniki.k50(), 60 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 20, 20, 0, 0, 10, MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 10, 0, 0, 0);
		case 41: return new TworzeniePostaci(120, 70 + MetodyIOdnosniki.k100(), 30 + MetodyIOdnosniki.k50(), 30 + MetodyIOdnosniki.k50(), 35 + MetodyIOdnosniki.k50(), 55 + MetodyIOdnosniki.k50(), 35 + MetodyIOdnosniki.k5(), 15 + MetodyIOdnosniki.k50(), 10 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 0, 0, 10, 0, 0, MetodyIOdnosniki.premiowy(), 10, 10, 10, 10, 10, 0, 0, 0);
		case 42: return new TworzeniePostaci(115, 70 + MetodyIOdnosniki.k100(), 40 + MetodyIOdnosniki.k50(), 40 + MetodyIOdnosniki.k50(), 25 + MetodyIOdnosniki.k50(), 55 + MetodyIOdnosniki.k50(), 30 + MetodyIOdnosniki.k5(), 15 + MetodyIOdnosniki.k50(), 20 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 0, 0, 10, 0, 0, MetodyIOdnosniki.premiowy(), 10, 10, 10, 10, 10, 0, 0, 0);
		case 51: return new TworzeniePostaci(150, 100 + MetodyIOdnosniki.k100(), 10 + MetodyIOdnosniki.k50(), 40 + MetodyIOdnosniki.k50(), 30 + MetodyIOdnosniki.k50(), 40 + MetodyIOdnosniki.k50(), 10 + MetodyIOdnosniki.k5(), 20 + MetodyIOdnosniki.k50(), 40 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 10, 10, 0, 20, 0, MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 20, 0, 0, 0);
		case 52: return new TworzeniePostaci(145, 80 + MetodyIOdnosniki.k100(), 20 + MetodyIOdnosniki.k50(), 40 + MetodyIOdnosniki.k50(), 40 + MetodyIOdnosniki.k50(), 40 + MetodyIOdnosniki.k50(), 10 + MetodyIOdnosniki.k5(), 20 + MetodyIOdnosniki.k50(), 30 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 10, 10, 0, 20, 0, MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 20, 0, 0, 0);
		case 61: return new TworzeniePostaci(130, 70 + MetodyIOdnosniki.k100(), 20 + MetodyIOdnosniki.k50(), 15 + MetodyIOdnosniki.k50(), 40 + MetodyIOdnosniki.k50(), 70 + MetodyIOdnosniki.k50(), 30 + MetodyIOdnosniki.k5(), 30 + MetodyIOdnosniki.k50(), 15 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 10, MetodyIOdnosniki.premiowy(), 10, 10, 10, 10, 0, 0, 0, 0);
		case 62: return new TworzeniePostaci(125, 65 + MetodyIOdnosniki.k100(), 20 + MetodyIOdnosniki.k50(), 20 + MetodyIOdnosniki.k50(), 45 + MetodyIOdnosniki.k50(), 75 + MetodyIOdnosniki.k50(), 25 + MetodyIOdnosniki.k5(), 20 + MetodyIOdnosniki.k50(), 15 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 10, MetodyIOdnosniki.premiowy(), 10, 10, 10, 10, 0, 0, 0, 0);
		case 71: return new TworzeniePostaci(100, 50 + MetodyIOdnosniki.k100(), 40 + MetodyIOdnosniki.k50(), 15 + MetodyIOdnosniki.k50(), 80 + MetodyIOdnosniki.k50(), 80 + MetodyIOdnosniki.k50(), 40 + MetodyIOdnosniki.k5(), 15 + MetodyIOdnosniki.k50(), 25 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 20, 0, 0, 0, 10, MetodyIOdnosniki.premiowy(), 10, 10, 0, 0, 10, 0, 0, 0);
		case 72: return new TworzeniePostaci(85, 40 + MetodyIOdnosniki.k100(), 40 + MetodyIOdnosniki.k50(), 25 + MetodyIOdnosniki.k50(), 70 + MetodyIOdnosniki.k50(), 80 + MetodyIOdnosniki.k50(), 45 + MetodyIOdnosniki.k5(), 15 + MetodyIOdnosniki.k50(), 30 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 20, 0, 0, 0, 10, MetodyIOdnosniki.premiowy(), 10, 10, 0, 0, 10, 0, 0, 0);
		case 81: return new TworzeniePostaci(75, 25 + MetodyIOdnosniki.k100(), 60 + MetodyIOdnosniki.k50(), 25 + MetodyIOdnosniki.k50(), 80 + MetodyIOdnosniki.k50(), 70 + MetodyIOdnosniki.k50(), 35 + MetodyIOdnosniki.k5(), 25 + MetodyIOdnosniki.k50(), 15 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 10, 10, 20, 0, 10, MetodyIOdnosniki.premiowy(), 10, 0, 0, 0, 0, 0, 0, 0);
		case 82: return new TworzeniePostaci(65, 20 + MetodyIOdnosniki.k100(), 60 + MetodyIOdnosniki.k50(), 25 + MetodyIOdnosniki.k50(), 80 + MetodyIOdnosniki.k50(), 70 + MetodyIOdnosniki.k50(), 35 + MetodyIOdnosniki.k5(), 20 + MetodyIOdnosniki.k50(), 35 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 10, 10, 20, 0, 10, MetodyIOdnosniki.premiowy(), 10, 0, 0, 0, 0, 0, 0, 0);
		case 91: return new TworzeniePostaci(180, 50 + MetodyIOdnosniki.k100(), 20 + MetodyIOdnosniki.k50(), 35 + MetodyIOdnosniki.k50(), 35 + MetodyIOdnosniki.k50(), 50 + MetodyIOdnosniki.k50(), 30 + MetodyIOdnosniki.k5(), 15 + MetodyIOdnosniki.k50(), 10 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 20, 0, 0, 10, 0, MetodyIOdnosniki.premiowy(), 20, 10, 0, 0, 0, 0, 0, 0);
		case 92: return new TworzeniePostaci(180, 45 + MetodyIOdnosniki.k100(), 25 + MetodyIOdnosniki.k50(), 35 + MetodyIOdnosniki.k50(), 30 + MetodyIOdnosniki.k50(), 50 + MetodyIOdnosniki.k50(), 30 + MetodyIOdnosniki.k5(), 15 + MetodyIOdnosniki.k50(), 10 + MetodyIOdnosniki.k50(), MetodyIOdnosniki.k50(), 0, MetodyIOdnosniki.premiowy(), 20, 0, 0, 10, 0, MetodyIOdnosniki.premiowy(), 20, 10, 0, 0, 0, 0, 0, 0);
		default: return null;
		}
	}
	
	protected static TworzeniePostaci Funkcja(String funkcja) {
		switch(funkcja) {
		case "Wojownik": return new TworzeniePostaci(10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.k5(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 6, 50, 10);
		case "Łowca": return new TworzeniePostaci(10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k5(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 6, 40, 10);
		case "Gwardzista": return new TworzeniePostaci(MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k5(), 0, 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 6, 50, 15);
		case "Barbarzyńca": return new TworzeniePostaci(20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 0, 0, MetodyIOdnosniki.k5(), 0, 0, 0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 6, 30, 5);
		case "Łowca Czarownic": return new TworzeniePostaci(20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.premiowy(), 0, 0, MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k5(), 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 0, 10 + MetodyIOdnosniki.premiowy(), 6, 45, 10);
		case "Wiedzmin": return new TworzeniePostaci(10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k5(), 0, MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, 20 + MetodyIOdnosniki.premiowy(), 0 , 0, 30 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, 0, MetodyIOdnosniki.premiowy(), 4, 50, 15);
		case "Rycerz": return new TworzeniePostaci(20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.premiowy(), 0, 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k5(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 0, 20 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 5, 50, 15);
		case "Paladyn": return new TworzeniePostaci(20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k5(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 0, 20 + MetodyIOdnosniki.premiowy(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 5, 50, 10);
		case "Czarny Rycerz": return new TworzeniePostaci(20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k5(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 0, 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 5, 50, 10);
		case "Templariusz": return new TworzeniePostaci(20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k10(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 5, 50, 15);
		case "Władca Smoków": return new TworzeniePostaci(20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.k5(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, 0, 5, 50 , 10);
		case "Demoniczny Rycerz": return new TworzeniePostaci(20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k5(), 0, 0, 20 + MetodyIOdnosniki.premiowy(), 0, 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 5, 50, 10);
		case "Złodziej": return new TworzeniePostaci(0, MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k5(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 3, 30, 5);
		case "Zabójca": return new TworzeniePostaci(0, 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.k5(), 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 20 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 4, 40, 15);
		case "Kupiec": return new TworzeniePostaci(0, 0, 0, 0, 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k5(), 0, 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 0, 0, 0, 3, 30, 5);
		case "Bard": return new TworzeniePostaci(MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.k5(), 0, 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 3, 30, 5);
		case "Szpieg": return new TworzeniePostaci(MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.k5(), 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0 , 10 + MetodyIOdnosniki.premiowy(), 0, 0, 20 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 3, 35, 10);
		case "Kłusownik": return new TworzeniePostaci(10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, 0, 0, MetodyIOdnosniki.k5(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 20 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 3, 40, 5);
		case "Hiena Cmentarna": return new TworzeniePostaci(MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k5(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 3, 30, 5);
		case "Kapłan": return new TworzeniePostaci(10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k10(), 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 3, 30, 5);
		case "Druid": return new TworzeniePostaci(10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, 20 + MetodyIOdnosniki.premiowy(),MetodyIOdnosniki.k10(), 0, 20 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 3, 30, 5);
		case "Półbóg": return new TworzeniePostaci(10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k10(), 0, 20 + MetodyIOdnosniki.premiowy(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 20 + MetodyIOdnosniki.premiowy(), 0, 3, 30, 5);
		case "Astrolog": return new TworzeniePostaci(0, 0, 0, 0, 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k10(), 0, 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 0, 0, 0, 10 + MetodyIOdnosniki.premiowy(), 2, 20, 0);
		case "Mnich": return new TworzeniePostaci(0, 0, 10 + MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 30 + MetodyIOdnosniki.premiowy(), 5 + MetodyIOdnosniki.k10(), 0, 0, MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 1, 30, 10);
		case "Szaman": return new TworzeniePostaci(10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 20 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k10(), 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 3, 30, 5);
		case "Mag": return new TworzeniePostaci(0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, MetodyIOdnosniki.k5(), 0, 0, 0, 0, 0, 20 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 2, 20, 0);
		case "Czarnoksiężnik": return new TworzeniePostaci(MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k5(), 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 3, 30, 5);
		case "Iluzjonista": return new TworzeniePostaci(0, 0, 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, 20 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.k5(), 0, 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 0, 0, 10 + MetodyIOdnosniki.premiowy(), 2, 20, 0);
		case "Alchemik": return new TworzeniePostaci(0, 0, 10 + MetodyIOdnosniki.premiowy(), 0, 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, MetodyIOdnosniki.k5(), 0, 0, 0, 0, 0, 10 + MetodyIOdnosniki.premiowy(), 0, 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 1, 20, 0);
		case "Demonolog": return new TworzeniePostaci(MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k5(), 0, 0, 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 3, 30, 5);
		case "Elementalista Wody": return new TworzeniePostaci(0, MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k5(), 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 2, 20, 0);
		case "Elementalista Ognia": return new TworzeniePostaci(10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k5(), 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 2, 20, 0);
		case "Elementalista Ziemi": return new TworzeniePostaci(20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k5(), 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 2, 20, 0);
		case "Elementalista Powietrza": return new TworzeniePostaci(MetodyIOdnosniki.premiowy(), 0, 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 20 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.k5(), 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 0, 10 + MetodyIOdnosniki.premiowy(), 0, 0, 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 10 + MetodyIOdnosniki.premiowy(), 2, 20, 0);
		case "brak": return new TworzeniePostaci(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		default: return null;
		}
	}
	
	protected static TworzeniePostaci Rozwoj(String funkcja) {
		switch(funkcja) {
		case "Wojownik": return new TworzeniePostaci(4, 5, 3, 3, 1, 2, 1, 1 + MetodyIOdnosniki.premiowy(), 1 + MetodyIOdnosniki.premiowy(), 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 3);
		case "Łowca": return new TworzeniePostaci(4, 4, 3, 3, 1, 3, 2, 1 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 2, 1, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 3);
		case "Gwardzista": return new TworzeniePostaci(3, 4, 3, 5, 2, 1, 0, 2 + MetodyIOdnosniki.premiowy(), 1 + MetodyIOdnosniki.premiowy(), 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 4);
		case "Barbarzyńca": return new TworzeniePostaci(5, 5, 4, 4, 0, 1, 0, 1 + MetodyIOdnosniki.premiowy(), 1 + MetodyIOdnosniki.premiowy(), 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 2);
		case "Łowca Czarownic": return new TworzeniePostaci(5, 3, 3, 3, 2, 2, 1, 1+ MetodyIOdnosniki.premiowy(), 1 + MetodyIOdnosniki.premiowy(), 1, 1, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 3);
		case "Wiedzmin": return new TworzeniePostaci(4, 4, 5, 5, 1, 1, 1, MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 5);
		case "Rycerz": return new TworzeniePostaci(4, 4, 3, 3, 1, 2, 0, 2 + MetodyIOdnosniki.premiowy(), 1 + MetodyIOdnosniki.premiowy(), 2, 1, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 4);
		case "Paladyn": return new TworzeniePostaci(4, 4, 2, 2, 2, 3, 2, 3 + MetodyIOdnosniki.premiowy(), 1 + MetodyIOdnosniki.premiowy(), 2, 2, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 4);
		case "Czarny Rycerz": return new TworzeniePostaci(4, 4, 2, 2, 3, 2, 2, 2 + MetodyIOdnosniki.premiowy(), 1 + MetodyIOdnosniki.premiowy(), 2, 1, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 4);
		case "Templariusz": return new TworzeniePostaci(4, 4, 3, 3, 2, 2, 2, 1 + MetodyIOdnosniki.premiowy(), 1 + MetodyIOdnosniki.premiowy(), 3, 2, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 4);
		case "Władca Smoków": return new TworzeniePostaci(4, 4, 3, 3, 2, 3, 2, 1 + MetodyIOdnosniki.premiowy(), 1 + MetodyIOdnosniki.premiowy(), 1, 1, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 4);
		case "Demoniczny Rycerz": return new TworzeniePostaci(3, 5, 2, 2, 2, 3, 3, 1 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 2, 2, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 4);
		case "Złodziej": return new TworzeniePostaci(2, 2, 5, 4, 3, 3, 1, MetodyIOdnosniki.premiowy(), 1 + MetodyIOdnosniki.premiowy(), 1, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 2);
		case "Zabójca": return new TworzeniePostaci(2, 3, 5, 4, 3, 3, 1, MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 1, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 3);
		case "Kupiec": return new TworzeniePostaci(2, 1, 1, 2, 5, 5, 0, 3 + MetodyIOdnosniki.premiowy(), 2 + MetodyIOdnosniki.premiowy(), 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 2);
		case "Bard": return new TworzeniePostaci(1, 1, 3, 3, 3, 4, 2, 2 + MetodyIOdnosniki.premiowy(), 2 + MetodyIOdnosniki.premiowy(), 1, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 2);
		case "Szpieg": return new TworzeniePostaci(2, 2, 4, 3, 5, 3, 1, 1 + MetodyIOdnosniki.premiowy(), 2 + MetodyIOdnosniki.premiowy(), 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 3);
		case "Kłusownik": return new TworzeniePostaci(4, 3, 3, 5, 1, 2, 2, 1 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 3);
		case "Hiena Cmentarna": return new TworzeniePostaci(1, 4, 4, 5, 1, 4, 1, MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 2);
		case "Kapłan": return new TworzeniePostaci(3, 3, 2, 2, 1, 5, 4, 1 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 3, 2, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 2);
		case "Druid": return new TworzeniePostaci(3, 2, 2, 1, 1, 5, 4, 3 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 3, 2, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 2);
		case "Półbóg": return new TworzeniePostaci(3, 3, 2, 1, 2, 5, 4, 1 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 3, 2, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 2);
		case "Astrolog": return new TworzeniePostaci(2, 0, 2, 1, 3, 5, 4, 3 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 3, 2, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 1);
		case "Mnich": return new TworzeniePostaci(3, 1, 2, 2, 5, 5, 5, 1 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 5, 3, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 3);
		case "Szaman": return new TworzeniePostaci(3, 2, 2, 2, 1, 5, 4, 2 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 2, 2, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 2);
		case "Mag": return new TworzeniePostaci(2, 0, 3, 3, 5, 3, 4, 1 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 1);
		case "Czarnoksiężnik": return new TworzeniePostaci(2, 1, 3, 2, 5, 3, 4, 1 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 1, 1, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 2);
		case "Iluzjonista": return new TworzeniePostaci(1, 0, 5, 4, 5, 2, 4, MetodyIOdnosniki.premiowy(), 2 + MetodyIOdnosniki.premiowy(), 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 1);
		case "Alchemik": return new TworzeniePostaci(1, 0, 2, 2, 5, 4, 5, 10, 0, 0, MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 1);
		case "Demonolog": return new TworzeniePostaci(2, 1, 2, 3, 4, 4, 4, 1 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 1, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 2);
		case "Elementalista Wody": return new TworzeniePostaci(0, 1, 5, 3, 4, 3, 4, 1 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 1, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 2);
		case "Elementalista Ognia": return new TworzeniePostaci(3, 5, 0, 1, 4, 3, 4, 1 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 1, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 2);
		case "Elementalista Ziemi": return new TworzeniePostaci(5, 3, 1, 0, 4, 3, 4, 1 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 1, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 2);
		case "Elementalista Powietrza": return new TworzeniePostaci(1, 0, 3, 5, 4, 3, 4, 1 + MetodyIOdnosniki.premiowy(), MetodyIOdnosniki.premiowy(), 1, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, MetodyIOdnosniki.k10(), 0, 0, 0, 0, 0, 0, 0, 2);
		case "brak": return new TworzeniePostaci(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		default: return null;
		}
	}

}
