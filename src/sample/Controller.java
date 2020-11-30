package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.security.PublicKey;

public class Controller {

    @FXML
    Button StenButton;
    @FXML
    private Button SaksButton;
    @FXML
    private Button PapirButton;
    @FXML
    ImageView PersonImageView;
    @FXML
    ImageView ComputerImageView;

    public void sten() {
        Image stenBillede = new Image("https://www.naarlivetslaar.dk/media/1045/sten.jpg?anchor=center&mode=crop&width=767&height=350&rnd=131779525870000000");

        PersonImageView.setImage(stenBillede);
        int random = ((int) (Math.random() * 3) + 1);

        if (random == 1) {
            Image i = new Image("https://www.naarlivetslaar.dk/media/1045/sten.jpg?anchor=center&mode=crop&width=767&height=350&rnd=131779525870000000");
            ComputerImageView.setImage(i);
        } else if (random == 2) {
            Image i = new Image("https://www.danianova.dk/resources/product/745/300/745300.jpg?width=1024&height=768&bgcolor=fff");
            ComputerImageView.setImage(i);
        } else if (random == 3) {
            Image i = new Image("https://www.cchobby.dk/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/2/3/23534_1.jpg");
            ComputerImageView.setImage(i);
        }


    }

    public void saks() {
        Image saksBillede = new Image("https://www.danianova.dk/resources/product/745/300/745300.jpg?width=1024&height=768&bgcolor=fff");

        PersonImageView.setImage(saksBillede);
        int random = ((int) (Math.random() * 3) + 1);

        if (random == 1) {
            Image i = new Image("https://www.naarlivetslaar.dk/media/1045/sten.jpg?anchor=center&mode=crop&width=767&height=350&rnd=131779525870000000");
            ComputerImageView.setImage(i);
        } else if (random == 2) {
            Image i = new Image("https://www.danianova.dk/resources/product/745/300/745300.jpg?width=1024&height=768&bgcolor=fff");
            ComputerImageView.setImage(i);
        } else if (random == 3) {
            Image i = new Image("https://www.cchobby.dk/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/2/3/23534_1.jpg");
            ComputerImageView.setImage(i);
        }


    }

    public void papir() {
        Image papirBillede = new Image("https://www.cchobby.dk/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/2/3/23534_1.jpg");

        PersonImageView.setImage(papirBillede);
        int random = ((int) (Math.random() * 3) + 1);

        if (random == 1) {
            Image i = new Image("https://www.naarlivetslaar.dk/media/1045/sten.jpg?anchor=center&mode=crop&width=767&height=350&rnd=131779525870000000");
            ComputerImageView.setImage(i);
        } else if (random == 2) {
            Image i = new Image("https://www.danianova.dk/resources/product/745/300/745300.jpg?width=1024&height=768&bgcolor=fff");
            ComputerImageView.setImage(i);
        } else if (random == 3) {
            Image i = new Image("https://www.cchobby.dk/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/2/3/23534_1.jpg");
            ComputerImageView.setImage(i);
        }

    }

}
