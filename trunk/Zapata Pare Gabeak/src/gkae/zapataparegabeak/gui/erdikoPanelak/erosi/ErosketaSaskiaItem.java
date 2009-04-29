package gkae.zapataparegabeak.gui.erdikoPanelak.erosi;

import gkae.zapataparegabeak.objektuak.Kudeaketa;
import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle;
import javax.swing.border.EtchedBorder;

import com.swtdesigner.SwingResourceManager;

public class ErosketaSaskiaItem extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JSpinner spinner;
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

		prezioaLabel = new JLabel();
		prezioaLabel.setText("Prezioa:");

		JLabel kantitateaLabel;
		kantitateaLabel = new JLabel();
		kantitateaLabel.setText("Kantitatea:");

		artikuluarenIzenaLabel = new JLabel();
		artikuluarenIzenaLabel.setText("Artikuluaren izena");

		label = new JLabel();
		label.setText("0.0 �");

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
				//saskiEguneraketa();	
			}
		});
		saskitikEzabatuButton.setIcon(SwingResourceManager.getIcon(ErosketaSaskiaItem.class, "/gkae/zapataparegabeak/resources/ikonoak/trash.png"));
		saskitikEzabatuButton.setMargin(new Insets(2, 2, 2, 4));
		saskitikEzabatuButton.setIcon(SwingResourceManager.getIcon(ErosketaSaskiaItem.class, "/gkae/zapataparegabeak/resources/trash.png"));
		saskitikEzabatuButton.setText("Saskitik Ezabatu");

		spinner = new JSpinner();
		spinner.setValue(1);

		JLabel stockaLabel;
		stockaLabel = new JLabel();
		stockaLabel.setText("Stock-a:");

		JLabel ezLabel;
		ezLabel = new JLabel();
		ezLabel.setText("Ez");

		JButton stockDagoeneanAbisatuButton;
		stockDagoeneanAbisatuButton = new JButton();
		stockDagoeneanAbisatuButton.setText("Stock Dagoenean Abisatu");
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
						.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(stockDagoeneanAbisatuButton)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(saskitikEzabatuButton, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(prezioaLabel)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
								.addGap(243, 243, 243)))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(artikuluarenIzenaLabel)
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
										.addComponent(label)
										.addComponent(prezioaLabel))
									.addGap(37, 37, 37))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(saskitikEzabatuButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
										.addComponent(stockDagoeneanAbisatuButton))
									.addContainerGap())))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(irudiaLabel)
							.addContainerGap(19, Short.MAX_VALUE))))
		);
		setLayout(groupLayout);

	}
	
	public void setDatuak(Zapata z){
		artikuluarenIzenaLabel.setText(z.getGeneroa()+" - "+z.getKategoria()+" "+z.getOina()+" "+z.getNeurria());
		label.setText(z.getPrezioa()-z.getPrezioa()*100/z.getBeherapenEhuneko()+" €");
		irudiaLabel.setIcon(SwingResourceManager.getIcon(ErosketaSaskiaItem.class, "/gkae/zapataparegabeak/resources/zapatak/"+z.getIrudiPath()));
		
		informazioa = z;
	}
	
//	private void saskiEguneraketa(){
//		Kudeaketa.getInstance().saskiaEguneratu(this);
//	}

}
