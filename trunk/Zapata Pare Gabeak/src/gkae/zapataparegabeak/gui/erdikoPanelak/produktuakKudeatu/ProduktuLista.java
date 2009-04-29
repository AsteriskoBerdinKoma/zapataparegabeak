package gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import com.swtdesigner.SwingResourceManager;
import gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu.ProduktuDatuak;

public class ProduktuLista extends JPanel {

	private JTextField estiloa;
	private JTextField generoa;
	private JTextField marka;
	private JTextField kategoria;
	private JTextField Id;
	private JList list;
	private JTextField textField;
	private JComboBox comboBox;
	/**
	 * Create the panel
	 */
	public ProduktuLista() {
		super();

		JLabel produktueLabel;
		produktueLabel = new JLabel();
		produktueLabel.setText("Produktuen Kudeaketa");

		comboBox = new JComboBox();

		JLabel motaLabel;
		motaLabel = new JLabel();
		motaLabel.setText("Mota:");

		textField = new JTextField();

		JButton bilatuButton;
		bilatuButton = new JButton();
		bilatuButton.setIcon(SwingResourceManager.getIcon(ProduktuLista.class, "/gkae/zapataparegabeak/resources/ikonoak/search_magnifier24.png"));
		bilatuButton.setText("Bilatu");

		list = new JList();
		list.setBorder(new TitledBorder(null, "Produktuen Lista", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLUE));

		JButton atzeraButton;
		atzeraButton = new JButton();
		atzeraButton.setIcon(SwingResourceManager.getIcon(ProduktuLista.class, "/gkae/zapataparegabeak/resources/ikonoak/left_arrow24.png"));
		atzeraButton.setText("Atzera");

		JButton editatuButton;
		editatuButton = new JButton();
		editatuButton.setIcon(SwingResourceManager.getIcon(ProduktuLista.class, "/gkae/zapataparegabeak/resources/ikonoak/edit_item24.png"));
		editatuButton.setText("Editatu");

		JButton ezabatuButton;
		ezabatuButton = new JButton();
		ezabatuButton.setIcon(SwingResourceManager.getIcon(ProduktuLista.class, "/gkae/zapataparegabeak/resources/ikonoak/trash.png"));
		ezabatuButton.setText("Ezabatu");

		JLabel idLabel;
		idLabel = new JLabel();
		idLabel.setText("Id:");

		JLabel kategoriaLabel;
		kategoriaLabel = new JLabel();
		kategoriaLabel.setText("Kategoria:");

		JLabel markaLabel;
		markaLabel = new JLabel();
		markaLabel.setText("Marka:");

		JLabel generoaLabel;
		generoaLabel = new JLabel();
		generoaLabel.setText("Generoa:");

		JLabel estiloaLabel;
		estiloaLabel = new JLabel();
		estiloaLabel.setText("Estiloa:");

		Id = new JTextField();

		kategoria = new JTextField();

		marka = new JTextField();

		generoa = new JTextField();

		estiloa = new JTextField();
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12, 12, 12)
					.addComponent(produktueLabel))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(72, 72, 72)
					.addComponent(atzeraButton))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(motaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(12, 12, 12)
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))
					.addGap(17, 17, 17)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(estiloaLabel)
						.addComponent(generoaLabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(idLabel)
								.addComponent(kategoriaLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
								.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
									.addComponent(marka, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
									.addComponent(generoa, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
									.addComponent(estiloa, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
									.addComponent(kategoria, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(Id, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))))
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
										.addComponent(editatuButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(ezabatuButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(bilatuButton))))
						.addComponent(markaLabel))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12, 12, 12)
					.addComponent(produktueLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(motaLabel)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(bilatuButton, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(19, 19, 19)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(list, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(idLabel)
								.addComponent(editatuButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(Id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(kategoriaLabel)
										.addComponent(kategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(15, 15, 15)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(markaLabel)
										.addComponent(marka, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(15, 15, 15)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(generoaLabel)
										.addComponent(generoa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(15, 15, 15)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(estiloaLabel)
										.addComponent(estiloa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addComponent(ezabatuButton))))
					.addGap(23, 23, 23)
					.addComponent(atzeraButton)
					.addGap(31, 31, 31))
		);
		setLayout(groupLayout);
		//
	}

}
