package shapes;

import java.awt.Color;

import interfaces.*;

public abstract class ClosedShape extends Shape implements Fillable {
  private boolean filled = false;
  private Color fillColor = Color.BLACK;
  private int width = 10, height = 10;
  
  public ClosedShape() {
    
  }
  
  public ClosedShape (int x1, int y1, int width, int height, Color lineColor, Color fillColor, boolean filled) {
    super(x1,y1,lineColor);
    this.setFillColor(fillColor);
    this.setFilled(filled);
  }
  
  public void change(String[][] toChange) {
    //specialized code to set fill parameters
  }
  
  public void resize(int x1, int y1, int x2, int y2) {
    
  }
  
  public void move(int x1, int y1) {
    
  }
  
  public boolean isFilled() {
    return filled;
  }
  
  public Color getFillColor() {
    return fillColor;
  }
  
  public int getWidth() {
    return width;
  }
  
  public int getHeight() {
    return height;
  }
  
  public void setFillColor(Color fillColor) {
    this.fillColor = fillColor;
  }
  
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  
  public void setWidth(int width) {
    this.width = width;
  }
  
  public void setHeight(int height) {
    this.height = height;
  }
  
}
