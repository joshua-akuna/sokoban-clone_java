package model;

import java.util.HashSet;
import java.util.Set;

public class GameObjects {
    Set<Wall> walls;
    Set<Box> boxes;
    Set<StorageLocation> storageLocations;
    Player player;

    public GameObjects(
            Set<Wall> walls,
            Set<Box> boxes,
            Set<StorageLocation> storageLocations,
            Player player
    ) {
        this.walls = walls;
        this.boxes = boxes;
        this.storageLocations = storageLocations;
        this.player = player;
    }

    public Set<Wall> getWalls() {
        return walls;
    }

    public Set<Box> getBoxes() {
        return boxes;
    }

    public Set<StorageLocation> getStorageLocations() {
        return storageLocations;
    }

    public Player getPlayer() {
        return player;
    }

    /*
     * @return
     * This object returns a set containing all
     * the instances of GameObjects.
     */
    public Set<GameObject> getAllGameObjects(){
        Set<GameObject> allGameObjects = new HashSet<>();

        if(!walls.isEmpty()) allGameObjects.addAll(walls);
        if(!boxes.isEmpty()) allGameObjects.addAll(boxes);
        if(!storageLocations.isEmpty())
            allGameObjects.addAll(storageLocations);

        return allGameObjects;
    }
}
