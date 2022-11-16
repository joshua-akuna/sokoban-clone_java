package model;

import java.awt.*;

public class Box
        extends CollisionObject
        implements Movable{
    public Box(int x, int y) {
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
        g2d.setColor(Color.BLACK);

        int x1 = getX();
        int x2 = getX() + getHeight();
        int y1 = getY();
        int y2 = getY() + getWidth();

        g2d.setColor(Color.GREEN);
        g2d.fillRect(x1, y1, getWidth(), getHeight());

        g2d.setColor(Color.BLACK);

        g2d.drawLine(x1, y1, x2, y2);
        g2d.drawLine(x2, y1, x1, y2);

        g2d.drawRect(x1, y1, getWidth(), getHeight());
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
}
