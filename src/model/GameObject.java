package model;

import java.awt.*;

public abstract class GameObject {
    //x and y represents the coordinate of the GameObject instance
    private int x;
    private int y;
    //width and height represents the dimensions of the instance
    private int width;
    private int height;

    public GameObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = Model.BOARD_CELL_SIZE;
        this.height = Model.BOARD_CELL_SIZE;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /*
     * @param g
     * This abstract method will be implemented differently
     * each implement of the GameObject subclass.
     *
     * Graphics is an abstract class of the java.awt library.
     */
    abstract void draw (Graphics g);
}
