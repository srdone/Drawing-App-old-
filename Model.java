package model;

import java.awt.Container;
import interfaces.Resettable;

public class Model implements Resettable {
  private Container container;
  public final static String DRAW = "Draw";
  public final static String MOVE = "Move";
  public final static String REMOVE = "Remove";
  public final static String RESIZE = "Resize";
  public final static String CHANGE = "Change";
  public final static String FILL = "Fill";
  
  public final static String OVAL = "Oval";
  public final static String RECTANGLE = "Rectangle";
  public final static String LINE = "Line";
  
  public final static String[] SHAPE_CHOICES = {OVAL, RECTANGLE, LINE};
  
  public final static int MAIN_WINDOW_SIZE_X = 600;
  public final static int MAIN_WINDOW_SIZE_Y = 400;
  
  private String action = DRAW;
  private boolean fill = false;
  private String currentShapeType = OVAL;
  
  public Model (Container container) {
    this.container = container;
  }
  
  public void repaint() {
    container.repaint();
  }
  
  public void resetComponents() {
    action = DRAW;
    fill = false;
    currentShapeType = OVAL;
    if(container instanceof Resettable) {
      ((Resettable)container).resetComponents();
    }
  }
  
  public String getAction() {
    return action;
  }
  
  public String getCurrentShapeType() {
    return currentShapeType;
  }
  
  public void setFill(boolean fill) {
    this.fill = fill;
  }
  
  public void setAction(String action) {
    this.action = action;
  }
  
  public void setCurrentShapeType(String shapeType) {
    this.currentShapeType = shapeType;
  }
  
  public boolean isFill() {
    return fill;
  }
  
  public String toString() {
    return "Model:\n\tAction: " + action + "\n\tShape: " + currentShapeType + "\n\tFill: " + fill;
  }

}
