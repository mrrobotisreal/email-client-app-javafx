module FirstProjectJavaFx {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.web;
    requires activation;
    requires java.mail;

    opens com.iamwintrow.email to javafx.graphics;
    opens com.iamwintrow.email.view to javafx.fxml;
    opens com.iamwintrow.email.controller to javafx.fxml;
}