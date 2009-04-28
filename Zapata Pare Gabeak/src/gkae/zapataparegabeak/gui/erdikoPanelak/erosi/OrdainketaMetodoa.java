package gkae.zapataparegabeak.gui.erdikoPanelak.erosi;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class OrdainketaMetodoa extends JPanel {

	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField;
	private SpringLayout springLayout_1;
	private SpringLayout springLayout;
	/**
	 * Create the panel
	 */
	public OrdainketaMetodoa() {
		super();
		springLayout = new SpringLayout();
		setLayout(springLayout);

		final JLabel ordainketaMetodoarenAukeraLabel = new JLabel();
		ordainketaMetodoarenAukeraLabel.setFont(new Font("", Font.PLAIN, 18));
		ordainketaMetodoarenAukeraLabel.setText("Ordainketa Metodoaren Aukera");
		add(ordainketaMetodoarenAukeraLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, ordainketaMetodoarenAukeraLabel, 50, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, ordainketaMetodoarenAukeraLabel, 20, SpringLayout.WEST, this);

		final JLabel aukeraEzazuBidalketaLabel = new JLabel();
		aukeraEzazuBidalketaLabel.setText("Aukera ezazu bidalketa metodo bat:");
		add(aukeraEzazuBidalketaLabel);
		springLayout.putConstraint(SpringLayout.NORTH, aukeraEzazuBidalketaLabel, 80, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, aukeraEzazuBidalketaLabel, 0, SpringLayout.WEST, ordainketaMetodoarenAukeraLabel);

		final JRadioButton jasotzeanOrdaintzekoaRadioButton = new JRadioButton();
		jasotzeanOrdaintzekoaRadioButton.setText("Jasotzean ordaintzekoa");
		add(jasotzeanOrdaintzekoaRadioButton);
		springLayout.putConstraint(SpringLayout.EAST, jasotzeanOrdaintzekoaRadioButton, 180, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, jasotzeanOrdaintzekoaRadioButton, 0, SpringLayout.WEST, aukeraEzazuBidalketaLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, jasotzeanOrdaintzekoaRadioButton, 120, SpringLayout.NORTH, this);

		final JRadioButton kredituTxartelBidezkoaRadioButton = new JRadioButton();
		kredituTxartelBidezkoaRadioButton.setText("Kreditu txartel bidezkoa");
		add(kredituTxartelBidezkoaRadioButton);
		springLayout.putConstraint(SpringLayout.EAST, kredituTxartelBidezkoaRadioButton, 195, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, kredituTxartelBidezkoaRadioButton, 0, SpringLayout.WEST, jasotzeanOrdaintzekoaRadioButton);
		springLayout.putConstraint(SpringLayout.SOUTH, kredituTxartelBidezkoaRadioButton, 22, SpringLayout.SOUTH, jasotzeanOrdaintzekoaRadioButton);
		springLayout.putConstraint(SpringLayout.NORTH, kredituTxartelBidezkoaRadioButton, 0, SpringLayout.SOUTH, jasotzeanOrdaintzekoaRadioButton);

		final JPanel panel = new JPanel();
		springLayout_1 = new SpringLayout();
		panel.setLayout(springLayout_1);
		panel.setBorder(new TitledBorder(new LineBorder(Color.black, 1, false), "Kreditu Txartelari Buruzko Datuak", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		add(panel);
		springLayout.putConstraint(SpringLayout.EAST, panel, 480, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, kredituTxartelBidezkoaRadioButton);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 290, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 5, SpringLayout.SOUTH, kredituTxartelBidezkoaRadioButton);

		final JLabel jabearenIzenabizenakLabel = new JLabel();
		jabearenIzenabizenakLabel.setText("Jabearen izen-abizenak:");
		panel.add(jabearenIzenabizenakLabel);
		springLayout_1.putConstraint(SpringLayout.NORTH, jabearenIzenabizenakLabel, 5, SpringLayout.NORTH, panel);
		springLayout_1.putConstraint(SpringLayout.WEST, jabearenIzenabizenakLabel, 5, SpringLayout.WEST, panel);

		textField = new JTextField();
		panel.add(textField);
		springLayout_1.putConstraint(SpringLayout.EAST, textField, 440, SpringLayout.WEST, panel);
		springLayout_1.putConstraint(SpringLayout.WEST, textField, 5, SpringLayout.EAST, jabearenIzenabizenakLabel);
		springLayout_1.putConstraint(SpringLayout.NORTH, textField, 3, SpringLayout.NORTH, panel);

		final JLabel txartelZenbakiaLabel = new JLabel();
		txartelZenbakiaLabel.setText("Txartel zenbakia:");
		panel.add(txartelZenbakiaLabel);
		springLayout_1.putConstraint(SpringLayout.NORTH, txartelZenbakiaLabel, 35, SpringLayout.NORTH, panel);
		springLayout_1.putConstraint(SpringLayout.WEST, txartelZenbakiaLabel, 0, SpringLayout.WEST, jabearenIzenabizenakLabel);

		textField_1 = new JTextField();
		panel.add(textField_1);
		springLayout_1.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
		springLayout_1.putConstraint(SpringLayout.WEST, textField_1, 5, SpringLayout.EAST, jabearenIzenabizenakLabel);
		springLayout_1.putConstraint(SpringLayout.NORTH, textField_1, 33, SpringLayout.NORTH, panel);

		final JLabel iraungitzedataLabel = new JLabel();
		iraungitzedataLabel.setText("Iraungitze-data:");
		panel.add(iraungitzedataLabel);
		springLayout_1.putConstraint(SpringLayout.SOUTH, iraungitzedataLabel, 80, SpringLayout.NORTH, panel);
		springLayout_1.putConstraint(SpringLayout.WEST, iraungitzedataLabel, 5, SpringLayout.WEST, panel);

		textField_2 = new JTextField();
		panel.add(textField_2);
		springLayout_1.putConstraint(SpringLayout.SOUTH, textField_2, 82, SpringLayout.NORTH, panel);

		final JLabel uuuuhheeLabel = new JLabel();
		uuuuhheeLabel.setText("(UUUU/hh/ee)");
		panel.add(uuuuhheeLabel);
		springLayout_1.putConstraint(SpringLayout.EAST, uuuuhheeLabel, 265, SpringLayout.WEST, panel);
		springLayout_1.putConstraint(SpringLayout.WEST, uuuuhheeLabel, 5, SpringLayout.EAST, textField_2);
		springLayout_1.putConstraint(SpringLayout.SOUTH, uuuuhheeLabel, 80, SpringLayout.NORTH, panel);

		final JLabel segurtasunKodeaLabel = new JLabel();
		segurtasunKodeaLabel.setText("Segurtasun kodea:");
		panel.add(segurtasunKodeaLabel);
		springLayout_1.putConstraint(SpringLayout.WEST, segurtasunKodeaLabel, 5, SpringLayout.WEST, panel);
		springLayout_1.putConstraint(SpringLayout.NORTH, segurtasunKodeaLabel, 95, SpringLayout.NORTH, panel);

		textField_3 = new JTextField();
		panel.add(textField_3);
		springLayout_1.putConstraint(SpringLayout.EAST, textField_2, 87, SpringLayout.WEST, textField_3);
		springLayout_1.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, textField_3);
		springLayout_1.putConstraint(SpringLayout.EAST, textField_3, 69, SpringLayout.EAST, segurtasunKodeaLabel);
		springLayout_1.putConstraint(SpringLayout.WEST, textField_3, 5, SpringLayout.EAST, segurtasunKodeaLabel);
		springLayout_1.putConstraint(SpringLayout.NORTH, textField_3, 93, SpringLayout.NORTH, panel);

		final JLabel txartelarenAtzekaldeanDaudenLabel = new JLabel();
		txartelarenAtzekaldeanDaudenLabel.setText("(Txartelaren atzekaldean dauden lau digitu)");
		panel.add(txartelarenAtzekaldeanDaudenLabel);
		springLayout_1.putConstraint(SpringLayout.SOUTH, txartelarenAtzekaldeanDaudenLabel, 109, SpringLayout.NORTH, panel);
		springLayout_1.putConstraint(SpringLayout.EAST, txartelarenAtzekaldeanDaudenLabel, 265, SpringLayout.EAST, textField_3);
		springLayout_1.putConstraint(SpringLayout.WEST, txartelarenAtzekaldeanDaudenLabel, 5, SpringLayout.EAST, textField_3);
		//
	}

}
