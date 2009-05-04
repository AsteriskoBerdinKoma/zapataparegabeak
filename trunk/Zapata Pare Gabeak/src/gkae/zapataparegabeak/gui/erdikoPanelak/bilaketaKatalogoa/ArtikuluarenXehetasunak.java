package gkae.zapataparegabeak.gui.erdikoPanelak.bilaketaKatalogoa;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import com.swtdesigner.SwingResourceManager;

public class ArtikuluarenXehetasunak extends JPanel {

	private JTextArea ezDagoDeskribapenikTextArea;
	private JSpinner spinner;
	private JComboBox comboBox;
	/**
	 * Create the panel
	 */
	public ArtikuluarenXehetasunak() {
		super();

		JLabel artikuluarenXehetasunakLabel;
		artikuluarenXehetasunakLabel = new JLabel();
		artikuluarenXehetasunakLabel.setFont(new Font("", Font.PLAIN, 18));
		artikuluarenXehetasunakLabel.setText("Produktuaren Xehetasunak");

		JSeparator separator;
		separator = new JSeparator();

		JLabel label;
		label = new JLabel();
		label.setIcon(SwingResourceManager.getIcon(ArtikuluarenXehetasunak.class, "/gkae/zapataparegabeak/resources/zapatak/noimage120.png"));

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

		comboBox = new JComboBox();

		JLabel datumodeloaLabel;
		datumodeloaLabel = new JLabel();
		datumodeloaLabel.setText("datuModeloa");

		JLabel datuoinaLabel;
		datuoinaLabel = new JLabel();
		datuoinaLabel.setText("datuOina");

		JLabel datugeneroaLabel;
		datugeneroaLabel = new JLabel();
		datugeneroaLabel.setText("datuGeneroa");

		JLabel datukategoriaLabel;
		datukategoriaLabel = new JLabel();
		datukategoriaLabel.setText("datuKategoria");

		JLabel datumaterialaLabel;
		datumaterialaLabel = new JLabel();
		datumaterialaLabel.setText("datuMateriala");

		JLabel datumarkaLabel;
		datumarkaLabel = new JLabel();
		datumarkaLabel.setText("datuMarka");

		JLabel koloreaLabel;
		koloreaLabel = new JLabel();
		koloreaLabel.setText("Kolorea:");

		JLabel datukoloreaLabel;
		datukoloreaLabel = new JLabel();
		datukoloreaLabel.setText("datuKolorea");

		JLabel kopuruaLabel;
		kopuruaLabel = new JLabel();
		kopuruaLabel.setText("Kopurua:");

		spinner = new JSpinner();
		spinner.setValue(1);

		JButton saskiraGehituButton;
		saskiraGehituButton = new JButton();
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
							.addComponent(label)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(materialaLabel)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(generoaLabel)
											.addGap(13, 13, 13))
										.addComponent(modeloaLabel)
										.addComponent(markaLabel)
										.addComponent(oinaLabel)
										.addComponent(koloreaLabel)
										.addComponent(kategoriaLabel))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(12, 12, 12)
											.addComponent(datugeneroaLabel))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(12, 12, 12)
											.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(datumodeloaLabel)
												.addComponent(datuoinaLabel)))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(12, 12, 12)
											.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(datumaterialaLabel)
												.addComponent(datukategoriaLabel)
												.addComponent(datumarkaLabel)
												.addComponent(datukoloreaLabel))))))
							.addGap(170, 170, 170))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(neurriaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(kopuruaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
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
						.addComponent(label)
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
					.addGap(46, 46, 46)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(neurriaLabel)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(kopuruaLabel)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(saskiraGehituButton))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(produktuarenDeskribapenaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(ezDagoDeskribapenikTextArea, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
