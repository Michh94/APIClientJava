module org.example.week11 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;

    opens org.example.week11 to javafx.fxml;
    exports org.example.week11;
}
