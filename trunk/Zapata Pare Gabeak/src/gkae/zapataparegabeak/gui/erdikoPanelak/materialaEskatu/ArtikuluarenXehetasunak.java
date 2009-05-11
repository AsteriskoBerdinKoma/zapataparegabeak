package gkae.zapataparegabeak.gui.erdikoPanelak.materialaEskatu;

import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.text.DecimalFormat;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
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
	private Zapata zp;
	
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
	
	/**
	 * Create the panel
	 */
	public ArtikuluarenXehetasunak(Zapata zp) {
		super();
		this.zp = zp;
		
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
					.addGap(46, 46, 46)
					.addComponent(produktuarenDeskribapenaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(ezDagoDeskribapenikTextArea, GroupLayout.PREFERRED_SIZE, 140, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
	}
	
	public void setDatuak(){
		datugeneroaLabel.setText(zp.getGeneroa());
		datukategoriaLabel.setText(zp.getKategoria());
		datukoloreaLabel.setText(zp.getKolorea());
		datumarkaLabel.setText(zp.getMarka());
		datumaterialaLabel.setText(zp.getEstiloa());
		datumodeloaLabel.setText("Modelo Generikoa");
		datuoinaLabel.setText(zp.getOina());
		if(zp.isEskaintzanDago()){
			double beherapena = zp.getPrezioa()*(zp.getBeherapenEhuneko()/100.0);
			double prezioBeheratua = zp.getPrezioa() - beherapena;
			datuprezioaLabel.setText("%"+zp.getBeherapenEhuneko()+" beherapena: "+twoDForm.format(prezioBeheratua)+"€");
		} else {
			datuprezioaLabel.setText(twoDForm.format(zp.getPrezioa())+"€");
		}
		
		ImageIcon iconOrig = SwingResourceManager.getIcon(ArtikuluarenXehetasunak.class, "/gkae/zapataparegabeak/resources/zapatak/"+zp.getIrudiPath());
		ImageIcon iconResized = new ImageIcon(iconOrig.getImage().getScaledInstance(120, 60, Image.SCALE_SMOOTH));
		irudialabel.setIcon(iconResized);	
	}

}
