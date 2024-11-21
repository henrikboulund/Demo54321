module dk.easv.demo54321 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.demo54321 to javafx.fxml;
    exports dk.easv.demo54321;
}