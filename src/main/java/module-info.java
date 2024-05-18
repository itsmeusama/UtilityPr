module com.example.utilitypr {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.utilitypr to javafx.fxml;
    exports com.example.utilitypr;
}