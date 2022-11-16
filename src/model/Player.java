package model;

import java.awt.*;

public class Player
        extends CollisionObject
        implements Movable{
    public Player(int x, int y) {
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
    public void move(int x, int y) {
        int newX = getX() + x;
        int newY = getY() + y;

        if(newX < 0 || newX >= getHeight()
                || newY < 0 || newY >= getWidth())
            return;

        setX(newX);
        setY(newY);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(getX(), getY(), getWidth(), getHeight());
    }

    public static Player createPlayer (int x, int y){
        return new Player(x, y);
    }
}
