package test1.fx;

/**
 * Created by diana on 13.11.16.
 */

    /*    import javafx.application.Application;
        import javafx.geometry.Insets;
        import javafx.geometry.Orientation;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;
        import javafx.scene.layout.BorderPane;
        import javafx.scene.layout.FlowPane;
        import javafx.scene.layout.GridPane;
        import javafx.stage.Stage;


public class javaFXDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("JavaFXDemo");
        // primaryStage.setResizable(false); // апрещает возможность расширения окна
        primaryStage.setMinHeight(225); // задаем мин высота и ширина, можно мамх меньше этих размеров окно не изменяет размер
        primaryStage.setMinWidth(325);  // другими словами фиксация границ, меньше не сужается окно
        // primaryStage.setMaxHeight(225);  // другими словами фиксация границ, меньше не сужается окно
        // primaryStage.setMaxWidth(325);  // другими словами фиксация границ, меньше не сужается окно


        // указать сцену
        BorderPane border = new BorderPane();
        FlowPane panel = new FlowPane(); // если окно уменьшается, компоненты отображаются подстраиваясь под размер окна

        panel.setOrientation(Orientation.HORIZONTAL); // адаем горизонтальное размещение
        panel.setHgap(5);
        panel.setVgap(5); // расстояние между

        // создадим три кнопки
        Button btnFirst = new Button("Button1");
        btnFirst.setMinSize(15,70); // задали размер кнопки
        // добавляем кнопку на панель
        panel.getChildren().add(btnFirst); // метод добавления на панель
        Button btnSecond = new Button("Button2");
        btnSecond.setMinSize(70,25);

        panel.getChildren().add(btnSecond);
        Button btnThird = new Button("Button3");
        btnThird.setMinSize(30,60);
        panel.getChildren().add( btnThird);


        border.setTop(panel);// ???????

        FlowPane left = new FlowPane();
        left.setOrientation(Orientation.VERTICAL);
        left.setHgap(5);
        left.setVgap(5); // отступы

// ефт отступает от бордераина 10
        left.setPadding(new Insets(5,5,5,5)); // тступ компонента
        left.setMargin(border, new Insets(10,10,10,10));// отступ от компонента до границы окна
        Label labelFirst = new Label("Label1");
        left.getChildren().add(labelFirst);
        Label labelSecond = new Label("Label2");
        left.getChildren().add(labelSecond);
        Label labelThird = new Label("Label3");
        left.getChildren().add(labelThird);



        border.setLeft(left);// панель размещаем в ТОP


        FlowPane center = new FlowPane();
        center.setOrientation(Orientation.VERTICAL);
        center.setHgap(5);
        center.setVgap(5);

        border.setCenter(center); // панель размещаем

        TextField fldFirst = new TextField();
        center.getChildren().add(fldFirst);
        TextField fldSecond = new TextField();
        center.getChildren().add(fldSecond);
        TextField fldThird = new TextField();
        center.getChildren().add(fldThird);



        Scene main  =  new Scene(border, 250,250); // размер

        GridPane grid = new GridPane(); // таблица
        grid.setHgap(5);
        grid.setVgap(5);
        // оздаем еще компоненты
        Label lbl1 = new Label("Label1");
        grid.add(lbl1, 0,0);
        TextField fld1 = new TextField();
        grid.add(fld1, 1,0);
        Label lbl2 = new Label("Label2" );
        grid.add(lbl2, 0,1);
        Button btn1 = new Button("Btn1");
        grid.add(btn1, 2, 2); // ндексами задаем  место расположения

        border.setRight(grid); //  в правую часть окна поместиль нашу таблицу

        primaryStage.setScene(main);  // окну задать сцену

        primaryStage.show();  // вывод окна на екран
    }
}

*/