package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.*;
import java.util.Scanner;

public class Controller {


    @FXML
    private Button StenButton;
    @FXML
    private Button LoadButton;
    @FXML
    private Button SaveButton;
    @FXML
    private Button SaksButton;
    @FXML
    private Button PapirButton;
    @FXML
    ImageView PersonImageView;
    @FXML
    ImageView ComputerImageView;
    @FXML
    Label LabelPointTæller;
    @FXML
    Label LabelPointScore;
    public int spillerPoint = 0;
    public int computerPoint = 0;

    Image sten = new Image("/billeder/rock.png");
    Image saks = new Image("/billeder/scissors.png");
    Image papir = new Image("/billeder/paper.png");


    public void sten() {

        PersonImageView.setImage(sten);


        int random = ((int) (Math.random() * 3) + 1);

        if (random == 1) {
            ComputerImageView.setImage(sten);

            LabelPointTæller.setText("   Draw");
        } else if (random == 2) {
            ComputerImageView.setImage(saks);
            spillerVandt();
            LabelPointTæller.setText("You win");

        } else if (random == 3) {
            ComputerImageView.setImage(papir);
            computerVandt();
            LabelPointTæller.setText("You lose");
        }
        score();
    }

    public void saks() {
        PersonImageView.setImage(saks);


        int random = ((int) (Math.random() * 3) + 1);

        if (random == 1) {
            ComputerImageView.setImage(sten);
            computerVandt();
            LabelPointTæller.setText("You lose");
        } else if (random == 2) {
            ComputerImageView.setImage(saks);

            LabelPointTæller.setText("   Draw");
        } else if (random == 3) {
            ComputerImageView.setImage(papir);
            spillerVandt();
            LabelPointTæller.setText("You win");
        }
        score();
    }

    public void papir() {
        PersonImageView.setImage(papir);


        int random = ((int) (Math.random() * 3) + 1);

        if (random == 1) {
            ComputerImageView.setImage(sten);
            spillerVandt();
            LabelPointTæller.setText("You win");

        } else if (random == 2) {
            ComputerImageView.setImage(saks);
            computerVandt();
            LabelPointTæller.setText("You lose");
        } else if (random == 3) {
            ComputerImageView.setImage(papir);

            LabelPointTæller.setText("   Draw");
        }
        score();
    }

    public void spillerVandt() {
        ++spillerPoint;
    }

    public void computerVandt() {
        ++computerPoint;
    }

    public void score() {

        LabelPointScore.setText(spillerPoint + "-" + computerPoint);
    }

    public void save() throws IOException {

        java.io.File file = new java.io.File("src/saveFile.txt");
        try{
            java.io.PrintWriter output = new java.io.PrintWriter(file);
            output.print(spillerPoint + "\n");
            output.print(computerPoint + "\n");

            output.close();
            System.out.println("The file has been saved");
        }catch (Exception e ){
            System.out.println("Something went wrong");
        }
    }
    public void load() throws FileNotFoundException {

        java.io.File file = new java.io.File("src/saveFile.txt");
        try{
            Scanner input = new Scanner(file);
           int sPoint = input.nextInt();
           int cPoint = input.nextInt();
           spillerPoint = sPoint;
           computerPoint = cPoint;

           LabelPointScore.setText(spillerPoint + " - " + computerPoint);

           input.close();

        }catch (Exception e ){
            System.out.println("Something went wrong");
        }
    }
}

