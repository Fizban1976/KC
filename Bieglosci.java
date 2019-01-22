package pl.Czasu.Krysztaly;

public class Bieglosci {

	public static String TypBroni(int numer) {
		switch(numer) {
		case 1: return "Bicze";
		case 2: return "Cepy";
		case 3: return "Dzidy";
		case 4: return "Głazy i Kamienie";
		case 5: return "Gwiazdki";
		case 6: return "Halabardy";
		case 7: return "Harpuny";
		case 8: return "Kopie";
		case 9: return "Lance";
		case 10: return "Kosa";
		case 11: return "Kusze ciężkie";
		case 12: return "Kusze typowe";
		case 13: return "Łańcuchy";
		case 14: return "Łuki proste";
		case 15: return "Łuki refleksyjne";
		case 16: return "Maczugi";
		case 17: return "Miecze ciężkie";
		case 18: return "Miecze lekkie";
		case 19: return "Młoty";
		case 20: return "Noże";
		case 21: return "Oskardy";
		case 22: return "Oszczep";
		case 23: return "Pały";
		case 24: return "Piki i Partyzany";
		case 25: return "Proce";
		case 26: return "Półtalerze";
		case 27: return "Rapiery i Szpady";
		case 28: return "Sieci";
		case 29: return "Sierp";
		case 30: return "Szable";
		case 31: return "Szlapary";
		case 32: return "Sztylety";
		case 33: return "Toporomiecze";
		case 34: return "Topory obusieczne";
		case 35: return "Topory koliste";
		case 36: return "Topory typowe i Siekiery bojowe";
		case 37: return "Trójzęby i Widły";
		case 38: return "Tarsary";
		case 39: return "Walki wręcz style";
		case 40: return "Włócznie";
		default: return null;
		}
	}
		
