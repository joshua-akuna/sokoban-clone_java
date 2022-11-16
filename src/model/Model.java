package model;

import controller.EventListener;

import java.io.File;
import java.nio.file.Path;

/*
 *  The Model class defines the current state
 *  of the program.
 */
public class Model {
    //represents the size of each cell of the graphical board.
    //Each GameObject instance will occupies one cell
    //This is the size that will be used in calculating
    //movement and collisions.
    //This parameter is used when drawing the object only.
    public static final int BOARD_CELL_SIZE = 20;
    //It will store our current game objects
    private GameObjects gameObjects;
    //It will store the current game level
    private int currentLevel = 1;
    //References a LevelLoader instance.
    private LevelLoader levelLoader;
    //Responsible for handling the user events
    private EventListener eventListener;

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
        this.levelLoader = new LevelLoader(
                new File("levels.txt")
                .toPath()
        );
    }

    //returns the GameObjects reference
    public GameObjects getGameObjects() {
        return gameObjects;
    }

    //get the corresponding GameObjects instance
    //for the level argument from the LevelLoader instance
    //and assign it to the GameObjects instance of the
    //current Model instance.
    public void restartLevel (int level){
        this.gameObjects = levelLoader.getLevel(level);
    }
    //restarts the current level of the game
    public void restart(){
        restartLevel(currentLevel);
    }
    //Increases the value of the currentLevel and
    //restart the new level
    public void startNextLevel(){
        int newLevel = currentLevel + 1;
        restartLevel(newLevel);
    }
}
