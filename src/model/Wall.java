package model;

import java.awt.*;

/*
 * The Wall class will define each cell of the wall.
 * The wall can collide with other objects
 * but cannot move.
 */
public class Wall extends CollisionObject{

    public Wall(int x, int y) {
        super(x, y);
    }

    @Override
    boolean isCollision(
            GameObject gameObject,
            Direction direction
    ) {
        return false;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    public static Wall createWall (int x, int y){
        return new Wall(x, y);
    }
}
