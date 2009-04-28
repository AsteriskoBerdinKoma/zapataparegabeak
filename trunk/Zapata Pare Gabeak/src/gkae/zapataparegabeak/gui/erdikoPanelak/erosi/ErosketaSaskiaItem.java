package gkae.zapataparegabeak.gui.erdikoPanelak.erosi;

import gkae.zapataparegabeak.objektuak.Kudeaketa;
import gkae.zapataparegabeak.objektuak.SaskiratutakoZapatak;
import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpringLayout;
import javax.swing.border.EtchedBorder;

import com.swtdesigner.SwingResourceManager;

public class ErosketaSaskiaItem extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JSpinner spinner;
	private SpringLayout springLayout;
	private JLabel prezioaLabel;
	private JLabel artikuluarenIzenaLabel;
	private JLabel label;
	private JLabel irudiaLabel;
	private JButton saskitikEzabatuButton;
	
	private Zapata informazioa;
	
	/**
	 * Create the panel
	 */
	public ErosketaSaskiaItem() {
		super();
		setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		springLayout = new SpringLayout();
		setLayout(springLayout);

		prezioaLabel = new JLabel();
		prezioaLabel.setText("Prezioa:");
		add(prezioaLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, prezioaLabel, 95, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, prezioaLabel, 80, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, prezioaLabel, 213, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, prezioaLabel, 165, SpringLayout.WEST, this);

		final JLabel kantitateaLabel = new JLabel();
		kantitateaLabel.setText("Kantitatea:");
		add(kantitateaLabel);
		springLayout.putConstraint(SpringLayout.EAST, kantitateaLabel, 240, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, kantitateaLabel, 165, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, kantitateaLabel, 60, SpringLayout.NORTH, this);

		artikuluarenIzenaLabel = new JLabel();
		artikuluarenIzenaLabel.setText("Artikuluaren izena");
		add(artikuluarenIzenaLabel);

		label = new JLabel();
		label.setText("0.0 €");
		add(label);
		springLayout.putConstraint(SpringLayout.EAST, label, 75, SpringLayout.EAST, prezioaLabel);
		springLayout.putConstraint(SpringLayout.WEST, label, 5, SpringLayout.EAST, prezioaLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, label, 95, SpringLayout.NORTH, this);

		irudiaLabel = new JLabel();
		irudiaLabel.setForeground(Color.WHITE);
		irudiaLabel.setBackground(Color.WHITE);
		irudiaLabel.setIcon(SwingResourceManager.getIcon(ErosketaSaskiaItem.class, "/gkae/zapataparegabeak/resources/zapatak/noimage120.png"));
		add(irudiaLabel);
		springLayout.putConstraint(SpringLayout.EAST, irudiaLabel, 138, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, irudiaLabel, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, artikuluarenIzenaLabel, 36, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, artikuluarenIzenaLabel, 0, SpringLayout.NORTH, irudiaLabel);
		springLayout.putConstraint(SpringLayout.EAST, artikuluarenIzenaLabel, 310, SpringLayout.EAST, irudiaLabel);
		springLayout.putConstraint(SpringLayout.WEST, artikuluarenIzenaLabel, 5, SpringLayout.EAST, irudiaLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, irudiaLabel, 125, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, irudiaLabel, 5, SpringLayout.NORTH, this);

		saskitikEzabatuButton = new JButton();
		saskitikEzabatuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				//Saskiko zerrendatik kendu
				Kudeaketa.getInstance().zapataSaskitikKendu(informazioa);
				//Saskia eguneratu
				saskiEguneraketa();	
			}
		});
		saskitikEzabatuButton.setIcon(SwingResourceManager.getIcon(ErosketaSaskiaItem.class, "/gkae/zapataparegabeak/resources/ikonoak/trash.png"));
		saskitikEzabatuButton.setMargin(new Insets(2, 2, 2, 4));
		saskitikEzabatuButton.setIcon(SwingResourceManager.getIcon(ErosketaSaskiaItem.class, "/gkae/zapataparegabeak/resources/trash.png"));
		saskitikEzabatuButton.setText("Saskitik Ezabatu");
		add(saskitikEzabatuButton);
		springLayout.putConstraint(SpringLayout.EAST, saskitikEzabatuButton, -7, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, saskitikEzabatuButton, -172, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, saskitikEzabatuButton, -8, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, saskitikEzabatuButton, -33, SpringLayout.SOUTH, this);

		spinner = new JSpinner();
		spinner.setValue(1);
		add(spinner);
		springLayout.putConstraint(SpringLayout.EAST, spinner, 285, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, spinner, 250, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, spinner, 43, SpringLayout.NORTH, this);

		final JLabel stockaLabel = new JLabel();
		stockaLabel.setText("Stock-a:");
		add(stockaLabel);
		springLayout.putConstraint(SpringLayout.EAST, stockaLabel, 54, SpringLayout.WEST, saskitikEzabatuButton);
		springLayout.putConstraint(SpringLayout.WEST, stockaLabel, 0, SpringLayout.WEST, saskitikEzabatuButton);
		springLayout.putConstraint(SpringLayout.NORTH, stockaLabel, 45, SpringLayout.NORTH, this);

		final JLabel ezLabel = new JLabel();
		ezLabel.setText("Ez");
		add(ezLabel);
		springLayout.putConstraint(SpringLayout.EAST, ezLabel, 54, SpringLayout.EAST, stockaLabel);
		springLayout.putConstraint(SpringLayout.WEST, ezLabel, 0, SpringLayout.EAST, stockaLabel);
		springLayout.putConstraint(SpringLayout.NORTH, ezLabel, 45, SpringLayout.NORTH, this);

		final JButton stockDagoeneanAbisatuButton = new JButton();
		stockDagoeneanAbisatuButton.setText("Stock Dagoenean Abisatu");
		add(stockDagoeneanAbisatuButton);
		springLayout.putConstraint(SpringLayout.EAST, stockDagoeneanAbisatuButton, 0, SpringLayout.EAST, saskitikEzabatuButton);
		springLayout.putConstraint(SpringLayout.WEST, stockDagoeneanAbisatuButton, 360, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, stockDagoeneanAbisatuButton, 76, SpringLayout.NORTH, this);

	}
	
	public void setDatuak(Zapata z){
		artikuluarenIzenaLabel.setText(z.getGeneroa()+" - "+z.getKategoria()+" "+z.getOina()+" "+z.getNeurria());
		label.setText(z.getPrezioa()-z.getPrezioa()*100/z.getBeherapenEhuneko()+" â‚¬");
		irudiaLabel.setIcon(SwingResourceManager.getIcon(ErosketaSaskiaItem.class, "/gkae/zapataparegabeak/resources/zapatak/"+z.getIrudiPath()));
		
		informazioa = z;
	}
	
	private void saskiEguneraketa(){
		Kudeaketa.getInstance().saskiaEguneratu(this);
	}

}
