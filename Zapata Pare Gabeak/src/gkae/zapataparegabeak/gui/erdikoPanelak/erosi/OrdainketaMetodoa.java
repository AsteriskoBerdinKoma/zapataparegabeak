package gkae.zapataparegabeak.gui.erdikoPanelak.erosi;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.swtdesigner.SwingResourceManager;

public class OrdainketaMetodoa extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField;
	private JRadioButton jasotzeanOrdaintzekoaRadioButton;
	private JRadioButton kredituTxartelBidezkoaRadioButton;
	
	private JPanel txartelInfoPanel;
	/**
	 * Create the panel
	 */
	public OrdainketaMetodoa() {
		super();

		JLabel ordainketaMetodoarenAukeraLabel;
		ordainketaMetodoarenAukeraLabel = new JLabel();
		ordainketaMetodoarenAukeraLabel.setFont(new Font("", Font.PLAIN, 18));
		ordainketaMetodoarenAukeraLabel.setText("Erosi: Ordainketa Metodoaren Aukera");

		JLabel aukeraEzazuBidalketaLabel;
		aukeraEzazuBidalketaLabel = new JLabel();
		aukeraEzazuBidalketaLabel.setText("Aukera ezazu bidalketa metodo bat:");


		jasotzeanOrdaintzekoaRadioButton = new JRadioButton();
		
		
		buttonGroup.add(jasotzeanOrdaintzekoaRadioButton);
		jasotzeanOrdaintzekoaRadioButton.setText("Jasotzean ordaintzekoa");
		jasotzeanOrdaintzekoaRadioButton.setSelected(true);

		kredituTxartelBidezkoaRadioButton = new JRadioButton();
		
		
		buttonGroup.add(kredituTxartelBidezkoaRadioButton);
		kredituTxartelBidezkoaRadioButton.setText("Kreditu txartel bidezkoa");
		

		txartelInfoPanel = new JPanel();
		txartelInfoPanel.setVisible(false);
		txartelInfoPanel.setBorder(new TitledBorder(new LineBorder(Color.black, 1, false), "Kreditu Txartelari Buruzko Datuak", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

		JLabel jabearenIzenabizenakLabel;
		jabearenIzenabizenakLabel = new JLabel();
		jabearenIzenabizenakLabel.setText("Jabearen izen-abizenak:");

		textField = new JTextField();

		JLabel txartelZenbakiaLabel;
		txartelZenbakiaLabel = new JLabel();
		txartelZenbakiaLabel.setText("Txartel zenbakia:");

		textField_1 = new JTextField();

		JLabel iraungitzedataLabel;
		iraungitzedataLabel = new JLabel();
		iraungitzedataLabel.setText("Iraungitze-data:");

		textField_2 = new JTextField();

		JLabel uuuuhheeLabel;
		uuuuhheeLabel = new JLabel();
		uuuuhheeLabel.setText("(UUUU/hh/ee)");

		JLabel segurtasunKodeaLabel;
		segurtasunKodeaLabel = new JLabel();
		segurtasunKodeaLabel.setText("Segurtasun kodea:");

		textField_3 = new JTextField();

		JLabel txartelarenAtzekaldeanDaudenLabel;
		txartelarenAtzekaldeanDaudenLabel = new JLabel();
		txartelarenAtzekaldeanDaudenLabel.setText("(Txartelaren atzekaldean dauden lau digitu)");

		JSeparator separator;
		separator = new JSeparator();
		
		jasotzeanOrdaintzekoaRadioButton.addChangeListener(new ChangeListener() {
			public void stateChanged(final ChangeEvent e) {
				if (jasotzeanOrdaintzekoaRadioButton.isSelected()){
					txartelInfoPanel.setVisible(false);
					panelValidation();
				}
			}
		});
		
		kredituTxartelBidezkoaRadioButton.addChangeListener(new ChangeListener() {
			public void stateChanged(final ChangeEvent e) {
				if(kredituTxartelBidezkoaRadioButton.isSelected()){
					txartelInfoPanel.setVisible(true);
					panelValidation();
				}
			}
		});
		final GroupLayout groupLayout_1 = new GroupLayout((JComponent) txartelInfoPanel);
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addGap(5, 5, 5)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(iraungitzedataLabel)
								.addComponent(txartelZenbakiaLabel)
								.addComponent(segurtasunKodeaLabel)))
						.addComponent(jabearenIzenabizenakLabel))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(textField)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(txartelarenAtzekaldeanDaudenLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(groupLayout_1.createSequentialGroup()
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(uuuuhheeLabel))
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addGap(3, 3, 3)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(jabearenIzenabizenakLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txartelZenbakiaLabel))
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGap(11, 11, 11)
							.addComponent(iraungitzedataLabel))
						.addGroup(groupLayout_1.createSequentialGroup()
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(uuuuhheeLabel))))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(segurtasunKodeaLabel)
						.addComponent(txartelarenAtzekaldeanDaudenLabel)))
		);
		txartelInfoPanel.setLayout(groupLayout_1);

		JButton erosketaAmaituButton;
		erosketaAmaituButton = new JButton();
		erosketaAmaituButton.setMargin(new Insets(2, 2, 2, 14));
		erosketaAmaituButton.setIcon(SwingResourceManager.getIcon(OrdainketaMetodoa.class, "/gkae/zapataparegabeak/resources/ikonoak/accept_item24.png"));
		erosketaAmaituButton.setText("Erosketa Amaitu");
		//
		

		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(ordainketaMetodoarenAukeraLabel)
					.addContainerGap(258, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(erosketaAmaituButton))
						.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(20, 20, 20)
								.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(kredituTxartelBidezkoaRadioButton)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
											.addComponent(jasotzeanOrdaintzekoaRadioButton, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
											.addComponent(aukeraEzazuBidalketaLabel, GroupLayout.Alignment.LEADING))
										.addGap(304, 304, 304))
									.addGroup(groupLayout.createSequentialGroup()
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(txartelInfoPanel, GroupLayout.PREFERRED_SIZE, 565, Short.MAX_VALUE))))
							.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(24, 24, 24))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(ordainketaMetodoarenAukeraLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(aukeraEzazuBidalketaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jasotzeanOrdaintzekoaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(kredituTxartelBidezkoaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(txartelInfoPanel, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(erosketaAmaituButton)
					.addGap(55, 55, 55))
		);
		setLayout(groupLayout);
	}
	
	public void panelValidation(){
		this.revalidate();
	}
	
	public static void main(String[] args){
		JFrame j = new JFrame("Frogak");
		OrdainketaMetodoa o = new OrdainketaMetodoa();
		j.add(o);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
