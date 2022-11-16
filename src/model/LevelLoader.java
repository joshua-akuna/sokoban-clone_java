package model;

import java.nio.file.Path;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LevelLoader {
    private Path levels;

    public LevelLoader(Path levels) {
        this.levels = levels;
    }

    public GameObjects getLevel (int level){
        Set<Wall> walls = new HashSet<>();
        Set<StorageLocation> locations = new HashSet<>();
        Set<Box> boxes = new HashSet<>();

        return new GameObjects(
                walls,
                boxes,
                locations,
                Player.createPlayer(
                        getRandomNumber(),
                        getRandomNumber()
                )
        );
    }

    private int getRandomNumber(){
        return new Random().nextInt(50) * 10;
    }
}
