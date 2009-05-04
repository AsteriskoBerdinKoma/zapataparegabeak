package gkae.zapataparegabeak.gui.erdikoPanelak.katalogoa;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle;
import javax.swing.border.LineBorder;

import com.swtdesigner.SwingResourceManager;

public class KatalogoItemPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JComboBox comboBox;
	private JSpinner spinner;
	/**
	 * Create the panel
	 */
	public KatalogoItemPanela() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));

		JLabel label;
		label = new JLabel();
		label.setBorder(new LineBorder(Color.black, 1, false));

		JLabel modeloaKoloreaLabel;
		modeloaKoloreaLabel = new JLabel();
		modeloaKoloreaLabel.setFont(new Font("", Font.BOLD, 14));
		modeloaKoloreaLabel.setText("Generoa + Modeloa + Kolorea + Oina");

		JLabel prezioaLabel;
		prezioaLabel = new JLabel();
		prezioaLabel.setFont(new Font("", Font.BOLD, 12));
		prezioaLabel.setText("Prezioa:");

		JLabel label_1;
		label_1 = new JLabel();
		label_1.setFont(new Font("", Font.BOLD, 12));
		label_1.setText("0.0€");

		JButton button;
		button = new JButton();
		button.setIcon(SwingResourceManager.getIcon(KatalogoItemPanela.class, "/gkae/zapataparegabeak/resources/ikonoak/search_magnifier24.png"));

		JButton button_1;
		button_1 = new JButton();
		button_1.setIcon(SwingResourceManager.getIcon(KatalogoItemPanela.class, "/gkae/zapataparegabeak/resources/ikonoak/add_cart24.png"));

		JLabel stockaLabel;
		stockaLabel = new JLabel();
		stockaLabel.setText("Stocka:");

		JLabel label_2;
		label_2 = new JLabel();
		label_2.setText("10");

		JLabel kopuruaLabel;
		kopuruaLabel = new JLabel();
		kopuruaLabel.setText("| Kopurua");

		spinner = new JSpinner();
		spinner.setValue(1);

		JLabel neurriaLabel;
		neurriaLabel = new JLabel();
		neurriaLabel.setText("Neurria:");

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"36", "38", "40", "43"}));
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(stockaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(label_2)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(kopuruaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
							.addComponent(button_1)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(button))
						.addComponent(modeloaKoloreaLabel, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(prezioaLabel)
								.addComponent(neurriaLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
						.addComponent(label, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(modeloaKoloreaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(prezioaLabel)
										.addComponent(label_1))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(neurriaLabel)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(stockaLabel)
										.addComponent(label_2)
										.addComponent(kopuruaLabel)
										.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(13, 13, 13))
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_1))))
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
