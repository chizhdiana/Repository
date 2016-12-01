package test1.fx;

/**
 * Created by diana on 13.11.16.
 */


      /*  import javafx.application.Application;

        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.geometry.Insets;
        import javafx.geometry.Orientation;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.PasswordField;
        import javafx.scene.control.TextField;
        import javafx.scene.layout.BorderPane;
        import javafx.scene.layout.FlowPane;
        import javafx.scene.layout.GridPane;
        import javafx.stage.Stage;


public class javaFXDemo2 extends   Application{
    private TextField fldLogin;
    private PasswordField fldPassword;


    User user = new User();
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Аутентификация");
        // primaryStage.setResizable(false);


        GridPane mainPane = new GridPane();
        mainPane.setPadding(new Insets(5,5,5,5));
        mainPane.setHgap(10);
        mainPane.setVgap(10);
        ButtonCancelHandler handlerUser = new  ButtonCancelHandler(  fldLogin,  fldPassword);

        Label lbLogin = new Label("Логин");
        lbLogin.setMinSize(75,25);
        mainPane.add(lbLogin, 0,0);
        TextField fldLogin = new TextField();

        fldLogin.setText(user.getLogin());
        fldLogin.setOnAction(handlerUser);

        mainPane.add(fldLogin, 1,0);

        Label lbPassword = new Label("Пароль");
        lbPassword.setMinSize(75,25);
        mainPane.add(lbPassword, 0,1);
        PasswordField fldPassword = new PasswordField();

        fldPassword.setText(user.getPassword());

        mainPane.add(fldPassword, 1,1);


        ButtonCancelHandler handler = new  ButtonCancelHandler(  fldLogin,  fldPassword);

        Button btnSingUp = new Button("ОК");
        btnSingUp.setMinSize(75,25);
        btnSingUp.setOnAction(handler);
        mainPane.add(btnSingUp, 0,2);

        Button btnCancel = new Button("Отмена");
        btnCancel.setMinSize(150, 25);
        btnCancel.setOnAction(handler);
        mainPane.add(btnCancel,1,2 );

        Scene scene  =  new Scene(mainPane, 250,250);

        primaryStage.setScene(scene);


        primaryStage.show();

    }
}
*/