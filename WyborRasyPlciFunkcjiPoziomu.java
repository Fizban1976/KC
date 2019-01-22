package pl.Czasu.Krysztaly;

import java.util.ArrayList;

public class WyborRasyPlciFunkcjiPoziomu {
	
	protected static int WR(String nazwaRasy) {
		int numer = 0;
			switch(nazwaRasy) {
			case "Człowiek": return 1;
			case "Półelf": return 2;
			case "Elf": return 3;
			case "Półork": return 4;
			case "Półolbrzym": return 5;
			case "Krasnolud": return 6;
			case "Gnom": return 7;
			case "Hobbit": return 8;
			case "Reptillion": return 9;
			default: return numer;
		}
	}
	
	protected static int WP(String nazwaPlci) {
		int numer = 0;
			switch(nazwaPlci) {
			case "Mężczyzna": return 1;
			case "Kobieta": return 2;
			default: return numer;
		}
	}
	/**
	protected static ArrayList<String> Lista;
	protected static ArrayList<String> Lista(int numerRasy) {
		ArrayList<String> lista = new ArrayList<String>();
		switch(numerRasy) {
			case 1: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Gwardzista"); lista.add("Barbarzyńca"); lista.add("Łowca Czarownic"); lista.add("Rycerz"); lista.add("Paladyn"); lista.add("Czarny Rycerz"); lista.add("Demoniczny Rycerz"); lista.add("Złodziej"); lista.add("Zabójca"); lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Kłusownik"); lista.add("Hiena Cmentarna"); lista.add("Kapłan"); lista.add("Druid"); lista.add("Astrolog"); lista.add("Mnich"); lista.add("Szaman"); lista.add("Mag"); lista.add("Czarnoksiężnik"); lista.add("Iluzjonista"); lista.add("Alchemik"); lista.add("Demonolog"); lista.add("Elementalista Wody"); lista.add("Elementalista Ognia"); lista.add("Elementalista Ziemi"); lista.add("Elementalista Powietrza"); return lista;
			case 2: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Gwardzista"); lista.add("Barbarzyńca"); lista.add("Łowca Czarownic"); lista.add("Rycerz"); lista.add("Paladyn"); lista.add("Czarny Rycerz"); lista.add("Demoniczny Rycerz"); lista.add("Złodziej"); lista.add("Zabójca"); lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Kłusownik"); lista.add("Hiena Cmentarna"); lista.add("Kapłan"); lista.add("Druid"); lista.add("Mnich"); lista.add("Szaman"); lista.add("Mag"); lista.add("Czarnoksiężnik"); lista.add("Iluzjonista"); lista.add("Alchemik"); lista.add("Demonolog"); lista.add("Elementalista Wody"); lista.add("Elementalista Ognia"); lista.add("Elementalista Ziemi"); lista.add("Elementalista Powietrza"); return lista;
			case 3: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Gwardzista"); lista.add("Łowca Czarownic"); lista.add("Rycerz"); lista.add("Paladyn"); lista.add("Czarny Rycerz");  lista.add("Złodziej"); lista.add("Zabójca"); lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Kapłan"); lista.add("Druid"); lista.add("Mnich"); lista.add("Szaman"); lista.add("Mag"); lista.add("Elementalista Wody"); lista.add("Elementalista Ognia"); lista.add("Elementalista Ziemi"); lista.add("Elementalista Powietrza"); return lista;
			case 4: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Gwardzista"); lista.add("Barbarzyńca"); lista.add("Łowca Czarownic"); lista.add("Rycerz"); lista.add("Paladyn"); lista.add("Czarny Rycerz"); lista.add("Demoniczny Rycerz"); lista.add("Złodziej"); lista.add("Zabójca"); lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Kłusownik"); lista.add("Hiena Cmentarna"); lista.add("Kapłan"); lista.add("Astrolog"); lista.add("Szaman"); lista.add("Czarnoksiężnik"); lista.add("Iluzjonista"); lista.add("Alchemik"); lista.add("Demonolog"); lista.add("Elementalista Wody"); lista.add("Elementalista Ognia"); lista.add("Elementalista Ziemi"); lista.add("Elementalista Powietrza"); return lista;
			case 5: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Gwardzista"); lista.add("Barbarzyńca"); lista.add("Łowca Czarownic"); lista.add("Rycerz"); lista.add("Paladyn"); lista.add("Czarny Rycerz");  lista.add("Demoniczny Rycerz"); lista.add("Złodziej"); lista.add("Zabójca"); lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Hiena Cmentarna"); lista.add("Kapłan"); lista.add("Druid"); lista.add("Astrolog"); lista.add("Mnich"); lista.add("Szaman"); lista.add("Czarnoksiężnik"); lista.add("Iluzjonista"); lista.add("Elementalista Wody"); lista.add("Elementalista Ognia"); lista.add("Elementalista Ziemi"); lista.add("Elementalista Powietrza"); return lista;
			case 6: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Gwardzista"); lista.add("Łowca Czarownic"); lista.add("Złodziej"); lista.add("Zabójca"); lista.add("Zabójca"); lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Hiena Cmentarna"); lista.add("Kapłan"); lista.add("Astrolog"); lista.add("Mnich"); return lista;
			case 7: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Gwardzista"); lista.add("Złodziej"); lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Hiena Cmentarna"); lista.add("Kapłan"); lista.add("Druid"); lista.add("Astrolog"); lista.add("Mnich"); lista.add("Iluzjonista"); lista.add("Alchemik"); return lista;
			case 8: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Złodziej"); lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Hiena Cmentarna"); lista.add("Kapłan"); lista.add("Druid"); lista.add("Astrolog"); lista.add("Mnich"); lista.add("Iluzjonista"); return lista;
			case 9: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Gwardzista"); lista.add("Rycerz"); lista.add("Paladyn"); lista.add("Zabójca");  lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Kapłan"); lista.add("Astrolog"); lista.add("Mnich"); lista.add("Mag"); lista.add("Iluzjonista"); lista.add("Alchemik"); return lista;	
			default: return lista;
		}
	}
	**/
	protected static ArrayList<String> Lista;
	protected static ArrayList<String> Lista(int numerRasy) {
		ArrayList<String> lista = new ArrayList<String>();
		switch(numerRasy) {
			case 1: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Gwardzista"); lista.add("Barbarzyńca"); lista.add("Łowca Czarownic"); lista.add("Wiedzmin"); lista.add("Rycerz"); lista.add("Paladyn"); lista.add("Czarny Rycerz"); lista.add("Templariusz"); lista.add("Władca Smoków"); lista.add("Demoniczny Rycerz"); lista.add("Złodziej"); lista.add("Zabójca"); lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Kłusownik"); lista.add("Hiena Cmentarna"); lista.add("Kapłan"); lista.add("Druid"); lista.add("Półbóg"); lista.add("Astrolog"); lista.add("Mnich"); lista.add("Szaman"); lista.add("Mag"); lista.add("Czarnoksiężnik"); lista.add("Iluzjonista"); lista.add("Alchemik"); lista.add("Demonolog"); lista.add("Elementalista Wody"); lista.add("Elementalista Ognia"); lista.add("Elementalista Ziemi"); lista.add("Elementalista Powietrza"); return lista;
			case 2: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Gwardzista"); lista.add("Barbarzyńca"); lista.add("Łowca Czarownic"); lista.add("Rycerz"); lista.add("Paladyn"); lista.add("Czarny Rycerz"); lista.add("Templariusz"); lista.add("Władca Smoków"); lista.add("Demoniczny Rycerz"); lista.add("Złodziej"); lista.add("Zabójca"); lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Kłusownik"); lista.add("Hiena Cmentarna"); lista.add("Kapłan"); lista.add("Druid"); lista.add("Półbóg"); lista.add("Mnich"); lista.add("Szaman"); lista.add("Mag"); lista.add("Czarnoksiężnik"); lista.add("Iluzjonista"); lista.add("Alchemik"); lista.add("Demonolog"); lista.add("Elementalista Wody"); lista.add("Elementalista Ognia"); lista.add("Elementalista Ziemi"); lista.add("Elementalista Powietrza"); return lista;
			case 3: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Gwardzista"); lista.add("Łowca Czarownic"); lista.add("Rycerz"); lista.add("Paladyn"); lista.add("Czarny Rycerz"); lista.add("Templariusz"); lista.add("Władca Smoków"); lista.add("Złodziej"); lista.add("Zabójca"); lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Kapłan"); lista.add("Druid"); lista.add("Półbóg"); lista.add("Mnich"); lista.add("Szaman"); lista.add("Mag"); lista.add("Elementalista Wody"); lista.add("Elementalista Ognia"); lista.add("Elementalista Ziemi"); lista.add("Elementalista Powietrza"); return lista;
			case 4: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Gwardzista"); lista.add("Barbarzyńca"); lista.add("Łowca Czarownic"); lista.add("Rycerz"); lista.add("Paladyn"); lista.add("Czarny Rycerz"); lista.add("Władca Smoków"); lista.add("Demoniczny Rycerz"); lista.add("Złodziej"); lista.add("Zabójca"); lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Kłusownik"); lista.add("Hiena Cmentarna"); lista.add("Kapłan"); lista.add("Półbóg"); lista.add("Astrolog"); lista.add("Szaman"); lista.add("Czarnoksiężnik"); lista.add("Iluzjonista"); lista.add("Alchemik"); lista.add("Demonolog"); lista.add("Elementalista Wody"); lista.add("Elementalista Ognia"); lista.add("Elementalista Ziemi"); lista.add("Elementalista Powietrza"); return lista;
			case 5: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Gwardzista"); lista.add("Barbarzyńca"); lista.add("Łowca Czarownic"); lista.add("Rycerz"); lista.add("Paladyn"); lista.add("Czarny Rycerz"); lista.add("Templariusz"); lista.add("Władca Smoków"); lista.add("Demoniczny Rycerz"); lista.add("Złodziej"); lista.add("Zabójca"); lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Hiena Cmentarna"); lista.add("Kapłan"); lista.add("Druid"); lista.add("Półbóg"); lista.add("Astrolog"); lista.add("Mnich"); lista.add("Szaman"); lista.add("Czarnoksiężnik"); lista.add("Iluzjonista"); lista.add("Elementalista Wody"); lista.add("Elementalista Ognia"); lista.add("Elementalista Ziemi"); lista.add("Elementalista Powietrza"); return lista;
			case 6: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Gwardzista"); lista.add("Łowca Czarownic"); lista.add("Złodziej"); lista.add("Zabójca"); lista.add("Zabójca"); lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Hiena Cmentarna"); lista.add("Kapłan"); lista.add("Astrolog"); lista.add("Mnich"); return lista;
			case 7: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Gwardzista"); lista.add("Złodziej"); lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Hiena Cmentarna"); lista.add("Kapłan"); lista.add("Druid"); lista.add("Półbóg"); lista.add("Astrolog"); lista.add("Mnich"); lista.add("Iluzjonista"); lista.add("Alchemik"); return lista;
			case 8: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Złodziej"); lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Hiena Cmentarna"); lista.add("Kapłan"); lista.add("Druid"); lista.add("Półbóg"); lista.add("Astrolog"); lista.add("Mnich"); lista.add("Iluzjonista"); return lista;
			case 9: lista.add("Wojownik"); lista.add("Łowca"); lista.add("Gwardzista"); lista.add("Rycerz"); lista.add("Paladyn"); lista.add("Templariusz"); lista.add("Zabójca");  lista.add("Kupiec"); lista.add("Bard"); lista.add("Szpieg"); lista.add("Kapłan"); lista.add("Półbóg"); lista.add("Astrolog"); lista.add("Mnich"); lista.add("Mag"); lista.add("Iluzjonista"); lista.add("Alchemik"); return lista;	
			default: return lista;
		}
	}
	
	protected static ArrayList<String> ListaB;
	protected static ArrayList<String> ListaB() {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("brak");
		return lista;
	}
	
	protected static int WF(String funkcja) {
		int numer = 0;
		if(funkcja.equals("Wojownik")) {
			numer = 1;
		} else if(funkcja.equals("Łowca")) {
			numer = 2;
		} else if(funkcja.equals("Gwardzista")) {
			numer = 3;
		} else if(funkcja.equals("Barbarzyńca")) {
			numer = 4;
		} else if(funkcja.equals("Łowca Czarownic")) {
			numer = 5;
		} else if(funkcja.equals("Wiedzmin")) {
			numer = 6;
		} else if(funkcja.equals("Rycerz")) {
			numer = 7;
		} else if(funkcja.equals("Paladyn")) {
			numer = 8;
		} else if(funkcja.equals("Czarny Rycerz")) {
			numer = 9;
		} else if(funkcja.equals("Templariusz")) {
			numer = 10;
		} else if(funkcja.equals("Władca Smoków")) {
			numer = 11;
		} else if(funkcja.equals("Demoniczny Rycerz")) {
			numer = 12;
		} else if(funkcja.equals("Złodziej")) {
			numer = 13;
		} else if(funkcja.equals("Zabójca")) {
			numer = 14;
		} else if(funkcja.equals("Kupiec")) {
			numer = 15;
		} else if(funkcja.equals("Bard")) {
			numer = 16;
		} else if(funkcja.equals("Szpieg")) {
			numer = 17;
		} else if(funkcja.equals("Kłusownik")) {
			numer = 18;
		} else if(funkcja.equals("Hiena Cmentarna")) {
			numer = 19;
		} else if(funkcja.equals("Kapłan")) {
			numer = 20;
		} else if(funkcja.equals("Druid")) {
			numer = 21;
		} else if(funkcja.equals("Półbóg")) {
			numer = 22;
		} else if(funkcja.equals("Astrolog")) {
			numer = 23;
		} else if(funkcja.equals("Mnich")) {
			numer = 24;
		} else if(funkcja.equals("Szaman")) {
			numer = 25;
		} else if(funkcja.equals("Mag")) {
			numer = 26;
		} else if(funkcja.equals("Czarnoksiężnik")) {
			numer = 27;
		} else if(funkcja.equals("Iluzjonista")) {
			numer = 28;
		} else if(funkcja.equals("Alchemik")) {
			numer = 29;
		} else if(funkcja.equals("Demonolog")) {
			numer = 30;
		} else if(funkcja.equals("Elementalista Wody")) {
			numer = 31;
		} else if(funkcja.equals("Elementalista Ognia")) {
			numer = 32;
		} else if(funkcja.equals("Elementalista Ziemi")) {
			numer = 33;
		} else if(funkcja.equals("Elementalista Powietrza")) {
			numer = 34;
		} else if(funkcja.equals("brak")) {
			numer = 35;
		}
		return numer;
	}
	
	protected static String[] ListaFunkcji(int numerFunkcji) {
		String[] rozpiska = {};
		switch(numerFunkcji) {
		case 1: String[] woj = {"Złodziej", "Zabójca", "Kupiec", "Bard", "Szpieg", "Kłusownik", "Hiena Cmentarna", "Kapłan", "Druid", "Astrolog", "Szaman", "Mag", "Czarnoksiężnik", "Iluzjonista", "Alchemik", "Demonolog", "Elementalista Wody", "Elementalista Ognia", "Elementalista Ziemi", "Elementalista Powietrza", "brak"}; rozpiska = woj; return rozpiska;
		case 2: String[] low = {"Kupiec", "Bard", "Szpieg", "Kapłan", "Druid", "Szaman", "Mag", "brak"}; rozpiska = low; return rozpiska;
		case 3: String[] gwa = {"Zabójca", "Szpieg", "Kapłan", "brak"}; rozpiska = gwa; return rozpiska;
		case 4: String[] bar = {"Złodziej", "Zabójca", "Kupiec", "Bard", "Kłusownik", "Hiena Cmentarna", "Kapłan", "Szaman", "brak"}; rozpiska = bar; return rozpiska;
		case 5: String[] lc = {"Zabójca", "Kupiec", "Szpieg", "Kapłan", "brak"}; rozpiska = lc; return rozpiska;
		case 6: String[] wie = {"brak"}; rozpiska = wie; return rozpiska;
		case 7: String[] ryc = {"Kapłan", "brak"}; rozpiska = ryc; return rozpiska;
		case 8: String[] pal = {"Astrolog", "brak"}; rozpiska = pal; return rozpiska;
		case 9: String[] cr = {"Kapłan", "brak"}; rozpiska = cr; return rozpiska;
		case 10: String[] tem = {"brak"}; rozpiska = tem; return rozpiska;
		case 11: String[] ws = {"brak"}; rozpiska = ws; return rozpiska;
		case 12: String[] dr = {"Kapłan", "brak"}; rozpiska = dr; return rozpiska;
		case 13: String[] zlo = {"Wojownik", "Barbarzyńca", "Kapłan", "Szaman", "Mag", "Czarnoksiężnik", "Iluzjonista", "Alchemik", "Demonolog", "Elementalista Wody", "Elementalista Ognia", "Elementalista Ziemi", "Elementalista Powietrza", "brak"}; rozpiska = zlo; return rozpiska;
		case 14: String[] zab = {"Wojownik", "Gwardzista", "Barbarzyńca", "Łowca Czarownic", "Kapłan", "Mag", "Czarnoksiężnik", "Iluzjonista", "Alchemik", "Demonolog", "Elementalista Wody", "Elementalista Ognia", "Elementalista Ziemi", "Elementalista Powietrza", "brak"}; rozpiska = zab; return rozpiska;
		case 15: String[] kup = {"Wojownik", "Łowca", "Gwardzista", "Barbarzyńca", "Łowca Czarownic", "Kapłan", "Druid", "Astrolog", "Szaman", "Mag", "Czarnoksiężnik", "Iluzjonista", "Alchemik", "Demonolog", "Elementalista Wody", "Elementalista Ognia", "Elementalista Ziemi", "Elementalista Powietrza", "brak"}; rozpiska = kup; return rozpiska;
		case 16: String[] bad = {"Wojownik", "Łowca", "Barbarzyńca", "Kapłan", "Astrolog", "Mag", "Czarnoksiężnik", "Iluzjonista", "Alchemik", "Demonolog", "Elementalista Wody", "Elementalista Ognia", "Elementalista Ziemi", "Elementalista Powietrza", "brak"}; rozpiska = bad; return rozpiska;
		case 17: String[] szp = {"Wojownik", "Łowca", "Gwardzista", "Łowca Czarownic", "Kapłan", "Astrolog", "Mag", "Czarnoksiężnik", "Iluzjonista", "Alchemik", "Demonolog", "Elementalista Wody", "Elementalista Ognia", "Elementalista Ziemi", "Elementalista Powietrza", "brak"}; rozpiska = szp; return rozpiska;
		case 18: String[] klu = {"Wojownik", "Barbarzyńca", "Kapłan", "Astrolog", "Mag", "Czarnoksiężnik", "Iluzjonista", "Alchemik", "Demonolog", "Elementalista Wody", "Elementalista Ognia", "Elementalista Ziemi", "Elementalista Powietrza", "brak"}; rozpiska = klu; return rozpiska;
		case 19: String[] hc = {"Wojownik", "Barbarzyńca", "Astrolog", "Mag", "Czarnoksiężnik", "Alchemik", "Demonolog", "Elementalista Wody", "Elementalista Ognia", "Elementalista Ziemi", "Elementalista Powietrza", "brak"}; rozpiska = hc; return rozpiska;
		case 20: String[] kap = {"Wojownik", "Łowca", "Gwardzista", "Barbarzyńca", "Łowca Czarownic", "Rycerz", "Czarny Rycerz", "Demoniczny Rycerz", "Złodziej", "Zabójca", "Kupiec", "Bard", "Szpieg", "Mag", "Czarnoksiężnik", "Iluzjonista", "Alchemik", "Demonolog", "Elementalista Wody", "Elementalista Ognia", "Elementalista Ziemi", "Elementalista Powietrza", "brak"}; rozpiska = kap; return rozpiska;
		case 21: String[] dru = {"Wojownik", "Łowca", "Mag", "Elementalista Wody", "Elementalista Ognia", "Elementalista Ziemi", "Elementalista Powietrza", "brak"}; rozpiska = dru; return rozpiska;
		case 22: String[] pol = {"brak"}; rozpiska = pol; return rozpiska;
		case 23: String[] ast = {"Wojownik", "Paladyn", "Kupiec", "Bard", "Szpieg", "Kłusownik", "Hiena Cmentarna", "Mag", "Czarnoksiężnik", "Iluzjonista", "Alchemik", "Demonolog", "Elementalista Wody", "Elementalista Ognia", "Elementalista Ziemi", "Elementalista Powietrza", "brak"}; rozpiska = ast; return rozpiska;
		case 24: String[] mni = {"Bard", "brak"}; rozpiska = mni; return rozpiska;
		case 25: String[] sza = {"Wojownik", "Łowca", "Barbarzyńca", "Złodziej", "brak"}; rozpiska = sza; return rozpiska;
		case 26: String[] mag = {"Wojownik", "Łowca", "Złodziej", "Zabójca", "Kupiec", "Bard", "Szpieg", "Kłusownik", "Hiena Cmentarna", "Kapłan", "Druid", "Astrolog", "Czarnoksiężnik", "Iluzjonista", "Alchemik", "Demonolog", "Elementalista Wody", "Elementalista Ognia", "Elementalista Ziemi", "Elementalista Powietrza", "brak"}; rozpiska = mag; return rozpiska;
		case 27: String[] cza = {"Wojownik", "Łowca", "Gwardzista", "Złodziej", "Zabójca", "Kupiec", "Bard", "Szpieg", "Kłusownik", "Hiena Cmentarna", "Kapłan", "Astrolog", "Mag", "Iluzjonista", "Alchemik", "Demonolog", "Elementalista Wody", "Elementalista Ognia", "Elementalista Ziemi", "Elementalista Powietrza", "brak"}; rozpiska = cza; return rozpiska;
		case 28: String[] ilu = {"Wojownik", "Złodziej", "Zabójca", "Kupiec", "Bard", "Szpieg", "Kłusownik", "Hiena Cmentarna", "Kapłan", "Astrolog", "Mag", "Czarnoksiężnik", "Alchemik", "Demonolog", "Elementalista Wody", "Elementalista Ognia", "Elementalista Ziemi", "Elementalista Powietrza", "brak"}; rozpiska = ilu; return rozpiska;
		case 29: String[] alc = {"Wojownik", "Złodziej", "Zabójca", "Kupiec", "Bard", "Szpieg", "Kłusownik", "Hiena Cmentarna", "Kapłan", "Astrolog", "Mag", "Czarnoksiężnik", "Iluzjonista", "Demonolog", "Elementalista Wody", "Elementalista Ognia", "Elementalista Ziemi", "Elementalista Powietrza", "brak"}; rozpiska = alc; return rozpiska;
		case 30: String[] dem = {"Wojownik", "Złodziej", "Zabójca", "Kupiec", "Bard", "Szpieg", "Kłusownik", "Hiena Cmentarna", "Kapłan", "Astrolog", "Mag", "Czarnoksiężnik", "Iluzjonista", "Alchemik", "Elementalista Wody", "Elementalista Ognia", "Elementalista Ziemi", "Elementalista Powietrza", "brak"}; rozpiska = dem; return rozpiska;
		case 31: String[] elew = {"Wojownik", "Złodziej", "Zabójca", "Kupiec", "Bard", "Szpieg", "Kłusownik", "Hiena Cmentarna", "Kapłan", "Druid", "Astrolog", "Mag", "Czarnoksiężnik", "Iluzjonista", "Alchemik", "Demonolog", "brak"}; rozpiska = elew; return rozpiska;
		case 32: String[] eleo = {"Wojownik", "Złodziej", "Zabójca", "Kupiec", "Bard", "Szpieg", "Kłusownik", "Hiena Cmentarna", "Kapłan", "Druid", "Astrolog", "Mag", "Czarnoksiężnik", "Iluzjonista", "Alchemik", "Demonolog", "brak"}; rozpiska = eleo; return rozpiska;
		case 33: String[] elez = {"Wojownik", "Złodziej", "Zabójca", "Kupiec", "Bard", "Szpieg", "Kłusownik", "Hiena Cmentarna", "Kapłan", "Druid", "Astrolog", "Mag", "Czarnoksiężnik", "Iluzjonista", "Alchemik", "Demonolog", "brak"}; rozpiska = elez; return rozpiska;
		case 34: String[] elep = {"Wojownik", "Złodziej", "Zabójca", "Kupiec", "Bard", "Szpieg", "Kłusownik", "Hiena Cmentarna", "Kapłan", "Druid", "Astrolog", "Mag", "Czarnoksiężnik", "Iluzjonista", "Alchemik", "Demonolog", "brak"}; rozpiska = elep; return rozpiska;
		default: return rozpiska;
		}
	}

	
	
	protected static String WybranaFunkcja(int numerFunkcji, int numerRasy) {
		switch(numerFunkcji) {
		case 1: return "Wojownik";
		case 2: return "Łowca";
		case 3: if(!(numerRasy == 8)) return "Gwardzista";
		case 4: if(numerRasy == 1 || numerRasy == 2 || numerRasy == 4 || numerRasy == 5) return "Barbarzyńca";
		case 5: if(!(numerRasy == 7 || numerRasy == 8 || numerRasy == 9)) return "Łowca Czarownic";
		case 6: if(numerRasy == 1) return "Wiedzmin";
		case 7: if(!(numerRasy == 6 || numerRasy == 7 || numerRasy == 8)) return "Rycerz";
		case 8: if(!(numerRasy == 6 || numerRasy == 7 || numerRasy == 8)) return "Paladyn";
		case 9: if(!(numerRasy == 6 || numerRasy == 7 || numerRasy == 8 || numerRasy == 9)) return "Czarny Rycerz";
		case 10: if(!(numerRasy == 4 || numerRasy == 6 || numerRasy == 7 || numerRasy == 8)) return "Templariusz";
		case 11: if(!(numerRasy == 6 || numerRasy == 7 || numerRasy == 8 || numerRasy == 9)) return "Władca Smoków";
		case 12: if(numerRasy == 1 || numerRasy == 2 || numerRasy == 4 || numerRasy == 5) return "Demoniczny Rycerz";
		case 13: if(!(numerRasy == 9)) return "Złodziej";
		case 14: if(!(numerRasy == 7 || numerRasy == 8)) return "Zabójca";
		case 15: return "Kupiec";
		case 16: return "Bard";
		case 17: return "Szpieg";
		case 18: if(numerRasy == 1 || numerRasy == 2 || numerRasy == 4) return "Kłusownik";
		case 19: if(!(numerRasy == 3 || numerRasy == 9)) return "Hiena Cmentarna";
		case 20: return "Kapłan";
		case 21: if(!(numerRasy == 4 || numerRasy == 6 || numerRasy == 9)) return "Druid";
		case 22: if(!(numerRasy == 6)) return "Półbóg";
		case 23: if(!(numerRasy == 2 || numerRasy == 3)) return "Astrolog";
		case 24: if(!(numerRasy == 4)) return "Mnich";
		case 25: if(!(numerRasy == 6 || numerRasy == 7 || numerRasy == 8 || numerRasy == 9)) return "Szaman";
		case 26: if(numerRasy == 1 || numerRasy == 2 || numerRasy == 3 || numerRasy == 9) return "Mag";
		case 27: if(numerRasy == 1 || numerRasy == 2 || numerRasy == 4 || numerRasy == 5) return "Czarnoksiężnik";
		case 28: if(!(numerRasy == 3 || numerRasy == 6)) return "Iluzjonista";
		case 29: if(!(numerRasy == 3 || numerRasy == 5 || numerRasy == 6 || numerRasy == 8)) return "Alchemik";
		case 30: if(numerRasy == 1 || numerRasy == 2 || numerRasy == 4) return "Demonolog";
		case 31: if(!(numerRasy == 6 || numerRasy == 7 || numerRasy == 8 || numerRasy == 9)) return "Elementalista Wody"; 
		case 32: if(!(numerRasy == 6 || numerRasy == 7 || numerRasy == 8 || numerRasy == 9)) return "Elementalista Ognia";
		case 33: if(!(numerRasy == 6 || numerRasy == 7 || numerRasy == 8 || numerRasy == 9)) return "Elementalista Ziemi";
		case 34: if(!(numerRasy == 6 || numerRasy == 7 || numerRasy == 8 || numerRasy == 9)) return "Elementalista Powietrza";
		case 35: return "brak";
		default: return "nic";
		}
	}
		
	protected static ArrayList<String> WyborFunkcji2(String[] WyborFunkcji, String[] ListaFunkcji) {
		ArrayList<String> spis = new ArrayList<String>();
		for(int i = 0; i < WyborFunkcji.length; i++) {
			for(int j = 0; j < ListaFunkcji.length; j++) {
				if(WyborFunkcji[i].equals(ListaFunkcji[j])) {
					spis.add(ListaFunkcji[j]);
				}
			}
		}
		return spis;
	}
	
	protected static int WybranyPoziom(int numerFunkcji, int numerRasy) {
		int max = 50;
		switch(numerFunkcji) {
		case 1: if(numerRasy == 7 || numerRasy == 8) { 
			return 15; 
			} else {
				return max;
			}
		case 2: if(numerRasy == 6 || numerRasy == 7 || numerRasy == 8) {
			return 10;
			} else {
				return max;
			}
		case 3: if(numerRasy == 3 || numerRasy == 7) {
			return 15;
			} else {
				return max;
			}
		case 4: if(numerRasy == 2) {
			return 10;
			} else {
				return max;
			}
		case 5: if(numerRasy == 2 || numerRasy == 6) {
			return 10;
			} else {
				return max;
			}
		case 6:	return max;
		case 7: return max;
		case 8: if(numerRasy == 4 || numerRasy == 5) {
			return 10;
			} else {
				return max;
			}
		case 9: return max;
		case 10: return max;
		case 11: if(numerRasy == 4 || numerRasy == 5) {
			return 10;
			} else {
				return max;
			}
		case 12: return max;
		case 13: if(numerRasy == 5 || numerRasy == 6) {
			return 15;
			} else {
				return max;
			}
		case 14: if(numerRasy == 5 || numerRasy == 6) {
			return 10;
			} else {
				return max;
			}
		case 15: if(numerRasy == 2 || numerRasy == 4) {
			return 15;
			} else if(numerRasy == 3 || numerRasy == 5 || numerRasy == 9){
			return 10;
			} else {
				return max;
			}
		case 16: if(numerRasy == 5 || numerRasy == 7) {
			return 15;
			} else if(numerRasy == 6 || numerRasy == 8){
			return 10;
			} else {
				return max;
			}
		case 17: if(numerRasy == 3 || numerRasy == 5 || numerRasy == 6 || numerRasy == 7 || numerRasy == 8 || numerRasy == 9) {
			return 15;
			} else {
				return max;
			}
		case 18: return max;
		case 19: return max;
		case 20: if(numerRasy == 3 || numerRasy == 6) {
			return 15;
			} else if(numerRasy == 5 || numerRasy == 8){
			return 10;
			} else {
				return max;
			}
		case 21: if(numerRasy == 5 || numerRasy == 7 || numerRasy == 8) {
			return 15;
			} else {
				return max;
			}
		case 22: return max;
		case 23: if(numerRasy == 4 || numerRasy == 5 || numerRasy == 8) {
			return 10;
			} else {
				return max;
			}
		case 24: if(numerRasy == 2 || numerRasy == 9) {
			return 15;
			} else if(numerRasy == 5 || numerRasy == 7 || numerRasy == 8){
			return 7;
			} else {
				return max;
			}
		case 25: return max;
		case 26: if(numerRasy == 9) {
			return 10;
			} else {
				return max;
			}
		case 27: if(numerRasy == 5) {
			return 15;
			} else {
				return max;
			}
		case 28: if(numerRasy == 2 || numerRasy == 4 || numerRasy == 8 || numerRasy == 9) {
			return 10;
			} else {
				return max;
			}
		case 29: if(numerRasy == 2 || numerRasy == 4 || numerRasy == 7) {
			return 15;
			} else if(numerRasy == 9){
			return 10;
			} else {
				return max;
			}
		case 30: return max;
		case 31: if(numerRasy == 5) {
			return 10;
			} else {
				return max;
			}
		case 32: if(numerRasy == 5) {
			return 10;
			} else {
				return max;
			}
		case 33: if(numerRasy == 5) {
			return 10;
			} else {
				return max;
			}
		case 34: if(numerRasy == 5) {
			return 10;
			} else {
				return max;
			}
		case 35: return 0;
		default: return 0;
		}
	}
	
	protected static int WybranyPoziom2(int numerFunkcji, int numerRasy, int wybranyPoziom) {
		int max = wybranyPoziom;
		switch(numerFunkcji) {
		case 1: if(numerRasy == 7 || numerRasy == 8) { 
				if(15 < max)
					return 15; 
			} else {
				return max;
			}
		case 2: if(numerRasy == 6 || numerRasy == 7 || numerRasy == 8) {
				if(10 < max)
					return 10;
			} else {
				return max;
			}
		case 3: if(numerRasy == 3 || numerRasy == 7) {
				if(15 < max)
					return 15;
			} else {
				return max;
			}
		case 4: if(numerRasy == 2) {
				if(10 < max)
					return 10;
			} else {
				return max;
			}
		case 5: if(numerRasy == 2 || numerRasy == 6) {
				if(10 < max)
					return 10;
			} else {
				return max;
			}
		case 6:	return max;
		case 7: return max;
		case 8: if(numerRasy == 4 || numerRasy == 5) {
				if(10 < max)
					return 10;
			} else {
				return max;
			}
		case 9: return max;
		case 10: return max;
		case 11: if(numerRasy == 4 || numerRasy == 5) {
				if(10 < max)
					return 10;
			} else {
				return max;
			}
		case 12: return max;
		case 13: if(numerRasy == 5 || numerRasy == 6) {
				if(15 < max)
					return 15;
			} else {
				return max;
			}
		case 14: if(numerRasy == 5 || numerRasy == 6) {
				if(10 < max)
					return 10;
			} else {
				return max;
			}
		case 15: if(numerRasy == 2 || numerRasy == 4) {
				if(15 < max)
					return 15;
			} else if(numerRasy == 3 || numerRasy == 5 || numerRasy == 9){
				if(10 < max)
					return 10;
			} else {
				return max;
			}
		case 16: if(numerRasy == 5 || numerRasy == 7) {
				if(15 < max)
					return 15;
			} else if(numerRasy == 6 || numerRasy == 8){
				if(10 < max)
					return 10;
			} else {
				return max;
			}
		case 17: if(numerRasy == 3 || numerRasy == 5 || numerRasy == 6 || numerRasy == 7 || numerRasy == 8 || numerRasy == 9) {
				if(15 < max)
					return 15;
			} else {
				return max;
			}
		case 18: return max;
		case 19: return max;
		case 20: if(numerRasy == 3 || numerRasy == 6) {
				if(15 < max)
					return 15;
			} else if(numerRasy == 5 || numerRasy == 8){
				if(10 < max)
					return 10;
			} else {
				return max;
			}
		case 21: if(numerRasy == 5 || numerRasy == 7 || numerRasy == 8) {
				if(15 < max)
					return 15;
			} else {
				return max;
			}
		case 22: return max;
		case 23: if(numerRasy == 4 || numerRasy == 5 || numerRasy == 8) {
				if(10 < max)
					return 10;
			} else {
				return max;
			}
		case 24: if(numerRasy == 2 || numerRasy == 9) {
				if(15 < max)
					return 15;
			} else if(numerRasy == 5 || numerRasy == 7 || numerRasy == 8){
				if(7 < max)
					return 7;
			} else {
				return max;
			}
		case 25: return max;
		case 26: if(numerRasy == 9) {
				if(10 < max)
					return 10;
			} else {
				return max;
			}
		case 27: if(numerRasy == 5) {
				if(15 < max)
					return 15;
			} else {
				return max;
			}
		case 28: if(numerRasy == 2 || numerRasy == 4 || numerRasy == 8 || numerRasy == 9) {
				if(10 < max)
					return 10;
			} else {
				return max;
			}
		case 29: if(numerRasy == 2 || numerRasy == 4 || numerRasy == 7) {
				if(15 < max)
					return 15;
			} else if(numerRasy == 9){
				if(10 < max)
					return 10;
			} else {
				return max;
			}
		case 30: return max;
		case 31: if(numerRasy == 5) {
				if(10 < max)
					return 10;
			} else {
				return max;
			}
		case 32: if(numerRasy == 5) {
				if(10 < max)
					return 10;
			} else {
				return max;
			}
		case 33: if(numerRasy == 5) {
				if(10 < max)
					return 10;
			} else {
				return max;
			}
		case 34: if(numerRasy == 5) {
				if(10 < max)
					return 10;
			} else {
				return max;
			}
		case 35: return 0;
		default: return 0;
		}
	}
}
