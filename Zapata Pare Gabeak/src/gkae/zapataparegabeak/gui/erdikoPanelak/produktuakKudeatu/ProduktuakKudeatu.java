package gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu;

import gkae.zapataparegabeak.objektuak.Kudeaketa;
import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.Font;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;

public class ProduktuakKudeatu extends JPanel {

	private JTextArea nahiDituzunProduktuakTextArea;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final JPanel artikuluZerrenda;
	private final Vector<ProduktuaItemPanela> CBPanela;
	//private ProduktuakKudeatuPanel jabea;

	/**
	 * Create the panel
	 */
	public ProduktuakKudeatu(ProduktuakKudeatuPanel jabea) {
		super();
		//this.jabea = jabea;
		CBPanela = new Vector<ProduktuaItemPanela>();
		JSeparator separator;
		separator = new JSeparator();

		JLabel katalogoaLabel;
		katalogoaLabel = new JLabel();
		katalogoaLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		katalogoaLabel.setText("Produktuak Kudeatu");

		JScrollPane scrollPane;
		scrollPane = new JScrollPane();

		artikuluZerrenda = new JPanel();
		scrollPane.setViewportView(artikuluZerrenda);
		artikuluZerrenda.setLayout(new BoxLayout(artikuluZerrenda, BoxLayout.Y_AXIS));
		artikuluZerrenda.setSize(473, 310);
		//
		katalogoaEguneratu();
		
		katalogoaEguneratu();

		nahiDituzunProduktuakTextArea = new JTextArea();
		nahiDituzunProduktuakTextArea.setFont(new Font("", Font.ITALIC, 12));
		nahiDituzunProduktuakTextArea.setText("Katalogoaren produkturen bat editatzeko edo ezabatzeko aukera ematen du");
		nahiDituzunProduktuakTextArea.setWrapStyleWord(true);
		nahiDituzunProduktuakTextArea.setLineWrap(true);
		nahiDituzunProduktuakTextArea.setEditable(false);
		nahiDituzunProduktuakTextArea.setOpaque(false);
		nahiDituzunProduktuakTextArea.setBackground(UIManager.getColor("Button.background"));
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(separator, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
								.addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
									.addGap(12, 12, 12)
									.addComponent(nahiDituzunProduktuakTextArea, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28, 28, 28)
							.addComponent(katalogoaLabel, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)))
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
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
					.addGap(45, 45, 45))
		);
		setLayout(groupLayout);
	}
	
	public void katalogoaEguneratu() {
		artikuluZerrenda.removeAll();
		for(Zapata z: Kudeaketa.getInstance().katalogokoZapatak()){
			ProduktuaItemPanela mip = new ProduktuaItemPanela(z);
			artikuluZerrenda.add(mip);
			CBPanela.addElement(mip);
		}
		
	}
	
	
}
