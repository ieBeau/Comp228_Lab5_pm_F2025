package application;

import java.net.URL;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

class CustomHorizontalTop extends HBox {
    public CustomHorizontalTop() {

        setAlignment(Pos.CENTER);

        setSpacing(15);
        setPadding(new Insets(15, 5, 5, 5));
        
        URL imgUrl = getClass().getResource("/image/basketball.jpg");
        if (imgUrl != null) {
            ImageView image = new ImageView(new Image(imgUrl.toExternalForm()));
            image.setFitHeight(200);
            image.setPreserveRatio(true);
            getChildren().add(image);
        } else {
            getChildren().add(new Label("Image not found"));
        }

    }
}
