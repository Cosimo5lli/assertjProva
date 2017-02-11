package tap.gianninicinquilli.tutorialAssertJ;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameTest extends JFrame{
	
	public JFrameTest(){
		super();
		setSize(200,200);
		
		JTextField textToCopy = new JTextField();
		JPanel panello = new JPanel();
		textToCopy.setName("textToCopy");
		getContentPane().add(textToCopy, BorderLayout.NORTH);
		textToCopy.setColumns(10);
		JLabel copiedText = new JLabel("");
		
		JButton1 copyButton = new JButton1("copyButton", copiedText, textToCopy);
		copyButton.setName("copyButton");
		
		JButton copyButton2 = new JButton();
		copyButton2.setName("copyButton2");
		
		panello.add(copyButton, BorderLayout.CENTER);
		panello.add(copyButton2, BorderLayout.NORTH);
		panello.setVisible(true);
		getContentPane().add(panello, BorderLayout.CENTER);
		
		copiedText.setName("copiedText");
		getContentPane().add(copiedText, BorderLayout.SOUTH);
		//setVisible(true);
		
	}

}
