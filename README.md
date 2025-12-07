# McDonald’s Ordering System (Java GUI)

An interactive McDonald’s-style ordering system built in Java Swing.  
Users can choose burgers, drinks (with sizes), and desserts/shakes, see the item image update on selection, and generate a receipt with the total price.

---

## Overview

This project simulates a simple fast-food ordering interface for a McDonald’s restaurant:

- The user selects:
  - A **sandwich** (Junior Chicken, Big Mac, McChicken)
  - A **beverage** (Coke or Sprite) with **Small/Medium/Large** size
  - A **dessert or shake** (Oreo McFlurry, Baked Apple Pie, cookies, or milkshakes)
- The GUI:
  - Shows a **restaurant background**
  - Displays the **McDonald’s logo**
  - Updates a **preview image** of the currently selected item
  - Maintains:
    - An **Order** area (what the user has chosen)
    - A **Menu** area (full list of items and prices)
    - A **Receipt** area (itemized bill + total price)

It uses `ItemListener` and `ActionListener` to react to user interaction and calculate the order total.

---

## Features

- **Background & Layout**
  - Custom `JPanel` (`RohanIPanel`) that draws a full-window background image (`restaurantbackground.png`).
  - Absolute positioning (`null` layout) to place components precisely.

- **Image-driven menu**
  - Each menu item has an associated image:
    - Sandwiches: Junior Chicken, Big Mac, McChicken
    - Beverages: Coke, Sprite
    - Desserts/Shakes: Oreo McFlurry, Apple Pie, RMHC cookies, Strawberry/Chocolate shakes
  - Images are loaded, scaled, and shown in a preview area when selected.

- **Order selection**
  - **Radio buttons** for sandwiches and beverages.
  - **Combo box** for beverage sizes (Small, Medium, Large).
  - **Combo box** for desserts & shakes.
  - Selections are appended to an **“Order”** text area as the user chooses items.

- **Receipt calculation**
  - Click **“Order”** to:
    - Read current selections
    - Add up prices (burgers + drink size + dessert/shake)
    - Show an itemized list in the **“Receipt”** text area
    - Display the **total price**, rounded to two decimals

- **Clear/reset**
  - Click **“Clear”** to:
    - Reset all radio buttons and combo boxes
    - Hide all item preview images
    - Clear the “Order” and “Receipt” text areas

---

## Project Structure

### `RohanIPanel.java`

- Extends `JPanel`.
- Loads `restaurantbackground.png` using `Toolkit`.
- Overrides `paintComponent(Graphics)` to draw the background stretched to the window size.

### `RohanRestaurant.java`

- Extends `JFrame` and implements `ItemListener`, `ActionListener`.
- Main GUI class that:
  - Sets up:
    - **ImageIcon**s and scaled `Image`s for all menu items and logo.
    - `JLabel`s for each image (used as preview images).
    - Radio buttons, combo boxes, text areas, labels, and checkboxes.
  - Groups sandwich and beverage radio buttons (`ButtonGroup`) so only one from each group is selected at a time.
  - Uses:
    - `itemStateChanged(ItemEvent)` to update:
      - Order text area when items are selected
      - Preview image visibility based on the selected item
      - Beverage + size selections
    - `actionPerformed(ActionEvent)` to:
      - Calculate item prices
      - Build an itemized receipt
      - Compute and display the total
      - Clear the UI when the “Clear” checkbox is used

- Contains the `main` method:
  ```java
  public static void main(String[] args) {
      RohanRestaurant example = new RohanRestaurant();
  }
