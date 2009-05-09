package gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu;


import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle;
import javax.swing.border.LineBorder;

import com.swtdesigner.SwingResourceManager;

public class ProduktuaItemPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JComboBox comboBox;
	private Zapata zapataInfo;
	private JLabel modeloaKoloreaLabel;
	private JLabel datuPrezioa;
	private JLabel irudiaLabel;
	JLabel datuStock;
	
	/**
	 * Create the panel
	 */
	public ProduktuaItemPanela(Zapata z) {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		this.zapataInfo = z;

		
		irudiaLabel = new JLabel();
		irudiaLabel.setOpaque(true);
		irudiaLabel.setBackground(Color.WHITE);
		irudiaLabel.setBorder(new LineBorder(Color.black, 1, false));

		
		modeloaKoloreaLabel = new JLabel();
		modeloaKoloreaLabel.setFont(new Font("", Font.BOLD, 14));
		modeloaKoloreaLabel.setText("Generoa + Modeloa + Kolorea + Oina");

		JLabel prezioaLabel;
		prezioaLabel = new JLabel();
		prezioaLabel.setFont(new Font("", Font.BOLD, 12));
		prezioaLabel.setText("Prezioa:");

		
		datuPrezioa = new JLabel();
		datuPrezioa.setFont(new Font("", Font.BOLD, 12));
		datuPrezioa.setText("0.0€");

		JButton button;
		button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				ProduktuDatuakDialog axd = new ProduktuDatuakDialog (ProduktuaItemPanela.this.zapataInfo);
				axd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				axd.setLocationRelativeTo(null);
				axd.setVisible(true);
				
			}
		});
		button.setIcon(SwingResourceManager.getIcon(ProduktuaItemPanela.class, "/gkae/zapataparegabeak/resources/ikonoak/edit_item24.png"));

		JLabel stockaLabel;
		stockaLabel = new JLabel();
		stockaLabel.setText("Stocka:");

		
		datuStock = new JLabel();
		datuStock.setText("10");

		JLabel neurriaLabel;
		neurriaLabel = new JLabel();
		neurriaLabel.setText("Neurria:");

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"36", "38", "40", "43"}));
		//
		setDatuak();

		JButton button_1;
		button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				
				JOptionPane jop = new JOptionPane(
                        "Aukeratutako produktua ezabatu da.",
                        JOptionPane.INFORMATION_MESSAGE);
						jop.createDialog("Produktua ezabatuta")
                        .setVisible(true);
			}
			
		});
		button_1.setIcon(SwingResourceManager.getIcon(ProduktuaItemPanela.class, "/gkae/zapataparegabeak/resources/ikonoak/delete_item24.png"));
	
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(37, 37, 37)
					.addComponent(irudiaLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(modeloaKoloreaLabel, GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(prezioaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(datuPrezioa)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(neurriaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(42, 42, 42)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(stockaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(datuStock)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(modeloaKoloreaLabel)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(prezioaLabel)
										.addComponent(datuPrezioa)
										.addComponent(neurriaLabel)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(8, 8, 8)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(button, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))))
						.addComponent(irudiaLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(stockaLabel)
						.addComponent(datuStock))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
	
	public void setDatuak(){
		modeloaKoloreaLabel.setText(zapataInfo.getGeneroa()+" - Modelo Generikoa - "+zapataInfo.getKolorea()+" - "+zapataInfo.getOina());
		datuPrezioa.setText(String.valueOf(zapataInfo.getPrezioa())+"€");
		if(zapataInfo.isStockDago())
			datuStock.setText(String.valueOf(zapataInfo.getStocka()));
		else
			datuStock.setText("Ez");
		
		ImageIcon iconOrig = SwingResourceManager.getIcon(ProduktuaItemPanela.class, "/gkae/zapataparegabeak/resources/zapatak/"+zapataInfo.getIrudiPath());
		ImageIcon iconResized = new ImageIcon(iconOrig.getImage().getScaledInstance(50, (60*50)/120, Image.SCALE_SMOOTH));
		irudiaLabel.setIcon(iconResized);
	}

	public void setAukeratuta(boolean b) {
				
	}

}
