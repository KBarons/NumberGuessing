package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    private TextField guessedNumber;
    private Stage window;
    private int roundedResult = (int) (Math.random() * 100);

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        primaryStage.setTitle("Number guessing game, trying conflict");
        guessedNumber = new TextField();
        guessedNumber.setPromptText("Please enter your number!");
        Button playButton = new Button("Check the number");

        VBox vBox = new VBox();
        vBox.getChildren().addAll(guessedNumber, playButton);

        playButton.setOnAction(event -> {
            checkNumber();
        });

        Scene scene = new Scene(vBox, 640, 480);
        window.setScene(scene);
        primaryStage.show();
    }

    private void checkNumber() {
        guessedNumber.getText();

        if (guessedNumber.equals(roundedResult)) {
            System.out.println("Your number is too big!");

        } else if (guessedNumber.equals(roundedResult)) {
            System.out.println("Your number is too small!");
            System.out.println("GIT is much fun");

        } else {
            window.close();
            System.out.println("You guessed my number!");
        }
    }



//        int roundedResult = (int) (Math.random() * 100);
//
//        System.out.println("Please try to guess my number!");
//        Scanner sc = new Scanner(System.in);
//        int guess = sc.nextInt();
//        System.out.println(roundedResult);
//
//        if (guess > roundedResult) {
//            System.out.println("Your number is too big!");
//        } else if (guess < roundedResult) {
//            System.out.println("Your number is too small!");
//        } else {
//            System.out.println("You guessed my number!");
//        }
//      }


