package pl.Czasu.Krysztaly;

public class ZdolnoscNadnaturalnaINienaturalna {

	public static String ZdolNad(int los) {
		switch(los) {
		case 1: case 2: return "Twardziel";
		case 3: case 4: return "Silacz";
		case 5: case 6: return "Akrobata";
		case 7: case 8: return "Szybki";
		case 9: case 10: return "Geniusz";
		case 11: case 12: return "Mędrzec";
		case 13: case 14: return "Magik";
		case 15: case 16: return "Fanatyk";
		case 17: case 18: return "Ulubieniec bogów";
		case 19: case 20: return "Elokwentny";
		case 21: case 22: return "Piękniś";
		case 23: case 24: return "Poliglota";
		case 25: case 26: return "Długowieczny";
		case 27: case 28: return "Fechmistrz";
		case 29: case 30: return "Odporny na Iluzje";
		case 31: case 32: return "odporny na Sugestie";
		case 33: case 34: return "Odporny na Zaklęcia";
		case 35: case 36: return "Odporny na Szok";
		case 37: case 38: return "Odporny na Energie";
		case 39: case 40: return "Odporny na Trucizny";
		case 41: case 42: return "Odporny na Gazy";
		case 43: case 44: return "Odporny na Temperature";
		case 45: case 46: return "Odporny na Elektryczność";
		case 47: case 48: return "Odporny na Polimorfie";
		case 49: case 50: return "Odporny na Glod";
		case 51: case 52: return "Odporny na Pragnienie";
		case 53: case 54: return "Odporny na Chlod";
		case 55: case 56: return "Odporny na Goraco";
		case 57: case 58: return "Odporny na Zmeczenie";
		case 59: case 60: return "Odporny na Choroby";
		case 61: case 62: return "Odporny na Przemiany";
		case 63: case 64: return "Widzenie noca";
		case 65: case 66: return "Przenikliwy wzrok";
		case 67: case 68: return "Nadzwyczajny sluch";
		case 69: case 70: return "Nadzwyczajny wech";
		case 71: case 72: return "Nazdwyczajny Sokoli wzrok";
		case 73: case 74: return "Znachor";
		case 75: case 76: return "Znawca Dawnej Mowy";
		case 77: case 78: return "Regenerujący się";
		case 79: case 80: return "Krótko śpiący";
		case 81: case 82: return "Telekinetyk";
		case 83: case 84: return "Telepata";
		case 85: case 86: return "Wieszcz";
		case 87: case 88: return "Hipnotyzer";
		case 89: case 90: return "Wyjątkowa przenikliwość";
		case 91: case 92: return "Naśladowanie odgłosów";
		case 93: case 94: return "Mówca";
		case 95: case 96: return "Wykrywanie zachwiania równowagi";
		case 97: case 98: return "Wielki szczęściarz";
		case 99: return "Automatyczne wykrywanie kłamstwa";
		case 100: return "Błogosławieństwo";
		default: throw new IllegalArgumentException("Nieprawidłowa watość");
		}
	}

	public static String ZdolNie(int los) {
		switch(los) {
		case 1: case 2: return "Karzeł";
		case 3: case 4: return "Kulawy";
		case 5: case 6: return "Platfus";
		case 7: case 8: return "Zezowaty";
		case 9: case 10: return "Garbaty";
		case 11: case 12: return "Niepłodny";
		case 13: case 14: return "Grubas";
		case 15: case 16: return "Jednoręki";
		case 17: case 18: return "Flegmatyk";
		case 19: case 20: return "Krótkowidz";
		case 21: case 22: return "Dalekowidz";
		case 23: case 24: return "Jąkała";
		case 25: case 26: return "Obżartuch";
		case 27: case 28: return "Szpetny";
		case 29: case 30: return "Śpioch";
		case 31: case 32: return "Pryszczaty";
		case 33: case 34: return "Alergik";
		case 35: case 36: return "Amnezja";
		case 37: case 38: return "Jednooki";
		case 39: case 40: return "Klaustrofobia";
		case 41: case 42: return "Lęk wysokości";
		case 43: case 44: return "Debil";
		case 45: case 46: return "Nadwrażliwy na magie";
		case 47: case 48: return "Sodomita";
		case 49: case 50: return "Nekrofil";
		case 51: case 52: return "Biseksualista";
		case 53: case 54: return "Homoseksualista";
		case 55: case 56: return "Masochista";
		case 57: case 58: return "Sadysta";
		case 59: case 60: return "Złośliwiec";
		case 61: case 62: return "Zgrywus";
		case 63: case 64: return "Skąpiec";
		case 65: case 66: return "Rozrzutnik";
		case 67: case 68: return "Zarozumialec";
		case 69: case 70: return "Kłamca";
		case 71: case 72: return "Zachłanny";
		case 73: case 74: return "Pechowiec";
		case 75: case 76: return "Samotnik";
		case 77: case 78: return "Bezlitosny";
		case 79: case 80: return "Ryzykant";
		case 81: case 82: return "Hazardzista";
		case 83: case 84: return "Pijak";
		case 85: case 86: return "Nerwus";
		case 87: case 88: return "Tchórz";
		case 89: case 90: return "Lizus";
		case 91: case 92: return "Brudas";
		case 93: case 94: return "Podrywacz";
		case 95: case 96: return "Głuchy";
		case 97: case 98: return "Głupiec";
		case 99: case 100: return "Arcyułomność";
		default: throw new IllegalArgumentException("Nieprawidłowa watość");
		}
	}
	
