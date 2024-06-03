module com.main.codelab6modul {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.codelab6modul to javafx.fxml;
    exports com.main.codelab6modul;
    exports com.main.codelab;
    opens com.main.codelab to javafx.fxml;
}