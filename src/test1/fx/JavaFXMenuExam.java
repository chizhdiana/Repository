package test1.fx;

/**
 * Created by diana on 13.11.16.
 */

/*
        import javafx.application.Application;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.scene.Scene;
        import javafx.scene.control.Menu;
        import javafx.scene.control.MenuBar;
        import javafx.scene.control.MenuItem;
        import javafx.scene.layout.BorderPane;
        import javafx.stage.Stage;


public class JavaFXMenuExam extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("MenuExample");

        BorderPane main = new BorderPane();
        Scene scene = new Scene(main, 400, 350);

        MenuBar bar = new MenuBar();
        {
            Menu mnuGroup1 = new Menu("Группа1");
            {
                MenuItem mnuGroup1Item1 = new MenuItem("Пункт1");
                mnuGroup1Item1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {

                    }
                });
                mnuGroup1.getItems().add(mnuGroup1Item1);
                MenuItem mnuGroup1Item2 = new MenuItem("Пункт2");
                mnuGroup1.getItems().add(mnuGroup1Item2);
                MenuItem mnuGroup1Item3 = new MenuItem("Пункт3");
                mnuGroup1.getItems().add(mnuGroup1Item3);
            }
            bar.getMenus().add(mnuGroup1);

            Menu mnuGroup2 = new Menu("Группа2");
            {
                MenuItem mnuGroup2Item1 = new MenuItem("Пункт1");
                mnuGroup2.getItems().add(mnuGroup2Item1);
                Menu mnuGroup2Sub1 = new Menu("Подгруппа1");
                {
                    MenuItem mnuGroup2SubItem1 = new MenuItem("Пункт1");
                    mnuGroup2Sub1.getItems().add(mnuGroup2SubItem1);
                    MenuItem mnuGroup2SubItem2 = new MenuItem("Пункт2");
                    mnuGroup2Sub1.getItems().add(mnuGroup2SubItem2);
                }
                mnuGroup2.getItems().add(mnuGroup2Sub1);
                MenuItem mnuGroup2Item2 = new MenuItem("Пункт2");
                mnuGroup2.getItems().add(mnuGroup2Item2);
                MenuItem mnuGroup2Item3 = new MenuItem("Пункт3");
                mnuGroup2.getItems().add(mnuGroup2Item3);
            }
            bar.getMenus().add(mnuGroup2);

            Menu mnuGroup3 = new Menu("Группа3");
            {
                MenuItem mnuGroup3Item1 = new MenuItem("Пункт1");
                mnuGroup3.getItems().add(mnuGroup3Item1);
            }
            bar.getMenus().add(mnuGroup3);
        }
        main.setTop(bar);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
*/