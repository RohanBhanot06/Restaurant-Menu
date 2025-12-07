# McDonald’s Style Restaurant Menu (Java GUI)

A Java Swing GUI that displays a McDonald’s-style restaurant menu using custom images for popular items like Big Mac, McChicken, Jr. Chicken, Oreo McFlurry, shakes, soft drinks, and desserts.

---

## Overview

This project is a simple GUI-based restaurant menu built in Java.  
It was inspired by the McDonald’s menu and focuses on:

- Loading and displaying menu item images (burgers, drinks, desserts).
- Presenting them in a visually appealing window with a restaurant-style background.
- Practicing Java Swing, panels, and basic 2D graphics.

All of the menu items are represented using images such as:

- `bigMac.jpeg`, `mcChicken.jpeg`, `jrChicken.jpeg`
- `applePie.jpeg`, `brownieCookie.jpeg`, `chocolateChipCookie.jpeg`, `oreoMcflurry.jpeg`
- `coke.jpeg`, `sprite.jpeg`, `chocolateShake.jpeg`, `strawberryShake.jpeg`
- Background image: `restaurantbackground.png`  
- Logo: `mcDonalds.jpeg` :contentReference[oaicite:1]{index=1}  

---

## Features

- **Java Swing GUI**
  - Main restaurant window that shows a McDonald’s-style menu.
  - Custom background image to imitate a restaurant setting.

- **Image-based menu**
  - Each menu item is displayed with a corresponding image (burgers, drinks, desserts).
  - Easy to visually identify each product.

- **Separation of concerns**
  - One main class to set up the window.
  - A custom panel class to handle drawing images and layout.

---

## Project Structure

Main files in this project:

- `RohanRestaurant.java`  
  - Likely the main entry point.
  - Creates the main application window (`JFrame`) and adds the custom panel.

- `RohanIPanel.java`  
  - Custom Swing panel responsible for drawing the menu.
  - Loads and displays the item images (burgers, drinks, desserts, logo, background).

- Image assets:
  - `applePie.jpeg`
  - `bigMac.jpeg`
  - `brownieCookie.jpeg`
  - `chocolateChipCookie.jpeg`
  - `chocolateShake.jpeg`
  - `coke.jpeg`
  - `jrChicken.jpeg`
  - `mcChicken.jpeg`
  - `mcDonalds.jpeg`
  - `oreoMcflurry.jpeg`
  - `restaurantbackground.png`
  - `sprite.jpeg`
  - `strawberryShake.jpeg` :contentReference[oaicite:2]{index=2}  

> If you move any images into subfolders, be sure to update the image paths in the Java code.

---

## How to Run

1. **Install Java**

   Make sure you have the Java JDK installed (Java 8 or later).

2. **Clone the repository**

   ```bash
   git clone https://github.com/RohanBhanot06/Restaurant-Menu.git
   cd Restaurant-Menu