	public static int Silacz(int rasa, int plec) {
		switch((rasa*10) + plec) {
		case 11: return 170 + MetodyIOdnosniki.premiowy();
		case 12: return 160 + MetodyIOdnosniki.premiowy();
		case 21: return 160 + MetodyIOdnosniki.premiowy();
		case 22: return 160 + MetodyIOdnosniki.premiowy();
		case 31: return 150 + MetodyIOdnosniki.premiowy();
		case 32: return 145 + MetodyIOdnosniki.premiowy();
		case 41: return 190 + MetodyIOdnosniki.premiowy();
		case 42: return 190 + MetodyIOdnosniki.premiowy();
		case 51: return 220 + MetodyIOdnosniki.premiowy();
		case 52: return 200 + MetodyIOdnosniki.premiowy();
		case 61: return 190 + MetodyIOdnosniki.premiowy();
		case 62: return 185 + MetodyIOdnosniki.premiowy();
		case 71: return 170 + MetodyIOdnosniki.premiowy();
		case 72: return 160 + MetodyIOdnosniki.premiowy();
		case 81: return 145 + MetodyIOdnosniki.premiowy();
		case 82: return 140 + MetodyIOdnosniki.premiowy();
		case 91: return 170 + MetodyIOdnosniki.premiowy();
		case 92: return 165 + MetodyIOdnosniki.premiowy();
		default: return 0;
		}			
	}
	
	public static int Akrobata(int rasa, int plec) {
		switch((rasa*10) + plec) {
		case 11: return 105 + MetodyIOdnosniki.premiowy();
		case 12: return 105 + MetodyIOdnosniki.premiowy();
		case 21: return 110 + MetodyIOdnosniki.premiowy();
		case 22: return 110 + MetodyIOdnosniki.premiowy();
		case 31: return 120 + MetodyIOdnosniki.premiowy();
		case 32: return 120 + MetodyIOdnosniki.premiowy();
		case 41: return 100 + MetodyIOdnosniki.premiowy();
		case 42: return 110 + MetodyIOdnosniki.premiowy();
		case 51: return 80 + MetodyIOdnosniki.premiowy();
		case 52: return 90 + MetodyIOdnosniki.premiowy();
		case 61: return 90 + MetodyIOdnosniki.premiowy();
		case 62: return 90 + MetodyIOdnosniki.premiowy();
		case 71: return 110 + MetodyIOdnosniki.premiowy();
		case 72: return 110 + MetodyIOdnosniki.premiowy();
		case 81: return 130 + MetodyIOdnosniki.premiowy();
		case 82: return 130 + MetodyIOdnosniki.premiowy();
		case 91: return 90 + MetodyIOdnosniki.premiowy();
		case 92: return 95 + MetodyIOdnosniki.premiowy();
		default: return 0;
		}	
	}
	
