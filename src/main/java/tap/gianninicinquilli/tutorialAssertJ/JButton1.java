package tap.gianninicinquilli.tutorialAssertJ;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JButton1 extends JButton {

	public JButton1(String stringa,JLabel copiedText,JTextField textToCopy) {
		super(stringa);
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				copiedText.setText(textToCopy.getText());
			}
		});
	}
	

}
