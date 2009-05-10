package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import gkae.zapataparegabeak.objektuak.AlbaranLista;
import gkae.zapataparegabeak.objektuak.Albarana;
import gkae.zapataparegabeak.objektuak.ErabiltzaileInfo;
import gkae.zapataparegabeak.objektuak.Erabiltzaileak;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu.AlbaranDatuak;
import gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu.AlbaranPanel;

public class AlbaranenLista extends JPanel {

	private JTextField textField;
	private JList list_1;
	private DefaultListModel listModel;
	private BezeroenEskaerakPanel owner;
	/**
	 * Create the panel
	 * @param bezeroenEskaerakPanel 
	 */
	//public AlbaranenLista(BezeroenEskaerakPanel bezeroenEskaerakPanel) {
	public AlbaranenLista(BezeroenEskaerakPanel bezeroenEskaerakPanel) {
		super();
		
		listModel = new DefaultListModel();
		list_1 = new JList(listModel);
		list_1.setBorder(new TitledBorder(null, "Albaranen Lista", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		list_1.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(final ListSelectionEvent arg0) {
				Albarana a = (Albarana) list_1.getSelectedValue();
				list_1.repaint();
			}
		});
		owner = bezeroenEskaerakPanel;
		
		JLabel bezeroenEskaerenListaLabel;
		bezeroenEskaerenListaLabel = new JLabel();
		bezeroenEskaerenListaLabel.setFont(new Font("", Font.PLAIN, 18));
		bezeroenEskaerenListaLabel.setText("Prozesatutako Eskaeren Albaranak");

		JButton itzuliButton;
		itzuliButton = new JButton();
		itzuliButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				owner.changeCard("bezeroekEgindakoEskaerenLista");
			}
		});
		itzuliButton.setText("Itzuli");

		textField = new JTextField();
		
		zerrendaKargatu();

		JButton bilatuButton;
		bilatuButton = new JButton();
		bilatuButton.setText("Bilatu");

		AlbaranPanel albaranPanel;
		albaranPanel = new AlbaranPanel();

		JSeparator separator;
		separator = new JSeparator();
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bezeroenEskaerenListaLabel, GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
							.addGap(100, 100, 100))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6, 6, 6)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
									.addGap(29, 29, 29)
									.addComponent(bilatuButton, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(list_1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(24, 24, 24)
											.addComponent(itzuliButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
									.addGap(10, 10, 10)
									.addComponent(albaranPanel, GroupLayout.PREFERRED_SIZE, 475, GroupLayout.PREFERRED_SIZE)))
							.addGap(475, 475, 475)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(bezeroenEskaerenListaLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(12, 12, 12)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(bilatuButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(list_1, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(itzuliButton, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(albaranPanel, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
							.addGap(2, 2, 2)))
					.addGap(17, 17, 17))
		);
		setLayout(groupLayout);
		//
	}
	
	private void zerrendaKargatu() {
		listModel.removeAllElements();
		Vector<Albarana> aZerrenda = AlbaranLista.getInstance().getAlbaranLista();
			
		for (Albarana a : aZerrenda)
			listModel.addElement(a);
		if (list_1.getModel().getSize() > 0) {
			list_1.setSelectedIndex(0);
		}
	}	

}
