package fr.umontpellier.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {
        // code de l'exercice 1
        BorderPane root = new BorderPane();

        /*
         * Menu - TOP
         */
        MenuItem file_new = new MenuItem("New");
        MenuItem file_open = new MenuItem("Open");
        MenuItem file_save = new MenuItem("Save");
        MenuItem file_close = new MenuItem("Close");
        Menu file_menu = new Menu("File");
        file_menu.getItems().addAll(file_new, new SeparatorMenuItem(), file_open, new SeparatorMenuItem(), file_save, new SeparatorMenuItem(), file_close);

        MenuItem edit_cut = new MenuItem("Cut");
        MenuItem edit_copy = new MenuItem("Copy");
        MenuItem edit_paste = new MenuItem("Paste");
        Menu edit_menu = new Menu("Edit");
        edit_menu.getItems().addAll(edit_cut, new SeparatorMenuItem(), edit_copy, new SeparatorMenuItem(), edit_paste);

        Menu help_menu = new Menu("Help");

        MenuBar toolbar = new MenuBar(file_menu, edit_menu, help_menu);
        root.setTop(toolbar);


        /*
         * LEFT
         */
        Label label_buttons = new Label("Boutons :");
        Button button_one = new Button("Bouton 1");
        Button button_two = new Button("Bouton 2");
        Button button_three = new Button("Bouton 3");
        VBox vbox_buttons = new VBox(label_buttons, button_one, button_two, button_three);
        vbox_buttons.setAlignment(Pos.CENTER);
        vbox_buttons.setSpacing(10);
        HBox left_box = new HBox(vbox_buttons, new Separator(Orientation.VERTICAL));
        left_box.setAlignment(Pos.CENTER);
        root.setLeft(left_box);

        /*
         * Form - CENTER
         */
        GridPane grid_form = new GridPane();
        grid_form.setAlignment(Pos.CENTER);
        grid_form.setHgap(10);
        grid_form.setVgap(10);

        Label name_label = new Label("Name:");
        TextField name_text = new TextField();
        grid_form.addRow(0, name_label, name_text);

        Label email_label = new Label("Email:");
        TextField email_text = new TextField();
        grid_form.addRow(1, email_label, email_text);

        Label password_label = new Label("Password:");
        PasswordField password_text = new PasswordField();
        grid_form.addRow(2, password_label, password_text);

        Button submit_button = new Button("Submit");
        Button cancel_button = new Button("Cancel");
        HBox form_buttons_box = new HBox(submit_button, cancel_button);
        form_buttons_box.setSpacing(10);
        form_buttons_box.setAlignment(Pos.CENTER);

        VBox box_form = new VBox(grid_form, form_buttons_box);
        box_form.setSpacing(10);
        box_form.setAlignment(Pos.CENTER);

        root.setCenter(box_form);


        /*
         * BOTTOM
         */
        Label label_bottom = new Label("Ceci est un label de bas de page");
        VBox box_bottom = new VBox(new Separator(), label_bottom);
        box_bottom.setAlignment(Pos.CENTER);
        root.setBottom(box_bottom);


        /*
         * Scene Application
         */
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

