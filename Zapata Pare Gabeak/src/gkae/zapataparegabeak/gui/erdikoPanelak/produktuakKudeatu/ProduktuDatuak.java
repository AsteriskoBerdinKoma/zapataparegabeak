package gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SpringLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import com.swtdesigner.SwingResourceManager;

public class ProduktuDatuak extends JPanel {

	private JTextField textField_12;
	private JComboBox comboBox_2;
	private JTextField textField;
	private JComboBox comboBox_1;
	private JComboBox comboBox;
	private JTextField textField_11;
	private JTextField textField_10;
	private JTextField textField_9;
	private JTextField textField_8;
	private JTextField textField_7;
	private JTextField textField_6;
	private JTextField textField_5;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_1;
	
	private String[] baiedoez = new String[]{"Bai","Ez"};
	/**
	 * Create the panel
	 */
	public ProduktuDatuak() {
		super();
		setBorder(new TitledBorder(null, "Produktuaren Datuak", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLUE));

		JLabel idLabel;
		idLabel = new JLabel();
		idLabel.setText("Id:");

		JLabel oinaLabel;
		oinaLabel = new JLabel();
		oinaLabel.setText("Oina:");

		JLabel neurriaLabel;
		neurriaLabel = new JLabel();
		neurriaLabel.setText("Neurria:");

		JLabel generoaLabel;
		generoaLabel = new JLabel();
		generoaLabel.setText("Generoa:");

		JLabel koloreaLabel;
		koloreaLabel = new JLabel();
		koloreaLabel.setText("Kolorea:");

		JLabel estiloaLabel;
		estiloaLabel = new JLabel();
		estiloaLabel.setText("Estiloa:");

		JLabel kategoriaLabel;
		kategoriaLabel = new JLabel();
		kategoriaLabel.setText("kategoria:");

		JLabel markaLabel;
		markaLabel = new JLabel();
		markaLabel.setText("Marka:");

		JLabel prezioaLabel;
		prezioaLabel = new JLabel();
		prezioaLabel.setText("Prezioa:");

		JLabel eskaintzanLabel;
		eskaintzanLabel = new JLabel();
		eskaintzanLabel.setText("Eskaintzan?:");

		JLabel eMotaLabel;
		eMotaLabel = new JLabel();
		eMotaLabel.setText("E. Mota:");

		JLabel bEhunekotanLabel;
		bEhunekotanLabel = new JLabel();
		bEhunekotanLabel.setText("B. Ehunekotan:");

		JLabel stockanLabel;
		stockanLabel = new JLabel();
		stockanLabel.setText("Stockan?:");

		JLabel zenbatLabel;
		zenbatLabel = new JLabel();
		zenbatLabel.setText("Zenbat:");

		textField_1 = new JTextField();

		textField_2 = new JTextField();

		textField_3 = new JTextField();

		textField_4 = new JTextField();

		textField_5 = new JTextField();

		textField_6 = new JTextField();

		textField_7 = new JTextField();

		textField_8 = new JTextField();

		textField_9 = new JTextField();

		textField_10 = new JTextField();

		textField_11 = new JTextField();

		comboBox = new JComboBox(baiedoez);

		comboBox_1 = new JComboBox(baiedoez);

		textField = new JTextField();

		JLabel label;
		label = new JLabel();
		label.setText("Irudia Du?:");

		comboBox_2 = new JComboBox(baiedoez);

		JLabel label_1;
		label_1 = new JLabel();
		label_1.setText("Irudi Izena:");

		textField_12 = new JTextField();

		JLabel label_2;
		label_2 = new JLabel();
		label_2.setIcon(SwingResourceManager.getIcon(ProduktuDatuak.class, "/gkae/zapataparegabeak/resources/zapatak/noimage120.png"));

		JButton atzeraButton;
		atzeraButton = new JButton();
		atzeraButton.setIcon(SwingResourceManager.getIcon(ProduktuDatuak.class, "/gkae/zapataparegabeak/resources/ikonoak/left_arrow24.png"));
		atzeraButton.setText("Atzera");

		JButton onartuButton;
		onartuButton = new JButton();
		onartuButton.setIcon(SwingResourceManager.getIcon(ProduktuDatuak.class, "/gkae/zapataparegabeak/resources/ikonoak/accept_item24.png"));
		onartuButton.setText("Onartu");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(idLabel)
						.addComponent(oinaLabel)
						.addComponent(neurriaLabel)
						.addComponent(generoaLabel)
						.addComponent(koloreaLabel)
						.addComponent(estiloaLabel)
						.addComponent(kategoriaLabel)
						.addComponent(markaLabel)
						.addComponent(prezioaLabel)
						.addComponent(eskaintzanLabel)
						.addComponent(stockanLabel))
					.addGap(24, 24, 24)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addComponent(textField_8, GroupLayout.Alignment.LEADING, 53, 53, 53)
										.addComponent(comboBox, GroupLayout.Alignment.LEADING, 0, 53, Short.MAX_VALUE)
										.addComponent(comboBox_1, GroupLayout.Alignment.LEADING, 0, 53, Short.MAX_VALUE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(eMotaLabel)
										.addComponent(zenbatLabel)
										.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
											.addComponent(bEhunekotanLabel)
											.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(label_1)
												.addComponent(label)))))
								.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
									.addComponent(textField_2, GroupLayout.Alignment.LEADING)
									.addComponent(textField_3, GroupLayout.Alignment.LEADING)
									.addComponent(textField_1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
								.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
									.addComponent(textField_7, GroupLayout.Alignment.LEADING)
									.addComponent(textField_6, GroupLayout.Alignment.LEADING)
									.addComponent(textField_5, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(31, 31, 31))
										.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
											.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
											.addComponent(textField, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
											.addComponent(textField_10, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
											.addGroup(groupLayout.createSequentialGroup()
												.addGap(12, 12, 12)
												.addComponent(atzeraButton, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(onartuButton))))
									.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
								.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addComponent(label_2)
									.addGap(38, 38, 38)))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(idLabel)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(oinaLabel)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(neurriaLabel)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(generoaLabel)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(koloreaLabel)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(estiloaLabel)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(kategoriaLabel)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(markaLabel)
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(prezioaLabel)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(19, 19, 19)
							.addComponent(label_2)))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(eskaintzanLabel)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(eMotaLabel)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(bEhunekotanLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(stockanLabel)
						.addComponent(zenbatLabel)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(atzeraButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(onartuButton)))
		);
		setLayout(groupLayout);
		//
	}

}
