package gkae.zapataparegabeak.gui.menuPanelak;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.jdesktop.swingx.JXHyperlink;
import org.jdesktop.swingx.JXTaskPane;
import org.jdesktop.swingx.JXTaskPaneContainer;

public class MenuPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public MenuPanela() {
		setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			add(scrollPane, BorderLayout.CENTER);
			{
				JXTaskPaneContainer taskPaneContainer = new JXTaskPaneContainer();
				
				JXTaskPane katalogoaGroup = new JXTaskPane();
				katalogoaGroup.setTitle("Katalogoa");
				katalogoaGroup.setScrollOnExpand(true);
				
				taskPaneContainer.add(katalogoaGroup);

				final JXHyperlink gizonezkoakHyperlink = new JXHyperlink();
				gizonezkoakHyperlink.setText("Gizonezkoak");
				katalogoaGroup.add(gizonezkoakHyperlink, BorderLayout.NORTH);

				final JXHyperlink emakumezkoakHyperlink = new JXHyperlink();
				emakumezkoakHyperlink.setText("Emakumezkoak");
				katalogoaGroup.add(emakumezkoakHyperlink, BorderLayout.SOUTH);
				
				scrollPane.setViewportView(taskPaneContainer);
				scrollPane.setBorder(null);
			}
		}

	}
}
