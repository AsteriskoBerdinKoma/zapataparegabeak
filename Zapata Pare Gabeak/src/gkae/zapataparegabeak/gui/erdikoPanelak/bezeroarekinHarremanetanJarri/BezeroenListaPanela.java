package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroarekinHarremanetanJarri;

import java.awt.Font;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.ListSelectionModel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import com.swtdesigner.SwingResourceManager;
import gkae.zapataparegabeak.gui.erdikoPanelak.bezeroarekinHarremanetanJarri.BezeroenDatuakPanel;
import gkae.zapataparegabeak.objektuak.ErabiltzaileInfo;
import gkae.zapataparegabeak.objektuak.Erabiltzaileak;
import gkae.zapataparegabeak.objektuak.HornitzaileZerrenda;
import gkae.zapataparegabeak.objektuak.Hornitzailea;

public class BezeroenListaPanela extends JPanel {

	private JList list;
	private JTextField textField;
	private DefaultListModel listModel;
	private BezeroenDatuakPanel bezeroenDatuak;
	/**
	 * Create the panel
	 */
	public BezeroenListaPanela() {
		super();

		textField = new JTextField();

		JButton bilatuButton;
		bilatuButton = new JButton();
		bilatuButton.setText("Bilatu");
		
		setAutoscrolls(true);
		listModel = new DefaultListModel();
		list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(final ListSelectionEvent arg0) {
				ErabiltzaileInfo e = (ErabiltzaileInfo) list.getSelectedValue();

				bezeroenDatuak.setDatuak(e);
				list.repaint();
			}
		});		
		list.setBorder(new TitledBorder(null, "Bezero Lista:", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

		JButton emailButton;
		emailButton = new JButton();
		emailButton.setIcon(SwingResourceManager.getIcon(BezeroenListaPanela.class, "/gkae/zapataparegabeak/resources/ikonoak/email24.png"));
		emailButton.setText("E-mail");
		
		bezeroenDatuak = new BezeroenDatuakPanel();
		bezeroenDatuak.setEditable(false);
		
		zerrendaKargatu();

		JButton bajaEmanButton;
		bajaEmanButton = new JButton();
		bajaEmanButton.setIcon(SwingResourceManager.getIcon(BezeroenListaPanela.class, "/gkae/zapataparegabeak/resources/ikonoak/delete_item24.png"));
		bajaEmanButton.setText("Baja eman");

		BezeroenDatuakPanel bezeroenDatuakPanel;
		bezeroenDatuakPanel = new BezeroenDatuakPanel();

		JSeparator separator;
		separator = new JSeparator();

		JLabel bezeroekinHarremanetanJarriLabel;
		bezeroekinHarremanetanJarriLabel = new JLabel();
		bezeroekinHarremanetanJarriLabel.setFont(new Font("", Font.PLAIN, 18));
		bezeroekinHarremanetanJarriLabel.setText("Bezeroak Kudeatu");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(bilatuButton))
						.addComponent(bezeroekinHarremanetanJarriLabel)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 531, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(36, 36, 36)
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
								.addComponent(bezeroenDatuakPanel, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(emailButton)
									.addGap(16, 16, 16)
									.addComponent(bajaEmanButton)
									.addGap(120, 120, 120)))))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bezeroekinHarremanetanJarriLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
							.addGap(8, 8, 8)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(69, 69, 69)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(list, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
										.addComponent(bezeroenDatuakPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(21, 21, 21)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(bilatuButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE))
						.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(emailButton)
							.addComponent(bajaEmanButton)))
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}
	
	private void zerrendaKargatu() {
		listModel.removeAllElements();
		Vector<ErabiltzaileInfo> eZerrenda = Erabiltzaileak.getInstance().getErabZerrenda();
			
		for (ErabiltzaileInfo e : eZerrenda)
			listModel.addElement(e);
		if (list.getModel().getSize() > 0) {
			list.setSelectedIndex(0);
		}
	}	

}
