package gkae.zapataparegabeak.gui.erdikoPanelak.katalogoa;

import gkae.zapataparegabeak.gui.NagusiaPanel;
import gkae.zapataparegabeak.objektuak.SaskiratutakoZapatak;
import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import com.swtdesigner.SwingResourceManager;

public class ArtikuluarenXehetasunak extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea ezDagoDeskribapenikTextArea;
	private JSpinner spinner;
	private JComboBox comboBox;
	private Zapata zapata;
	
	JLabel datumodeloaLabel;
	JLabel datuoinaLabel;
	JLabel datugeneroaLabel;
	JLabel datukategoriaLabel;
	JLabel datumaterialaLabel;
	JLabel datumarkaLabel;
	JLabel datukoloreaLabel;
	JLabel irudialabel;
	JLabel datuprezioaLabel;
	private DecimalFormat twoDForm;
	private NagusiaPanel owner;
	
	/**
	 * Create the panel
	 * @param jabea 
	 */
	public ArtikuluarenXehetasunak(Zapata zp, NagusiaPanel jabea) {
		super();
		this.zapata = zp;
		this.owner = jabea;
		
		twoDForm = new DecimalFormat("#.##");
		JLabel artikuluarenXehetasunakLabel;
		artikuluarenXehetasunakLabel = new JLabel();
		artikuluarenXehetasunakLabel.setFont(new Font("", Font.PLAIN, 18));
		artikuluarenXehetasunakLabel.setText("Produktuaren Xehetasunak");

		JSeparator separator;
		separator = new JSeparator();

		
		irudialabel = new JLabel();
		irudialabel.setIcon(SwingResourceManager.getIcon(ArtikuluarenXehetasunak.class, "/gkae/zapataparegabeak/resources/zapatak/noimage120.png"));

		JLabel modeloaLabel;
		modeloaLabel = new JLabel();
		modeloaLabel.setText("Modeloa:");

		JLabel oinaLabel;
		oinaLabel = new JLabel();
		oinaLabel.setText("Oina:");

		JLabel generoaLabel;
		generoaLabel = new JLabel();
		generoaLabel.setText("Generoa:");

		JLabel kategoriaLabel;
		kategoriaLabel = new JLabel();
		kategoriaLabel.setText("Kategoria:");

		JLabel materialaLabel;
		materialaLabel = new JLabel();
		materialaLabel.setText("Materiala:");

		JLabel markaLabel;
		markaLabel = new JLabel();
		markaLabel.setText("Marka:");

		JLabel neurriaLabel;
		neurriaLabel = new JLabel();
		neurriaLabel.setText("Neurria:");

		comboBox = new JComboBox(new String[]{"38","40","42","43.5","46"});

		
		datumodeloaLabel = new JLabel();
		datumodeloaLabel.setText("datuModeloa");

		
		datuoinaLabel = new JLabel();
		datuoinaLabel.setText("datuOina");

		
		datugeneroaLabel = new JLabel();
		datugeneroaLabel.setText("datuGeneroa");

		
		datukategoriaLabel = new JLabel();
		datukategoriaLabel.setText("datuKategoria");

		
		datumaterialaLabel = new JLabel();
		datumaterialaLabel.setText("datuMateriala");

		
		datumarkaLabel = new JLabel();
		datumarkaLabel.setText("datuMarka");

		JLabel koloreaLabel;
		koloreaLabel = new JLabel();
		koloreaLabel.setText("Kolorea:");

		
		datukoloreaLabel = new JLabel();
		datukoloreaLabel.setText("datuKolorea");

		JLabel kopuruaLabel;
		kopuruaLabel = new JLabel();
		kopuruaLabel.setText("Kopurua:");

		spinner = new JSpinner();
		spinner.setToolTipText("Erosketa saskira sartu nahi duzun kopurua zehaztu");
		spinner.setValue(1);

		JButton saskiraGehituButton;
		saskiraGehituButton = new JButton();
		saskiraGehituButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				//Zapata hau saskira gehitu
				SaskiratutakoZapatak.getInstance().saskiraGehitu(zapata,Integer.parseInt(spinner.getValue().toString()));
				//Eskubiko menua eguneratu
				owner.saskiaEguneratu();
			}
		});
		saskiraGehituButton.setMargin(new Insets(2, 4, 2, 14));
		saskiraGehituButton.setIcon(SwingResourceManager.getIcon(ArtikuluarenXehetasunak.class, "/gkae/zapataparegabeak/resources/ikonoak/add_cart24.png"));
		saskiraGehituButton.setText("Saskira Gehitu");

		JLabel produktuarenDeskribapenaLabel;
		produktuarenDeskribapenaLabel = new JLabel();
		produktuarenDeskribapenaLabel.setText("Produktuaren Deskribapena:");

		ezDagoDeskribapenikTextArea = new JTextArea();
		ezDagoDeskribapenikTextArea.setText("Ez dago deskribapenik.");
		ezDagoDeskribapenikTextArea.setWrapStyleWord(true);
		ezDagoDeskribapenikTextArea.setLineWrap(true);
		ezDagoDeskribapenikTextArea.setEditable(false);
		ezDagoDeskribapenikTextArea.setBorder(new LineBorder(Color.black, 1, false));
		ezDagoDeskribapenikTextArea.setBackground(UIManager.getColor("Button.background"));

		JLabel prezioaLabel;
		prezioaLabel = new JLabel();
		prezioaLabel.setText("Prezioa:");

		
		datuprezioaLabel = new JLabel();
		datuprezioaLabel.setText("datuPrezioa");
		//
		
		setDatuak();
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(ezDagoDeskribapenikTextArea, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
						.addComponent(artikuluarenXehetasunakLabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(irudialabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(materialaLabel)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(generoaLabel)
										.addComponent(modeloaLabel)
										.addComponent(markaLabel)
										.addComponent(oinaLabel)
										.addComponent(koloreaLabel)
										.addComponent(kategoriaLabel)
										.addComponent(prezioaLabel))
									.addGap(18, 18, 18)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(datuprezioaLabel)
										.addComponent(datugeneroaLabel)
										.addComponent(datumodeloaLabel)
										.addComponent(datuoinaLabel)
										.addComponent(datumaterialaLabel)
										.addComponent(datukategoriaLabel)
										.addComponent(datumarkaLabel)
										.addComponent(datukoloreaLabel))))
							.addGap(170, 170, 170))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(neurriaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(kopuruaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
							.addComponent(saskiraGehituButton))
						.addComponent(produktuarenDeskribapenaLabel))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(artikuluarenXehetasunakLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(irudialabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(modeloaLabel)
								.addComponent(datumodeloaLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(oinaLabel)
								.addComponent(datuoinaLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(generoaLabel)
								.addComponent(datugeneroaLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(kategoriaLabel)
								.addComponent(datukategoriaLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(materialaLabel)
								.addComponent(datumaterialaLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(markaLabel)
								.addComponent(datumarkaLabel))))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(koloreaLabel)
						.addComponent(datukoloreaLabel))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(prezioaLabel)
						.addComponent(datuprezioaLabel))
					.addGap(24, 24, 24)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(neurriaLabel)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(kopuruaLabel)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(saskiraGehituButton))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(produktuarenDeskribapenaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(ezDagoDeskribapenikTextArea, GroupLayout.PREFERRED_SIZE, 140, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
	}
	
	public void setDatuak(){
		datugeneroaLabel.setText(zapata.getGeneroa());
		datukategoriaLabel.setText(zapata.getKategoria());
		datukoloreaLabel.setText(zapata.getKolorea());
		datumarkaLabel.setText(zapata.getMarka());
		datumaterialaLabel.setText(zapata.getEstiloa());
		datumodeloaLabel.setText("Modelo Generikoa");
		datuoinaLabel.setText(zapata.getOina());
		if(zapata.isEskaintzanDago()){
			double beherapena = zapata.getPrezioa()*(zapata.getBeherapenEhuneko()/100.0);
			double prezioBeheratua = zapata.getPrezioa() - beherapena;
			datuprezioaLabel.setText("%"+zapata.getBeherapenEhuneko()+" beherapena: "+twoDForm.format(prezioBeheratua)+"€");
		} else {
			datuprezioaLabel.setText(twoDForm.format(zapata.getPrezioa())+"€");
		}
		
		ImageIcon iconOrig = SwingResourceManager.getIcon(ArtikuluarenXehetasunak.class, "/gkae/zapataparegabeak/resources/zapatak/"+zapata.getIrudiPath());
		ImageIcon iconResized = new ImageIcon(iconOrig.getImage().getScaledInstance(120, 60, Image.SCALE_SMOOTH));
		irudialabel.setIcon(iconResized);	
	}

}
