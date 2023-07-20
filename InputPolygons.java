import java.util.*;
import java.awt.*;
import java.awt.event.*;
class Main {
  public static void main(String[] args) {
    int height = 500, width = 500;
		
		StdDraw.setCanvasSize(width, height); //set the size / scale of the drawing window
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);

    //moving triangle 
    double dx= 25;
    double dy= 25;
    Random rng= new Random();
    for(int f = 0; f < 20; f++){
      StdDraw.clear();
      dx+=5;
      dy+=5;
    double[] x1= {25 + dx,25 + dx,100 + dx};
    double[] y1= {100 + dy,50 + dy,50 + dy};
    StdDraw.setPenColor(rng.nextInt(256),rng.nextInt(256),rng.nextInt(256));
    StdDraw.filledPolygon(x1,y1);
    StdDraw.pause(50);
    }
    //3 cursor 
    double side= 50;
    double h= side* Math.sqrt(3)/2;

    StdDraw.setPenColor(0,0,255);
    for(int f= 0; f<2000; f++){
      StdDraw.clear();
    double mx= StdDraw.mouseX();
    double my= StdDraw.mouseY();

    double[] x2= {mx, mx-side/2, mx+side/2};
    double[] y2= {my + h/2, my-h/2, my-h/2};
    StdDraw.filledPolygon(x2,y2);
    }
    
    //4 
    double h2= 80;
    double w2= 50;
    StdDraw.setPenColor(Color.GREEN);
    for(int f= 0; f<200; f++){
      StdDraw.clear();
    double cx= 25;
    double cy= 25;
    if(StdDraw.isKeyPressed(KeyEvent.VK_LEFT)){
       cx-=10;
    }
    if(StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
       cx+=10;
    }
    if(StdDraw.isKeyPressed(KeyEvent.VK_UP)){
       cy+=10;
    }
    if(StdDraw.isKeyPressed(KeyEvent.VK_DOWN)){
       cy-=10;
    }
    double[] x3= {cx, cx-w2/2, cx, cx+w2/2};
    double[] y3= {cy+ h2/2, cy, cy-h2/2, cy};
    StdDraw.filledPolygon(x3,y3);

    StdDraw.pause(50);
    }
   
   //5
   double groundY= 50;

   double speed= 0; 
   double gravity= 2; 
   double origX= width/2;
   double origY= groundY;
   for(int f=0; f<2000; f++) {
     StdDraw.clear();
     StdDraw.setPenColor(Color.BLACK);
     StdDraw.line(0,groundY, width, groundY);
     origY+=speed;
     speed-=gravity;
     if(origY<groundY){
       origY=groundY;
       speed=0;
     }
   if(origY == groundY && StdDraw.isKeyPressed(KeyEvent.VK_SPACE)){
     speed=30;
   }  
   double[] x4= {origX, origX+ -25, origX+ 25};
   double[] y4= {origY+ 43, origY, origY};
   StdDraw.setPenColor(Color.orange);
   StdDraw.filledPolygon(x4,y4);
   StdDraw.pause(50);
   }



  }
}
