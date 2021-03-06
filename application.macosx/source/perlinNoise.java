import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class perlinNoise extends PApplet {

float off, move;

public void setup() {
  
  off=0;
  move=0;
}

public void draw() {
  background(0);
  stroke(255);
  strokeWeight(2);
  text("sin wave", 20, height/4-40);
  text("perlin noise", 20, height/2-40);
  text("random", 20, 3*height/4-40);
  for (int i=1; i<=height; i++) {
    off=move+0.05f*i;
    point(i, sin(off)*10+height/4);
    point(i, noise(off)*20+height/2);
    point(i, random(20)+3*height/4);
  }
  move+=0.05f;
}
  public void settings() {  size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "perlinNoise" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
