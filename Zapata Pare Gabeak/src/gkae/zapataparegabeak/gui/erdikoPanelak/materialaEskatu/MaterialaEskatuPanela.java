package gkae.zapataparegabeak.gui.erdikoPanelak.materialaEskatu;

import gkae.zapataparegabeak.objektuak.Katalogoa;
import gkae.zapataparegabeak.objektuak.Kudeaketa;
import gkae.zapataparegabeak.objektuak.SaskiratutakoZapatak;
import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;

public class MaterialaEskatuPanela extends JPanel {

	private JTextArea nahiDituzunProduktuakTextArea;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final JPanel artikuluZerrenda;
	private final Vector<MaterialaItemPanela> CBPanela;

	/**
	 * Create the panel
	 */
	public MaterialaEskatuPanela() {
		super();
		CBPanela = new Vector<MaterialaItemPanela>();
		JSeparator separator;
		separator = new JSeparator();

		JLabel katalogoaLabel;
		katalogoaLabel = new JLabel();
		katalogoaLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		katalogoaLabel.setText("Materiala Eskatu");

		JScrollPane scrollPane;
		scrollPane = new JScrollPane();

		artikuluZerrenda = new JPanel();
		scrollPane.setViewportView(artikuluZerrenda);
		artikuluZerrenda.setLayout(new BoxLayout(artikuluZerrenda, BoxLayout.Y_AXIS));
		artikuluZerrenda.setSize(473, 310);
		//
		katalogoaEguneratu();
		
		katalogoaEguneratu();

		JButton eskaeraGordeButton;
		eskaeraGordeButton = new JButton();
		eskaeraGordeButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				JOptionPane jop = new JOptionPane(
                        "Zure eskaera gorde da.",
                        JOptionPane.INFORMATION_MESSAGE);
						jop.createDialog("Eskaera gordeta")
                        .setVisible(true);
						for(MaterialaItemPanela m: CBPanela){
							m.setAukeratuta(false);
						}
			}
		});
		eskaeraGordeButton.setText("Eskaera Gorde");

		JButton berriaEskatuButton;
		berriaEskatuButton = new JButton();
		berriaEskatuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				MaterialBerri MBerri = new MaterialBerri();
				MBerri.setLocationRelativeTo(null);
				MBerri.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				MBerri.setVisible(true);
			}
		});
		berriaEskatuButton.setText("Material Berria");

		nahiDituzunProduktuakTextArea = new JTextArea();
		nahiDituzunProduktuakTextArea.setFont(new Font("", Font.ITALIC, 12));
		nahiDituzunProduktuakTextArea.setText("Nahi dituzun produktuak eta kantitateak aukeratu gehiago eskatzeko edo Material Berria eskatu");
		nahiDituzunProduktuakTextArea.setWrapStyleWord(true);
		nahiDituzunProduktuakTextArea.setLineWrap(true);
		nahiDituzunProduktuakTextArea.setEditable(false);
		nahiDituzunProduktuakTextArea.setOpaque(false);
		nahiDituzunProduktuakTextArea.setBackground(UIManager.getColor("Button.background"));
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(separator, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
						.addComponent(nahiDituzunProduktuakTextArea, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
						.addComponent(scrollPane, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
						.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(berriaEskatuButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(eskaeraGordeButton))
						.addComponent(katalogoaLabel, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(katalogoaLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(nahiDituzunProduktuakTextArea, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(eskaeraGordeButton)
						.addComponent(berriaEskatuButton))
					.addGap(13, 13, 13))
		);
		setLayout(groupLayout);
	}
	
	public void katalogoaEguneratu() {
		artikuluZerrenda.removeAll();
		for(Zapata z: Kudeaketa.getInstance().katalogokoZapatak()){
			MaterialaItemPanela mip = new MaterialaItemPanela(z);
			artikuluZerrenda.add(mip);
			CBPanela.addElement(mip);
		}
		
	}
	
	
}
