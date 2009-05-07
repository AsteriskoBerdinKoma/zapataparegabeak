package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroarekinHarremanetanJarri;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import org.jdesktop.swingx.JXBusyLabel;

public class ItxarotePanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel
	 */
	public ItxarotePanela() {
		super();
		setLayout(new BorderLayout());

		final JXBusyLabel zureMezuaBidaltzenBusyLabel = new JXBusyLabel();
		zureMezuaBidaltzenBusyLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
		zureMezuaBidaltzenBusyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		zureMezuaBidaltzenBusyLabel.setBusy(true);
		zureMezuaBidaltzenBusyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		zureMezuaBidaltzenBusyLabel.setText("Zure mezua bidaltzen ari da. Itxaron mesedez.");
		add(zureMezuaBidaltzenBusyLabel, BorderLayout.CENTER);
		//
	}

}
