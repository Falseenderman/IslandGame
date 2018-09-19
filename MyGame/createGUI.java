import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class createGUI{

	public static void gui(){
		Frame theGUI = new JFrame();
		theGUI.setTitle("Island Game");
      theGUI.setDefaultCloseOperation(GUIWindow.EXIT_ON_CLOSE);
		theGUI.pack();
		theGUI.setVisible(true);
	}
}