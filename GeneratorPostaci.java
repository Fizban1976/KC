package pl.Czasu.Krysztaly;

import java.awt.EventQueue;
import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.io.File;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

//import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;

import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JButton;
//import javax.swing.KeyStroke;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;
//import javax.swing.JOptionPane;
//import javax.swing.JMenu;

public class GeneratorPostaci extends JFrame implements ActionListener{


//	private JMenuBar menuBar;
//	private JMenuItem mOtworz, mZapisz, mWyjscie;
//	private JMenu menuPlik;
	private JFrame frame;
	private JTextField textFieldNadnaturalne, textFieldNienaturalne, txtStatusUrodzenia, txtWzrost, txtWaga, txtWiek, txtZywotnosc, txtSilafizyczna, txtZrecznosc, txtSzybkosc,
	 	txtInteligencja, txtMadrosc, txtUmiejetnoscimagiczne, txtPrezencja, txtCharyzma, txtWiara, txtZauwazenie, txtBazowaOdpornoscPsychiczno, txtOdpornoscNaIluzje,
	 	txtOdpornoscNaSugestie, txtOdpornoscNaZaklecia, txtOdpornoscNaSzok, txtOdpornoscNaEnergie, txtBazowaOdpornoscFizyczna, txtOdpornoscNaTrucizny, txtOdpornoscNaGazy,
	 	txtOdpornoscNaTemperature, txtOdpornoscNaElktrycznosc, txtOdpornoscNaPolimorfie, txtZawody, txtBieglosciWBroniach;
	private JComboBox comboBoxRasa, comboBoxPlec, comboBoxProfesjaGlowna, comboBoxProfesjaDruga;
	private JCheckBox chckbxPostacDwuprofesyjna;
	private JSpinner spinnerPoziomProfesjiDrugiej;
	private JLabel  lblProfesjaDruga, lblPoziomProfesjiDrugiej;
	private String[] Lista1 = {}, Lista2;
	private static String Wzrost, Waga, Wiek, StatusUrodzenia, Zywotnosc, SilaFizyczna, Zrecznosc, Szybkosc, Inteligencja, Madrosc, UmiejetnosciMagiczne, Prezencja, Charyzma, 
		Wiara, Zauwazenie, BazowaPF, OIlu, OSug, OZak, OSzo, OEne, BazowaF, OTru, OGaz, OTem, OEle, OPol; //  Rasa, Plec, ProfesjaG, PoziomPG, ProfesjaD, PoziomPD,
	private static String[] Nadnaturalne, Nienaturalne, Zawody, UWD;
	private static int  numerRasy, numerPlci, numerFunkcji, numerFunkcji2, poziom, poziom2;
	private static String rasa, plec, profesjaGlowna, profesjaDrugorzedna;
	
	
	private void init() {
		rasa = "Człowiek";
		numerRasy = WyborRasyPlciFunkcjiPoziomu.WR(rasa);
		plec = "Mężczyzna";
		numerPlci = WyborRasyPlciFunkcjiPoziomu.WP(plec);
		Lista1 = MetodyIOdnosniki.WybranaFunkcja(numerRasy);
		Lista2 = MetodyIOdnosniki.WybranaFunkcja2(numerRasy, numerFunkcji);
		}
	
	private void reload() {	
		rasa = (String) comboBoxRasa.getSelectedItem();
		numerRasy = WyborRasyPlciFunkcjiPoziomu.WR(rasa);
		plec = (String) comboBoxPlec.getSelectedItem();
		numerPlci = WyborRasyPlciFunkcjiPoziomu.WP(plec);
		Lista1 = MetodyIOdnosniki.WybranaFunkcja(numerRasy);
		Lista2 = MetodyIOdnosniki.WybranaFunkcja2(numerRasy, numerFunkcji);
		}
	
	public static void main(String[] args) {
		
		/**
		 * Uruchomienie Wizualizacji.
		 */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneratorPostaci window = new GeneratorPostaci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}
	
	/**
	 * Create the application.
	 */
	public GeneratorPostaci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1300, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String[] dostepneRasy = {"Człowiek", "Półelf", "Elf", "Półork", "Półolbrzym", "Krasnolud", "Gnom", "Hobbit", "Reptillion"};
		String[] dostepnePlcie = {"Mężczyzna", "Kobieta"};
		
		init();
				
