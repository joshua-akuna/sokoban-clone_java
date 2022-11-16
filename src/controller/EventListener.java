package controller;

import model.Direction;

/*
 * This interface must be implemented by all classes
 * that handle events.
 */
public interface EventListener {
    //moves the object in the specified direction.
    void move (Direction direction);
    //restarts the current level
    void restart();
    //starts the next level
    void startNextLevel();
    //the level with the passed index has been completed.
    void levelCompleted (int level);
}
