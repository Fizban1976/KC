package pl.Czasu.Krysztaly;

import java.util.ArrayList;

public class LosowanieZawodow {
	
	// Zawody dostępne dla klasy niższej
	public static String NZawody(int los){
		switch(los) {
		case 1: case 2: case 3: return "Żebrak";
		case 4: case 5: case 6: return "Pastuch";
		case 7: case 8: case 9: return "Stajenny";
		case 10: case 11: case 12: return "Górnik";
		case 13: case 14: case 15: return "Goniec";
		case 16: case 17: case 18: return "Tragarz";
		case 19: case 20: case 21: return "Służący";
		case 22: case 23: case 24: return "Rybak";
		case 25: case 26: case 27: return "Drwal";
		case 28: case 29: case 30: return "Pilot";
		case 31: case 32: case 33: return "Pływak";
		case 34: case 35: case 36: return "Marynarz";
		case 37: case 38: case 39: return "Nurek";
		case 40: case 41: case 42: return "Flisak";
		case 43: case 44: case 45: return "Murarz";
		case 46: case 47: case 48: return "Tkacz";
		case 49: case 50: case 51: return "Rzezbiarz";
		case 52: case 53: case 54: return "Krawiec";
		case 55: case 56: case 57: return "Pszczelarz";
		case 58: case 59: case 60: return "Grabarz";
		case 61: case 62: case 63: return "Cieśla";
		case 64: case 65: case 66: return "Ogrodnik";
		case 67: case 68: case 69: return "Zielarz";
		case 70: case 71: case 72: return "Garncarz";
		case 73: case 74: case 75: return "Kucharz";
		case 76: case 77: case 78: return "Hodowca";
		case 79: case 80: case 81: return "Woznica";
		case 82: case 83: case 84: return "Rolnik";
		case 85: case 86: case 87: return "Piekarz";
		case 88: case 89: case 90: return "Garbarz";
		case 91: case 92: case 93: return "Kowal";
		case 94: case 95: case 96: return "Młynarz";
		case 97: return "Pieśniarz Ludowy";
		case 98: return SZawody(MetodyIOdnosniki.zawody96());
		case 99: return WZawody(MetodyIOdnosniki.zawody96());
		case 100: return "Torcedor";
		default: throw new IllegalArgumentException("Nieprawidłowa watość");
		}
	}
	
	// Zawody dostępne dla klasy średniej
	public static String SZawody(int los){
		switch(los) {
		case 1: case 2: case 3: return "Żebrak";
		case 4: case 5: case 6: return "Goniec";
		case 7: case 8: case 9: return "Stajenny";
		case 10: case 11: case 12: return "Górnik";
		case 13: case 14: case 15: return "Marynarz";
		case 16: case 17: case 18: return "Tragarz";
		case 19: case 20: case 21: return "Służący";
		case 22: case 23: case 24: return "Kucharz";
		case 25: case 26: case 27: return "Dozorca";
		case 28: case 29: case 30: return "Krawiec";
		case 31: case 32: case 33: return "Treser";
		case 34: case 35: case 36: return "Fryzjer";
		case 37: case 38: case 39: return "Ptasznik";
		case 40: case 41: case 42: return "Woznica";
		case 43: case 44: case 45: return "Murarz";
		case 46: case 47: case 48: return "Tkacz";
		case 49: case 50: case 51: return "Rzezbiarz";
		case 52: case 53: case 54: return "Garbarz";
		case 55: case 56: case 57: return "Bosman";
		case 58: case 59: case 60: return "Grabarz";
		case 61: case 62: case 63: return "Piekarz";
		case 64: case 65: case 66: return "Kowal";
		case 67: case 68: case 69: return "Stolarz";
		case 70: case 71: case 72: return "Garncarz";
		case 73: case 74: case 75: return "Skryba";
		case 76: case 77: case 78: return "Kat";
		case 79: case 80: case 81: return "Tłumacz";
		case 82: case 83: case 84: return "Architekt";
		case 85: case 86: case 87: return "Mineralog";
		case 88: case 89: case 90: return "Płatnerz";
		case 91: case 92: case 93: return "Złotnik";
		case 94: case 95: case 96: return "Jubiler";
		case 97: return "Rymarz";
		case 98: return NZawody(MetodyIOdnosniki.zawody96());
		case 99: return WZawody(MetodyIOdnosniki.zawody96());
		case 100: return "Medalier";
		default: throw new IllegalArgumentException("Nieprawidłowa watość");
		}
	}
	
