package shapes;

import java.awt.Color;

public abstract class OpenShape extends Shape {
  
  public void resize(int x1, int y1,int x2,int y2) {
    
  }
  
  public void move(int x1, int x2) {
    
  }
  
  public void change(String[][] toChange) {
    
  }
  
  public int getX2() {
    return x2;
  }
  
  public int getY2() {
    return y2;
  }
  
  public void setX2(int x2) {
    this.x2 = x2;
  }
  
  public void setY2(int y2) {
    this.y2 = y2;
  }

}
