package elephant;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

//**************************************************************************
// Elephant.java      Author: Colissa Pollard
// Programming Project #1       Question #3
// March 10th, 2018
//**************************************************************************

public class Elephant extends Application 
{
    @Override
    public void start(Stage primaryStage) 
    {
        //-------------------------------------------------
        // A JavaFX program that creates an elephant to demonstrate
        // how to use shapes, colors, fills, and grouping objects.
        //-------------------------------------------------

        //LIMBS       
        Rectangle rightArm = new Rectangle(200, 220, 20, 90);
        rightArm.setFill(Color.LIGHTSTEELBLUE);
        
        Rectangle rightLeg = new Rectangle(300, 220, 20, 90);
        rightLeg.setFill(Color.LIGHTSTEELBLUE);
        
        Rectangle leftArm = new Rectangle(210, 220, 20, 90);
        leftArm.setFill(Color.LAVENDER);
        
        Rectangle leftLeg = new Rectangle(310, 220, 20, 90);
        leftLeg.setFill(Color.LAVENDER);
        
        Group limbs = new Group(rightArm, rightLeg, leftLeg, 
                leftArm);
        
        //EARS   
        Ellipse leftEar = new Ellipse(200, 170, 30, 35);
        leftEar.setFill(Color.LIGHTSTEELBLUE);
        
        Ellipse rightEar = new Ellipse(140, 170, 30, 35);
        rightEar.setFill(Color.LIGHTSTEELBLUE);
          
        Ellipse innerLeftEar = new Ellipse(200, 170, 20, 28);
        innerLeftEar.setFill(Color.LAVENDERBLUSH);
        
        Ellipse innerRightEar = new Ellipse(140, 170, 20, 28);
        innerRightEar.setFill(Color.LAVENDERBLUSH);
        
         Group ears = new Group(leftEar, rightEar, 
                innerLeftEar, innerRightEar);
         
        //EYES
        Circle leftEye = new Circle(168, 174, 9);
        leftEye.setFill(Color.BLACK);
        
        Circle rightEye = new Circle(134, 174, 9);
        rightEye.setFill(Color.BLACK);
        
        Ellipse leftEyeSparkle = new Ellipse(164, 171, 3, 4);
        leftEyeSparkle.setFill(Color.WHITE);
        leftEyeSparkle.setRotate(25);
        
        Ellipse rightEyeSparkle = new Ellipse(130, 171, 3, 4);
        rightEyeSparkle.setFill(Color.WHITE);
        rightEyeSparkle.setRotate(35);
        
        Circle leftEyeBall = new Circle(170, 175, 12);
        leftEyeBall.setFill(Color.CADETBLUE);
        
        Circle rightEyeBall = new Circle(135, 175, 12);
        rightEyeBall.setFill(Color.CADETBLUE);
        
        Ellipse leftEyeDot = new Ellipse(167, 175, 2, 2);
        leftEyeDot.setFill(Color.WHITE);
        
        Ellipse rightEyeDot = new Ellipse(133, 175, 2, 2);
        rightEyeDot.setFill(Color.WHITE); 
        
        Group eyes = new Group(leftEyeBall, rightEyeBall, leftEye, rightEye, leftEyeSparkle, 
                rightEyeSparkle, rightEyeDot, leftEyeDot);
         
        //BODY
        Ellipse body = new Ellipse(280, 200, 90, 70);
        body.setFill(Color.LAVENDER);
        
        CubicCurve tail = new CubicCurve(360, 200, 360, 200, 390, 170, 395, 255);
        tail.setFill(null);
        tail.setStroke(Color.LIGHTSTEELBLUE);
        tail.setStrokeWidth(10);
        
        Polyline hair = new Polyline();
        hair.getPoints().addAll(388.0, 253.0, 395.0, 266.0, 402.0, 253.0, 388.0, 253.0);
        hair.setFill(Color.LAVENDER);
        hair.setStroke(Color.LAVENDER);
        
        //TOES
        Arc toe1 = new Arc(215, 310, 5, 5, 0, 180);
        toe1.setFill(Color.MEDIUMPURPLE);

        Arc toe2 = new Arc(205, 310, 5, 5, 0, 180);
        toe2.setFill(Color.MEDIUMPURPLE);        
        
        Arc toe3 = new Arc(225, 310, 5, 5, 0, 180);
        toe3.setFill(Color.MEDIUMPURPLE);
        
        Arc toe4 = new Arc(305, 310, 5, 5, 0, 180);
        toe4.setFill(Color.MEDIUMPURPLE);

        Arc toe5 = new Arc(315, 310, 5, 5, 0, 180);
        toe5.setFill(Color.MEDIUMPURPLE);        
        
        Arc toe6 = new Arc(325, 310, 5, 5, 0, 180);
        toe6.setFill(Color.MEDIUMPURPLE);
        
        Group toes = new Group(toe1, toe2, toe3, toe4, toe5, toe6);
                
        //FACE        
        Circle head = new Circle(160, 180, 40);
        head.setFill(Color.LAVENDER);
         
        CubicCurve leftTusk = new CubicCurve(180, 200, 180, 200, 175, 205, 160, 208);
        leftTusk.setFill(null);
        leftTusk.setStroke(Color.IVORY);
        leftTusk.setStrokeWidth(6);
        
        CubicCurve rightTusk = new CubicCurve(160, 200, 160, 200, 155, 205, 120, 208);
        rightTusk.setFill(null);
        rightTusk.setStroke(Color.IVORY);
        rightTusk.setStrokeWidth(6);
     
        CubicCurve trunk = new CubicCurve(160, 200, 115, 210, 150, 270, 165, 250);
        trunk.setFill(null);
        trunk.setStroke(Color.LAVENDER);
        trunk.setStrokeWidth(19);
        trunk.setStrokeLineCap(StrokeLineCap.ROUND);
        
        Group face = new Group(ears, rightTusk, head, eyes, trunk, leftTusk);

        
        //ELEPHANT
        Group elephant = new Group(limbs, tail, body, hair, toes, face);
        
        
        //BACKGROUND
        Circle sun = new Circle(10, 10, 100);
        sun.setFill(Color.GOLD);

        Rectangle ground = new Rectangle(0, 250, 500, 100);
        ground.setFill(Color.DARKGREEN);

        
        //SCENE
        Group root = new Group(ground, sun, elephant);
        Scene scene = new Scene(root, 500, 350, Color.SKYBLUE);

        primaryStage.setTitle("Elephant");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
