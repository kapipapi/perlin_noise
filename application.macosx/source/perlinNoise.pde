float off, move;

void setup() {
  size(500, 500);
  off=0;
  move=0;
}

void draw() {
  background(0);
  stroke(255);
  strokeWeight(2);
  text("sin wave", 20, height/4-40);
  text("perlin noise", 20, height/2-40);
  text("random", 20, 3*height/4-40);
  for (int i=1; i<=height; i++) {
    off=move+0.05*i;
    point(i, sin(off)*10+height/4);
    point(i, noise(off)*20+height/2);
    point(i, random(20)+3*height/4);
  }
  move+=0.05;
}
