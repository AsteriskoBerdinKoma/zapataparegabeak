package gkae.zapataparegabeak.gui.menuPanelak;

import gkae.zapataparegabeak.gui.NagusiaPanel;
import gkae.zapataparegabeak.gui.erdikoPanelak.katalogoa.ArtikuluarenXehetasunakDialog;
import gkae.zapataparegabeak.objektuak.SaskiratutakoZapatak;
import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.jdesktop.swingx.JXHyperlink;

import com.swtdesigner.SwingResourceManager;

public class ErosketaSaskiaMenuPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final JPanel panel;
	private final JScrollPane scrollPane;
	private final JLabel label;
	private final JLabel label_1;
	
	private NagusiaPanel jabea;
	
	private DecimalFormat twoDForm;

	/**
	 * Create the panel
	 */
	public ErosketaSaskiaMenuPanel(NagusiaPanel jabea) {
		super();
		
		this.jabea = jabea;
		
		setBorder(new TitledBorder(null, "Erosketa Saskia", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

		twoDForm = new DecimalFormat("#.##");
		
		JButton erosketaGauzatuButton;
		erosketaGauzatuButton = new JButton();
		erosketaGauzatuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				ErosketaSaskiaMenuPanel.this.jabea.ikusiErosiPanela();
			}
		});
		erosketaGauzatuButton.setIcon(SwingResourceManager.getIcon(ErosketaSaskiaMenuPanel.class, "/gkae/zapataparegabeak/resources/ikonoak/accept_cart24.png"));
		erosketaGauzatuButton.setText("Erosketa gauzatu");

		JLabel zureErosketaSaskiaLabel;
		zureErosketaSaskiaLabel = new JLabel();
		zureErosketaSaskiaLabel.setText("Zure erosketa saskia:");

		scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));

		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setSize(462, 272);

		scrollPane.setViewportView(panel);

		JLabel prezioaLabel;
		prezioaLabel = new JLabel();
		prezioaLabel.setFont(new Font("", Font.BOLD, 12));
		prezioaLabel.setText("Prezioa Totala:");

		label = new JLabel();
		label.setText("0.0€");

		JLabel produktuKopuruaLabel;
		produktuKopuruaLabel = new JLabel();
		produktuKopuruaLabel.setFont(new Font("", Font.BOLD, 12));
		produktuKopuruaLabel.setText("Produktu kopurua:");
		
		label_1 = new JLabel();
		label_1.setText("0");
		
		saskiaEguneratu();
		
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(zureErosketaSaskiaLabel)
					.addContainerGap(201, Short.MAX_VALUE))
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(produktuKopuruaLabel)
						.addComponent(prezioaLabel))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(label)
						.addComponent(label_1))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
					.addComponent(erosketaGauzatuButton))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(zureErosketaSaskiaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(produktuKopuruaLabel)
								.addComponent(label_1))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(label)
								.addComponent(prezioaLabel)))
						.addComponent(erosketaGauzatuButton))
					.addGap(0, 0, 0))
		);
		setLayout(groupLayout);
	}
	
	public void saskiaEguneratu(){
		panel.removeAll();
		Vector<Zapata> saskia = SaskiratutakoZapatak.getInstance().getSaskikoZapatak();
		int kont = 0;
		double prezioTotala = 0;
		for (Zapata z: saskia){
			prezioTotala += (z.getPrezioa() * SaskiratutakoZapatak.getInstance().getSaskiratutakoKopurua(z));
			kont++;
			ErosketaSaskiaItem item = new ErosketaSaskiaItem(z);
			panel.add(item);
		}
		label.setText(twoDForm.format(prezioTotala) + " €");
		label_1.setText(String.valueOf(kont));
	}

	public void prezioakEguneratu() {
		Vector<Zapata> saskia = SaskiratutakoZapatak.getInstance().getSaskikoZapatak();
		double prezioTotala = 0;
		for (Zapata z: saskia)
			prezioTotala += (z.getPrezioa() * SaskiratutakoZapatak.getInstance().getSaskiratutakoKopurua(z));
		label.setText(twoDForm.format(prezioTotala) + " €");
	}
	
	public class ErosketaSaskiaItem extends JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private Zapata z;
		private JLabel irudiaLabel;
		private JXHyperlink artikuluarenIzenaHyperlink;
		private JSpinner spinner;
		private JLabel label;		
		
		public ErosketaSaskiaItem(Zapata z) {
			super();

			this.z = z;
			
			irudiaLabel = new JLabel();
			irudiaLabel.setBackground(Color.WHITE);
			irudiaLabel.setOpaque(true);
			
			irudiaLabel.setHorizontalTextPosition(SwingConstants.CENTER);
			irudiaLabel.setBorder(new LineBorder(Color.black, 1, false));
			
			artikuluarenIzenaHyperlink = new JXHyperlink();
			artikuluarenIzenaHyperlink.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent arg0) {
					ArtikuluarenXehetasunakDialog axd = new ArtikuluarenXehetasunakDialog(ErosketaSaskiaItem.this.z);
					axd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					axd.setLocationRelativeTo(null);
					axd.setVisible(true);
				}
			});
			artikuluarenIzenaHyperlink.setFont(new Font("", Font.BOLD, 10));
			artikuluarenIzenaHyperlink.setToolTipText("Egin klik hemen artikuluaren zehaztasunak ikusteko");
			artikuluarenIzenaHyperlink.setText("Artikuluaren izena");

			JButton button;
			button = new JButton();
			button.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent arg0) {
					SaskiratutakoZapatak.getInstance().saskitikKendu(ErosketaSaskiaItem.this.z);
					ErosketaSaskiaMenuPanel.this.saskiaEguneratu();
				}
			});
			button.setToolTipText("Artikulua saskitik kendu");
			button.setIcon(SwingResourceManager.getIcon(ErosketaSaskiaItem.class, "/gkae/zapataparegabeak/resources/ikonoak/delete_item24.png"));

			JLabel kopuruaLabel;
			kopuruaLabel = new JLabel();
			kopuruaLabel.setText("Kopurua:");
			
			label = new JLabel();
			label.setText("0.0€");
			
			spinner = new JSpinner();
			spinner.addChangeListener(new ChangeListener() {
				public void stateChanged(final ChangeEvent arg0) {
					SaskiratutakoZapatak.getInstance().setKopurua(ErosketaSaskiaItem.this.z, Integer.parseInt(spinner.getValue().toString()));
					setDatuak();
					prezioakEguneratu();
				}
			});
			
			JLabel prezioTotalaLabel;
			prezioTotalaLabel = new JLabel();
			prezioTotalaLabel.setText("Prezioa:");

			JSeparator separator;
			separator = new JSeparator();
			setDatuak();
			
			final GroupLayout groupLayout = new GroupLayout((JComponent) this);
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(irudiaLabel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(artikuluarenIzenaHyperlink, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(kopuruaLabel)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(prezioTotalaLabel)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(label)))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(artikuluarenIzenaHyperlink, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(kopuruaLabel)
											.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(7, 7, 7)
										.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(prezioTotalaLabel)
											.addComponent(label)))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(button)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))))
							.addComponent(irudiaLabel, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
						.addGap(6, 6, 6)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			setLayout(groupLayout);
		}
		
		private void setDatuak(){
			artikuluarenIzenaHyperlink.setText(z.getGeneroa()+" - "+z.getKategoria()+"\n"+z.getOina()+" "+z.getNeurria());
			spinner.setValue(SaskiratutakoZapatak.getInstance().getSaskiratutakoKopurua(z));
			label.setText(twoDForm.format(z.getPrezioa() * SaskiratutakoZapatak.getInstance().getSaskiratutakoKopurua(z)) + " €");
			
			String irudi;
			if(z.isIruditxoaDu())
				irudi = "/gkae/zapataparegabeak/resources/zapatak/"+z.getIrudiPath();
			else
				irudi = "/gkae/zapataparegabeak/resources/zapatak/noimage120";
			
			ImageIcon iconOrig = SwingResourceManager.getIcon(ErosketaSaskiaItem.class, irudi);
			ImageIcon iconResized = new ImageIcon(iconOrig.getImage().getScaledInstance(67, (60*67)/120, Image.SCALE_SMOOTH));
			
			irudiaLabel.setIcon(iconResized);
		}
	}
}
