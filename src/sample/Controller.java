package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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

        try {
            File file = new File("test.txt");
            PrintWriter myWriter = new PrintWriter("file.txt");
            myWriter.write(spillerPoint);
            myWriter.write(computerPoint);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void load(){


    }
}

