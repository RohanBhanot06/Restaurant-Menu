package guiItemListener;

/* Name: Rohan Bhanot 
 * Date: Friday, April 12, 2024
 * Teacher: Elena Kapustina
 * Course Code: ICS4U1-2
 * Program Name: RohanRestaurant
 * Description: Creating the Restaurant class for Graphic User Interface Item Listener.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RohanRestaurant extends JFrame implements ItemListener, ActionListener {

	// Image icons for menu items
	ImageIcon mcDonalds = new ImageIcon("mcDonalds.jpeg"); // McDonald's logo
	ImageIcon jrChicken = new ImageIcon("jrChicken.jpeg"); // Junior Chicken image
	ImageIcon bigMac = new ImageIcon("bigMac.jpeg"); // Big Mac image
	ImageIcon mcChicken = new ImageIcon("mcChicken.jpeg"); // McChicken image
	ImageIcon coke = new ImageIcon("coke.jpeg"); // Coke image
	ImageIcon sprite = new ImageIcon("sprite.jpeg"); // Sprite image
	ImageIcon oreoMcflurry = new ImageIcon("oreoMcflurry.jpeg"); // Oreo McFlurry image
	ImageIcon applePie = new ImageIcon("applePie.jpeg"); // Apple Pie image
	ImageIcon chocolateChipCookie = new ImageIcon("chocolateChipCookie.jpeg"); // Chocolate Chip Cookie image
	ImageIcon brownieCookie = new ImageIcon("brownieCookie.jpeg"); // Brownie Cookie image
	ImageIcon strawberryShake = new ImageIcon("strawberryShake.jpeg"); // Strawberry Shake image
	ImageIcon chocolateShake = new ImageIcon("chocolateShake.jpeg"); // Chocolate Shake image

	// Resized images for display
	Image image1 = jrChicken.getImage(); // Junior Chicken
	Image image2 = bigMac.getImage(); // Big Mac
	Image image3 = mcChicken.getImage(); // McChicken
	Image image4 = coke.getImage(); // Coke
	Image image5 = sprite.getImage(); // Sprite
	Image image6 = oreoMcflurry.getImage(); // Oreo McFlurry
	Image image7 = applePie.getImage(); // Apple Pie
	Image image8 = chocolateChipCookie.getImage(); // Chocolate Chip Cookie
	Image image9 = brownieCookie.getImage(); // Brownie Cookie
	Image image10 = strawberryShake.getImage(); // Strawberry Shake
	Image image11 = chocolateShake.getImage(); // Chocolate Shake
	Image image12 = mcDonalds.getImage(); // McDonald's logo

	// Scaled images for display
	Image newimage1 = image1.getScaledInstance(225, 225, java.awt.Image.SCALE_SMOOTH);
	Image newimage2 = image2.getScaledInstance(225, 225, java.awt.Image.SCALE_SMOOTH);
	Image newimage3 = image3.getScaledInstance(225, 225, java.awt.Image.SCALE_SMOOTH);
	Image newimage4 = image4.getScaledInstance(225, 225, java.awt.Image.SCALE_SMOOTH);
	Image newimage5 = image5.getScaledInstance(225, 225, java.awt.Image.SCALE_SMOOTH);
	Image newimage6 = image6.getScaledInstance(225, 225, java.awt.Image.SCALE_SMOOTH);
	Image newimage7 = image7.getScaledInstance(225, 225, java.awt.Image.SCALE_SMOOTH);
	Image newimage8 = image8.getScaledInstance(225, 225, java.awt.Image.SCALE_SMOOTH);
	Image newimage9 = image9.getScaledInstance(225, 225, java.awt.Image.SCALE_SMOOTH);
	Image newimage10 = image10.getScaledInstance(225, 225, java.awt.Image.SCALE_SMOOTH);
	Image newimage11 = image11.getScaledInstance(225, 225, java.awt.Image.SCALE_SMOOTH);
	Image newimage12 = image12.getScaledInstance(200, 130, java.awt.Image.SCALE_SMOOTH);

	// Image icons for resized images
	ImageIcon jrChickenImg = new ImageIcon(newimage1); // Junior Chicken image
	ImageIcon bigMacImg = new ImageIcon(newimage2); // Big Mac image
	ImageIcon mcChickenImg = new ImageIcon(newimage3); // McChicken image
	ImageIcon cokeImg = new ImageIcon(newimage4); // Coke image
	ImageIcon spriteImg = new ImageIcon(newimage5); // Sprite image
	ImageIcon oreomcFlurryImg = new ImageIcon(newimage6); // Oreo McFlurry image
	ImageIcon applePieImg = new ImageIcon(newimage7); // Apple Pie image
	ImageIcon chocolateChipCookieImg = new ImageIcon(newimage8); // Chocolate Chip Cookie image
	ImageIcon brownieCookieImg = new ImageIcon(newimage9); // Brownie Cookie image
	ImageIcon strawberryShakeImg = new ImageIcon(newimage10); // Strawberry Shake image
	ImageIcon chocolateShakeImg = new ImageIcon(newimage11); // Chocolate Shake image
	ImageIcon mcDonaldsImg = new ImageIcon(newimage12); // McDonald's logo

	// Labels for displaying menu items
	JLabel jrChickenLabel = new JLabel(jrChickenImg); // Junior Chicken label
	JLabel bigMacLabel = new JLabel(bigMacImg); // Big Mac label
	JLabel mcChickenLabel = new JLabel(mcChickenImg); // McChicken label
	JLabel cokeLabel = new JLabel(cokeImg); // Coke label
	JLabel spriteLabel = new JLabel(spriteImg); // Sprite label
	JLabel oreoMcflurryLabel = new JLabel(oreomcFlurryImg); // Oreo McFlurry label
	JLabel applePieLabel = new JLabel(applePieImg); // Apple Pie label
	JLabel chocolateChipCookieLabel = new JLabel(chocolateChipCookieImg); // Chocolate Chip Cookie label
	JLabel brownieCookieLabel = new JLabel(brownieCookieImg); // Brownie Cookie label
	JLabel strawberryShakeLabel = new JLabel(strawberryShakeImg); // Strawberry Shake label
	JLabel chocolateShakeLabel = new JLabel(chocolateShakeImg); // Chocolate Shake label
	JLabel mcDonaldsLabel = new JLabel(mcDonaldsImg); // McDonald's logo label

	// Custom panel for layout
	RohanIPanel panel = new RohanIPanel();

	// Radio buttons for food items
	JRadioButton buttonjrChicken = new JRadioButton("Junior Chicken"); // Junior Chicken radio button
	JRadioButton buttonbigMac = new JRadioButton("Big Mac"); // Big Mac radio button
	JRadioButton buttonmcChicken = new JRadioButton("McChicken"); // McChicken radio button
	ButtonGroup foods = new ButtonGroup(); // Button group for food items

	// Labels for order and receipt
	JLabel orderLabel = new JLabel("Order:"); // Order label
	JLabel receiptLabel = new JLabel("Receipt:"); // Receipt label
	// Labels for welcome and item picked
	JLabel welcomeLabel = new JLabel("Welcome to McDonald's!"); // Welcome label
	JLabel itemLabel = new JLabel("Chosen Item:"); // Chosen item label

	// Radio buttons for beverage selection
	JRadioButton buttonCoke = new JRadioButton("Coke"); // Coke radio button
	JRadioButton buttonSprite = new JRadioButton("Sprite"); // Sprite radio button
	ButtonGroup beverages = new ButtonGroup(); // Button group for beverages

	// Combo box for selecting beverage sizes
	String[] beverageSizes = { "Beverage Sizes", "Small", "Medium", "Large" }; // Beverage sizes array
	JComboBox boxBeverageSizes = new JComboBox(beverageSizes); // Beverage sizes combo box

	// Combo box for selecting desserts and shakes
	String[] dessertsAndShakes = { "Desserts & Shakes", "Oreo McFlurry", "Baked Apple Pie",
			"Chocolate Chunk RMHC Cookie", "Brownie RMHC Cookie", "Strawberry Triple Thick Milkshake",
			"Chocolate Triple Thick Milkshake" }; // Desserts and shakes array
	JComboBox boxDessertsAndShakes = new JComboBox(dessertsAndShakes); // Desserts and shakes combo box

	// String variable to store the selected beverage
	String selectedBeverage = "";

	// Text areas for displaying order, menu, and receipt
	JTextArea textArea1 = new JTextArea(5, 38);
	JTextArea textArea2 = new JTextArea(5, 38);
	JTextArea textArea3 = new JTextArea(5, 38);

	// Prices of menu items
	double jrChickenPrice = 3.29;
	double bigMacPrice = 6.39;
	double mcChickenPrice = 6.19;
	double smallSizePrice = 1.69;
	double mediumSizePrice = 2.49;
	double largeSizePrice = 2.89;
	double oreoMcflurryPrice = 3.99;
	double applePiePrice = 1.59;
	double chocolateChipCookiePrice = 0.99;
	double brownieCookiePrice = 0.99;
	double strawberryShakePrice = 3.89;
	double chocolateShakePrice = 3.89;

	// Check boxes for ordering and clearing
	JCheckBox buttonOrder = new JCheckBox("Order");
	JCheckBox buttonClear = new JCheckBox("Clear");
	boolean isSelectButtonClicked = false;

	// Constructor for initializing the GUI
	public RohanRestaurant() {
		super("Rohan McDonald's Restaurant"); // Set the title of the GUI
		setSize(1000, 750); // Set the size of the GUI window
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Define default close operation

		panel.setLayout(null); // Set layout of the panel to null

		// Setting fonts for components
		Font buttonFont = new Font("Helvetica Black", Font.BOLD, 15);
		// Setting font for food selection buttons
		buttonjrChicken.setFont(buttonFont);
		buttonbigMac.setFont(buttonFont);
		buttonmcChicken.setFont(buttonFont);
		// Setting font for beverage selection buttons
		buttonCoke.setFont(buttonFont);
		buttonSprite.setFont(buttonFont);
		// Setting font for order and clear buttons
		buttonOrder.setFont(buttonFont);
		buttonClear.setFont(buttonFont);
		// Setting font for combo boxes
		boxBeverageSizes.setFont(buttonFont);
		boxDessertsAndShakes.setFont(buttonFont);
		Font buttonFont2 = new Font("Helvetica Black", Font.BOLD, 30);
		// Setting font for labels
		orderLabel.setFont(buttonFont2);
		receiptLabel.setFont(buttonFont2);
		welcomeLabel.setFont(buttonFont2);
		itemLabel.setFont(buttonFont2);

		// Setting colors for components
		Color red = new Color(219, 0, 6);
		Color yellow = new Color(255, 184, 28);

		// Setting properties for food selection buttons
		buttonjrChicken.setForeground(yellow);
		buttonjrChicken.setBounds(35, 75, 150, 30);

		buttonbigMac.setForeground(yellow);
		buttonbigMac.setBounds(35, 105, 150, 30);

		buttonmcChicken.setForeground(yellow);
		buttonmcChicken.setBounds(35, 135, 150, 30);

		// Setting properties for beverage selection buttons
		buttonCoke.setForeground(yellow);
		buttonCoke.setBounds(200, 75, 100, 30);

		buttonSprite.setForeground(yellow);
		buttonSprite.setBounds(200, 105, 100, 30);

		// Setting properties for order and clear buttons
		buttonOrder.setBackground(red);
		buttonOrder.setForeground(yellow);
		buttonOrder.setBounds(13, 600, 200, 30);

		buttonClear.setBackground(red);
		buttonClear.setForeground(yellow);
		buttonClear.setBounds(663, 600, 200, 30);

		// Setting properties for combo boxes
		boxDessertsAndShakes.setBackground(red);
		boxDessertsAndShakes.setForeground(yellow);
		boxDessertsAndShakes.setBounds(320, 140, 195, 30);

		boxBeverageSizes.setBackground(red);
		boxBeverageSizes.setForeground(yellow);
		boxBeverageSizes.setBounds(135, 200, 170, 30);

		// Setting properties for text areas
		textArea1.setBounds(20, 300, 310, 300);
		textArea1.setForeground(yellow);
		textArea1.setBackground(red);

		textArea2.setBounds(350, 300, 300, 330);
		textArea2.setForeground(yellow);
		textArea2.setBackground(red);

		textArea3.setBounds(670, 300, 310, 300);
		textArea3.setForeground(yellow);
		textArea3.setBackground(red);

		// Setting properties for labels
		orderLabel.setForeground(red);
		orderLabel.setBounds(20, 230, 200, 100);
		receiptLabel.setForeground(red);
		receiptLabel.setBounds(670, 230, 200, 100);
		welcomeLabel.setForeground(red);
		welcomeLabel.setBounds(310, -10, 500, 100);
		itemLabel.setForeground(red);
		itemLabel.setBounds(550, 40, 500, 100);

		// Adding food selection buttons to the foods button group
		foods.add(buttonjrChicken);
		foods.add(buttonbigMac);
		foods.add(buttonmcChicken);

		// Adding beverage selection buttons to the beverages button group
		beverages.add(buttonCoke);
		beverages.add(buttonSprite);

		// Adding action listeners to buttons and item listeners to radio buttons and combo boxes
		buttonjrChicken.addItemListener(this);
		buttonbigMac.addItemListener(this);
		buttonmcChicken.addItemListener(this);
		buttonCoke.addItemListener(this);
		buttonSprite.addItemListener(this);
		boxBeverageSizes.addItemListener(this);
		boxDessertsAndShakes.addItemListener(this);
		buttonOrder.addActionListener(this);
		buttonClear.addActionListener(this);

		// Adding labels to panel and setting label visibility
		mcDonaldsLabel.setBounds(780, 75, 200, 200);
		jrChickenLabel.setBounds(550, 115, 200, 100);
		jrChickenLabel.setVisible(false);
		bigMacLabel.setBounds(550, 115, 200, 100);
		bigMacLabel.setVisible(false);
		mcChickenLabel.setBounds(550, 115, 200, 100);
		mcChickenLabel.setVisible(false);
		cokeLabel.setBounds(550, 115, 200, 100);
		cokeLabel.setVisible(false);
		spriteLabel.setBounds(550, 115, 200, 100);
		spriteLabel.setVisible(false);
		oreoMcflurryLabel.setBounds(550, 115, 200, 100);
		oreoMcflurryLabel.setVisible(false);
		applePieLabel.setBounds(550, 115, 200, 100);
		applePieLabel.setVisible(false);
		chocolateChipCookieLabel.setBounds(550, 115, 200, 100);
		chocolateChipCookieLabel.setVisible(false);
		brownieCookieLabel.setBounds(550, 115, 200, 100);
		brownieCookieLabel.setVisible(false);
		strawberryShakeLabel.setBounds(550, 115, 200, 100);
		strawberryShakeLabel.setVisible(false);
		chocolateShakeLabel.setBounds(550, 115, 200, 100);
		chocolateShakeLabel.setVisible(false);

		// Adding components to the panel
		panel.add(buttonjrChicken);
		panel.add(buttonbigMac);
		panel.add(buttonmcChicken);
		panel.add(buttonCoke);
		panel.add(buttonSprite);
		panel.add(boxBeverageSizes);
		panel.add(boxDessertsAndShakes);
		panel.add(textArea1);
		panel.add(textArea2);
		panel.add(textArea3);
		panel.add(buttonOrder);
		panel.add(buttonClear);
		panel.add(mcDonaldsLabel);
		panel.add(orderLabel);
		panel.add(receiptLabel);
		panel.add(welcomeLabel);
		panel.add(itemLabel);

		// Displaying initial menu in text area
		textArea2.setText("                                Menu:\n");
		textArea2.append("\n");
		textArea2.append("  Beef and Chicken Sandwiches:\n");
		textArea2.append("    - Junior Chicken: $" + jrChickenPrice + "\n");
		textArea2.append("    - Big Mac: $" + bigMacPrice + "\n");
		textArea2.append("    - McChicken: $" + mcChickenPrice + "\n");
		textArea2.append("\n");
		textArea2.append("  Beverages:\n");
		textArea2.append("    - Coke (S/M/L): \n  $" + smallSizePrice + " / $" + mediumSizePrice + " / $"
				+ largeSizePrice + "\n");
		textArea2.append("    - Sprite (S/M/L): \n  $" + smallSizePrice + " / $" + mediumSizePrice + " / $"
				+ largeSizePrice + "\n");
		textArea2.append("\n");
		textArea2.append("  Desserts and Shakes:\n");
		textArea2.append("    - Oreo McFlurry: $" + oreoMcflurryPrice + "\n");
		textArea2.append("    - Baked Apple Pie: $" + applePiePrice + "\n");
		textArea2.append("    - Chocolate Chunk RMHC Cookie: $" + chocolateChipCookiePrice + "\n");
		textArea2.append("    - Brownie RMHC Cookie: $" + brownieCookiePrice + "\n");
		textArea2.append("    - Strawberry Triple Thick Milkshake: $" + strawberryShakePrice + "\n");
		textArea2.append("    - Chocolate Triple Thick Milkshake: $" + chocolateShakePrice + "\n");

		// Adding components to panel and setting panel visibility
		add(jrChickenLabel);
		add(bigMacLabel);
		add(mcChickenLabel);
		add(cokeLabel);
		add(spriteLabel);
		add(oreoMcflurryLabel);
		add(applePieLabel);
		add(chocolateChipCookieLabel);
		add(brownieCookieLabel);
		add(strawberryShakeLabel);
		add(chocolateShakeLabel);
		add(panel);

		// Making the frame visible
		setVisible(true);

	}

	/*
	 * Purpose: Handles the state change events generated by item selections in the GUI.
	 * PRE: ItemEvent event
	 * POST: None
	 */
	public void itemStateChanged(ItemEvent event) {
		// Handling selection of beverage sizes and types
		if (event.getStateChange() == ItemEvent.SELECTED) {
			if (event.getItemSelectable() == buttonCoke) {
				selectedBeverage = buttonCoke.getText();
			} else if (event.getItemSelectable() == buttonSprite) {
				selectedBeverage = buttonSprite.getText();
			} else if (event.getItemSelectable() == boxBeverageSizes && !selectedBeverage.isEmpty()
					&& boxBeverageSizes.getSelectedIndex() > 0) {
				textArea1.append(
						"\n" + "  " + boxBeverageSizes.getSelectedItem() + " " + selectedBeverage + " order placed");
			} else if (event.getItemSelectable() == boxDessertsAndShakes) {
				textArea1.append("\n" + "  " + boxDessertsAndShakes.getSelectedItem() + " order placed");
			}
		}
		// Handling selection of food items
		if (event.getStateChange() == ItemEvent.SELECTED) {
			if (!isSelectButtonClicked) {
				if (event.getItemSelectable() == buttonjrChicken) {
					textArea1.append("\n" + "  " + buttonjrChicken.getText() + " order placed");
				} else if (event.getItemSelectable() == buttonbigMac) {
					textArea1.append("\n" + "  " + buttonbigMac.getText() + " order placed");
					jrChickenLabel.setVisible(false);
				} else if (event.getItemSelectable() == buttonmcChicken) {
					textArea1.append("\n" + "  " + buttonmcChicken.getText() + " order placed");
				}
			}
		}
		// Handling visibility of labels based on item selection
		if (event.getItemSelectable() == buttonjrChicken) {
			jrChickenLabel.setVisible(true);
			bigMacLabel.setVisible(false);
			mcChickenLabel.setVisible(false);
			cokeLabel.setVisible(false);
			spriteLabel.setVisible(false);
			oreoMcflurryLabel.setVisible(false);
			applePieLabel.setVisible(false);
			chocolateChipCookieLabel.setVisible(false);
			brownieCookieLabel.setVisible(false);
			strawberryShakeLabel.setVisible(false);
			chocolateShakeLabel.setVisible(false);
		} else if (event.getItemSelectable() == buttonbigMac) {
			jrChickenLabel.setVisible(false);
			bigMacLabel.setVisible(true);
			mcChickenLabel.setVisible(false);
			cokeLabel.setVisible(false);
			spriteLabel.setVisible(false);
			oreoMcflurryLabel.setVisible(false);
			applePieLabel.setVisible(false);
			chocolateChipCookieLabel.setVisible(false);
			brownieCookieLabel.setVisible(false);
			strawberryShakeLabel.setVisible(false);
			chocolateShakeLabel.setVisible(false);
		} else if (event.getItemSelectable() == buttonmcChicken) {
			jrChickenLabel.setVisible(false);
			bigMacLabel.setVisible(false);
			mcChickenLabel.setVisible(true);
			cokeLabel.setVisible(false);
			spriteLabel.setVisible(false);
			oreoMcflurryLabel.setVisible(false);
			applePieLabel.setVisible(false);
			chocolateChipCookieLabel.setVisible(false);
			brownieCookieLabel.setVisible(false);
			strawberryShakeLabel.setVisible(false);
			chocolateShakeLabel.setVisible(false);
		} else if (event.getItemSelectable() == buttonCoke) {
			jrChickenLabel.setVisible(false);
			bigMacLabel.setVisible(false);
			mcChickenLabel.setVisible(false);
			cokeLabel.setVisible(true);
			spriteLabel.setVisible(false);
			oreoMcflurryLabel.setVisible(false);
			applePieLabel.setVisible(false);
			chocolateChipCookieLabel.setVisible(false);
			brownieCookieLabel.setVisible(false);
			strawberryShakeLabel.setVisible(false);
			chocolateShakeLabel.setVisible(false);

		} else if (event.getItemSelectable() == buttonSprite) {
			jrChickenLabel.setVisible(false);
			bigMacLabel.setVisible(false);
			mcChickenLabel.setVisible(false);
			cokeLabel.setVisible(false);
			spriteLabel.setVisible(true);
			oreoMcflurryLabel.setVisible(false);
			applePieLabel.setVisible(false);
			chocolateChipCookieLabel.setVisible(false);
			brownieCookieLabel.setVisible(false);
			strawberryShakeLabel.setVisible(false);
			chocolateShakeLabel.setVisible(false);
		} else if (event.getItemSelectable() == boxDessertsAndShakes) {
			jrChickenLabel.setVisible(false);
			bigMacLabel.setVisible(false);
			mcChickenLabel.setVisible(false);
			cokeLabel.setVisible(false);
			spriteLabel.setVisible(false);

			oreoMcflurryLabel.setVisible(false);
			applePieLabel.setVisible(false);
			chocolateChipCookieLabel.setVisible(false);
			brownieCookieLabel.setVisible(false);
			strawberryShakeLabel.setVisible(false);
			chocolateShakeLabel.setVisible(false);

			String selectedDessert = boxDessertsAndShakes.getSelectedItem().toString();
			if ("Oreo McFlurry".equals(selectedDessert)) {
				oreoMcflurryLabel.setVisible(true);
			} else if ("Baked Apple Pie".equals(selectedDessert)) {
				applePieLabel.setVisible(true);
			} else if ("Chocolate Chunk RMHC Cookie".equals(selectedDessert)) {
				chocolateChipCookieLabel.setVisible(true);
			} else if ("Brownie RMHC Cookie".equals(selectedDessert)) {
				brownieCookieLabel.setVisible(true);
			} else if ("Strawberry Triple Thick Milkshake".equals(selectedDessert)) {
				strawberryShakeLabel.setVisible(true);
			} else if ("Chocolate Triple Thick Milkshake".equals(selectedDessert)) {
				chocolateShakeLabel.setVisible(true);
			}
		}
	}

	/*
	 * Purpose: Handles the action events generated by button clicks in the GUI.
	 * PRE: ActionEvent event
	 * POST: None
	 */
	public void actionPerformed(ActionEvent event) {
		// Handling order placement
		double totalPrice = 0.0;
		StringBuilder orderDetails = new StringBuilder();
		orderDetails.append("\n");

		if (event.getSource() == buttonOrder) {
			if (buttonjrChicken.isSelected()) {
				totalPrice += jrChickenPrice;
				orderDetails.append("  Junior Chicken: $").append(jrChickenPrice).append("\n");
			} else if (buttonbigMac.isSelected()) {
				totalPrice += bigMacPrice;
				orderDetails.append("  Big Mac: $").append(bigMacPrice).append("\n");
			} else if (buttonmcChicken.isSelected()) {
				totalPrice += mcChickenPrice;
				orderDetails.append("  McChicken: $").append(mcChickenPrice).append("\n");
			}

			if (buttonCoke.isSelected()) {
				if (boxBeverageSizes.getSelectedItem().equals("Small")) {
					totalPrice += smallSizePrice;
					orderDetails.append("  Coke: $").append(smallSizePrice).append(" (Small)\n");
				} else if (boxBeverageSizes.getSelectedItem().equals("Medium")) {
					totalPrice += mediumSizePrice;
					orderDetails.append("  Coke: $").append(mediumSizePrice).append(" (Medium)\n");
				} else if (boxBeverageSizes.getSelectedItem().equals("Large")) {
					totalPrice += largeSizePrice;
					orderDetails.append("  Coke: $").append(largeSizePrice).append(" (Large)\n");
				}
			} else if (buttonSprite.isSelected()) {
				if (boxBeverageSizes.getSelectedItem().equals("Small")) {
					totalPrice += smallSizePrice;
					orderDetails.append("  Sprite: $").append(smallSizePrice).append(" (Small)\n");
				} else if (boxBeverageSizes.getSelectedItem().equals("Medium")) {
					totalPrice += mediumSizePrice;
					orderDetails.append("  Sprite: $").append(mediumSizePrice).append(" (Medium)\n");
				} else if (boxBeverageSizes.getSelectedItem().equals("Large")) {
					totalPrice += largeSizePrice;
					orderDetails.append("  Sprite: $").append(largeSizePrice).append(" (Large)\n");
				}
			}
			if (boxDessertsAndShakes.getSelectedItem().equals("Oreo McFlurry")) {
				totalPrice += oreoMcflurryPrice;
				orderDetails.append("  Oreo McFlurry: $").append(oreoMcflurryPrice).append("\n");
			} else if (boxDessertsAndShakes.getSelectedItem().equals("Baked Apple Pie")) {
				totalPrice += applePiePrice;
				orderDetails.append("  Baked Apple Pie: $").append(applePiePrice).append("\n");
			} else if (boxDessertsAndShakes.getSelectedItem().equals("Chocolate Chunk RMHC Cookie")) {
				totalPrice += chocolateChipCookiePrice;
				orderDetails.append("  Chocolate Chunk RMHC Cookie: $").append(chocolateChipCookiePrice).append("\n");
			} else if (boxDessertsAndShakes.getSelectedItem().equals("Brownie RMHC Cookie")) {
				totalPrice += brownieCookiePrice;
				orderDetails.append("  Brownie RMHC Cookie: $").append(brownieCookiePrice).append("\n");
			} else if (boxDessertsAndShakes.getSelectedItem().equals("Strawberry Triple Thick Milkshake")) {
				totalPrice += strawberryShakePrice;
				orderDetails.append("  Strawberry Triple Thick Milkshake: $").append(strawberryShakePrice).append("\n");
			} else if (boxDessertsAndShakes.getSelectedItem().equals("Chocolate Triple Thick Milkshake")) {
				totalPrice += chocolateShakePrice;
				orderDetails.append("  Chocolate Triple Thick Milkshake: $").append(chocolateShakePrice).append("\n");
			}
			
			double roundedTotalPrice = Math.round(totalPrice * 100.0) / 100.0;
			textArea3.setText(orderDetails.toString());
			textArea3.append("\n  Total Price to Pay: $" + roundedTotalPrice);

			// Handling order clearing
		} else if (event.getSource() == buttonClear) {

			if (foods != null) {
				foods.clearSelection();
			}
			if (beverages != null) {
				beverages.clearSelection();
			}
			if (boxBeverageSizes != null) {
				boxBeverageSizes.setSelectedIndex(0);
			}
			if (boxDessertsAndShakes != null) {
				boxDessertsAndShakes.setSelectedIndex(0);
			}
			jrChickenLabel.setVisible(false);
			bigMacLabel.setVisible(false);
			mcChickenLabel.setVisible(false);
			cokeLabel.setVisible(false);
			spriteLabel.setVisible(false);
			isSelectButtonClicked = false;
			textArea3.setText("");
			textArea1.setText("");
		}
	}
	
	public static void main(String[] args) {
		RohanRestaurant example = new RohanRestaurant();
	}
}