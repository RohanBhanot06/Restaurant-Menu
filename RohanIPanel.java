package guiItemListener;

/* Name: Rohan Bhanot 
 * Date: Friday, April 12, 2024
 * Teacher: Elena Kapustina
 * Course Code: ICS4U1-2
 * Program Name: RohanIPanel
 * Description: Creating the IPanel class for Graphic User Interface Item Listener.
 */

import java.awt.*;
import javax.swing.*;

public class RohanIPanel extends JPanel {
	Image restaurantbackground;

	public RohanIPanel() {
		super();
		Toolkit kit = Toolkit.getDefaultToolkit();
		restaurantbackground = kit.getImage("restaurantbackground.png");
	}

	public void paintComponent(Graphics comp) {
        Graphics2D comp2D = (Graphics2D) comp;
        comp2D.drawImage(restaurantbackground, 0, 0, getWidth(), getHeight(), this);
    }
}