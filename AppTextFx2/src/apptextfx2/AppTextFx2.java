
package apptextfx2;



import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class AppTextFx2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        Group root = new Group();

Image image ;
String path = "test.png";
image = new Image(getClass().getResource(path).toString());
ImageView imageView = new ImageView(image);


       // Rectangle rect = new Rectangle(100,100,Color.AQUA);


        /*Polygon pol = new Polygon(new double[]{
        45.0, 10.0,
        10.0, 80.0,
        80.0, 80.0,
        });*/
        
        Scene scene = new Scene(root, 1000, 1000);
        root.getChildren().add(image);
        root.setImage(image);
        /*root.getChildren().add(rect);
        rect.setLayoutX(20);
        rect.setLayoutY(20);
        rect.setStroke(Color.BISQUE);
        rect.setStrokeWidth(10);*/

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