		JLabel lblRasa = new JLabel("Rasa");
		lblRasa.setBounds(10, 30, 46, 14);
		frame.getContentPane().add(lblRasa);
		
		
		comboBoxRasa = new JComboBox(dostepneRasy);
		comboBoxRasa.setBounds(183, 27, 145, 20);
		frame.getContentPane().add(comboBoxRasa);
		comboBoxRasa.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent wr) {
				comboBoxRasa.setSelectedItem(wr.getItem());
				
					rasa = (String) comboBoxRasa.getSelectedItem();
					numerRasy = WyborRasyPlciFunkcjiPoziomu.WR(rasa);
					Lista1 = MetodyIOdnosniki.WybranaFunkcja(numerRasy);
					Lista2 = MetodyIOdnosniki.WybranaFunkcja2(numerRasy, numerFunkcji);
					reload();
			}
		}); 		
		
		
		JLabel lblPlec = new JLabel("Płeć");
		lblPlec.setBounds(400, 30, 46, 14);
		frame.getContentPane().add(lblPlec);
		
		
		comboBoxPlec = new JComboBox(dostepnePlcie);
		comboBoxPlec.setBounds(578, 27, 100, 20);
		frame.getContentPane().add(comboBoxPlec);
		comboBoxPlec.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent wp) {
				comboBoxPlec.setSelectedItem(wp.getItem());
				plec = (String) comboBoxPlec.getSelectedItem();
				numerPlci = WyborRasyPlciFunkcjiPoziomu.WP(plec);
				reload();
			} 
		});
		
		
		JLabel lblProfesjaGlowna = new JLabel("Profesja Główna");
		lblProfesjaGlowna.setBounds(10, 70, 105, 14);
		frame.getContentPane().add(lblProfesjaGlowna);
		
		comboBoxProfesjaGlowna = new JComboBox(Lista1);
		comboBoxProfesjaGlowna.setBounds(183, 67, 145, 20);
		frame.getContentPane().add(comboBoxProfesjaGlowna);
		comboBoxProfesjaGlowna.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent pg) {
				comboBoxProfesjaGlowna.setSelectedItem(pg.getItem());
				profesjaGlowna = (String) comboBoxProfesjaGlowna.getSelectedItem();
				numerFunkcji =  WyborRasyPlciFunkcjiPoziomu.WF(profesjaGlowna);
				reload();
			}
		});
		
		
		JLabel lblPoziomProfesjiGlownej = new JLabel("Poziom Profesji Głównej");
		lblPoziomProfesjiGlownej.setBounds(400, 70, 145, 14);
		frame.getContentPane().add(lblPoziomProfesjiGlownej);
		
		SpinnerNumberModel spinnermodelP = new SpinnerNumberModel(0, 0, WyborRasyPlciFunkcjiPoziomu.WybranyPoziom(numerFunkcji, numerRasy), 1);
		JSpinner spinnerPoziomProfesjiGlownej = new JSpinner(spinnermodelP);
		spinnerPoziomProfesjiGlownej.setBounds(638, 67, 40, 20);
		frame.getContentPane().add(spinnerPoziomProfesjiGlownej);
		poziom = (int) spinnerPoziomProfesjiGlownej.getValue();
		
		lblProfesjaDruga = new JLabel("Profesja Druga");
		lblProfesjaDruga.setBounds(10, 110, 105, 14);
		frame.getContentPane().add(lblProfesjaDruga);
		
		
		
		comboBoxProfesjaDruga = new JComboBox(Lista2);
		comboBoxProfesjaDruga.setBounds(183, 107, 145, 20);
		frame.getContentPane().add(comboBoxProfesjaDruga);
		comboBoxProfesjaDruga.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent pd) {
				comboBoxProfesjaDruga.setSelectedItem(pd.getItem());
				profesjaDrugorzedna = (String) comboBoxProfesjaDruga.getSelectedItem();
				numerFunkcji2 = WyborRasyPlciFunkcjiPoziomu.WF(profesjaDrugorzedna);
				reload();
			}
		});
		
		
		lblPoziomProfesjiDrugiej = new JLabel("Poziom Profesji Drugiej");
		lblPoziomProfesjiDrugiej.setBounds(400, 110, 145, 14);
		frame.getContentPane().add(lblPoziomProfesjiDrugiej);
		
		SpinnerNumberModel spinnermodelD = new SpinnerNumberModel(0, 0, WyborRasyPlciFunkcjiPoziomu.WybranyPoziom2(numerFunkcji2, numerRasy, poziom), 1);
		spinnerPoziomProfesjiDrugiej = new JSpinner(spinnermodelD);
		spinnerPoziomProfesjiDrugiej.setBounds(638, 107, 40, 20);
		frame.getContentPane().add(spinnerPoziomProfesjiDrugiej);
		poziom2 = (int) spinnerPoziomProfesjiDrugiej.getValue();
		
		JButton btnGenerujPostac = new JButton("Generuj Postać");
		btnGenerujPostac.setBounds(10, 150, 130, 23);
		frame.getContentPane().add(btnGenerujPostac);
		btnGenerujPostac.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
				btnGenerujPostacActionPerformed(evt);
				
			}
		});
		
		JLabel lblZdolnosciNadnatutalne = new JLabel("Zdolności Nadnatutalne");
		lblZdolnosciNadnatutalne.setBounds(10, 200, 150, 14);
		frame.getContentPane().add(lblZdolnosciNadnatutalne);
		
		textFieldNadnaturalne = new JTextField();
		textFieldNadnaturalne.setText(MetodyIOdnosniki.wypisz(Nadnaturalne));
		textFieldNadnaturalne.setBounds(230, 197, 410, 20);
		frame.getContentPane().add(textFieldNadnaturalne);
		textFieldNadnaturalne.setColumns(10);
		
		JLabel lblUlomnosci = new JLabel("Ułomności");
		lblUlomnosci.setBounds(10, 240, 70, 14);
		frame.getContentPane().add(lblUlomnosci);
		
		textFieldNienaturalne = new JTextField();
		textFieldNienaturalne.setText(MetodyIOdnosniki.wypisz(Nienaturalne));
		textFieldNienaturalne.setBounds(230, 237, 410, 20);
		frame.getContentPane().add(textFieldNienaturalne);
		textFieldNienaturalne.setColumns(10);
		
		JLabel lblStatusUrodzenia = new JLabel("Status urodzenia");
		lblStatusUrodzenia.setBounds(10, 300, 105, 14);
		frame.getContentPane().add(lblStatusUrodzenia);
		
		txtStatusUrodzenia = new JTextField();
		txtStatusUrodzenia.setText(StatusUrodzenia);
		txtStatusUrodzenia.setBounds(230, 297, 160, 20);
		frame.getContentPane().add(txtStatusUrodzenia);
		txtStatusUrodzenia.setColumns(10);
		
		JLabel lblWzrost = new JLabel("Wzrost");
		lblWzrost.setBounds(10, 340, 46, 14);
		frame.getContentPane().add(lblWzrost);
		
		txtWzrost = new JTextField();
		txtWzrost.setText(Wzrost);
		txtWzrost.setBounds(170, 337, 40, 20);
		frame.getContentPane().add(txtWzrost);
		txtWzrost.setColumns(10);
		
		JLabel lblWaga = new JLabel("Waga");
		lblWaga.setBounds(250, 340, 46, 14);
		frame.getContentPane().add(lblWaga);
		
		txtWaga = new JTextField();
		txtWaga.setText(Waga);
		txtWaga.setBounds(400, 337, 40, 20);
		frame.getContentPane().add(txtWaga);
		txtWaga.setColumns(10);
		
		JLabel lblWiek = new JLabel("Wiek");
		lblWiek.setBounds(450, 340, 46, 14);
		frame.getContentPane().add(lblWiek);
		
		txtWiek = new JTextField();
		txtWiek.setText(Wiek);
		txtWiek.setBounds(630, 337, 40, 20);
		frame.getContentPane().add(txtWiek);
		txtWiek.setColumns(10);
		
		JLabel lblZywotnosc = new JLabel("Żywotność");
		lblZywotnosc.setBounds(10, 380, 70, 14);
		frame.getContentPane().add(lblZywotnosc);
		
		txtZywotnosc = new JTextField();
		txtZywotnosc.setText(Zywotnosc);
		txtZywotnosc.setBounds(170, 377, 40, 20);
		frame.getContentPane().add(txtZywotnosc);
		txtZywotnosc.setColumns(10);
		
		JLabel lblSilaFizyczna = new JLabel("Siła Fizyczna");
		lblSilaFizyczna.setBounds(250, 380, 80, 14);
		frame.getContentPane().add(lblSilaFizyczna);
		
		txtSilafizyczna = new JTextField();
		txtSilafizyczna.setText(SilaFizyczna);
		txtSilafizyczna.setBounds(400, 377, 40, 20);
		frame.getContentPane().add(txtSilafizyczna);
		txtSilafizyczna.setColumns(10);
		
		JLabel lblZrecznosc = new JLabel("Zręczność");
		lblZrecznosc.setBounds(450, 380, 70, 14);
		frame.getContentPane().add(lblZrecznosc);
		
		txtZrecznosc = new JTextField();
		txtZrecznosc.setText(Zrecznosc);
		txtZrecznosc.setBounds(630, 377, 40, 20);
		frame.getContentPane().add(txtZrecznosc);
		txtZrecznosc.setColumns(10);
		
		JLabel lblSzybkosc = new JLabel("Szybkość");
		lblSzybkosc.setBounds(700, 380, 57, 14);
		frame.getContentPane().add(lblSzybkosc);
		
		txtSzybkosc = new JTextField();
		txtSzybkosc.setText(Szybkosc);
		txtSzybkosc.setBounds(880, 377, 40, 20);
		frame.getContentPane().add(txtSzybkosc);
		txtSzybkosc.setColumns(10);
		
		JLabel lblInteligencja = new JLabel("Inteligencja");
		lblInteligencja.setBounds(10, 420, 70, 14);
		frame.getContentPane().add(lblInteligencja);
		
		txtInteligencja = new JTextField();
		txtInteligencja.setText(Inteligencja);
		txtInteligencja.setBounds(170, 417, 40, 20);
		frame.getContentPane().add(txtInteligencja);
		txtInteligencja.setColumns(10);
		
		JLabel lblMadrosc = new JLabel("Mądrość");
		lblMadrosc.setBounds(250, 420, 70, 14);
		frame.getContentPane().add(lblMadrosc);
		
		txtMadrosc = new JTextField();
		txtMadrosc.setText(Madrosc);
		txtMadrosc.setBounds(400, 417, 40, 20);
		frame.getContentPane().add(txtMadrosc);
		txtMadrosc.setColumns(10);
		
		JLabel lblUmiejetnosciMagiczne = new JLabel("Umiejętności Magiczne");
		lblUmiejetnosciMagiczne.setBounds(450, 420, 140, 14);
		frame.getContentPane().add(lblUmiejetnosciMagiczne);
		
		txtUmiejetnoscimagiczne = new JTextField();
		txtUmiejetnoscimagiczne.setText(UmiejetnosciMagiczne);
		txtUmiejetnoscimagiczne.setBounds(630, 417, 40, 20);
		frame.getContentPane().add(txtUmiejetnoscimagiczne);
		txtUmiejetnoscimagiczne.setColumns(10);
		
		JLabel lblPrezencja = new JLabel("Prezencja");
		lblPrezencja.setBounds(10, 460, 70, 14);
		frame.getContentPane().add(lblPrezencja);
		
		txtPrezencja = new JTextField();
		txtPrezencja.setText(Prezencja);
		txtPrezencja.setBounds(170, 457, 40, 20);
		frame.getContentPane().add(txtPrezencja);
		txtPrezencja.setColumns(10);
		
		JLabel lblCharyzma = new JLabel("Charyzma");
		lblCharyzma.setBounds(250, 460, 70, 14);
		frame.getContentPane().add(lblCharyzma);
		
		txtCharyzma = new JTextField();
		txtCharyzma.setText(Charyzma);
		txtCharyzma.setBounds(400, 457, 40, 20);
		frame.getContentPane().add(txtCharyzma);
		txtCharyzma.setColumns(10);
		
		JLabel lblWiara = new JLabel("Wiara");
		lblWiara.setBounds(450, 460, 46, 14);
		frame.getContentPane().add(lblWiara);
		
		txtWiara = new JTextField();
		txtWiara.setText(Wiara);
		txtWiara.setBounds(630, 457, 40, 20);
		frame.getContentPane().add(txtWiara);
		txtWiara.setColumns(10);
		
		JLabel lblZauwaenie = new JLabel("Zauważenie");
		lblZauwaenie.setBounds(700, 460, 70, 14);
		frame.getContentPane().add(lblZauwaenie);
		
		txtZauwazenie = new JTextField();
		txtZauwazenie.setText(Zauwazenie);
		txtZauwazenie.setBounds(880, 457, 40, 20);
		frame.getContentPane().add(txtZauwazenie);
		txtZauwazenie.setColumns(10);
		
		JLabel lblBazowaOdpornoscPsychicznoFizyczna = new JLabel("Bazowa Odporność Psychiczno - Fizyczna");
		lblBazowaOdpornoscPsychicznoFizyczna.setBounds(10, 500, 240, 14);
		frame.getContentPane().add(lblBazowaOdpornoscPsychicznoFizyczna);
		
		txtBazowaOdpornoscPsychiczno = new JTextField();
		txtBazowaOdpornoscPsychiczno.setText(BazowaPF);
		txtBazowaOdpornoscPsychiczno.setBounds(400, 497, 40, 20);
		frame.getContentPane().add(txtBazowaOdpornoscPsychiczno);
		txtBazowaOdpornoscPsychiczno.setColumns(10);
		
		JLabel lblOdpornoscNaIluzje = new JLabel("Odporność na Iluzje");
		lblOdpornoscNaIluzje.setBounds(10, 540, 120, 14);
		frame.getContentPane().add(lblOdpornoscNaIluzje);
		
		txtOdpornoscNaIluzje = new JTextField();
		txtOdpornoscNaIluzje.setText(OIlu);
		txtOdpornoscNaIluzje.setBounds(170, 537, 40, 20);
		frame.getContentPane().add(txtOdpornoscNaIluzje);
		txtOdpornoscNaIluzje.setColumns(10);
		
		JLabel lblOdpornoscNaSugestie = new JLabel("Odporność na Sugestie");
		lblOdpornoscNaSugestie.setBounds(250, 540, 140, 14);
		frame.getContentPane().add(lblOdpornoscNaSugestie);
		
		txtOdpornoscNaSugestie = new JTextField();
		txtOdpornoscNaSugestie.setToolTipText(OSug);
		txtOdpornoscNaSugestie.setBounds(400, 537, 40, 20);
		frame.getContentPane().add(txtOdpornoscNaSugestie);
		txtOdpornoscNaSugestie.setColumns(10);
		
		JLabel lblOdpornoscNaZaklcia = new JLabel("Odporność na Zaklęcia");
		lblOdpornoscNaZaklcia.setBounds(450, 540, 140, 14);
		frame.getContentPane().add(lblOdpornoscNaZaklcia);
		
		txtOdpornoscNaZaklecia = new JTextField();
		txtOdpornoscNaZaklecia.setText(OZak);
		txtOdpornoscNaZaklecia.setBounds(630, 537, 40, 20);
		frame.getContentPane().add(txtOdpornoscNaZaklecia);
		txtOdpornoscNaZaklecia.setColumns(10);
		
		JLabel lblOdpornoscNaSzok = new JLabel("Odporność na Szok");
		lblOdpornoscNaSzok.setBounds(700, 540, 130, 14);
		frame.getContentPane().add(lblOdpornoscNaSzok);
		
		txtOdpornoscNaSzok = new JTextField();
		txtOdpornoscNaSzok.setText(OSzo);
		txtOdpornoscNaSzok.setBounds(880, 537, 40, 20);
		frame.getContentPane().add(txtOdpornoscNaSzok);
		txtOdpornoscNaSzok.setColumns(10);
		
		JLabel lblOdpornoscNaEnergie = new JLabel("Odporność na Energie");
		lblOdpornoscNaEnergie.setBounds(930, 540, 130, 14);
		frame.getContentPane().add(lblOdpornoscNaEnergie);
		
		txtOdpornoscNaEnergie = new JTextField();
		txtOdpornoscNaEnergie.setText(OEne);
		txtOdpornoscNaEnergie.setBounds(1090, 537, 40, 20);
		frame.getContentPane().add(txtOdpornoscNaEnergie);
		txtOdpornoscNaEnergie.setColumns(10);
		
		JLabel lblBazowaOdpornoscFizyczna = new JLabel("Bazowa Odporność Fizyczna");
		lblBazowaOdpornoscFizyczna.setBounds(10, 580, 180, 14);
		frame.getContentPane().add(lblBazowaOdpornoscFizyczna);
		
		txtBazowaOdpornoscFizyczna = new JTextField();
		txtBazowaOdpornoscFizyczna.setText(BazowaF);
		txtBazowaOdpornoscFizyczna.setBounds(400, 577, 40, 20);
		frame.getContentPane().add(txtBazowaOdpornoscFizyczna);
		txtBazowaOdpornoscFizyczna.setColumns(10);
		
		JLabel lblOdpornoscNaTrucizny = new JLabel("Odporność Na Trucizny");
		lblOdpornoscNaTrucizny.setBounds(10, 620, 150, 14);
		frame.getContentPane().add(lblOdpornoscNaTrucizny);
		
		txtOdpornoscNaTrucizny = new JTextField();
		txtOdpornoscNaTrucizny.setText(OTru);
		txtOdpornoscNaTrucizny.setBounds(170, 617, 40, 20);
		frame.getContentPane().add(txtOdpornoscNaTrucizny);
		txtOdpornoscNaTrucizny.setColumns(10);
		
		JLabel lblOdpornoscNaGazy = new JLabel("Odporność na Gazy");
		lblOdpornoscNaGazy.setBounds(250, 620, 110, 14);
		frame.getContentPane().add(lblOdpornoscNaGazy);
		
		txtOdpornoscNaGazy = new JTextField();
		txtOdpornoscNaGazy.setText(OGaz);
		txtOdpornoscNaGazy.setBounds(400, 617, 40, 20);
		frame.getContentPane().add(txtOdpornoscNaGazy);
		txtOdpornoscNaGazy.setColumns(10);
		
		JLabel lblOdpornoscNaTemperature = new JLabel("Odporność na Temperature");
		lblOdpornoscNaTemperature.setBounds(450, 620, 170, 14);
		frame.getContentPane().add(lblOdpornoscNaTemperature);
		
		txtOdpornoscNaTemperature = new JTextField();
		txtOdpornoscNaTemperature.setText(OTem);
		txtOdpornoscNaTemperature.setBounds(630, 617, 40, 20);
		frame.getContentPane().add(txtOdpornoscNaTemperature);
		txtOdpornoscNaTemperature.setColumns(10);
		
		JLabel lblOdpornoscNaElektrycznosc = new JLabel("Odporność na Elektryczność");
		lblOdpornoscNaElektrycznosc.setBounds(700, 620, 170, 14);
		frame.getContentPane().add(lblOdpornoscNaElektrycznosc);
		
		txtOdpornoscNaElktrycznosc = new JTextField();
		txtOdpornoscNaElktrycznosc.setText(OEle);
		txtOdpornoscNaElktrycznosc.setBounds(880, 617, 40, 20);
		frame.getContentPane().add(txtOdpornoscNaElktrycznosc);
		txtOdpornoscNaElktrycznosc.setColumns(10);
		
		JLabel lblOdpornoNaPolimorfie = new JLabel("Odporność na Polimorfie");
		lblOdpornoNaPolimorfie.setBounds(930, 620, 150, 14);
		frame.getContentPane().add(lblOdpornoNaPolimorfie);
		
		txtOdpornoscNaPolimorfie = new JTextField();
		txtOdpornoscNaPolimorfie.setText(OPol);
		txtOdpornoscNaPolimorfie.setBounds(1090, 617, 40, 20);
		frame.getContentPane().add(txtOdpornoscNaPolimorfie);
		txtOdpornoscNaPolimorfie.setColumns(10);
		
		JLabel lblZawody = new JLabel("Zawody");
		lblZawody.setBounds(10, 660, 46, 14);
		frame.getContentPane().add(lblZawody);
		
		txtZawody = new JTextField();
		txtZawody.setText(MetodyIOdnosniki.wypisz(Zawody));
		txtZawody.setBounds(150, 657, 490, 20);
		frame.getContentPane().add(txtZawody);
		txtZawody.setColumns(10);
		
		JLabel lblBieglosciWBroniach = new JLabel("Biegłości w broniach\r\n");
		lblBieglosciWBroniach.setBounds(10, 700, 130, 14);
		frame.getContentPane().add(lblBieglosciWBroniach);
		
		txtBieglosciWBroniach = new JTextField();
		txtBieglosciWBroniach.setText(MetodyIOdnosniki.wypisz(UWD));
		txtBieglosciWBroniach.setBounds(150, 697, 490, 20);
		frame.getContentPane().add(txtBieglosciWBroniach);
		txtBieglosciWBroniach.setColumns(10);
	
	}
