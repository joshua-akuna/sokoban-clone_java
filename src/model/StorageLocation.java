package model;

import java.awt.*;

/*
 * This class is responsible for the game board cells
 * that all the boxes must be moved to.
 * Objects of this type must not move across the
 * board or collide with the game objects.
 */
public class StorageLocation extends GameObject{
    public StorageLocation(int x, int y) {
        super(x, y, 2*Model.BOARD_CELL_SIZE, 2*Model.BOARD_CELL_SIZE);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2d.setColor(Color.RED);

        g2d.drawOval(getX(), getY(), getWidth(), getHeight());
    }

    public static StorageLocation createStorageLocation (int x, int y){
        return new StorageLocation(x, y);
    }
}
