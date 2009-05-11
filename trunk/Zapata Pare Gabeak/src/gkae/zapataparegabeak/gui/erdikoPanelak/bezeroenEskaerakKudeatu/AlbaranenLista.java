package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu;

import gkae.zapataparegabeak.objektuak.AlbaranLista;
import gkae.zapataparegabeak.objektuak.Albarana;

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
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import com.swtdesigner.SwingResourceManager;

public class AlbaranenLista extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
				//Albarana a = (Albarana) list_1.getSelectedValue();
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
		itzuliButton.setIcon(SwingResourceManager.getIcon(AlbaranenLista.class, "/gkae/zapataparegabeak/resources/ikonoak/left_arrow24.png"));
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
		bilatuButton.setIcon(SwingResourceManager.getIcon(AlbaranenLista.class, "/gkae/zapataparegabeak/resources/ikonoak/search_magnifier24.png"));
		bilatuButton.setText("Bilatu");

		AlbaranPanel albaranPanel;
		albaranPanel = new AlbaranPanel();

		JSeparator separator;
		separator = new JSeparator();
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(bilatuButton))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(list_1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(10, 10, 10)
											.addComponent(albaranPanel, GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(itzuliButton))))
								.addComponent(bezeroenEskaerenListaLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(bezeroenEskaerenListaLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(bilatuButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(albaranPanel, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(itzuliButton, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addComponent(list_1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))
					.addGap(11, 11, 11))
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
