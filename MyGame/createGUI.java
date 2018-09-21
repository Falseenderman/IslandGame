import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class createGUI{

	public static void gui(){
		JFrame theGUI = new JFrame();
		theGUI.setTitle("Island Game");
      theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theGUI.pack();
		theGUI.setVisible(true);
	}
}