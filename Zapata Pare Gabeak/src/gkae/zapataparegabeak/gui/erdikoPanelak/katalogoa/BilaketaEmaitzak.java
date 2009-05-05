package gkae.zapataparegabeak.gui.erdikoPanelak.katalogoa;

import gkae.zapataparegabeak.gui.erdikoPanelak.erosi.ErosketaSaskiaItem;
import gkae.zapataparegabeak.objektuak.Kudeaketa;
import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import com.swtdesigner.SwingResourceManager;

public class BilaketaEmaitzak extends JPanel {

	private JComboBox comboBox_4;
	private JComboBox comboBox_2;
	private JComboBox comboBox_1;
	private JComboBox comboBox;
	
	final JPanel resultPanel;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel
	 */
	public BilaketaEmaitzak() {
		super();

		JLabel bilaketarenEmaitzakLabel;
		bilaketarenEmaitzakLabel = new JLabel();
		bilaketarenEmaitzakLabel.setFont(new Font("", Font.PLAIN, 18));
		bilaketarenEmaitzakLabel.setText("Bilaketaren Emaitzak");

		JSeparator separator;
		separator = new JSeparator();

		JLabel label;
		label = new JLabel();
		label.setText("2 artikulu kointzidente aurkitu dira.");

		JLabel emaitzenIragazketaLabel;
		emaitzenIragazketaLabel = new JLabel();
		emaitzenIragazketaLabel.setText("Emaitzen Iragazketa:");

		comboBox = new JComboBox(new String[]{"Oina:","Ezkerrekoa","Eskubikoa"});

		comboBox_1 = new JComboBox(new String[]{"Marka:","Adidas","Brooks","Nike","Gucci","John Smith","Reef","Puma","Manolo Blànik"});

		comboBox_2 = new JComboBox(new String[]{"Materiala:","Larrua","Sintetikoa","Plastikoa","Goma","Egurra","Espartoa","Belusa"});

		JLabel erabilitakoIragazkiakLabel;
		erabilitakoIragazkiakLabel = new JLabel();
		erabilitakoIragazkiakLabel.setText("Erabilitako Iragazkiak:");

		JLabel kategoriaLabel;
		kategoriaLabel = new JLabel();
		kategoriaLabel.setText("Kategoria:");

		comboBox_4 = new JComboBox(new String[]{"Kategoria:","Botak","Korritzeko Zapatak","Mendiko Zapatak","Sandaliak","Alpargatak","Abarkak","Kaleko Zapatak","Takoiak","Plataformak"});

		JLabel oinaEzkerrekoaLabel;
		oinaEzkerrekoaLabel = new JLabel();
		oinaEzkerrekoaLabel.setText("Oina:");

		JScrollPane scrollPane;
		scrollPane = new JScrollPane();

		resultPanel = new JPanel();
		resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.Y_AXIS));
		scrollPane.setViewportView(resultPanel);

		JButton korritzekoZapatakButton;
		korritzekoZapatakButton = new JButton();
		korritzekoZapatakButton.setMargin(new Insets(2, 2, 2, 2));
		
		ImageIcon iconOrig = SwingResourceManager.getIcon(ErosketaSaskiaItem.class, "/gkae/zapataparegabeak/resources/ikonoak/delete_item24.png");
		ImageIcon iconResized = new ImageIcon(iconOrig.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH));
		
		
		korritzekoZapatakButton.setIcon(iconResized);
		korritzekoZapatakButton.setHorizontalAlignment(SwingConstants.LEFT);
		korritzekoZapatakButton.setHorizontalTextPosition(SwingConstants.LEADING);
		korritzekoZapatakButton.setText("Korritzeko Zapatak");

		JButton korritzekoZapatakButton_1;
		korritzekoZapatakButton_1 = new JButton();
		korritzekoZapatakButton_1.setMargin(new Insets(2, 2, 2, 2));
		korritzekoZapatakButton_1.setHorizontalTextPosition(SwingConstants.LEADING);
		korritzekoZapatakButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		korritzekoZapatakButton_1.setText("Ezkerrekoa");
		korritzekoZapatakButton_1.setIcon(iconResized);
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
						.addComponent(bilaketarenEmaitzakLabel)
						.addComponent(label)
						.addComponent(emaitzenIragazketaLabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(12, 12, 12)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(12, 12, 12)
							.addComponent(kategoriaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(korritzekoZapatakButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(oinaEzkerrekoaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(korritzekoZapatakButton_1))
						.addComponent(erabilitakoIragazkiakLabel))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(bilaketarenEmaitzakLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(label)
					.addGap(26, 26, 26)
					.addComponent(emaitzenIragazketaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addComponent(erabilitakoIragazkiakLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(kategoriaLabel)
						.addComponent(korritzekoZapatakButton, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(oinaEzkerrekoaLabel)
						.addComponent(korritzekoZapatakButton_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}
	
	public void emaitzakEguneratu() {
		resultPanel.removeAll();
		for(Zapata z: Kudeaketa.getInstance().katalogokoZapatak()){
			resultPanel.add(new KatalogoItemPanela(z));
		}
		
	}

}