/**
	
	public void comboBoxRasaActionPerformed(ActionEvent evt) {
		daneRasy();
	}
	
	private void daneRasy() {
		rasa = (String) comboBoxRasa.getSelectedItem();
		numerRasy = WyborRasyPlciFunkcjiPoziomu.WR(rasa);
	}
	
	public void comboBoxPlecActionPerformed(ActionEvent evt) {
		danePlci();
	}
	
	private void danePlci() {
		plec = (String) comboBoxPlec.getSelectedItem();
		numerPlci = WyborRasyPlciFunkcjiPoziomu.WP(plec);
	}
	
	public void comboBoxProfesjaGlownaActionPerformed(ActionEvent evt) {
		daneProfesjiGlownej();
	}
	
	public void daneProfesjiGlownej() {
		profesjaGlowna = (String) comboBoxProfesjaGlowna.getSelectedItem();
		numerFunkcji =  WyborRasyPlciFunkcjiPoziomu.WF(profesjaGlowna);
	}
	
	public void comboBoxProfesjaDrugorzednaActionPerformed(ActionEvent evt) {
		daneProfesjiDrugorzednej();
	}
	
	public void daneProfesjiDrugorzednej() {
		profesjaDrugorzedna = (String) comboBoxProfesjaDrugorzedna.getSelectedItem();
		numerFunkcji2 = WyborRasyPlciFunkcjiPoziomu.WF(profesjaDrugorzedna);
	}

	public void comboBoxRasaItemStateChanged(ItemEvent wr) {
		wybieranieRasy();
	}
	
	public void wybieranieRasy() {
		comboBoxRasa.getSelectedItem();
	}

	public void chckbxPostacDwuprofesyjnaItemStateChanged(ItemEvent dp) {
		dwuprofesyjny();
	}
	
	public void dwuprofesyjny() {
		
			
	}
**/
	public void btnGenerujPostacActionPerformed(ActionEvent evt) {
		generujPostac();
	}
	
	public void generujPostac() {
		//int numerRasy, numerPlci, numerFunkcji, numerFunkcji2 = 35, poziom, poziom2 = 0, 
				int ileBieglosci, minBieglosc, dodatekBieglosc;
				//String rasa, plec, 
				String funkcjaBieglosc; 
				String[] funkcje = {profesjaGlowna, profesjaDrugorzedna};
						
				
				TworzeniePostaci podstawa = TworzeniePostaci.Wspolczynniki(numerRasy, numerPlci);
				TworzeniePostaci podstawaB = TworzeniePostaci.Wspolczynniki(numerRasy, numerPlci); 
				TworzeniePostaci funkcjan1 = TworzeniePostaci.Funkcja(profesjaGlowna);
				TworzeniePostaci funkcjan2 = TworzeniePostaci.Funkcja(profesjaDrugorzedna);
				TworzeniePostaci rozwoj1 = TworzeniePostaci.Rozwoj(profesjaGlowna);
				TworzeniePostaci rozwoj2 = TworzeniePostaci.Rozwoj(profesjaDrugorzedna);
				TworzeniePostaci postac = new TworzeniePostaci();
				
				postac.setRasa(rasa);
				
				postac.setPlec(plec);
				
				postac.setFunkcja(funkcje);
				
				postac.setStatus_urodzenia(MetodyIOdnosniki.sp(numerFunkcji, numerFunkcji2));
				
				postac.setNadnaturalne(MetodyIOdnosniki.ZdNad());
				
				postac.setNienaturalne(MetodyIOdnosniki.ZdNie());
				
				if(!(postac.getNadnaturalne() == null) && (!(postac.getNienaturalne() == null))){
					if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Silacz") && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Jednoręki")) {
						MetodyIOdnosniki.extracted();
					} else if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Akrobata") && (MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Garbaty") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Jednoręki"))) {
						MetodyIOdnosniki.extracted();
					} else if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Szybki") && (MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Karzeł") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Kulawy") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Platfus") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Flegmatyk") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Jednooki"))) {
						MetodyIOdnosniki.extracted();
					} else if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Geniusz") && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Debil")) {
						MetodyIOdnosniki.extracted();
					} else if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Mędrzec") && (MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Amnezja") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Głupiec"))) {
						MetodyIOdnosniki.extracted();
					} else if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Magik") && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Jednoręki")) {
						MetodyIOdnosniki.extracted();
					} else if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Piękniś") && (MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Kulawy") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Zezowaty") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Garbaty") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Szpetny") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Pryszczaty") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Brudas"))) {
						MetodyIOdnosniki.extracted();
					} else if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Elokwentny") && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Jąkała")) {
						MetodyIOdnosniki.extracted();
					}
				}
				
				int[] ZliczanieBonusuNienaturalnych = ZdolnoscNadnaturalnaINienaturalna.BonusNienaturalne(postac.getNienaturalne());
				int[] ZliczanieBonusuNadnaturalnych = ZdolnoscNadnaturalnaINienaturalna.BonusNadnaturalne(postac.getNadnaturalne());
				
				int startM = 0;
				if(!(postac.getNadnaturalne() == null)) {
					if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Mędrzec")){
						startM = (ZdolnoscNadnaturalnaINienaturalna.Medrzec(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getMadrosc(), funkcjan2.getMadrosc()));
					}
				} else if(!(postac.getNienaturalne() == null) && !(ZliczanieBonusuNienaturalnych[11] == 0 || ZliczanieBonusuNienaturalnych[12] == 0)) {
					int MaN1 = 1; int MaN2 = 1;
					for(int i = 0; i < ZliczanieBonusuNienaturalnych[11]; i++) {
						MaN1 += ZdolnoscNadnaturalnaINienaturalna.Debonus10();
					}
					
					for(int j = 0; j < ZliczanieBonusuNienaturalnych[12]; j++) {
						MaN2 += 3;
					}
					
					startM = (((int)(podstawa.getMadrosc() / (MaN1 * MaN2) )) + MetodyIOdnosniki.wieksze(funkcjan1.getMadrosc(), funkcjan2.getMadrosc()));
							if(ZliczanieBonusuNienaturalnych[12] > 0 && postac.getMadrosc() > 30) {
								startM = 30;
							} 
				} else {
					startM = podstawa.getMadrosc() + MetodyIOdnosniki.wieksze(funkcjan1.getMadrosc(), funkcjan2.getMadrosc());
				}
				
				if(!(postac.getNienaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Karzeł")) {
					postac.setWzrost(ZdolnoscNadnaturalnaINienaturalna.Karzel(numerRasy, numerPlci));
				} else {
					postac.setWzrost(WzrostWagaWiek.robWzrost(numerRasy, numerPlci));
				}
				
				if(!(postac.getNienaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Grubas")) {
					postac.setWaga(WzrostWagaWiek.robWaga(numerRasy, numerPlci) * 2);
				} else {
					postac.setWaga(WzrostWagaWiek.robWaga(numerRasy, numerPlci));
				}
				
				int dodajemyWiek = MetodyIOdnosniki.wiekZFunkcji(numerFunkcji2);
				postac.setWiek(WzrostWagaWiek.robWiek(numerRasy) + dodajemyWiek);
				
				postac.setZawod(MetodyIOdnosniki.Zawody(postac.getStatus_urodzenia(), Math.round((startM - MetodyIOdnosniki.k100())/20)));
				
				int[] ZliczanieBonusuZawodow = LosowanieZawodow.BonusZawod(postac.getZawod());
					
				if(!(postac.getNadnaturalne() == null) && !(ZliczanieBonusuNadnaturalnych[0] == 0 || ZliczanieBonusuNadnaturalnych[1] == 0)){
					int Z1 = 1; int Z2 = 0;
					for(int i = 0; i < ZliczanieBonusuNienaturalnych[6]; i++) {
						Z1 += 1;
					}
					
					for(int j = 0; j < ZliczanieBonusuNienaturalnych[10]; j++) {
						Z2 = ZdolnoscNadnaturalnaINienaturalna.Bonus();
					}		
					postac.setZywotnosc(((MetodyIOdnosniki.Blogoslawienstwo(podstawa.getZywotnosc(), podstawaB.getZywotnosc(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci)) * Z1) + Z2 + (MetodyIOdnosniki.wieksze(funkcjan1.getZywotnosc(),funkcjan2.getZywotnosc()) * Z1));
				} else {
					postac.setZywotnosc(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getZywotnosc(), podstawaB.getZywotnosc(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getZywotnosc(),funkcjan2.getZywotnosc()) + WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci));
				}
					
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Silacz")) {
					postac.setSila_Fizyczna(ZdolnoscNadnaturalnaINienaturalna.Silacz(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getSila_Fizyczna(), funkcjan2.getSila_Fizyczna()) + WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci));
				} else if(!(postac.getNienaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Jednoręki")) {
					postac.setSila_Fizyczna(((int)((MetodyIOdnosniki.Blogoslawienstwo(podstawa.getSila_Fizyczna(), podstawaB.getSila_Fizyczna(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci) / 4))) + MetodyIOdnosniki.wieksze(funkcjan1.getSila_Fizyczna(), funkcjan2.getSila_Fizyczna())) ;
				} else {
					postac.setSila_Fizyczna(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getSila_Fizyczna(), podstawaB.getSila_Fizyczna(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getSila_Fizyczna(), funkcjan2.getSila_Fizyczna()) + WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci));
				}
					
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Akrobata")) {
					postac.setZrecznosc(ZdolnoscNadnaturalnaINienaturalna.Akrobata(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getZrecznosc(), funkcjan2.getZrecznosc()) + ((int)(WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci)) / 2));
				} else if(!(postac.getNienaturalne() == null) && !(ZliczanieBonusuNienaturalnych[6] == 0 || ZliczanieBonusuNienaturalnych[10] == 0)) {
					int ZrN1 = 0; int ZrN2 = 1; int ZrN3 = 0;
					for(int i = 0; i < ZliczanieBonusuNienaturalnych[6]; i++) {
						ZrN1 += ZdolnoscNadnaturalnaINienaturalna.Debonus10();
					}			
					for(int j = 0; j < ZliczanieBonusuNienaturalnych[10]; j++) {
						ZrN2 += 3;
					}
					for(int k = 0; k < ZliczanieBonusuNienaturalnych[13]; k++) {
						ZrN3 += ZdolnoscNadnaturalnaINienaturalna.Debonus20();;
					}
					postac.setZrecznosc((int)((MetodyIOdnosniki.Blogoslawienstwo(podstawa.getZrecznosc(), podstawaB.getZrecznosc(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + ((int)WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci) / 2) - ZrN1 - ZrN3) / ZrN2) + MetodyIOdnosniki.wieksze(funkcjan1.getZrecznosc(), funkcjan2.getZrecznosc()));
				} else {
					postac.setZrecznosc(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getZrecznosc(), podstawaB.getZrecznosc(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + ((int)(WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci)) / 2)  + MetodyIOdnosniki.wieksze(funkcjan1.getZrecznosc(), funkcjan2.getZrecznosc()));
				}
						
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Szybki")){
					postac.setSzybkosc(ZdolnoscNadnaturalnaINienaturalna.Szybki(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getSzybkosc(), funkcjan2.getSzybkosc()) + ((int)(WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci)) / 2));
				} else if(!(postac.getNienaturalne() == null) && !(ZliczanieBonusuNienaturalnych[0] == 0 || ZliczanieBonusuNienaturalnych[1] == 0 || ZliczanieBonusuNienaturalnych[2] == 0 || ZliczanieBonusuNienaturalnych[3] == 0 || ZliczanieBonusuNienaturalnych[4] == 0)) {
					int SzN1 = 0; int SzN2 = 0; int SzN3 = 0; int SzN4 = 0; int SzN5 = 0; int SzN6 = 0;
					for(int i = 0; i < ZliczanieBonusuNienaturalnych[0]; i++) {
						SzN1 += ((int)(WzrostWagaWiek.wz(0, numerRasy, numerPlci) - postac.getWzrost()) / 2);
					}
					for(int j = 0; j < ZliczanieBonusuNienaturalnych[1]; j++) {
						SzN2 += 1;
					}
					for(int k = 0; k < ZliczanieBonusuNienaturalnych[2]; k++) {
						SzN3 += ZdolnoscNadnaturalnaINienaturalna.Debonus10();
					}
					for(int l = 0; l < ZliczanieBonusuNienaturalnych[3]; l++) {
						SzN4 += 1;
					}
					for(int m = 0; m < ZliczanieBonusuNienaturalnych[4]; m++) {
						SzN5 += ZdolnoscNadnaturalnaINienaturalna.Jednooki();
					}
					for(int n = 0; n < ZliczanieBonusuNienaturalnych[13]; n++) {
						SzN6 += ZdolnoscNadnaturalnaINienaturalna.Debonus20();
					}
					postac.setSzybkosc(((int)(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getSzybkosc(), podstawaB.getSzybkosc(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + SzN1 - (SzN3 + SzN5 + SzN6)) / SzN2 * SzN4) + MetodyIOdnosniki.wieksze(funkcjan1.getSzybkosc(), funkcjan2.getSzybkosc()));
				} else {
					postac.setSzybkosc(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getSzybkosc(), podstawaB.getSzybkosc(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + ((int)(WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci)) / 2) + MetodyIOdnosniki.wieksze(funkcjan1.getSzybkosc(), funkcjan2.getSzybkosc()));
				}
						
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Geniusz")) {
					postac.setInteligencja(ZdolnoscNadnaturalnaINienaturalna.Geniusz(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getInteligencja(), funkcjan2.getInteligencja()));
				} else if(!(postac.getNienaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Debil")) {
					postac.setInteligencja(((int)(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getInteligencja(), podstawaB.getInteligencja(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) / 10)) + MetodyIOdnosniki.wieksze(funkcjan1.getInteligencja(), funkcjan2.getIlosc_Bieglosci()));
						if(postac.getInteligencja() > 30) {
							postac.setInteligencja(30);
						}
				} else {
					postac.setInteligencja(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getInteligencja(), podstawaB.getInteligencja(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getInteligencja(), funkcjan2.getInteligencja()));
				}
						
				if(!(postac.getNadnaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Mędrzec")) {
					postac.setMadrosc(ZdolnoscNadnaturalnaINienaturalna.Medrzec(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getMadrosc(), funkcjan2.getMadrosc())); 
				} else if(!(postac.getNienaturalne() == null) && !(ZliczanieBonusuNienaturalnych[11] == 0 || ZliczanieBonusuNienaturalnych[12] == 0)) {
					int MaN1 = 1; int MaN2 = 1; int MaN3 = 0;
					for(int i = 0; i < ZliczanieBonusuNienaturalnych[11]; i++) {
						MaN1 = ZdolnoscNadnaturalnaINienaturalna.Debonus10();
					}
					for(int j = 0; j < ZliczanieBonusuNienaturalnych[12]; j++) {
						MaN2 += 3;
					}
					for(int k = 0; k < ZliczanieBonusuNienaturalnych[13]; k++) {
						MaN2 += ZdolnoscNadnaturalnaINienaturalna.Debonus20();
					}
					postac.setMadrosc(((int)(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getMadrosc(), podstawaB.getMadrosc(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) - MaN3 / (MaN1 * MaN2) )) + MetodyIOdnosniki.wieksze(funkcjan1.getMadrosc(), funkcjan2.getMadrosc()));
						if(ZliczanieBonusuNienaturalnych[12] > 0 && postac.getMadrosc() > 30) {
							postac.setMadrosc(30);
						}
				} else {
					postac.setMadrosc(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getMadrosc(), podstawaB.getMadrosc(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getMadrosc(), funkcjan2.getMadrosc()));
				}
						
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Magik")) {
					postac.setUmiejetnosci_Magiczne(ZdolnoscNadnaturalnaINienaturalna.Magik(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getUmiejetnosci_Magiczne(), funkcjan2.getUmiejetnosci_Magiczne()));
				} else if(!(postac.getNienaturalne() == null) && !(ZliczanieBonusuNienaturalnych[10] == 0)) {
					int UMN = 1;
					for(int i = 0; i < ZliczanieBonusuNienaturalnych[10]; i++) {
						UMN += 3;
					}
					postac.setUmiejetnosci_Magiczne(((int)(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getUmiejetnosci_Magiczne(), podstawaB.getUmiejetnosci_Magiczne(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) / UMN)) + MetodyIOdnosniki.wieksze(funkcjan1.getUmiejetnosci_Magiczne(), funkcjan2.getUmiejetnosci_Magiczne()));
				} else {
					postac.setUmiejetnosci_Magiczne(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getUmiejetnosci_Magiczne(), podstawaB.getUmiejetnosci_Magiczne(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getUmiejetnosci_Magiczne(), funkcjan2.getUmiejetnosci_Magiczne()));
				} 
						
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Piękniś")) {
					postac.setPrezencja(ZdolnoscNadnaturalnaINienaturalna.Pieknis(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getPrezencja(), funkcjan2.getPrezencja()));
				} else if(!(postac.getNienaturalne() == null) && !(ZliczanieBonusuNienaturalnych[1] == 0 || ZliczanieBonusuNienaturalnych[5] == 0 || ZliczanieBonusuNienaturalnych[6] == 0 || ZliczanieBonusuNienaturalnych[7] == 0 || ZliczanieBonusuNienaturalnych[8] == 0 || ZliczanieBonusuNienaturalnych[9] == 0)) {
					int PrN1 = 0; int PrN2 = 0; int PrN3 = 0; int PrN4 = 1; int PrN5 = 0; int PrN6 = 0; int PrN7 = 0;
					for(int i = 0; i < ZliczanieBonusuNienaturalnych[1]; i++) {
						PrN1 += ZdolnoscNadnaturalnaINienaturalna.Kulawy();
					}			
					for(int j = 0; j < ZliczanieBonusuNienaturalnych[5]; j++) {
						PrN2 += ZdolnoscNadnaturalnaINienaturalna.Debonus10();
					}
					for(int k = 0; k < ZliczanieBonusuNienaturalnych[6]; k++) {
						PrN3 += ZdolnoscNadnaturalnaINienaturalna.Debonus10();
					}
					for(int l = 0; l < ZliczanieBonusuNienaturalnych[7]; l++) {
						PrN4 += 1;
					}
					for(int m = 0; m < ZliczanieBonusuNienaturalnych[8]; m++) {
						PrN5 += ZdolnoscNadnaturalnaINienaturalna.Debonus20();
					}
					for(int n = 0; n < ZliczanieBonusuNienaturalnych[9]; n++) {
						PrN6 += ZdolnoscNadnaturalnaINienaturalna.Debonus20();
					}
					for(int o = 0; o < ZliczanieBonusuNienaturalnych[13]; o++) {
						PrN7 += ZdolnoscNadnaturalnaINienaturalna.Debonus20();
					}
					postac.setPrezencja(((int)(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getPrezencja(), podstawaB.getPrezencja(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) - (PrN1 + PrN2 +  + PrN4 + PrN5 + PrN6 + PrN7)) / PrN3) + MetodyIOdnosniki.wieksze(funkcjan1.getPrezencja(), funkcjan2.getPrezencja()));
				} else {
					postac.setPrezencja(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getPrezencja(), podstawaB.getPrezencja(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getPrezencja(), funkcjan2.getPrezencja()));
				}
						
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Elokwentny")) {
					postac.setCharyzma(ZdolnoscNadnaturalnaINienaturalna.Elokwentny(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getCharyzma(), funkcjan2.getCharyzma()));
				} else if(!(postac.getNienaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Jąkała")) {
					postac.setCharyzma(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getCharyzma(), podstawaB.getCharyzma(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) - ZdolnoscNadnaturalnaINienaturalna.Jakala() + MetodyIOdnosniki.wieksze(funkcjan1.getCharyzma(), funkcjan2.getCharyzma()));
				} else {
					postac.setCharyzma(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getCharyzma(), podstawaB.getCharyzma(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getCharyzma(), funkcjan2.getCharyzma()));
				}
						
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Fanatyk")) {
					postac.setWiara(ZdolnoscNadnaturalnaINienaturalna.Fanatyk() + MetodyIOdnosniki.wieksze(funkcjan1.getWiara(), funkcjan2.getWiara()));
				} else {
					postac.setWiara(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getWiara(), podstawaB.getWiara(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getWiara(), funkcjan2.getWiara()));
				}
					
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Ulubieniec bogów")) {
					postac.setZauwazenie(ZdolnoscNadnaturalnaINienaturalna.UlubieniecBogow(numerFunkcji) + MetodyIOdnosniki.wieksze(funkcjan1.getZauwazenie(), funkcjan2.getZauwazenie()));
				} else {
					postac.setZauwazenie(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getZauwazenie(), podstawaB.getZauwazenie(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getZauwazenie(), funkcjan2.getZauwazenie()));
				}	
				
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Iluzje")) {
					postac.setOdpornosc_na_Iluzje(podstawa.getOdpornosc_na_Iluzje() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Iluzje(), funkcjan2.getOdpornosc_na_Iluzje()));
				} else {
					postac.setOdpornosc_na_Iluzje(podstawa.getOdpornosc_na_Iluzje() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Iluzje(), funkcjan2.getOdpornosc_na_Iluzje()));
				}
					
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Sugestie")) {
					postac.setOdpornosc_na_Sugestie(podstawa.getOdpornosc_na_Sugestie() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Sugestie(), funkcjan2.getOdpornosc_na_Sugestie()));
				} else {
					postac.setOdpornosc_na_Sugestie(podstawa.getOdpornosc_na_Sugestie() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Sugestie(), funkcjan2.getOdpornosc_na_Sugestie()));
				}
						
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Zaklęcia")) {
					postac.setOdpornosc_na_Zaklecia(podstawa.getOdpornosc_na_Zaklecia() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Zaklecia(), funkcjan2.getOdpornosc_na_Zaklecia()));
				} else {
					postac.setOdpornosc_na_Zaklecia(podstawa.getOdpornosc_na_Zaklecia() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Zaklecia(), funkcjan2.getOdpornosc_na_Zaklecia()));
				}
						
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Szok")) {
					postac.setOdpornosc_na_Szok(podstawa.getOdpornosc_na_Szok() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Szok(), funkcjan2.getOdpornosc_na_Szok()));
				} else {
					postac.setOdpornosc_na_Szok(podstawa.getOdpornosc_na_Szok() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Szok(), funkcjan2.getOdpornosc_na_Szok()));
				}
						
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Energie")) {
					postac.setOdpornosc_na_Energie(podstawa.getOdpornosc_na_Energie() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Energie(), funkcjan2.getOdpornosc_na_Energie()));
				} else {
					postac.setOdpornosc_na_Energie(podstawa.getOdpornosc_na_Energie() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Energie(), funkcjan2.getOdpornosc_na_Energie()));
				}
						
				if(!(postac.getNadnaturalne() == null) && !(ZliczanieBonusuNadnaturalnych[2] == 0 || ZliczanieBonusuNadnaturalnych[3] == 0)){
					int OT1 = 0; int OT2 = 0;
					for(int i = 0; i < ZliczanieBonusuNienaturalnych[11]; i++) {
						OT1 = ZdolnoscNadnaturalnaINienaturalna.Bonus();
					}
					for(int j = 0; j < ZliczanieBonusuNienaturalnych[12]; j++) {
						OT2 = ZdolnoscNadnaturalnaINienaturalna.Bonus();
					}
					postac.setOdpornosc_na_Trucizny(podstawa.getOdpornosc_na_Trucizny() + OT1 + OT2 + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Trucizny(), funkcjan2.getOdpornosc_na_Trucizny())); 
				} else {
					postac.setOdpornosc_na_Trucizny(podstawa.getOdpornosc_na_Trucizny() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Trucizny(), funkcjan2.getOdpornosc_na_Trucizny()));
				}
						
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Gazy")) {
					postac.setOdpornosc_na_Gazy(podstawa.getOdpornosc_na_Gazy() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Gazy(), funkcjan2.getOdpornosc_na_Gazy()));
				} else {
					postac.setOdpornosc_na_Gazy(podstawa.getOdpornosc_na_Gazy() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Gazy(), funkcjan2.getOdpornosc_na_Gazy()));
				}
						
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Temperature")) {
					postac.setOdpornosc_na_Temperature(podstawa.getOdpornosc_na_Temperature() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Temperature(), funkcjan2.getOdpornosc_na_Temperature()));
				} else {
					postac.setOdpornosc_na_Temperature(podstawa.getOdpornosc_na_Temperature() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Temperature(), funkcjan2.getOdpornosc_na_Temperature()));
				}
						
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Elektryczność")) {
					postac.setOdpornosc_na_Elektrycznosc(podstawa.getOdpornosc_na_Elektrycznosc() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Elektrycznosc(), funkcjan2.getOdpornosc_na_Elektrycznosc()));
				} else {
					postac.setOdpornosc_na_Elektrycznosc(podstawa.getOdpornosc_na_Elektrycznosc() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Elektrycznosc(), funkcjan2.getOdpornosc_na_Elektrycznosc()));
				}
						
				if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Polimorfie")) {
					postac.setOdpornosc_na_Polimorfie(podstawa.getOdpornosc_na_Polimorfie() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Polimorfie(), funkcjan2.getOdpornosc_na_Polimorfie()));
				} else {
					postac.setOdpornosc_na_Polimorfie(podstawa.getOdpornosc_na_Polimorfie() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Polimorfie(), funkcjan2.getOdpornosc_na_Polimorfie()));
				}
							
				ileBieglosci = MetodyIOdnosniki.wieksze(funkcjan1.getIlosc_Bieglosci(), funkcjan2.getIlosc_Bieglosci());
				minBieglosc = MetodyIOdnosniki.wieksze(funkcjan1.getMinimalna_Bieglosc(), funkcjan2.getMinimalna_Bieglosc());
				funkcjaBieglosc = MetodyIOdnosniki.ktoraFunkcja(funkcjan1.getIlosc_Bieglosci(), funkcjan2.getIlosc_Bieglosci(), funkcje[0], funkcje[1]);
				postac.setBronie(MetodyIOdnosniki.LosowanieBroni(ileBieglosci, rasa, funkcjaBieglosc));
				
				
				
				postac.setBieglosc(MetodyIOdnosniki.LosowanieBieglosci(ileBieglosci, minBieglosc));
				if(!(postac.getNadnaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Fechmistrz")) {
					postac.setBieglosc(MetodyIOdnosniki.testFechmistrz(postac.getBronie(), postac.getBieglosc()));
				}
					
				if(!(postac.getZawod() == null)){
					postac.setWiek(postac.getWiek() + MetodyIOdnosniki.wiekZaZawody(postac.getZawod()) + MetodyIOdnosniki.wiekZZawodow(postac.getZawod()));
					
					int Sf1 = 0; int Sf2 = 0;
					for(int i = 0; i < ZliczanieBonusuZawodow[0]; i++) {
						Sf1 += LosowanieZawodow.bonusZ20Plus();
					}
					for(int j = 0; j < ZliczanieBonusuZawodow[1]; j++) {
						Sf2 += LosowanieZawodow.bonusZ10Plus();
					}
					postac.setSila_Fizyczna(postac.getSila_Fizyczna() + Sf1 + Sf2);
					
						
					int Zr1 = 0; int Zr2 = 0; int Zr3 = 0;
					for(int i = 0; i < ZliczanieBonusuZawodow[2]; i++) {
						Zr1 += LosowanieZawodow.bonusZ5();
					}
					for(int j = 0; j < ZliczanieBonusuZawodow[3]; j++) {
						Zr2 += LosowanieZawodow.bonusZ10();
					}
					for(int k = 0; k < ZliczanieBonusuZawodow[14]; k++) {
						Zr3 += LosowanieZawodow.bonusZ10();
					}
					postac.setZrecznosc(postac.getZrecznosc() + Zr1 + Zr2 + Zr3);
					
					int Iq1 = 0; int Iq2 = 0;
					for(int i = 0; i < ZliczanieBonusuZawodow[4]; i++) {
						Iq1 += LosowanieZawodow.bonusZ10();
					}
					for(int j = 0; j < ZliczanieBonusuZawodow[14]; j++) {
						Iq2 += LosowanieZawodow.bonusZ10();
					}
					postac.setInteligencja(postac.getInteligencja() + Iq1 + Iq2);
					
					int Ma1 = 0; int Ma2 = 0; int Ma3 = 0; int Ma4 = 0; int Ma5 = 0; int Ma6 = 0;
					for(int i = 0; i < ZliczanieBonusuZawodow[5]; i++) {
						Ma1 += LosowanieZawodow.bonusZ3();
					}
					for(int j = 0; j < ZliczanieBonusuZawodow[6]; j++) {
						Ma2 += LosowanieZawodow.bonusZ2();
					}
					for(int k = 0; k < ZliczanieBonusuZawodow[7]; k++) {
						Ma3 += LosowanieZawodow.bonusZ5();
					}
					for(int l = 0; l < ZliczanieBonusuZawodow[8]; l++) {
						Ma4 += LosowanieZawodow.bonusZ20();
					}
					for(int m = 0; m < ZliczanieBonusuZawodow[4]; m++) {
						Ma5 += LosowanieZawodow.bonusZ20();
					}
					for(int n = 0; n < ZliczanieBonusuZawodow[14]; n++) {
						Ma6 += LosowanieZawodow.bonusZ10();
					}
					postac.setMadrosc(postac.getMadrosc() + Ma1 + Ma2 + Ma3 + Ma4 + Ma5 + Ma6);
					
					int Pr1 = 0; int Pr2 = 0; int Pr3 = 0;
					for(int i = 0; i < ZliczanieBonusuZawodow[9]; i++) {
						Pr1 += LosowanieZawodow.bonusZ5();
					}
					for(int j = 0; j < ZliczanieBonusuZawodow[10]; j++) {
						Pr2 += LosowanieZawodow.bonusZ10();
					}
					for(int k = 0; k < ZliczanieBonusuZawodow[11]; k++) {
						Pr3 += LosowanieZawodow.bonusZ20();
					}
					postac.setPrezencja(postac.getPrezencja() + Pr1 + Pr2 + Pr3);
					
					int Ch1 = 0; int Ch2 = 0;
					for(int i = 0; i < ZliczanieBonusuZawodow[12]; i++) {
						Ch1 += LosowanieZawodow.bonusZ10();
					}
					for(int j = 0; j < ZliczanieBonusuZawodow[13]; j++) {
						Ch2 += LosowanieZawodow.bonusZ10Plus();
					}
					postac.setCharyzma(postac.getCharyzma() + Ch1 + Ch2);
				}
				
				postac.setBazowa_odpornosc_Psychiczno_Fizyczna(podstawa.getBazowa_odpornosc_Psychiczno_Fizyczna() + MetodyIOdnosniki.bazowaPF(postac.getInteligencja(), postac.getMadrosc(), postac.getZywotnosc()));	
				postac.setBazowa_odpornosc_Fizyczna(podstawa.getBazowa_odpornosc_Fizyczna() + MetodyIOdnosniki.bazowaF(postac.getZywotnosc(), postac.getSila_Fizyczna()));

				dodatekBieglosc = MetodyIOdnosniki.wieksze(funkcjan1.getDodatek_do_Bieglosci(), funkcjan2.getDodatek_do_Bieglosci());
				postac.setBieglosc(MetodyIOdnosniki.DodatkiBieglosci(postac.getBronie(), postac.getBieglosc(), dodatekBieglosc, numerRasy));
				if(!(postac.getZawod() == null)) {
					postac.setBieglosc(MetodyIOdnosniki.DodatekZawod(postac.getBronie(), postac.getBieglosc(), postac.getZawod().toArray(new String[postac.getZawod().size()])));
				}
					
				for(int i = 0; i < poziom; i++) {
					if(!(postac.getNadnaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Twardziel")){
						postac.setZywotnosc(postac.getZywotnosc() + (MetodyIOdnosniki.rozwojPostaci(rozwoj1.getZywotnosc(), rozwoj2.getZywotnosc(), poziom, poziom2) * MetodyIOdnosniki.superio(postac.getZywotnosc()) * 2));
					} else {
						postac.setZywotnosc(postac.getZywotnosc() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getZywotnosc(), rozwoj2.getZywotnosc(), poziom, poziom2) * MetodyIOdnosniki.superio(postac.getZywotnosc()));
					}
				
					postac.setSila_Fizyczna(postac.getSila_Fizyczna() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getSila_Fizyczna(), rozwoj2.getSila_Fizyczna(), poziom, poziom2) * MetodyIOdnosniki.superio(postac.getSila_Fizyczna()));
					postac.setZrecznosc(postac.getZrecznosc() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getZrecznosc(), rozwoj2.getZrecznosc(), poziom, poziom2));
					postac.setSzybkosc(postac.getSzybkosc() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getSzybkosc(), rozwoj2.getSzybkosc(), poziom, poziom2));
					
					if(!(postac.getNienaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Debil")) {
						postac.setInteligencja(postac.getInteligencja() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getInteligencja(), rozwoj2.getInteligencja(), poziom, poziom2));
							if(postac.getInteligencja() > 30) {
								postac.setInteligencja(30);
						}
					} else {
						postac.setInteligencja(postac.getInteligencja() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getInteligencja(), rozwoj2.getInteligencja(), poziom, poziom2));
					}
							
					postac.setMadrosc(postac.getMadrosc() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getMadrosc(), rozwoj2.getMadrosc(), poziom, poziom2));
					postac.setUmiejetnosci_Magiczne(postac.getUmiejetnosci_Magiczne() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getUmiejetnosci_Magiczne(), rozwoj2.getUmiejetnosci_Magiczne(), poziom, poziom2));

					if(!(postac.getNienaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Szpetny")) { 
						postac.setPrezencja(postac.getPrezencja() + ((int)(MetodyIOdnosniki.rozwojPostaci(rozwoj1.getPrezencja(), rozwoj2.getPrezencja(), poziom, poziom2) / 2)));
					} else {
						postac.setPrezencja(postac.getPrezencja() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getPrezencja(), rozwoj2.getPrezencja(), poziom, poziom2));
					}
					
					postac.setCharyzma(postac.getCharyzma() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getCharyzma(), rozwoj2.getCharyzma(), poziom, poziom2));
					postac.setWiara(postac.getWiara() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getWiara(), rozwoj2.getWiara(), poziom, poziom2));
					postac.setZauwazenie(postac.getZauwazenie() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getZauwazenie(), rozwoj2.getZauwazenie(), poziom, poziom2));
					postac.setBazowa_odpornosc_Psychiczno_Fizyczna(postac.getBazowa_odpornosc_Psychiczno_Fizyczna() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getBazowa_odpornosc_Psychiczno_Fizyczna(), rozwoj2.getBazowa_odpornosc_Psychiczno_Fizyczna(), poziom, poziom2));
					postac.setBazowa_odpornosc_Fizyczna(postac.getBazowa_odpornosc_Fizyczna() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getBazowa_odpornosc_Fizyczna(), rozwoj2.getBazowa_odpornosc_Fizyczna(), poziom, poziom2));
					postac.setBieglosc(MetodyIOdnosniki.rozwojBieglosci(postac.getBieglosc(), MetodyIOdnosniki.rozwojPostaci(rozwoj1.getDodatek_do_Bieglosci(), rozwoj2.getDodatek_do_Bieglosci(), poziom, poziom2)));
				}
				
				postac.setBazowa_odpornosc_Psychiczno_Fizyczna(postac.getBazowa_odpornosc_Psychiczno_Fizyczna());	
				postac.setOdpornosc_na_Iluzje(postac.getOdpornosc_na_Iluzje() + postac.getBazowa_odpornosc_Psychiczno_Fizyczna());
				postac.setOdpornosc_na_Sugestie(postac.getOdpornosc_na_Sugestie() + postac.getBazowa_odpornosc_Psychiczno_Fizyczna());
				postac.setOdpornosc_na_Zaklecia(postac.getOdpornosc_na_Zaklecia() + postac.getBazowa_odpornosc_Psychiczno_Fizyczna());
				postac.setOdpornosc_na_Szok(postac.getOdpornosc_na_Szok() + postac.getBazowa_odpornosc_Psychiczno_Fizyczna());
				postac.setOdpornosc_na_Energie(postac.getOdpornosc_na_Energie() + postac.getBazowa_odpornosc_Psychiczno_Fizyczna());
				postac.setBazowa_odpornosc_Fizyczna(postac.getBazowa_odpornosc_Fizyczna());
				postac.setOdpornosc_na_Trucizny(postac.getOdpornosc_na_Trucizny() + postac.getBazowa_odpornosc_Fizyczna());
				postac.setOdpornosc_na_Gazy(postac.getOdpornosc_na_Gazy() + postac.getBazowa_odpornosc_Fizyczna());
				postac.setOdpornosc_na_Temperature(postac.getOdpornosc_na_Temperature() + postac.getBazowa_odpornosc_Fizyczna());
				postac.setOdpornosc_na_Elektrycznosc(postac.getOdpornosc_na_Elektrycznosc() + postac.getBazowa_odpornosc_Fizyczna());
				postac.setOdpornosc_na_Polimorfie(postac.getOdpornosc_na_Polimorfie() + postac.getBazowa_odpornosc_Fizyczna());
				postac.setUmiejetnosc_wladania_bronia(MetodyIOdnosniki.razem(postac.getBronie(), postac.getBieglosc(), ileBieglosci));
				//System.out.println(Arrays.toString(MetodyIOdnosniki.SprawdzTo(postac.getZawod().toArray(new String[postac.getZawod().size()]))));
				
				Nadnaturalne = MetodyIOdnosniki.SprawdzTo(postac.getNadnaturalne());
				Nienaturalne = MetodyIOdnosniki.SprawdzTo(postac.getNienaturalne());
				Wzrost = String.valueOf(postac.getWzrost());
				Waga = String.valueOf(postac.getWaga());
				Wiek = String.valueOf(postac.getWiek());
				StatusUrodzenia = postac.getStatus_urodzenia();
				Zywotnosc = String.valueOf(postac.getZywotnosc());
				SilaFizyczna = String.valueOf(postac.getSila_Fizyczna());
				Zrecznosc = String.valueOf(postac.getZrecznosc());
				Szybkosc = String.valueOf(postac.getSzybkosc());
				Inteligencja = String.valueOf(postac.getInteligencja());
				Madrosc = String.valueOf(postac.getMadrosc());
				UmiejetnosciMagiczne = String.valueOf(postac.getUmiejetnosci_Magiczne());
				Prezencja = String.valueOf(postac.getPrezencja());
				Charyzma = String.valueOf(postac.getCharyzma());
				Wiara = String.valueOf(postac.getWiara());
				Zauwazenie = String.valueOf(postac.getZauwazenie());
				BazowaPF = String.valueOf(postac.getBazowa_odpornosc_Psychiczno_Fizyczna());
				OIlu = String.valueOf(postac.getOdpornosc_na_Iluzje());
				OSug = String.valueOf(postac.getOdpornosc_na_Sugestie());
				OZak = String.valueOf(postac.getOdpornosc_na_Zaklecia());
				OSzo = String.valueOf(postac.getOdpornosc_na_Szok());
				OEne = String.valueOf(postac.getOdpornosc_na_Energie());
				BazowaF = String.valueOf(postac.getBazowa_odpornosc_Fizyczna());
				OTru = String.valueOf(postac.getOdpornosc_na_Trucizny());
				OGaz = String.valueOf(postac.getOdpornosc_na_Gazy());
				OTem = String.valueOf(postac.getOdpornosc_na_Temperature());
				OEle = String.valueOf(postac.getOdpornosc_na_Elektrycznosc());
				OPol = String.valueOf(postac.getOdpornosc_na_Polimorfie());
				Zawody = MetodyIOdnosniki.SprawdzTo(LosowanieZawodow.nowaLista(postac.getZawod()));
				UWD = MetodyIOdnosniki.SprawdzTo(postac.getUmiejetnosc_wladania_bronia());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	/**	Object z = e.getSource();
		
		if (z == mOtworz)
		{
			JFileChooser fc = new JFileChooser();
			if (fc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION)
			{
				File plik = fc.getSelectedFile();
				JOptionPane.showMessageDialog(null, "wybrany plik to " + plik.getAbsolutePath());
			}
		}
		else if (z == mZapisz)
		{
			JFileChooser fc = new JFileChooser();
			if (fc.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
			{
				File plik = fc.getSelectedFile();
				JOptionPane.showMessageDialog(null, "wybrany plik to " + plik);
			}
		}
		else if (z == mWyjscie) {
			dispose();
		}
		**/
	}	
}
