package gkae.zapataparegabeak.gui.erdikoPanelak.erosi;

import gkae.zapataparegabeak.gui.erdikoPanelak.katalogoa.ArtikuluarenXehetasunak;
import gkae.zapataparegabeak.objektuak.Kudeaketa;
import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.Color;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.jdesktop.swingx.JXHyperlink;

import com.swtdesigner.SwingResourceManager;

public class ErosketaSaskiaItem extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JSpinner spinner;
	private JLabel prezioaLabel;
	private JXHyperlink artikuluarenIzenaLabel;
	private JLabel label;
	private JLabel irudiaLabel;
	private JButton saskitikEzabatuButton;
	
	private Zapata informazioa;
	private ErosiPanel jabea;
	private JLabel ezLabel;
	private JButton stockDagoeneanAbisatuButton;
	
	/**
	 * Create the panel
	 */
	public ErosketaSaskiaItem(ErosiPanel owner, Zapata zap) {
		super();
		
		this.jabea = owner;
		this.informazioa = zap;
		
		setBorder(new EtchedBorder(EtchedBorder.LOWERED));

		prezioaLabel = new JLabel();
		prezioaLabel.setText("Prezioa:");

		JLabel kantitateaLabel;
		kantitateaLabel = new JLabel();
		kantitateaLabel.setText("Kantitatea:");

		artikuluarenIzenaLabel = new JXHyperlink();
		artikuluarenIzenaLabel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				ArtikuluarenXehetasunak ax = new ArtikuluarenXehetasunak(informazioa);
			}
		});
		artikuluarenIzenaLabel.setText("Artikuluaren izena");

		label = new JLabel();
		label.setText("0.0 €");

		irudiaLabel = new JLabel();
		irudiaLabel.setForeground(Color.WHITE);
		irudiaLabel.setBackground(Color.WHITE);
		
		irudiaLabel.setIcon(SwingResourceManager.getIcon(ErosketaSaskiaItem.class, "/gkae/zapataparegabeak/resources/zapatak/noimage120.png"));
		
		saskitikEzabatuButton = new JButton();
		saskitikEzabatuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				//Saskiko zerrendatik kendu
				Kudeaketa.getInstance().zapataSaskitikKendu(informazioa);
				//Saskia eguneratu
				setInvisible();
				jabea.saskiaEguneratu();
				
			}
		});
		saskitikEzabatuButton.setIcon(SwingResourceManager.getIcon(ErosketaSaskiaItem.class, "/gkae/zapataparegabeak/resources/ikonoak/trash.png"));
		saskitikEzabatuButton.setMargin(new Insets(2, 2, 2, 4));
		saskitikEzabatuButton.setIcon(SwingResourceManager.getIcon(ErosketaSaskiaItem.class, "/gkae/zapataparegabeak/resources/trash.png"));
		saskitikEzabatuButton.setText("Saskitik Ezabatu");

		spinner = new JSpinner();
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(final ChangeEvent arg0) {
				label.setText(String.valueOf(Integer.parseInt(spinner.getValue().toString())*informazioa.getPrezioa())+" €");
			}
		});
		spinner.setValue(1);

		JLabel stockaLabel;
		stockaLabel = new JLabel();
		stockaLabel.setText("Stock-a:");

		ezLabel = new JLabel();
		ezLabel.setText("Ez");

		
		stockDagoeneanAbisatuButton = new JButton();
		stockDagoeneanAbisatuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				jabea.changeCard("stockAbisua");
			}
		});
		stockDagoeneanAbisatuButton.setText("Stock Dagoenean Abisatu");
		setDatuak(informazioa);
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10, 10, 10)
					.addComponent(irudiaLabel)
					.addGap(29, 29, 29)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(artikuluarenIzenaLabel, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(kantitateaLabel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGap(8, 8, 8)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(81, 81, 81)
							.addComponent(stockaLabel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addComponent(ezLabel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(stockDagoeneanAbisatuButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(saskitikEzabatuButton, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(prezioaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
					.addGap(39, 39, 39))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(artikuluarenIzenaLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(9, 9, 9)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(kantitateaLabel))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(2, 2, 2)
											.addComponent(stockaLabel))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(2, 2, 2)
											.addComponent(ezLabel)))
									.addGap(17, 17, 17)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(prezioaLabel)
										.addComponent(label))
									.addGap(37, 37, 37))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(stockDagoeneanAbisatuButton)
										.addComponent(saskitikEzabatuButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
									.addContainerGap())))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(irudiaLabel)
							.addContainerGap(23, Short.MAX_VALUE))))
		);
		setLayout(groupLayout);
	}
	
	public void setInvisible(){
		this.setVisible(false);
	}
	
	public void setDatuak(Zapata z){
		artikuluarenIzenaLabel.setText(z.getGeneroa()+" - "+z.getKategoria()+" "+z.getOina()+" "+z.getNeurria());
		label.setText(z.getPrezioa()+" €");
		
		ImageIcon iconOrig = SwingResourceManager.getIcon(ErosketaSaskiaItem.class, "/gkae/zapataparegabeak/resources/zapatak/"+z.getIrudiPath());
		ImageIcon iconResized = new ImageIcon(iconOrig.getImage().getScaledInstance(120, 60, Image.SCALE_SMOOTH));
		
		irudiaLabel.setIcon(iconResized);
		if (z.isStockDago()){
			ezLabel.setText(String.valueOf(z.getStocka()));
			stockDagoeneanAbisatuButton.setEnabled(false);
		} else {
			saskitikEzabatuButton.setEnabled(false);
			spinner.setEnabled(false);
			this.setEnabled(false);
		}
		informazioa = z;
	}

}