	public static String[] BronieRasy(String rasa){ 
		String[] br;
		switch(rasa) {
		case "Człowiek" : String[] czlowiek = {"Bicze", "Cepy", "Dzidy", "Głazy i Kamienie", "Gwiazdki", "Halabardy", "Harpuny", "Kopie", "Lance", "Kosa", "Kusze ciężkie", "Kusze typowe", "Łańcuchy", "Łuki proste", "Łuki refleksyjne", "Maczugi", "Miecze ciężkie", "Miecze lekkie", "Młoty", "Noże", "Oskardy", "Oszczep", "Pały", "Piki i Partyzany", "Proce", "Półtalerze", "Rapiery i Szpady", "Sieci", "Sierp", "Szable", "Szlapary", "Sztylety", "Toporomiecze", "Topory obusieczne", "Topory koliste", "Topory typowe i Siekiery bojowe", "Trójzęby i Widły", "Tarsary", "Walki wręcz style", "Włócznie"};
				br = czlowiek; return br;
		case "Półelf": String[] polelf = {"Bicze", "Cepy", "Lance", "Łańcuchy", "Łuki proste", "Łuki refleksyjne", "Miecze ciężkie", "Miecze lekkie", "Młoty", "Noże", "Oszczep", "Pały", "Piki i Partyzany", "Proce", "Sieci", "Szlapary", "Sztylety", "Topory typowe i Siekiery bojowe", "Walki wręcz style", "Włócznie"};
				br = polelf; return br;
		case "Elf": String[] elf = {"Bicze", "Cepy", "Lance", "Łańcuchy", "Łuki proste", "Miecze ciężkie", "Miecze lekkie", "Młoty", "Noże", "Oszczep", "Pały", "Piki i Partyzany", "Proce", "Sieci", "Szlapary", "Sztylety", "Topory typowe i Siekiery bojowe",  "Walki wręcz style", "Włócznie"};
				br = elf; return br;
		case "Półork": String[] polork = {"Bicze", "Cepy", "Dzidy", "Lance", "Łańcuchy", "Łuki refleksyjne", "Miecze ciężkie", "Miecze lekkie", "Noże", "Oszczep", "Pały", "Piki i Partyzany", "Proce", "Sieci", "Szable", "Szlapary", "Topory typowe i Siekiery bojowe",  "Walki wręcz style", "Włócznie"};
				br = polork; return br;
		case "Półolbrzym": String[] pololbrzym = {"Bicze", "Dzidy", "Głazy i Kamienie", "Kusze ciężkie", "Lance", "Łańcuchy", "Maczugi", "Miecze ciężkie", "Miecze lekkie", "Młoty", "Noże", "Oszczep", "Pały", "Piki i Partyzany", "Proce", "Półtalerze", "Sieci", "Szable", "Szlapary", "Sztylety", "Toporomiecze",  "Topory obusieczne", "Topory koliste",  "Walki wręcz style"};
				br = pololbrzym; return br;
		case "Krasnolud": String[] krasnolud = {"Bicze", "Cepy", "Kusze ciężkie", "Kusze typowe", "Łańcuchy", "Łuki proste", "Łuki refleksyjne", "Maczugi", "Młoty", "Noże", "Oskardy", "Pały", "Proce", "Sieci", "Szable", "Szlapary", "Sztylety", "Topory obusieczne", "Topory koliste", "Topory typowe i Siekiery bojowe", "Walki wręcz style", "Włócznie"};
				br = krasnolud; return br;
		case "Gnom": String[] gnom = {"Gwiazdki", "Łańcuchy", "Łuki proste", "Łuki refleksyjne", "Miecze lekkie", "Młoty", "Noże", "Oskardy", "Pały", "Proce", "Szlapary", "Sztylety", "Topory obusieczne", "Topory koliste", "Topory typowe i Siekiery bojowe",  "Walki wręcz style", "Włócznie"};
				br = gnom; return br;
		case "Hobbit": String[] hobbit = {"Głazy i Kamienie", "Łańcuchy", "Łuki proste", "Łuki refleksyjne", "Miecze lekkie", "Noże", "Pały", "Proce", "Szlapary", "Sztylety", "Topory typowe i Siekiery bojowe", "Walki wręcz style"};
				br = hobbit; return br;
		case "Reptillion": String[] reptillion = {"Bicze", "Cepy", "Dzidy", "Głazy i Kamienie", "Gwiazdki", "Halabardy", "Harpuny", "Kopie", "Lance", "Kosa", "Kusze ciężkie", "Kusze typowe", "Łańcuchy", "Łuki proste", "Łuki refleksyjne", "Maczugi", "Miecze ciężkie", "Miecze lekkie", "Młoty", "Noże", "Oskardy", "Oszczep", "Pały", "Piki i Partyzany", "Proce", "Półtalerze", "Rapiery i Szpady", "Sieci", "Sierp", "Szable", "Szlapary", "Sztylety", "Toporomiecze", "Topory obusieczne", "Topory koliste", "Topory typowe i Siekiery bojowe", "Trójzęby i Widły", "Tarsary", "Walki wręcz style", "Włócznie"};
				br = reptillion; return br;
		default: return null;
		}
	}
	
	public static String[] BronieFunkcji(String funkcja, int numer){ 
		switch(funkcja) {
		case "Wojownik" : return wojownik(numer);
		case "Łowca": return lowca(numer);
		case "Gwardzista": return gwardzista(numer);
		case "Barbarzyńca": return barbarzynca(numer);
		case "Łowca Czarownic": return lowcaczarownic(numer);
		case "Wiedzmin": return wiedzmin(numer);
		case "Rycerz": return rycerz(numer);
		case "Paladyn": return paladyn(numer);
		case "Czarny Rycerz": return czarnyrycerz(numer);
		case "Templariusz": return templariusz(numer);
		case "Władca Smoków": return wladcasmokow(numer);
		case "Demoniczny Rycerz": return demonicznyrycerz(numer);
		case "Złodziej": return zlodziej(numer);
		case "Zabójca": return zabojca(numer);
		case "Kupiec": return kupiec(numer);
		case "Bard": return bard(numer);
		case "Szpieg": return szpieg(numer);
		case "Kłusownik": return klusownik(numer);
		case "Hiena Cmentarna": return hienacmentarna(numer);
		case "Kapłan": return kaplan(numer);
		case "Druid": return druid(numer);
		case "Półbóg": return polbog(numer);
		case "Astrolog": return astrolog(numer);
		case "Mnich": return mnich(numer);
		case "Szaman": return szaman(numer);
		case "Mag": return mag(numer);
		case "Czarnoksiężnik": return czarnoksieznik(numer);
		case "Iluzjonista": return iluzjonista(numer);
		case "Alchemik": return alchemik(numer);
		case "Demonolog": return demonolog(numer);
		case "Elementalista": return elementalista(numer);					
		default: return null;
		}
	}
	