	public static int Szybki(int rasa, int plec) {
		switch((rasa*10) + plec) {
		case 11: return 95 + MetodyIOdnosniki.premiowy();
		case 12: return 95 + MetodyIOdnosniki.premiowy();
		case 21: return 105 + MetodyIOdnosniki.premiowy();
		case 22: return 110 + MetodyIOdnosniki.premiowy();
		case 31: return 110 + MetodyIOdnosniki.premiowy();
		case 32: return 115 + MetodyIOdnosniki.premiowy();
		case 41: return 100 + MetodyIOdnosniki.premiowy();
		case 42: return 110 + MetodyIOdnosniki.premiowy();
		case 51: return 110 + MetodyIOdnosniki.premiowy();
		case 52: return 110 + MetodyIOdnosniki.premiowy();
		case 61: return 85 + MetodyIOdnosniki.premiowy();
		case 62: return 90 + MetodyIOdnosniki.premiowy();
		case 71: return 85 + MetodyIOdnosniki.premiowy();
		case 72: return 95 + MetodyIOdnosniki.premiowy();
		case 81: return 95 + MetodyIOdnosniki.premiowy();
		case 82: return 95 + MetodyIOdnosniki.premiowy();
		case 91: return 105 + MetodyIOdnosniki.premiowy();
		case 92: return 105 + MetodyIOdnosniki.premiowy();
		default: return 0;
		}
	}
	
	public static int Geniusz(int rasa, int plec) {
		switch((rasa*10) + plec) {
		case 11: return 130 + MetodyIOdnosniki.premiowy();
		case 12: return 130 + MetodyIOdnosniki.premiowy();
		case 21: return 140 + MetodyIOdnosniki.premiowy();
		case 22: return 150 + MetodyIOdnosniki.premiowy();
		case 31: return 150 + MetodyIOdnosniki.premiowy();
		case 32: return 150 + MetodyIOdnosniki.premiowy();
		case 41: return 105 + MetodyIOdnosniki.premiowy();
		case 42: return 95 + MetodyIOdnosniki.premiowy();
		case 51: return 110 + MetodyIOdnosniki.premiowy();
		case 52: return 110 + MetodyIOdnosniki.premiowy();
		case 61: return 110 + MetodyIOdnosniki.premiowy();
		case 62: return 115 + MetodyIOdnosniki.premiowy();
		case 71: return 150 + MetodyIOdnosniki.premiowy();
		case 72: return 140 + MetodyIOdnosniki.premiowy();
		case 81: return 150 + MetodyIOdnosniki.premiowy();
		case 82: return 150 + MetodyIOdnosniki.premiowy();
		case 91: return 105 + MetodyIOdnosniki.premiowy();
		case 92: return 100 + MetodyIOdnosniki.premiowy();
		default: return 0;
		}
	}
	
	public static int Medrzec(int rasa, int plec) {
		switch((rasa*10) + plec) {
		case 11: return 140 + MetodyIOdnosniki.premiowy();
		case 12: return 140 + MetodyIOdnosniki.premiowy();
		case 21: return 130 + MetodyIOdnosniki.premiowy();
		case 22: return 130 + MetodyIOdnosniki.premiowy();
		case 31: return 130 + MetodyIOdnosniki.premiowy();
		case 32: return 120 + MetodyIOdnosniki.premiowy();
		case 41: return 125 + MetodyIOdnosniki.premiowy();
		case 42: return 125 + MetodyIOdnosniki.premiowy();
		case 51: return 110 + MetodyIOdnosniki.premiowy();
		case 52: return 110 + MetodyIOdnosniki.premiowy();
		case 61: return 140 + MetodyIOdnosniki.premiowy();
		case 62: return 145 + MetodyIOdnosniki.premiowy();
		case 71: return 150 + MetodyIOdnosniki.premiowy();
		case 72: return 150 + MetodyIOdnosniki.premiowy();
		case 81: return 140 + MetodyIOdnosniki.premiowy();
		case 82: return 140 + MetodyIOdnosniki.premiowy();
		case 91: return 120 + MetodyIOdnosniki.premiowy();
		case 92: return 120 + MetodyIOdnosniki.premiowy();
		default: return 0;
		}
	}
	
