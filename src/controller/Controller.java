package controller;

import model.Model;
import view.View;

/*
 * The controller class contains the business logic
 * that enables the user to interact with the program.
 * The controller is also the entry point of the program.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(){
        this.model = new Model();
        this.view = new View(this);
        view.init();
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
    }
}
