package gkae.zapataparegabeak.gui.menuPanelak;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultMutableTreeNode;
import org.jdesktop.swingx.JXHyperlink;

import org.jdesktop.swingx.JXTaskPane;
import org.jdesktop.swingx.JXTaskPaneContainer;
import org.jdesktop.swingx.JXTree;

public class MenuPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Vector<String> zapataMotakG;
	Vector<String> zapataMotakE;

	/**
	 * Create the panel.
	 */
	public MenuPanela() {
		zapataMotakG = new Vector<String>();
		zapataMotakE = new Vector<String>();
		
		zapataMotakG.add("Botak");
		zapataMotakG.add("Kirol zapatak");
		zapataMotakG.add("Bestelakoak");
		zapataMotakG.add("Bereziak");
		
		zapataMotakE.add("Botak");
		zapataMotakE.add("Kirol zapatak");
		zapataMotakE.add("Bestelakoak");
		zapataMotakE.add("Bereziak");
		zapataMotakE.add("Takoidunak");
		
		DefaultMutableTreeNode rootGizonezkoa = new DefaultMutableTreeNode("Gizonezkoa");
		DefaultMutableTreeNode rootEmakumezkoa = new DefaultMutableTreeNode("Emakumezkoa");
		
		for (String s: zapataMotakG)
			rootGizonezkoa.add(new DefaultMutableTreeNode(s));
		
		for (String s: zapataMotakE)
			rootEmakumezkoa.add(new DefaultMutableTreeNode(s));
		
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
				
				scrollPane.setViewportView(taskPaneContainer);
				scrollPane.setBorder(null);
			}
		}

	}
}
