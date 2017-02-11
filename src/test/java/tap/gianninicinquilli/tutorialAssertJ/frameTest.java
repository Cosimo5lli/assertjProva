package tap.gianninicinquilli.tutorialAssertJ;

import static org.junit.Assert.*;

import java.awt.Frame;

import javax.swing.JFrame;

import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.core.Robot;
import org.assertj.swing.core.Settings;
import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class frameTest {
	private FrameFixture frameFixture;
	
	@BeforeClass
	public static void onceSetUp(){
		FailOnThreadViolationRepaintManager.install();
	}
	
	@Before
	public void setup(){
		Robot robot = BasicRobot.robotWithNewAwtHierarchy();
		JFrameTest frame = GuiActionRunner.execute(() -> new JFrameTest());
		frameFixture = new FrameFixture(robot,frame);
		frameFixture.show();
		
		robot.settings().delayBetweenEvents(100);
		
	}
	
	@Test
	public void shouldCopyTextInLabelWhenClickingButton() {
		frameFixture.textBox("textToCopy").enterText("Somebody");
		frameFixture.button("copyButton").click();
		frameFixture.label("copiedText").requireText("Somebody");
	}
	
	@Test
	public void shouldCopyTextInLabelWhenClickingButton2() {
		frameFixture.textBox("textToCopy").enterText("Somebody");
		frameFixture.button("copyButton2").click();
		frameFixture.label("copiedText2").requireText("");
	}

	
	@After
	public void signalSemaphoreResources(){
		frameFixture.cleanUp();
	}
	

}
