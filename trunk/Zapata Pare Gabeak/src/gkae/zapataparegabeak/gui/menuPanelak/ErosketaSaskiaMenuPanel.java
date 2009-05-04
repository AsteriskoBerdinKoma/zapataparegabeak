package gkae.zapataparegabeak.gui.menuPanelak;

import gkae.zapataparegabeak.objektuak.SaskiratutakoZapatak;
import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.text.DecimalFormat;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

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

	/**
	 * Create the panel
	 */
	public ErosketaSaskiaMenuPanel() {
		super();
		
		setBorder(new TitledBorder(null, "Erosketa Saskia", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

		JButton erosketaGauzatuButton;
		erosketaGauzatuButton = new JButton();
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
		label.setFont(new Font("", Font.BOLD, 12));
		label.setText("0.0�");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(zureErosketaSaskiaLabel)
					.addContainerGap(299, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(prezioaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(label)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
					.addComponent(erosketaGauzatuButton))
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(zureErosketaSaskiaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(prezioaLabel)
						.addComponent(label)
						.addComponent(erosketaGauzatuButton))
					.addContainerGap())
		);
		setLayout(groupLayout);
		saskiaEguneratu();
	}
	
	public void saskiaEguneratu(){
		Vector<Zapata> saskia = SaskiratutakoZapatak.getInstance().getSaskikoZapatak();
		double prezioTotala = 0;
		for (Zapata z: saskia){
			prezioTotala += z.getPrezioa();
			ErosketaSaskiaItem item = new ErosketaSaskiaItem(z);
			panel.add(item);
		}		
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		//Double.valueOf(twoDForm.format(prezioTotala));

		label.setText(twoDForm.format(prezioTotala) + " �");
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
			
			irudiaLabel.setHorizontalTextPosition(SwingConstants.CENTER);
			irudiaLabel.setBorder(new LineBorder(Color.black, 1, false));
			
			artikuluarenIzenaHyperlink = new JXHyperlink();
			artikuluarenIzenaHyperlink.setFont(new Font("", Font.BOLD, 10));
			artikuluarenIzenaHyperlink.setToolTipText("Egin klik hemen artikuluaren zehaztasunak ikusteko");
			artikuluarenIzenaHyperlink.setText("Artikuluaren izena");

			JButton button;
			button = new JButton();
			button.setToolTipText("Artikulua saskitik kendu");
			button.setIcon(SwingResourceManager.getIcon(ErosketaSaskiaItem.class, "/gkae/zapataparegabeak/resources/ikonoak/delete_item24.png"));

			JLabel kopuruaLabel;
			kopuruaLabel = new JLabel();
			kopuruaLabel.setText("Kopurua:");

			spinner = new JSpinner();
			spinner.setValue(1);

			JLabel prezioTotalaLabel;
			prezioTotalaLabel = new JLabel();
			prezioTotalaLabel.setText("Prezioa:");

			label = new JLabel();
			label.setText("0.0�");

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
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
							.addComponent(artikuluarenIzenaHyperlink, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
						.addContainerGap())
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
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
											.addComponent(label))
										.addGap(3, 3, 3))
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
			label.setText(z.getPrezioa() + " �");
			
			String irudi;
			if(z.isIruditxoaDu())
				irudi = "/gkae/zapataparegabeak/resources/zapatak/"+z.getIrudiPath();
			else
				irudi = "/gkae/zapataparegabeak/resources/zapatak/noimage120";
			
			ImageIcon iconOrig = SwingResourceManager.getIcon(ErosketaSaskiaItem.class, irudi);
			ImageIcon iconResized = new ImageIcon(iconOrig.getImage().getScaledInstance(67, 61, Image.SCALE_SMOOTH));
			
			irudiaLabel.setIcon(iconResized);
		}
	}
}