	public static int Magik(int rasa, int plec) {
		switch((rasa*10) + plec) {
		case 11: return 120 + MetodyIOdnosniki.premiowy();
		case 12: return 120 + MetodyIOdnosniki.premiowy();
		case 21: return 70 + MetodyIOdnosniki.premiowy();
		case 22: return 75 + MetodyIOdnosniki.premiowy();
		case 31: return 75 + MetodyIOdnosniki.premiowy();
		case 32: return 65 + MetodyIOdnosniki.premiowy();
		case 41: return 60 + MetodyIOdnosniki.premiowy();
		case 42: return 55 + MetodyIOdnosniki.premiowy();
		case 51: return 35 + MetodyIOdnosniki.premiowy();
		case 52: return 35 + MetodyIOdnosniki.premiowy();
		case 61: return 55 + MetodyIOdnosniki.premiowy();
		case 62: return 50 + MetodyIOdnosniki.premiowy();
		case 71: return 65 + MetodyIOdnosniki.premiowy();
		case 72: return 70 + MetodyIOdnosniki.premiowy();
		case 81: return 60 + MetodyIOdnosniki.premiowy();
		case 82: return 60 + MetodyIOdnosniki.premiowy();
		case 91: return 55 + MetodyIOdnosniki.premiowy();
		case 92: return 55 + MetodyIOdnosniki.premiowy();
		default: return 0;
		}
	}
	
	public static int Fanatyk() {
				
			return 30 + MetodyIOdnosniki.premiowy();
	}
	
	public static int UlubieniecBogow(int funkcja) {
		switch(funkcja) {
		case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 15: case 16: case 17: case 18: case 19: case 20: case 22: return 25 + MetodyIOdnosniki.premiowy();
		case 11: case 12: case 13: case 14: case 21: return 30 + MetodyIOdnosniki.premiowy();
		default: return 0;
		}
	}
	
	public static int Elokwentny(int rasa, int plec) {
		switch((rasa*10) + plec) {
		case 11: return 110 + MetodyIOdnosniki.premiowy();
		case 12: return 110 + MetodyIOdnosniki.premiowy();
		case 21: return 105 + MetodyIOdnosniki.premiowy();
		case 22: return 110 + MetodyIOdnosniki.premiowy();
		case 31: return 110 + MetodyIOdnosniki.premiowy();
		case 32: return 110 + MetodyIOdnosniki.premiowy();
		case 41: return 85 + MetodyIOdnosniki.premiowy();
		case 42: return 85 + MetodyIOdnosniki.premiowy();
		case 51: return 90 + MetodyIOdnosniki.premiowy();
		case 52: return 90 + MetodyIOdnosniki.premiowy();
		case 61: return 100 + MetodyIOdnosniki.premiowy();
		case 62: return 90 + MetodyIOdnosniki.premiowy();
		case 71: return 85 + MetodyIOdnosniki.premiowy();
		case 72: return 85 + MetodyIOdnosniki.premiowy();
		case 81: return 90 + MetodyIOdnosniki.premiowy();
		case 82: return 90 + MetodyIOdnosniki.premiowy();
		case 91: return 85 + MetodyIOdnosniki.premiowy();
		case 92: return 85 + MetodyIOdnosniki.premiowy();
		default: return 0;
		}
	}
	
	public static int Pieknis(int rasa, int plec) {
		switch((rasa*10) + plec) {
		case 11: return 90 + MetodyIOdnosniki.premiowy();
		case 12: return 110 + MetodyIOdnosniki.premiowy();
		case 21: return 100 + MetodyIOdnosniki.premiowy();
		case 22: return 120 + MetodyIOdnosniki.premiowy();
		case 31: return 120 + MetodyIOdnosniki.premiowy();
		case 32: return 160 + MetodyIOdnosniki.premiowy();
		case 41: return 80 + MetodyIOdnosniki.premiowy();
		case 42: return 90 + MetodyIOdnosniki.premiowy();
		case 51: return 110 + MetodyIOdnosniki.premiowy();
		case 52: return 100 + MetodyIOdnosniki.premiowy();
		case 61: return 85 + MetodyIOdnosniki.premiowy();
		case 62: return 85 + MetodyIOdnosniki.premiowy();
		case 71: return 95 + MetodyIOdnosniki.premiowy();
		case 72: return 100 + MetodyIOdnosniki.premiowy();
		case 81: return 85 + MetodyIOdnosniki.premiowy();
		case 82: return 105 + MetodyIOdnosniki.premiowy();
		case 91: return 80 + MetodyIOdnosniki.premiowy();
		case 92: return 80 + MetodyIOdnosniki.premiowy();
		default: return 0;
		}
	}
	