	// Zawody dostępne dla klasy wyższej
	public static String WZawody(int los){
		switch(los) {		
		case 1: case 2: case 3: return "Poborca";
		case 4: case 5: case 6: return "Marynarz";
		case 7: case 8: case 9: return "Bosman";
		case 10: case 11: case 12: return "Skryba";
		case 13: case 14: case 15: return "Kucharz";
		case 16: case 17: case 18: return "Zbrojmistrz";
		case 19: case 20: case 21: return "Płatnerz";
		case 22: case 23: case 24: return "Malarz";
		case 25: case 26: case 27: return "Złotnik";
		case 28: case 29: case 30: return "Bibliotekarz";
		case 31: case 32: case 33: return "Treser";
		case 34: case 35: case 36: return "Jezdziec";
		case 37: case 38: case 39: return "Sokolnik";
		case 40: case 41: case 42: return "Woznica rydwanów";
		case 43: case 44: case 45: return "Jubiler";
		case 46: case 47: case 48: return "Tkacz gobelinów";
		case 49: case 50: case 51: return "Rzezbiarz";
		case 52: case 53: case 54: return "Tancerz";
		case 55: case 56: case 57: return "Tłumacz";
		case 58: case 59: case 60: return "Architekt";
		case 61: case 62: case 63: return "Mineralog";
		case 64: case 65: case 66: return "Śpiewak";
		case 67: case 68: case 69: return "Aktor";
		case 70: case 71: case 72: return "Poeta";
		case 73: case 74: case 75: return "Pisarz";
		case 76: case 77: case 78: return "Szkutnik";
		case 79: case 80: case 81: return "Szuler";
		case 82: case 83: case 84: return "Myśliwy";
		case 85: case 86: case 87: return "Religioznawca";
		case 88: case 89: case 90: return "Kolekcjoner";
		case 91: case 92: case 93: return "Historyk";
		case 94: case 95: case 96: return "Akademik";
		case 97: return "Osoba do Towarzystwa";
		case 98: return NZawody(MetodyIOdnosniki.zawody96());
		case 99: return SZawody(MetodyIOdnosniki.zawody96());
		case 100: return "Tanatopraktor";
		default: throw new IllegalArgumentException("Nieprawidłowa watość");
		}
	}
	
	public static int bonusZ2() {
		
		return 2;
	}
	
	public static int bonusZ3() {
				
		return 3;
	}
	
	public static int bonusZ5() {
		
		return 5;
	}
	
	public static int bonusZ10() {
		
		return 10;
	}
	
	public static int bonusZ20() {
				
		return 20;
	}
	
	public static int bonusZ10Plus() {
		
		return 10 + MetodyIOdnosniki.premiowy();
	}
	
	public static int bonusZ20Plus() {
				
		return 20 + MetodyIOdnosniki.premiowy();
	}
	
	// Zliczamy zawody które dają bonus do cechy lub biegłości
	public static int[] BonusZawod(ArrayList<String> zawod){
		int[] spis = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		if(!(zawod == null)) {
			for(int i = 0; i < zawod.size(); i++) {
				if(zawod.get(i).equals("Górnik") || zawod.get(i).equals("Kowal")) {
					spis[0]++;
				} else if(zawod.get(i).equals("Drwal") || zawod.get(i).equals("Młynarz") || zawod.get(i).equals("Pływak") || zawod.get(i).equals("Tragarz")){
					spis[1]++;
				} else if(zawod.get(i).equals("Garncarz") || zawod.get(i).equals("Rzezbiarz") || zawod.get(i).equals("Rymarz")){
					spis[2]++;
				} else if(zawod.get(i).equals("Tancerz")){
					spis[3]++;
				} else if(zawod.get(i).equals("Akademik")){
					spis[4]++;
				} else if(zawod.get(i).equals("Pilot")){
					spis[5]++;
				} else if(zawod.get(i).equals("Marynarz")){
					spis[6]++;
				} else if(zawod.get(i).equals("Bosman") || zawod.get(i).equals("Historyk") || zawod.get(i).equals("Pisarz") || zawod.get(i).equals("Religioznawca")){
					spis[7]++;
				} else if(zawod.get(i).equals("Bibliotekarz")){
					spis[8]++;
				} else if(zawod.get(i).equals("Kucharz")){
					spis[9]++;
				} else if(zawod.get(i).equals("Służący")){
					spis[10]++;
				} else if(zawod.get(i).equals("Aktor") || zawod.get(i).equals("Osoba do Towarzystwa")){
					spis[11]++;
				} else if(zawod.get(i).equals("Tłumacz") || zawod.get(i).equals("Pieśniarz Ludowy")){
					spis[12]++;
				} else if(zawod.get(i).equals("Poborca")){
					spis[13]++;
				} else if(zawod.get(i).equals("Tanatopraktor")){
					spis[14]++;
				}
			}
		}
		return spis;
	}

	// Zliczanie zawodów i zamiana nazwy na inną
	public static ArrayList<String> nowaLista(ArrayList<String> zawod) {
		if(!(zawod == null)) {
			String test;
			ArrayList<String> dane = zawod;
			ArrayList<String> lista = new ArrayList<>();
			while(!(dane.isEmpty())){
				test = dane.get(0); // przyjmujemy dla testu pierwszy element listy, po sprawdzeniu zostanie on usunięty i zastąpiony przez kolejny, który ma inną wartość
				int liczba = 0;
				for(int i = 0; i < dane.size(); i++) {
						if(dane.get(i).equals(test)) {
						liczba++;
						dane.remove(i); // usuwamy element po sprawdzeniu ze słowem testującym, po zwiększeniu ilości występowania danego elementu 
						i--;	// zmniejszamy wartość "i" po usunięciu elementu
					}
				}
				lista.add(specjalnosc(liczba) + test + " ");
				
			}
			return lista;
		} else {
			return zawod;
		}
	}

	// Przedrostek dodany do zawodu po określeniu ilości występowania
	public static String specjalnosc(int liczba) {
		switch(liczba) {
		case 1: return "";
		case 2: return "Specjalista ";
		case 3: return "Mistrz ";
		case 4: return "Arcymistrz ";
		case 5: return "Boski talent ";
		default: return "";
		}
	}
}
