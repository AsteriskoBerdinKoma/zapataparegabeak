package gkae.zapataparegabeak.gui.erdikoPanelak.erosi;

import gkae.zapataparegabeak.gui.NagusiaPanel;
import gkae.zapataparegabeak.gui.erdikoPanelak.katalogoa.ArtikuluarenXehetasunakDialog;
import gkae.zapataparegabeak.objektuak.Kudeaketa;
import gkae.zapataparegabeak.objektuak.SaskiratutakoZapatak;
import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
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
	
	private DecimalFormat twoDForm;
	private NagusiaPanel superowner;
	
	public float prezioa;
	
	/**
	 * Create the panel
	 * @param superjabea 
	 */
	public ErosketaSaskiaItem(ErosiPanel owner, Zapata zap, NagusiaPanel superjabea) {
		super();
		setMinimumSize(new Dimension(300, 160));
		setMaximumSize(new Dimension(1600, 160));
		
		this.jabea = owner;
		this.superowner = superjabea;
		this.informazioa = zap;
		twoDForm = new DecimalFormat("#.##");
		
		setBorder(new EtchedBorder(EtchedBorder.LOWERED));

		prezioaLabel = new JLabel();
		prezioaLabel.setText("Prezioa:");

		JLabel kantitateaLabel;
		kantitateaLabel = new JLabel();
		kantitateaLabel.setText("Kopurua:");

		artikuluarenIzenaLabel = new JXHyperlink();
		artikuluarenIzenaLabel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				ArtikuluarenXehetasunakDialog ax = new ArtikuluarenXehetasunakDialog(informazioa,superowner);
				ax.setVisible(true);
				ax.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				ax.setLocationRelativeTo(null);
			}
		});
		artikuluarenIzenaLabel.setText("Artikuluaren izena");

		label = new JLabel();
		label.setText("0.0 €");

		irudiaLabel = new JLabel();
		irudiaLabel.setBorder(new LineBorder(Color.black, 1, false));
		irudiaLabel.setOpaque(true);
		irudiaLabel.setPreferredSize(new Dimension(120, 120));
		irudiaLabel.setIconTextGap(0);
		irudiaLabel.setForeground(Color.WHITE);
		irudiaLabel.setBackground(Color.WHITE);
		
		irudiaLabel.setIcon(SwingResourceManager.getIcon(ErosketaSaskiaItem.class, "/gkae/zapataparegabeak/resources/zapatak/noimage120.png"));
		
		saskitikEzabatuButton = new JButton();
		saskitikEzabatuButton.setIcon(SwingResourceManager.getIcon(ErosketaSaskiaItem.class, "/gkae/zapataparegabeak/resources/ikonoak/delete_cart24.png"));
		saskitikEzabatuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				//Saskiko zerrendatik kendu
				Kudeaketa.getInstance().zapataSaskitikKendu(informazioa);
				//Saskia eguneratu
				setInvisible();
				jabea.saskiaEguneratu();
				
			}
		});
		saskitikEzabatuButton.setMargin(new Insets(2, 4, 2, 4));
		saskitikEzabatuButton.setText("Saskitik Ezabatu");

		spinner = new JSpinner();
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(final ChangeEvent arg0) {
				label.setText(String.valueOf(Integer.parseInt(spinner.getValue().toString())*informazioa.getPrezioa())+" €");
				prezioa = Integer.parseInt(spinner.getValue().toString())*informazioa.getPrezioa();
				jabea.prezioTotalaEguneratu();
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
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(irudiaLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(artikuluarenIzenaLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(kantitateaLabel)
										.addComponent(prezioaLabel)
										.addComponent(stockaLabel))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(ezLabel)
										.addComponent(label)
										.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addContainerGap(324, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(stockDagoeneanAbisatuButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(saskitikEzabatuButton)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(artikuluarenIzenaLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(kantitateaLabel)
								.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(prezioaLabel)
								.addComponent(label))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(stockaLabel)
								.addComponent(ezLabel)))
						.addComponent(irudiaLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(35, Short.MAX_VALUE))
				.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(121, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(saskitikEzabatuButton)
						.addComponent(stockDagoeneanAbisatuButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		setLayout(groupLayout);
	}
	
	public void setInvisible(){
		this.setVisible(false);
	}
	
	public void setDatuak(Zapata z){
		artikuluarenIzenaLabel.setText(z.getGeneroa()+" - "+z.getKategoria()+" "+z.getOina()+" "+z.getNeurria());
		spinner.setValue(SaskiratutakoZapatak.getInstance().getSaskiratutakoKopurua(z));
		if(z.isStockDago()){
			label.setText(twoDForm.format(z.getPrezioa() * SaskiratutakoZapatak.getInstance().getSaskiratutakoKopurua(z)) + " €");
			prezioa = 0.0f;
		}else{
			label.setText("0.0€");
			prezioa = z.getPrezioa() * SaskiratutakoZapatak.getInstance().getSaskiratutakoKopurua(z);
		}
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
