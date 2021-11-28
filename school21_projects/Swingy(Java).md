      

Study project SWINGY
================
(Text based RPG)
-----------------------

*Two mods:*
-   Console based
-   GUI based([Swing API documentation](https://docs.oracle.com/javase/8/docs/technotes/guides/swing/enhancements-7.html))
-----------------------

*Programming requirements:*
-   [[MVC]] design pattern
-   Build with [[Maven]]
-   Annotation based input validation. 
-   All exceptions handling
-----------------------
*Recomendatoins:*
-   Builder pattern
-   Hibernate Validator([javax.validation](https://docs.oracle.com/javaee/7/api/javax/validation/constraints/package-summary.html))
-----------------------
*General instructions:*
-   Java 7
-   External libraries
-   Don’t use default package. Create own package structure
-   Don’t commit bins to repo
-   Run ```mvn clean package``` for generate .jar runable file
	-   The game can be launched in 2 modes as described below
``` $java -jar swingy.jar console ```
``` $java -jar swingy.jar gui ```

-----------------------
Gameplay
-----------------------
**Multiply heroes of different types**
* When the player starts the game:
	* Create hero
	* Select a previously created hero
* Player can see the hero stats:
	* Hero name
	* Hero class
	* Level
		*  level*1000+(level-1)ˆ2 * 450
			*  Level 1 - 1000 XP
			*  Level 2 - 2450 XP
			*  Level 3 - 4800 XP
			*  Level 4 - 8050 XP
			*  Level 5 - 12200 XP
	* Experience
	* Attack
	* Defense
	* Hit Point
* Hero stats are affected by the hero level and artifacts. There are 3 types of artefacs:
	* Weapon - increases the attack
	* Armor - increases defense
	* Helm - increases hit points
-----------------------
**Game Map**
* Square size formula
	* (level-1)*5+10-(level) 
		* a hero of level 7 will be placed on a 39X39 map.
* The initial position of the hero is in the center of the map
* Player wins  the game if he reaches on of the border of the map
* Each turn he can move one position in one of the 4 four directions:
	* North
	* East
	* South
	* West
-----------------------
**Villains**

* Villains of varying power will be spread randomly
*  When a hero moves to a position occupied by a villain, the hero has 2 options:
	*  Fight
		*  Simulate battle and represent the result
			*  TODO create algo for simulate and calculate who will win
				* Can include small "lucky"  component for make the game more entertaining
		* if hero looses a battle, he dies and also looses the mission
		* if hero wins a battle, he gains:
			* Exp based on the villain power
				* TODO create algo
				* Will level up if he reaches the next level expreicence
			* An artifact
				* Can keep or leave.
				* Winning doesn't guarantee that an artefact will be droped
				* Quality based on villain's strenght
	*  Run
		*  If heroe is lucky gives him 50
		*  else he must fight the villain

-----------------------