	public static int Bonus() {
		
		return 20 + MetodyIOdnosniki.premiowy();
	}
	
	public static int Fechmistrz() {
		
		return 100 + 20 + MetodyIOdnosniki.premiowy();
	}
	
	public static int Karzel(int rasa, int plec) {
		switch((rasa*10) + plec) {
		case 11: return 130 - MetodyIOdnosniki.k10();
		case 12: return 120 - MetodyIOdnosniki.k10();
		case 21: return 130 - MetodyIOdnosniki.k10();
		case 22: return 120 - MetodyIOdnosniki.k10();
		case 31: return 140 - MetodyIOdnosniki.k10();
		case 32: return 130 - MetodyIOdnosniki.k10();
		case 41: return 130 - MetodyIOdnosniki.k10();
		case 42: return 120 - MetodyIOdnosniki.k10();
		case 51: return 160 - MetodyIOdnosniki.k10();
		case 52: return 170 - MetodyIOdnosniki.k10();
		case 61: return 80 - MetodyIOdnosniki.k10();
		case 62: return 70 - MetodyIOdnosniki.k10();
		case 71: return 80 - MetodyIOdnosniki.k10();
		case 72: return 70 - MetodyIOdnosniki.k10();
		case 81: return 70 - MetodyIOdnosniki.k10();
		case 82: return 60 - MetodyIOdnosniki.k10();
		case 91: return 130 - MetodyIOdnosniki.k10();
		case 92: return 120 - MetodyIOdnosniki.k10();
		default: return 0;
		}
	}
	
	public static int Kulawy() {
		
		return MetodyIOdnosniki.k10() + MetodyIOdnosniki.k10();
	}
	
	public static int Jakala() {
		
		return 30 + MetodyIOdnosniki.k10();
	}
	
	public static int Jednooki() {
		
		return 10;
	}
	
	public static int Debonus10() {
		
		return 10 + MetodyIOdnosniki.k10();
	}
	
	public static int Debonus20() {
		
		return 20 + MetodyIOdnosniki.k10();
	}
	
	public static int[] BonusNienaturalne(String[] nienaturalne){
		int[] spis = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		if(!(nienaturalne == null)) {
			for(int i = 0; i < nienaturalne.length; i++) {
				if(nienaturalne[i].equals("Karzeł")) {
					spis[0]++;
				} else if(nienaturalne[i].equals("Kulawy")){
					spis[1]++;
				} else if(nienaturalne[i].equals("Platfus")){
					spis[2]++;
				} else if(nienaturalne[i].equals("Flegmatyk")){
					spis[3]++;
				} else if(nienaturalne[i].equals("Jednooki")){
					spis[4]++;
				} else if(nienaturalne[i].equals("Zezowaty")){
					spis[5]++;
				} else if(nienaturalne[i].equals("Garbaty")){
					spis[6]++;
				} else if(nienaturalne[i].equals("Szpetny")){
					spis[7]++;
				} else if(nienaturalne[i].equals("Pryszczaty")){
					spis[8]++;
				} else if(nienaturalne[i].equals("Brudas")){
					spis[9]++;
				} else if(nienaturalne[i].equals("Jednoręki")){
					spis[10]++;
				} else if(nienaturalne[i].equals("Amnezja")){
					spis[11]++;
				} else if(nienaturalne[i].equals("Głupiec")){
					spis[12]++;
				} else if(nienaturalne[i].equals("Arcyułomność")){
					spis[13]++;
				}
			}
		}
		return spis;
	}
	
	public static int[] BonusNadnaturalne(String[] nadnaturalne){
		int[] spis = {0, 0, 0, 0};
		if(!(nadnaturalne == null)) {
			for(int i = 0; i < nadnaturalne.length; i++) {
				if(nadnaturalne[i].equals("Twardziel")) {
					spis[0]++;
				} else if(nadnaturalne[i].equals("Odporny na Zmeczenie")){
					spis[1]++;
				} else if(nadnaturalne[i].equals("Odporny na Choroby")){
					spis[2]++;
				} else if(nadnaturalne[i].equals("Odporny na Trucizny")){
					spis[3]++;
				} 
			}
		}
		return spis;
	}
}
