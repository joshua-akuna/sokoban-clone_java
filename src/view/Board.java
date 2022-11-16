package view;
import controller.EventListener;
import model.Box;
import model.Player;
import model.StorageLocation;
import model.Wall;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    private View view;

    private EventListener eventListener;

    public Board (View view){
        this.view = view;
    }

    public void paint(Graphics g){
        Player currentPlayer = new Player(80, 80);
        currentPlayer.draw(g);

        Box box = new Box(50, 50);
        box.draw(g);

        StorageLocation st = new StorageLocation(40,40);
        st.draw(g);

        Wall wall = new Wall(0,0);
        wall.draw(g);
    }

    public void setEventListener(EventListener e){

    }
}