	public static String[] wojownik(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Dzidy", "Głazy i Kamienie", "Gwiazdki", "Kusze ciężkie", "Kusze typowe", "Łuki proste", "Łuki refleksyjne", "Oszczep", "Proce"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Halabardy", "Piki i Partyzany", "Szlapary", "Toporomiecze", "Trójzęby i Widły", "Tarsary", "Włócznie"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Miecze ciężkie", "Miecze lekkie", "Rapiery i Szpady", "Szable",};
		wb = trzecia; return wb;
		case 3: String[] czwarta = {"Noże", "Sierp", "Sztylety"};
		wb = czwarta; return wb;
		case 4: String[] piata = {"Cepy", "Łańcuchy", "Maczugi", "Młoty", "Pały"};
		wb = piata; return wb;
		case 5: String[] szosta = {"Bicze", "Harpuny", "Kosa", "Oskardy", "Półtalerze", "Sieci", "Topory obusieczne", "Topory koliste", "Topory typowe i Siekiery bojowe", "Walki wręcz style", };
		wb = szosta; return wb;
		default: return wb;
		}
	}
	
	public static String[] lowca(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Kusze ciężkie", "Kusze typowe", "Oszczep", "Proce"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Miecze lekkie", "Noże", "Sztylety"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Rapiery i Szpady", "Sierp", "Szable", "Topory typowe i Siekiery bojowe"};
		wb = trzecia; return wb;
		case 3: String[] czwarta = {"Łańcuchy",  "Maczugi",  "Młoty", "Pały"};
		wb = czwarta; return wb;
		case 4: String[] piata = {"Dzidy", "Łuki proste", "Łuki refleksyjne"};
		wb = piata; return wb;
		case 5: String[] szosta = {"Cepy", "Gwiazdki", "Oskardy", "Walki wręcz style", "Włócznie"};
		wb = szosta; return wb;
		default: return wb;
		}
	}
	
	public static String[] gwardzista(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Miecze lekkie", "Rapiery i Szpady", "Szable", "Topory typowe i Siekiery bojowe"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Halabardy", "Piki i Partyzany", "Włócznie"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Dzidy",  "Kusze ciężkie", "Kusze typowe", "Łuki proste", "Łuki refleksyjne", "Oszczep"};
		wb = trzecia; return wb;
		case 3: String[] czwarta = {"Noże", "Sztylety"};
		wb = czwarta; return wb;
		case 4: String[] piata = { "Miecze ciężkie", "Topory obusieczne", "Topory koliste", "Trójzęby i Widły"};
		wb = piata; return wb;
		case 5: String[] szosta = {"Cepy", "Młoty", "Pały"};
		wb = szosta; return wb;
		default: return wb;
		}
	}
	
	public static String[] barbarzynca(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Kosa", "Miecze ciężkie", "Trójzęby i Widły"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Cepy", "Łańcuchy", "Maczugi", "Młoty", "Pały"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Oskardy", "Tarsary", "Walki wręcz style", "Włócznie"};
		wb = trzecia; return wb;
		case 3: String[] czwarta = {"Półtalerze",  "Topory obusieczne", "Topory koliste", "Topory typowe i Siekiery bojowe"};
		wb = czwarta; return wb;
		case 4: String[] piata = {"Miecze lekkie", "Noże", "Szable", "Szlapary", "Sztylety", "Toporomiecze"};
		wb = piata; return wb;
		case 5: String[] szosta = {"Dzidy", "Głazy i Kamienie", "Łuki proste", "Łuki refleksyjne", "Proce", "Oszczep"};
		wb = szosta; return wb;
		default: return wb;
		}
	}
	
	public static String[] lowcaczarownic(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Bicze"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Łańcuchy"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Sieci"};
		wb = trzecia; return wb;
		case 3: String[] czwarta = {"Kusze ciężkie", "Kusze typowe", "Łuki proste", "Łuki refleksyjne", "Oszczep"};
		wb = czwarta; return wb;
		case 4: String[] piata = {"Cepy", "Maczugi", "Młoty", "Pały"};
		wb = piata; return wb;
		case 5: String[] szosta = {"Miecze ciężkie", "Miecze lekkie", "Rapiery i Szpady", "Szable", "Szlapary", "Sztylety", "Toporomiecze", "Topory typowe i Siekiery bojowe"};
		wb = szosta; return wb;
		default: return wb;
		}
	}
	
	public static String[] wiedzmin(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Miecze lekkie"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Noże", "Rapiery i Szpady", "Szable",  "Szlapary", "Sztylety", "Miecze ciężkie", };
		wb = druga; return wb;
		case 2: String[] trzecia = {"Półtalerze",   "Toporomiecze", "Topory obusieczne", "Topory koliste", "Topory typowe i Siekiery bojowe", "Tarsary"};
		wb = trzecia; return wb;
		case 3: String[] czwarta = {"Cepy", "Łańcuchy", "Łuki proste", "Łuki refleksyjne", "Maczugi", "Młoty", "Pały"};
		wb = czwarta; return wb;
		default: return wb;
		}
	}

	public static String[] rycerz(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Kopie", "Lance"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Miecze ciężkie", "Miecze lekkie", "Rapiery i Szpady", "Szable"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Cepy", "Maczugi", "Młoty", "Półtalerze", "Szlapary",  "Tarsary", "Topory obusieczne", "Topory koliste", "Topory typowe i Siekiery bojowe", "Włócznie"};
		wb = trzecia; return wb;
		case 3: String[] czwarta = {"Noże", "Sztylety"};
		wb = czwarta; return wb;
		case 4: String[] piata = {"Kusze ciężkie", "Kusze typowe", "Łuki proste", "Łuki refleksyjne", "Oszczep", "Walki wręcz style"};
		wb = piata; return wb;
		default: return wb;
		}
	}
	
	public static String[] paladyn(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Kopie", "Lance"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Miecze ciężkie", "Miecze lekkie", "Rapiery i Szpady", "Szable"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Cepy", "Maczugi", "Młoty", "Półtalerze", "Szlapary",  "Tarsary", "Topory obusieczne", "Topory koliste", "Topory typowe i Siekiery bojowe", "Włócznie"};
		wb = trzecia; return wb;
		case 3: String[] czwarta = {"Noże", "Sztylety"};
		wb = czwarta; return wb;
		case 4: String[] piata = {"Kusze ciężkie", "Kusze typowe", "Łuki proste", "Łuki refleksyjne", "Oszczep", "Walki wręcz style"};
		wb = piata; return wb;
		default: return wb;
		}
	}
	
	public static String[] czarnyrycerz(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Kopie", "Lance"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Miecze ciężkie", "Miecze lekkie", "Rapiery i Szpady", "Szable"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Cepy", "Maczugi", "Młoty", "Półtalerze", "Szlapary",  "Tarsary", "Topory obusieczne", "Topory koliste", "Topory typowe i Siekiery bojowe", "Włócznie"};
		wb = trzecia; return wb;
		case 3: String[] czwarta = {"Noże", "Sztylety"};
		wb = czwarta; return wb;
		case 4: String[] piata = {"Kusze ciężkie", "Kusze typowe", "Łuki proste", "Łuki refleksyjne", "Oszczep", "Walki wręcz style"};
		wb = piata; return wb;
		default: return wb;
		}
	}
	
	public static String[] templariusz(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Kopie", "Lance"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Miecze ciężkie", "Miecze lekkie", "Rapiery i Szpady", "Szable"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Cepy", "Maczugi", "Młoty", "Półtalerze", "Szlapary",  "Tarsary", "Topory obusieczne", "Topory koliste", "Topory typowe i Siekiery bojowe", "Włócznie"};
		wb = trzecia; return wb;
		case 3: String[] czwarta = {"Noże", "Sztylety"};
		wb = czwarta; return wb;
		case 4: String[] piata = {"Kusze ciężkie", "Kusze typowe", "Łuki proste", "Łuki refleksyjne", "Oszczep", "Walki wręcz style"};
		wb = piata; return wb;
		default: return wb;
		}
	}
	
	public static String[] wladcasmokow(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Kopie", "Lance"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Miecze ciężkie", "Miecze lekkie", "Rapiery i Szpady", "Szable"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Cepy", "Maczugi", "Młoty", "Półtalerze", "Szlapary",  "Tarsary", "Topory obusieczne", "Topory koliste", "Topory typowe i Siekiery bojowe", "Włócznie"};
		wb = trzecia; return wb;
		case 3: String[] czwarta = {"Noże", "Sztylety"};
		wb = czwarta; return wb;
		case 4: String[] piata = {"Kusze ciężkie", "Kusze typowe", "Łuki proste", "Łuki refleksyjne", "Oszczep", "Walki wręcz style"};
		wb = piata; return wb;
		default: return wb;
		}
	}
	
	public static String[] demonicznyrycerz(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Halabardy", "Harpuny", "Kopie", "Lance", "Piki i Partyzany"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Miecze ciężkie", "Półtalerze", "Trójzęby i Widły", "Tarsary"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Cepy", "Kosa",  "Łańcuchy",  "Maczugi",  "Młoty", "Pały", "Szlapary",  "Toporomiecze", "Topory obusieczne", "Topory koliste", "Topory typowe i Siekiery bojowe"};
		wb = trzecia; return wb;
		case 3: String[] czwarta = {"Dzidy", "Kusze ciężkie", "Kusze typowe", "Łuki proste", "Łuki refleksyjne", "Oszczep"};
		wb = czwarta; return wb;
		case 4: String[] piata = {"Bicze", "Miecze lekkie", "Noże", "Oskardy", "Rapiery i Szpady", "Szable", "Sztylety", "Walki wręcz style", "Włócznie"};
		wb = piata; return wb;
		default: return wb;
		}
	}
	
	public static String[] zlodziej(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Głazy i Kamienie", "Gwiazdki", "Kusze typowe", "Łuki proste", "Łuki refleksyjne", "Proce"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Miecze lekkie", "Noże", "Rapiery i Szpady", "Sztylety"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Bicze", "Cepy", "Łańcuchy", "Maczugi", "Młoty", "Pały", "Sierp", "Szable", "Topory typowe i Siekiery bojowe", "Walki wręcz style"};
		wb = trzecia; return wb;
		default: return wb;
		}
	}
	
	public static String[] zabojca(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Głazy i Kamienie", "Gwiazdki", "Kusze typowe", "Łuki proste", "Łuki refleksyjne", "Proce"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Miecze lekkie", "Noże", "Sztylety"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Maczugi", "Młoty", "Pały", "Rapiery i Szpady", "Szable"};
		wb = trzecia; return wb;
		case 3: String[] czwarta = {"Bicze", "Cepy", "Łańcuchy", "Topory typowe i Siekiery bojowe", "Walki wręcz style"};
		wb = czwarta; return wb;
		default: return wb;
		}
	}
	
	public static String[] kupiec(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Gwiazdki", "Kusze typowe", "Łuki proste", "Łuki refleksyjne", "Proce"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Miecze lekkie", "Noże", "Sztylety"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Bicze", "Maczugi", "Młoty", "Pały", "Topory typowe i Siekiery bojowe", "Walki wręcz style"};
		wb = trzecia; return wb;
		default: return wb;
		}
	}
	
	public static String[] bard(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Gwiazdki", "Głazy i Kamienie", "Kusze typowe", "Proce"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Miecze lekkie", "Noże", "Sztylety"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Rapiery i Szpady", "Walki wręcz style"};
		wb = trzecia; return wb;
		default: return wb;
		}
	}
	
	public static String[] szpieg(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Gwiazdki", "Głazy i Kamienie", "Kusze typowe", "Proce"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Miecze lekkie", "Noże", "Sztylety"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Rapiery i Szpady", "Walki wręcz style"};
		wb = trzecia; return wb;
		default: return wb;
		}
	}
	
	public static String[] klusownik(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Głazy i Kamienie", "Gwiazdki", "Kusze ciężkie", "Kusze typowe", "Łuki proste", "Łuki refleksyjne", "Oszczep", "Proce"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Miecze lekkie", "Noże", "Rapiery i Szpady", "Sztylety"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Łańcuchy", "Maczugi", "Topory typowe i Siekiery bojowe", "Walki wręcz style"};
		wb = trzecia; return wb;
		default: return wb;
		}
	}
	
	public static String[] hienacmentarna(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Gwiazdki", "Kusze typowe", "Łuki proste", "Łuki refleksyjne", "Proce"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Miecze lekkie", "Noże", "Rapiery i Szpady", "Sztylety"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Bicze", "Cepy", "Łańcuchy", "Maczugi",  "Młoty", "Pały", "Topory typowe i Siekiery bojowe", "Walki wręcz style"};
		wb = trzecia; return wb;
		default: return wb;
		}
	}
	
	public static String[] kaplan(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Cepy", "Dzidy", "Łańcuchy"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Noże", "Sztylety"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Maczugi", "Młoty",  "Pały"};
		wb = trzecia; return wb;
		default: return wb;
		}
	}
	
	public static String[] druid(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = { "Miecze lekkie", "Noże", "Sierp", "Szable", "Sztylety"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Dzidy", "Łuki proste", "Łuki refleksyjne", "Włócznie"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Cepy", "Maczugi", "Młoty", "Pały", "Topory typowe i Siekiery bojowe", "Trójzęby i Widły"};
		wb = trzecia; return wb;
		default: return wb;
		}
	}
	
	public static String[] polbog(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Cepy", "Dzidy", "Łańcuchy"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Noże", "Sztylety"};
		wb = druga; return wb;
		case 2: String[] trzecia = { "Maczugi", "Młoty",  "Pały"};
		wb = trzecia; return wb;
		default: return wb;
		}
	}
	
	public static String[] astrolog(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Noże", "Sztylety"};
		wb = pierwsza; return wb;
		case 1: String[] druga = { "Maczugi", "Młoty", "Pały"};
		wb = druga; return wb;
		default: return wb;
		}
	}
	
	public static String[] mnich(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Walki wręcz style"};
		wb = pierwsza; return wb;
		default: return wb;
		}
	}
	
	public static String[] szaman(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Cepy", "Maczugi", "Pały", "Topory typowe i Siekiery bojowe", "Włócznie"};
		wb = pierwsza; return wb;
		case 1: String[] druga = { "Miecze lekkie", "Noże",  "Sierp", "Sztylety"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Dzidy", "Łuki proste", "Łuki refleksyjne"};
		wb = trzecia; return wb;
		default: return wb;
		}
	}
	
	public static String[] mag(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Miecze lekkie", "Noże", "Sztylety"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Pały"};
		wb = druga; return wb;
		default: return wb;
		}
	}
	
	public static String[] czarnoksieznik(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Miecze lekkie"};
		wb = pierwsza; return wb;
		case 1: String[] druga = { "Noże", "Sztylety"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Pały"};
		wb = trzecia; return wb;
		default: return wb;
		}
	}
	
	public static String[] iluzjonista(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Miecze lekkie", "Noże", "Sztylety"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Pały"};
		wb = druga; return wb;
		default: return wb;
		}
	}
	
	public static String[] alchemik(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Miecze lekkie", "Noże", "Pały", "Sztylety"};
		wb = pierwsza; return wb;
		default: return wb;
		}
	}
	
	public static String[] demonolog(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Miecze lekkie"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Pały"};
		wb = druga; return wb;
		case 2: String[] trzecia = {"Noże", "Sztylety"};
		wb = trzecia; return wb;
		default: return wb;
		}
	}
	
	public static String[] elementalista(int numer) {
		String[] wb = {};
		switch(numer) {
		case 0: String[] pierwsza = {"Miecze lekkie", "Noże", "Sztylety"};
		wb = pierwsza; return wb;
		case 1: String[] druga = {"Pały"};
		wb = druga; return wb;
		default: return wb;
		}
	}
	
	public static int DodatekRasy(int numerRasy, String nazwaBroni) {
		switch(numerRasy) {
		case 1: return czlowiek(nazwaBroni);
		case 2: return polelf(nazwaBroni);
		case 3: return elf(nazwaBroni);
		case 4: return polork(nazwaBroni);
		case 5: return pololbrzym(nazwaBroni);
		case 6: return krasnolud(nazwaBroni);
		case 7: return gnom(nazwaBroni);
		case 8: return hobbit(nazwaBroni);
		case 9: return reptillion(nazwaBroni);
		default: return 0;
		}
	}
	
	public static int czlowiek(String nazwaBroni) {
		switch(nazwaBroni) {
		case "Lance": case "Miecze ciężkie": case "Miecze lekkie": case "Kusze ciężkie": case "Kusze typowe": case "Rapiery i Szpady": case "Włócznie": return 5;
		default: return 0;
		}
	}
	
	public static int polelf(String nazwaBroni) {
		switch(nazwaBroni) {
		case "Miecze ciężkie": case "Miecze lekkie": return 10;
		case "Łuki proste": case "Łuki refleksyjne": case "Lance": case "Włócznie": return 5;
		default: return 0;
		}
	}
	
	public static int elf(String nazwaBroni) {
		switch(nazwaBroni) {
		case "Łuki proste": case "Miecze ciężkie": case "Miecze lekkie": return 10;
		case "Sztylety": case "Włócznie": return 5;
		default: return 0;
		}
	}
	
	public static int polork(String nazwaBroni) {
		switch(nazwaBroni) {
		case "Szable": case "Łuki refleksyjne": return 10;
		case "Noże": return 5;
		default: return 0;
		}
	}
	
	public static int pololbrzym(String nazwaBroni) {
		switch(nazwaBroni) {
		case "Głazy i Kamienie": case "Walki wręcz style": case "Maczugi": case "Młoty": case "Pały": return 5;
		default: return 0;
		}
	}
	
	public static int krasnolud(String nazwaBroni) {
		switch(nazwaBroni) {
		case "Topory obusieczne": case "Topory koliste": case "Topory typowe i Siekiery bojowe": return 10;
		case "Kusze ciężkie": case "Kusze typowe": case "Młoty": case "Oskardy": case "Sztylety": return 5;
		default: return 0;
		}
	}
	
	public static int gnom(String nazwaBroni) {
		switch(nazwaBroni) {
		case "Topory obusieczne": case "Topory koliste": case "Topory typowe i Siekiery bojowe": case "Młoty": return 10;
		case "Miecze lekkie": return 5;
		default: return 0;
		}
	}
	
	public static int hobbit(String nazwaBroni) {
		switch(nazwaBroni) {
		case "Głazy i Kamienie": return 10; 
		case "Łuki proste": case "Łuki refleksyjne": case "Miecze lekkie": case "Sztylety": return 5;
		default: return 0;
		}
	}
	
	public static int reptillion(String nazwaBroni) {
		switch(nazwaBroni) {
		case "Toporomiecze": case "Walki wręcz style": return 10;
		case "Miecze ciężkie": case "Miecze lekkie": case "Kusze ciężkie": case "Kusze typowe": return 5;
		default: return 0;
		}
	}
	
	public static int DodatekZawodu(String zawod, String nazwaBroni) {
		switch(zawod) {
		case "Drwal": return drwal(nazwaBroni);
		case "Górnik": return gornik(nazwaBroni);
		case "Kat": return kat(nazwaBroni);
		case "Kowal": return kowal(nazwaBroni);
		case "Myśliwy": return mysliwy(nazwaBroni);
		case "Rolnik": return rolnik(nazwaBroni);
		case "Rybak": return rybak(nazwaBroni);
		default: return 0;
		}
	}
	
	public static int drwal(String nazwaBroni) {
		switch(nazwaBroni) {
		case "Topory typowe i Siekiery bojowe": return 10;
		default: return 0;
		}
	}
	
	public static int gornik(String nazwaBroni) {
		switch(nazwaBroni) {
		case "Oskardy": return 10;
		default: return 0;
		}
	}
	
	public static int kat(String nazwaBroni) {
		switch(nazwaBroni) {
		case "Miecze ciężkie": case "Miecze lekkie": case "Topory obusieczne": case "Topory koliste": case "Topory typowe i Siekiery bojowe": return 10;
		default: return 0;
		}
	}
	
	public static int kowal(String nazwaBroni) {
		switch(nazwaBroni) {
		case "Młoty": return 10;
		default: return 0;
		}
	}
	
	public static int mysliwy(String nazwaBroni) {
		switch(nazwaBroni) {
		case "Łuki proste": case "Łuki refleksyjne": case "Kusze ciężkie": case "Kusze typowe": case "Oszczep": return 10;
		default: return 0;
		}
	}
	
	public static int rolnik(String nazwaBroni) {
		switch(nazwaBroni) {
		case "Kosa": case "Sierp": return 10;
		default: return 0;
		}
	}
	
	public static int rybak(String nazwaBroni) {
		switch(nazwaBroni) {
		case "Sieci": return 10;
		default: return 0;
		}
	}
}
