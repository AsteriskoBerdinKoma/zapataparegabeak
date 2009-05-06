package gkae.zapataparegabeak.gui.erdikoPanelak.materialaEskatu;


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
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle;
import javax.swing.border.LineBorder;

import com.swtdesigner.SwingResourceManager;

public class MaterialaItemPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JComboBox comboBox;
	private JSpinner spinner;
	private Zapata zapataInfo;
	private JLabel modeloaKoloreaLabel;
	private JLabel datuPrezioa;
	private JLabel irudiaLabel;
	JLabel datuStock;
	
	/**
	 * Create the panel
	 */
	public MaterialaItemPanela(Zapata z) {
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
				ArtikuluarenXehetasunakDialog axd = new ArtikuluarenXehetasunakDialog(MaterialaItemPanela.this.zapataInfo);
				axd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				axd.setLocationRelativeTo(null);
				axd.setVisible(true);
			}
		});
		button.setIcon(SwingResourceManager.getIcon(MaterialaItemPanela.class, "/gkae/zapataparegabeak/resources/ikonoak/search_magnifier24.png"));

		JLabel stockaLabel;
		stockaLabel = new JLabel();
		stockaLabel.setText("Stocka:");

		
		datuStock = new JLabel();
		datuStock.setText("10");

		JLabel kopuruaLabel;
		kopuruaLabel = new JLabel();
		kopuruaLabel.setText("Kopurua");

		spinner = new JSpinner();
		spinner.setValue(1);

		JLabel neurriaLabel;
		neurriaLabel = new JLabel();
		neurriaLabel.setText("Neurria:");

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"36", "38", "40", "43"}));
		//
		setDatuak();

		JCheckBox checkBox;
		checkBox = new JCheckBox();
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(checkBox)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(irudiaLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(modeloaKoloreaLabel, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(prezioaLabel)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(datuPrezioa))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(stockaLabel)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(datuStock)))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(neurriaLabel)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(46, 46, 46)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
									.addGap(0, 0, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(kopuruaLabel)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
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
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(button, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))))
								.addComponent(irudiaLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(24, 24, 24)
							.addComponent(checkBox)))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(stockaLabel)
						.addComponent(datuStock)
						.addComponent(kopuruaLabel)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
		
		ImageIcon iconOrig = SwingResourceManager.getIcon(MaterialaItemPanela.class, "/gkae/zapataparegabeak/resources/zapatak/"+zapataInfo.getIrudiPath());
		ImageIcon iconResized = new ImageIcon(iconOrig.getImage().getScaledInstance(50, (60*50)/120, Image.SCALE_SMOOTH));
		irudiaLabel.setIcon(iconResized);
	}

}
