package application;

import java.time.LocalDate;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

class CustomHorizontalBottom extends HBox {
    public CustomHorizontalBottom() {
        setAlignment(Pos.CENTER);
        
        setSpacing(15);
        setPadding(new Insets(15, 5, 5, 5));

        getChildren().add(new Label("Today's Date: " + LocalDate.now()));
    }
}
