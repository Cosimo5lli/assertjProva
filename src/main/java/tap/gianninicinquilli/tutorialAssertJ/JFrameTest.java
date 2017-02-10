package tap.gianninicinquilli.tutorialAssertJ;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class JFrameTest extends JFrame{
	
	public JFrameTest(){
		super();
		setSize(200,200);
		
		JTextField textToCopy = new JTextField();
		textToCopy.setName("textToCopy");
		getContentPane().add(textToCopy, BorderLayout.NORTH);
		textToCopy.setColumns(10);
		JLabel copiedText = new JLabel("copiedText");
		
		JButton1 copyButton = new JButton1("copyButton", copiedText, textToCopy);
		copyButton.setName("copyButton");
		
		getContentPane().add(copyButton, BorderLayout.CENTER);
		
		copiedText.setName("copiedText");
		getContentPane().add(copiedText, BorderLayout.SOUTH);
		//setVisible(true);
		
	}

}
