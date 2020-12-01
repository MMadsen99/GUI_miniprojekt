package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.security.PublicKey;

public class Controller {

    @FXML
    private Button StenButton;
    @FXML
    private Button SaksButton;
    @FXML
    private Button PapirButton;
    @FXML
    ImageView PersonImageView;
    @FXML
    ImageView ComputerImageView;
    @FXML
    TextField pointTæller;
    @FXML
    Label LabelPointTæller;


    public void sten() {
        Image stenBillede = new Image("https://www.naarlivetslaar.dk/media/1045/sten.jpg?anchor=center&mode=crop&width=767&height=350&rnd=131779525870000000");
        PersonImageView.setImage(stenBillede);
        int spillervalg = 1;

        int random = ((int) (Math.random() * 3) + 1);

        if (random == 1) {
            Image sten = new Image("https://www.naarlivetslaar.dk/media/1045/sten.jpg?anchor=center&mode=crop&width=767&height=350&rnd=131779525870000000");
            ComputerImageView.setImage(sten);

            LabelPointTæller.setText("Draw");
        } else if (random == 2) {
            Image saks = new Image("https://www.danianova.dk/resources/product/745/300/745300.jpg?width=1024&height=768&bgcolor=fff");
            ComputerImageView.setImage(saks);

            LabelPointTæller.setText("You win");
        } else if (random == 3) {
            Image papir = new Image("https://www.cchobby.dk/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/2/3/23534_1.jpg");
            ComputerImageView.setImage(papir);

            LabelPointTæller.setText("You lose");
        }
    }
    public void saks() {
        Image saksBillede = new Image("https://www.danianova.dk/resources/product/745/300/745300.jpg?width=1024&height=768&bgcolor=fff");
        PersonImageView.setImage(saksBillede);
        int spillervalg = 2;

        int random = ((int) (Math.random() * 3) + 1);

        if (random == 1) {
            Image sten = new Image("https://www.naarlivetslaar.dk/media/1045/sten.jpg?anchor=center&mode=crop&width=767&height=350&rnd=131779525870000000");
            ComputerImageView.setImage(sten);

            LabelPointTæller.setText("You lose");
        } else if (random == 2) {
            Image saks = new Image("https://www.danianova.dk/resources/product/745/300/745300.jpg?width=1024&height=768&bgcolor=fff");
            ComputerImageView.setImage(saks);

            LabelPointTæller.setText("Draw");
        } else if (random == 3) {
            Image papir = new Image("https://www.cchobby.dk/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/2/3/23534_1.jpg");
            ComputerImageView.setImage(papir);

            LabelPointTæller.setText("You win");
        }
    }
    public void papir() {
        Image papirBillede = new Image("https://www.cchobby.dk/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/2/3/23534_1.jpg");
        PersonImageView.setImage(papirBillede);
        int spillervalg = 3;

        int random = ((int) (Math.random() * 3) + 1);

        if (random == 1) {
            Image sten = new Image("https://www.naarlivetslaar.dk/media/1045/sten.jpg?anchor=center&mode=crop&width=767&height=350&rnd=131779525870000000");
            ComputerImageView.setImage(sten);

            LabelPointTæller.setText("You win");
        } else if (random == 2) {
            Image saks = new Image("https://www.danianova.dk/resources/product/745/300/745300.jpg?width=1024&height=768&bgcolor=fff");
            ComputerImageView.setImage(saks);

            LabelPointTæller.setText("You lose");
        } else if (random == 3) {
            Image papir = new Image("https://www.cchobby.dk/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/2/3/23534_1.jpg");
            ComputerImageView.setImage(papir);

            LabelPointTæller.setText("Draw");
        }
    }
}


/*
 int random = ((int) (Math.random() * 3) + 1);

            if (random == 1) {
                Image stenC = new Image("https://www.naarlivetslaar.dk/media/1045/sten.jpg?anchor=center&mode=crop&width=767&height=350&rnd=131779525870000000");
                ComputerImageView.setImage(stenC);
            } else if (random == 2) {
                Image saksC = new Image("https://www.danianova.dk/resources/product/745/300/745300.jpg?width=1024&height=768&bgcolor=fff");
                ComputerImageView.setImage(saksC);
            } else if (random == 3) {
                Image papirC = new Image("https://www.cchobby.dk/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/2/3/23534_1.jpg");
                ComputerImageView.setImage(papirC);
            }

 */