# ⚔️ Text-Based Survival RPG

A comprehensive **Command-Line Interface (CLI) Adventure Game** developed in Java. This project serves as a practical implementation of **Object-Oriented Programming (OOP)** concepts, featuring a modular architecture with distinct classes for locations, enemies, items, and game logic.

## 🕹️ Game Mechanics

The goal of the game is to survive, gather specific resources from dangerous zones, and return to the Safe House to win.

* **Combat System:** A turn-based battle mechanic where the player fights against randomly spawned obstacles (Bears, Zombies, Vampires).
* **Inventory System:** Players can buy weapons/armor from the Tool Store and collect loot from enemies.
* **Map Navigation:** Travel between safe zones (Safe House, Tool Store) and battle zones (Cave, Forest, River).
* **Win Condition:** Collect all three unique awards (**Food, Firewood, Water**) and return to the Safe House.

## 🏗️ Technical Architecture (OOP)

The project heavily relies on **Inheritance** and **Abstract Classes** to manage code reusability and logic flow.

### Class Structure
* **`Location` (Abstract):** Base class for all places.
    * **`NormalLoc`:** Places with no enemies (e.g., `SafeHouse`, `ToolStore`).
    * **`BattleLoc`:** Places with enemies (e.g., `Cave`, `Forest`, `River`).
* **`Obstacle`:** Represents enemies (`Bear`, `Zombie`, `Vampire`) with dynamic damage and health stats.
* **`Player`:** Manages health, damage, money, and `Inventory`.

## 📂 File Overview

Based on the source code structure:

| Class | Description |
| :--- | :--- |
| `Game.java` | The main engine that handles the gameplay loop and location selection. |
| `Player.java` | Manages player stats, character selection (Samurai, Archer, Knight), and inventory. |
| `BattleLoc.java` | abstract class handling the combat logic, "Hit or Run" mechanics, and loot drops. |
| `SafeHouse.java` | A location where the player's health is fully restored. |
| `ToolStore.java` | A shop interface to purchase Weapons and Armor using collected money. |
| `Obstacle.java` | Defines generic enemy properties (ID, damage, health). |

## 💻 How to Run

Ensure you have Java installed on your machine.

```bash
# Clone the repository
git clone [https://github.com/sudeeyilmaz/OOP-Adventure-Quest.git](https://github.com/sudeeyilmaz/OOP-Adventure-Quest.git)

# Navigate to the source folder
cd OOP-Adventure-Quest/src

# Compile the project
javac Main.java

# Run the game
java Main
