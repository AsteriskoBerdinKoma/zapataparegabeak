package gkae.zapataparegabeak.gui.erdikoPanelak.katalogoa;

import gkae.zapataparegabeak.gui.NagusiaPanel;
import gkae.zapataparegabeak.objektuak.Zapata;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JDialog;

public class ArtikuluarenXehetasunakDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the dialog
	 * @param jabea 
	 */
	public ArtikuluarenXehetasunakDialog(Zapata z, NagusiaPanel jabea) {
		super();
		setTitle("Artikuluaren xehetasunak");

		ArtikuluarenXehetasunak panel;
		panel = new ArtikuluarenXehetasunak(z, jabea);
		final GroupLayout groupLayout = new GroupLayout((JComponent) getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
		pack();
		//
	}

}
