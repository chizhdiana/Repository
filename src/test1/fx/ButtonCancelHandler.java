package test1.fx;

/**
 * Created by diana on 13.11.16.
 */

/*
        import javafx.event.Event;
        import javafx.event.EventHandler;
        import javafx.geometry.Insets;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.PasswordField;
        import javafx.scene.control.TextField;
        import javafx.scene.layout.GridPane;


public class ButtonCancelHandler implements EventHandler {
    private TextField login;
    private TextField password;

    public ButtonCancelHandler(TextField login, TextField password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public void handle(Event event) {

        Button btn = (Button) event.getTarget();
        switch (btn.getText()) {
            case "OK": {
                break; // ничего не делаем
            }
            case "Отмена": {
                System.exit(0); // действие выход из програмыы
            }
        }
    }
    //@Override
    public void handlerUser(Event event) {
        Label lbUser = new Label(" ");
        PasswordField pld = (PasswordField) event.getTarget();
        if (pld.getText() != null  ){
            lbUser = new Label("Login was entered");
        } else {
            lbUser = new Label("");
        }
    }
}
*/