package pl.Czasu.Krysztaly;

public class WzrostWagaWiek {

	public static int wz(int los, int numerRasy, int numerPlci) {
		int baza = 0;
		switch((numerRasy *10) + numerPlci) {
		case 11: case 21: case 41: case 91: 
			if(los < 21) {
				baza = 150;
			} else if(los > 20 && los < 81) {
				baza = 170;
			} else if(los > 80) {
				baza = 200;
			} return baza;
		case 12: case 22: case 42: case 92: 
			if(los < 21) {
				baza = 140;
			} else if(los > 20 && los < 81) {
				baza = 160;
			} else if(los > 80) {
				baza = 190;
			} return baza;
		case 31: 
			if(los < 21) {
				baza = 160;
			} else if(los > 20 && los < 81) {
				baza = 180;
			} else if(los > 80) {
				baza = 210;
			} return baza;
		case 32:
			if(los < 21) {
				baza = 150;
			} else if(los > 20 && los < 81) {
				baza = 170;
			} else if(los > 80) {
				baza = 200;
			} return baza;
		case 51:
			if(los < 21) {
				baza = 180;
			} else if(los > 20 && los < 81) {
				baza = 200;
			} else if(los > 80) {
				baza = 230;
			} return baza;
		case 52:
			if(los < 21) {
				baza = 190;
			} else if(los > 20 && los < 81) {
				baza = 210;
			} else if(los > 80) {
				baza = 240;
			} return baza;
		case 61: case 71: 
			if(los < 21) {
				baza = 100;
			} else if(los > 20 && los < 81) {
				baza = 120;
			} else if(los > 80) {
				baza = 150;
			} return baza;
		case 62: case 72: 
			if(los < 21) {
				baza = 90;
			} else if(los > 20 && los < 81) {
				baza = 110;
			} else if(los > 80) {
				baza = 140;
			} return baza;
		case 81:
			if(los < 21) {
				baza = 90;
			} else if(los > 20 && los < 81) {
				baza = 110;
			} else if(los > 80) {
				baza = 140;
			} return baza;
		case 82:
			if(los < 21) {
				baza = 80;
			} else if(los > 20 && los < 81) {
				baza = 100;
			} else if(los > 80) {
				baza = 130;
			} return baza;
		default: return baza;
		}			
	}
	
	public static int robWzrost(int numerRasy, int numerPlci) {
		int wzrost = 0;
		int los = MetodyIOdnosniki.k100();
		int start = wz(los, numerRasy, numerPlci);
		if(los < 21) {
			if(los == 1) {
				int los2 = MetodyIOdnosniki.k100();
					if(los2 < 51) {
						int minus = MetodyIOdnosniki.k10();
						wzrost = start + los - minus;
					}
			}
			wzrost = start + los;
			return wzrost;
		} else if(los > 20 && los < 81) {
			wzrost = start + (los % 10);
			return wzrost;
		} else if(los > 80) {
			if(los == 100) {
				int los2 = MetodyIOdnosniki.k100();
					if(los2 > 50) {
						int plus = MetodyIOdnosniki.k10();
						wzrost = start + plus;
					}
			}
			wzrost = start - (100 - los);
		}
		return wzrost;
	} 

	public static int wg(int los, int numerRasy, int numerPlci) {
		int baza = 0;
		switch((numerRasy *10) + numerPlci) {
		case 11: case 21: case 41: case 61: case 71: case 91: 
			if(los < 21) {
				baza = 50;
			} else if(los > 20 && los < 81) {
				baza = 70;
			} else if(los > 80) {
				baza = 100;
			} return baza;
		case 12: case 22: case 42: case 62: case 72: case 92: 
			if(los < 21) {
				baza = 40;
			} else if(los > 20 && los < 81) {
				baza = 60;
			} else if(los > 80) {
				baza = 90;
			} return baza;
		case 31: 
			if(los < 21) {
				baza = 40;
			} else if(los > 20 && los < 81) {
				baza = 60;
			} else if(los > 80) {
				baza = 90;
			} return baza;
		case 32:
			if(los < 21) {
				baza = 30;
			} else if(los > 20 && los < 81) {
				baza = 50;
			} else if(los > 80) {
				baza = 80;
			} return baza;
		case 51:
			if(los < 21) {
				baza = 80;
			} else if(los > 20 && los < 81) {
				baza = 100;
			} else if(los > 80) {
				baza = 130;
			} return baza;
		case 52:
			if(los < 21) {
				baza = 90;
			} else if(los > 20 && los < 81) {
				baza = 110;
			} else if(los > 80) {
				baza = 140;
			} return baza;
		case 81:
			if(los < 21) {
				baza = 30;
			} else if(los > 20 && los < 81) {
				baza = 50;
			} else if(los > 80) {
				baza = 80;
			} return baza;
		case 82:
			if(los < 21) {
				baza = 20;
			} else if(los > 20 && los < 81) {
				baza = 40;
			} else if(los > 80) {
				baza = 70;
			} return baza;
		default: return baza;
		}
	}
	
	public static int robWaga(int numerRasy, int numerPlci) {
		int waga = 0;
		int los = MetodyIOdnosniki.k100();
		int start = wg(los, numerRasy, numerPlci);
		if(los < 21) {
			if(los == 1) {
				int los2 = MetodyIOdnosniki.k100();
					if(los2 < 51) {
						int minus = MetodyIOdnosniki.k10();
						waga = start - minus;
					}
			}
			waga = start + los;
			return waga;
		} else if(los > 20 && los < 81) {
			waga = start + (los % 10);
			return waga;
		} else if(los > 80) {
			if(los == 100) {
				int los2 = MetodyIOdnosniki.k100();
					if(los2 > 50) {
						int plus = MetodyIOdnosniki.k10();
						waga = start + plus;
					}
			}
			waga = start - (100 - los);
		}
		return waga;
	} 
	
	public static int robWiek(int numerRasy) {
		switch(numerRasy) {
		case 1: return 15;
		case 2: return 30;
		case 3: return 120;
		case 4: return 15;
		case 5: return 30;
		case 6: return 60;
		case 7: return 60;
		case 8: return 30;
		case 9: return 30;
		default: return 0;
		}
	}
	
	public static int extra(int waga, int numerRasy, int numerPlci) {
		int baza = 0;
		switch((numerRasy *10) + numerPlci) {
		case 11: case 21: case 41: case 61: case 91: 
			 if(waga < 70) {
				baza = waga - 70;
			} else if(waga > 80) {
				baza = waga - 80;
			} return baza;	
		case 12: case 22: case 42: case 62: case 92:
			if(waga < 40) {
				baza = waga - 40;
			} else if(waga > 80) {
				baza = waga - 70;
			} return baza;
		
		case 31:
			if(waga < 40) {
				baza = waga - 40;
			} else if(waga > 80) {
				baza = waga - 70;
			} return baza;
			
		case 32:
			if(waga < 30) {
				baza = waga - 30;
			} else if(waga > 80) {
				baza = waga - 60;
			} return baza;
			
		case 51:
			if(waga < 80) {
				baza = waga - 80;
			} else if(waga > 80) {
				baza = waga - 110;
			} return baza;
		case 52:
			if(waga < 90) {
				baza = waga - 90;				
			} else if(waga > 80) {
				baza = waga - 120;
			} return baza;
		
		case 81:
			if(waga < 30) {
				baza = waga - 30;
			} else if(waga > 80) {
				baza = waga - 60;
			} return baza;
		case 82:
			if(waga < 20) {
				baza = waga - 20;
			} else if(waga > 80) {
				baza = waga - 50;
			} return baza;
		default: return baza;
		}
	}
}
