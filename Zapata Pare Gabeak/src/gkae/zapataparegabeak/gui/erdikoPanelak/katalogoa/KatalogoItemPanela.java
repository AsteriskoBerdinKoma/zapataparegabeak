package gkae.zapataparegabeak.gui.erdikoPanelak.katalogoa;

import gkae.zapataparegabeak.objektuak.SaskiratutakoZapatak;
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
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle;
import javax.swing.border.LineBorder;

import com.swtdesigner.SwingResourceManager;

public class KatalogoItemPanela extends JPanel {

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
	public KatalogoItemPanela(Zapata z) {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		this.zapataInfo = z;

		
		irudiaLabel = new JLabel();
		ImageIcon iconOrig = SwingResourceManager.getIcon(KatalogoItemPanela.class, "/gkae/zapataparegabeak/resources/zapatak/noimage120.png");
		ImageIcon iconResized = new ImageIcon(iconOrig.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
		irudiaLabel.setIcon(iconResized);
		irudiaLabel.setBackground(Color.WHITE);
		irudiaLabel.setOpaque(true);
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
				ArtikuluarenXehetasunakDialog ax = new ArtikuluarenXehetasunakDialog(zapataInfo);
				ax.setLocationRelativeTo(null);
				ax.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				ax.setVisible(true);
				//Menu nagusira gehitu eta bista bertara aldatu
			}
		});
		button.setIcon(SwingResourceManager.getIcon(KatalogoItemPanela.class, "/gkae/zapataparegabeak/resources/ikonoak/search_magnifier24.png"));

		JButton button_1;
		button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				//Zapata hau saskira gehitu
				SaskiratutakoZapatak.getInstance().saskiraGehitu(zapataInfo,Integer.parseInt(spinner.getValue().toString()));
				//Eskubiko menua eguneratu
			}
		});
		button_1.setIcon(SwingResourceManager.getIcon(KatalogoItemPanela.class, "/gkae/zapataparegabeak/resources/ikonoak/add_cart24.png"));

		JLabel stockaLabel;
		stockaLabel = new JLabel();
		stockaLabel.setText("Stocka:");

		
		datuStock = new JLabel();
		datuStock.setText("10");

		JLabel kopuruaLabel;
		kopuruaLabel = new JLabel();
		kopuruaLabel.setText("| Kopurua");

		spinner = new JSpinner();
		spinner.setValue(1);

		JLabel neurriaLabel;
		neurriaLabel = new JLabel();
		neurriaLabel.setText("Neurria:");

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"36", "38", "40", "43"}));
		//
		setDatuak();
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(irudiaLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(stockaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(datuStock)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(kopuruaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
							.addComponent(button_1)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(button))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(prezioaLabel)
								.addComponent(neurriaLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(datuPrezioa)))
						.addComponent(modeloaKoloreaLabel))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
						.addComponent(irudiaLabel, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(modeloaKoloreaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(prezioaLabel)
										.addComponent(datuPrezioa))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(neurriaLabel)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(stockaLabel)
										.addComponent(datuStock)
										.addComponent(kopuruaLabel)
										.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(13, 13, 13))
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_1))))
					.addContainerGap())
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
		
		ImageIcon iconOrig = SwingResourceManager.getIcon(KatalogoItemPanela.class, "/gkae/zapataparegabeak/resources/zapatak/"+zapataInfo.getIrudiPath());
		ImageIcon iconResized = new ImageIcon(iconOrig.getImage().getScaledInstance(100, 60, Image.SCALE_SMOOTH));
		irudiaLabel.setIcon(iconResized);
	}

}
