package view;

import controller.Controller;
import controller.EventListener;

import javax.swing.*;
import java.awt.*;

/*
 * The View class is responsible for displaying
 * the game state on the device screen.
 */
public class View extends JFrame {
    private Controller controller;
    private Board board;

    public View(Controller controller){
        this.controller = controller;
    }

    /*
     * Creates a new Board instance and displays the
     * game state on the screen
     */
    public void init(){
        this.board = new Board(this);
        add(board);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setTitle("Sokoban");
        setVisible(true);
    }

    public void setEventListener (EventListener e){
        board.setEventListener(e);
    }
}
