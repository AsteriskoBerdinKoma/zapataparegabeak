package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroarekinHarremanetanJarri;

import gkae.zapataparegabeak.objektuak.ErabiltzaileInfo;
import gkae.zapataparegabeak.objektuak.Erabiltzaileak;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

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
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.swtdesigner.SwingResourceManager;

public class BezeroenListaPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JList list;
	private JTextField textField;
	private DefaultListModel listModel;
	private BezeroenDatuakPanel bezeroenDatuakPanel;
	private BezeroakKudeatuPanel jabea;
	/**
	 * Create the panel
	 */
	public BezeroenListaPanela(BezeroakKudeatuPanel jabea) {
		super();
		this.jabea = jabea;
		textField = new JTextField();

		JButton bilatuButton;
		bilatuButton = new JButton();
		bilatuButton.setText("Bilatu");
		
		bezeroenDatuakPanel = new BezeroenDatuakPanel();
		bezeroenDatuakPanel.setEditable(false);
		
		setAutoscrolls(true);
		listModel = new DefaultListModel();
		list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(final ListSelectionEvent arg0) {
				ErabiltzaileInfo e = (ErabiltzaileInfo) list.getSelectedValue();

				bezeroenDatuakPanel.setDatuak(e);
				list.repaint();
			}
		});		
		list.setBorder(new TitledBorder(null, "Bezero Lista:", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

		JButton emailButton;
		emailButton = new JButton();
		emailButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				mezuaBidali(bezeroenDatuakPanel.getEposta());
			}
		});
		emailButton.setIcon(SwingResourceManager.getIcon(BezeroenListaPanela.class, "/gkae/zapataparegabeak/resources/ikonoak/email24.png"));
		emailButton.setText("E-mail");
		
		zerrendaKargatu();

		JButton bajaEmanButton;
		bajaEmanButton = new JButton();
		bajaEmanButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				mezuaBidali(bezeroenDatuakPanel.getEposta());
			}
		});
		bajaEmanButton.setIcon(SwingResourceManager.getIcon(BezeroenListaPanela.class, "/gkae/zapataparegabeak/resources/ikonoak/delete_item24.png"));
		bajaEmanButton.setText("Baja eman");

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
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(bajaEmanButton)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(emailButton))
								.addComponent(bezeroenDatuakPanel, GroupLayout.PREFERRED_SIZE, 411, Short.MAX_VALUE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
							.addGap(14, 14, 14)
							.addComponent(bilatuButton))
						.addComponent(bezeroekinHarremanetanJarriLabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
							.addGap(35, 35, 35)))
					.addGap(12, 12, 12))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(bezeroekinHarremanetanJarriLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(27, 27, 27)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(bilatuButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(25, 25, 25)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(list, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
							.addGap(40, 40, 40))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bezeroenDatuakPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(22, 22, 22)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(bajaEmanButton)
								.addComponent(emailButton))
							.addContainerGap(17, Short.MAX_VALUE))))
		);
		setLayout(groupLayout);
		//
	}
	
	protected void mezuaBidali(String eposta) {
		// TODO Auto-generated method stub
		this.jabea.ikusiEmailIdatzi(eposta);

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
