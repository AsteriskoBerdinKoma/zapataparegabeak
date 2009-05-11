package gkae.zapataparegabeak.gui.erdikoPanelak.eskaeraJarraipena;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;

import com.swtdesigner.SwingResourceManager;

public class ItzuleraJarraibideak extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	

	/**
	 * Create the dialog
	 */
	public ItzuleraJarraibideak() {
		super();
		setIconImage(SwingResourceManager.getImage(ItzuleraJarraibideak.class, "/gkae/zapataparegabeak/resources/ikonoak/help24.png"));
		setTitle("Itzulera Jarraibideak");
		setBounds(100, 100, 523, 388);

		final JPanel panel = new JPanel();
		getContentPane().add(panel);

		JLabel produktuaDagoenekoBidaliLabel;
		produktuaDagoenekoBidaliLabel = new JLabel();
		produktuaDagoenekoBidaliLabel.setText("Produktua dagoeneko bidali denez, ezin da bere eskaera bertan behera utzi.");

		JLabel halaEreHonakoLabel;
		halaEreHonakoLabel = new JLabel();
		halaEreHonakoLabel.setText("Hala ere, jasotako produktu bat itzultzeko aukera dago, betiere baldintza hauek beteaz:");

		JLabel produktuaBereLabel;
		produktuaBereLabel = new JLabel();
		produktuaBereLabel.setText("- Produktua bere kaja eta guzti itzultzea");

		JLabel jasotzeDatatikLabel;
		jasotzeDatatikLabel = new JLabel();
		jasotzeDatatikLabel.setText("- Jasotze datatik 20 egun baino gehiago igaro ez izana");

		JLabel produktuaItzultzekoInformazioaLabel;
		produktuaItzultzekoInformazioaLabel = new JLabel();
		produktuaItzultzekoInformazioaLabel.setText("Produktua itzultzeko gutunazalean/paketean agertu beharreko informazioa:");

		JLabel erosketaLabel;
		erosketaLabel = new JLabel();
		erosketaLabel.setText("- Produktu honen Eskaera-Kodea");

		JLabel zureIzenabizenakLabel;
		zureIzenabizenakLabel = new JLabel();
		zureIzenabizenakLabel.setText("- Zure Izen/Abizenak eta Helbide osoa");

		JLabel zurekinHarremanetanLabel;
		zurekinHarremanetanLabel = new JLabel();
		zurekinHarremanetanLabel.setText("- Zurekin harremanetan jartzeko telefono zenbaki bat");

		JLabel itzuleraHelbideaLabel;
		itzuleraHelbideaLabel = new JLabel();
		itzuleraHelbideaLabel.setText("Itzulera helbidea:");

		JTextPane peruBakarkaTextPane;
		peruBakarkaTextPane = new JTextPane();
		peruBakarkaTextPane.setEditable(false);
		peruBakarkaTextPane.setText("Peru Bakarka\nZapata Pare Gabeak SL\nhttps://www.zapataparegabeak.net\nLasaitasun pasealekua, 11\nLarrugorria, Nafarroa");
		final GroupLayout groupLayout = new GroupLayout((JComponent) panel);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(produktuaDagoenekoBidaliLabel)
								.addComponent(halaEreHonakoLabel)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(12, 12, 12)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(jasotzeDatatikLabel)
										.addComponent(produktuaBereLabel)))
								.addComponent(produktuaItzultzekoInformazioaLabel)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(12, 12, 12)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(zureIzenabizenakLabel)
										.addComponent(erosketaLabel)
										.addComponent(zurekinHarremanetanLabel)))
								.addComponent(itzuleraHelbideaLabel)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(24, 24, 24)
							.addComponent(peruBakarkaTextPane, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(produktuaDagoenekoBidaliLabel)
					.addGap(24, 24, 24)
					.addComponent(halaEreHonakoLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jasotzeDatatikLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(produktuaBereLabel)
					.addGap(17, 17, 17)
					.addComponent(produktuaItzultzekoInformazioaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(erosketaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(zureIzenabizenakLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(zurekinHarremanetanLabel)
					.addGap(21, 21, 21)
					.addComponent(itzuleraHelbideaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(peruBakarkaTextPane, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel.setLayout(groupLayout);
		//
	}
	
//	/**
//	 * Launch the application
//	 * @param args
//	 */
//	public static void main(String args[]) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ItzuleraJarraibideak dialog = new ItzuleraJarraibideak();
//					dialog.addWindowListener(new WindowAdapter() {
//						public void windowClosing(WindowEvent e) {
//							System.exit(0);
//						}
//					});
//					dialog.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
}
