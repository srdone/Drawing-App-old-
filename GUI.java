package ui.applet;

import java.applet.Applet;
import java.awt.Graphics;
import model.Model;
import ui.panels.MainPanel;
import interfaces.Resettable;

public class GUI extends Applet implements Resettable {
  MainPanel mainPanel;
  Model model;
  
  public void init() {
    resize(Model.MAIN_WINDOW_SIZE_X, Model.MAIN_WINDOW_SIZE_Y);
    model = new Model(this);
    mainPanel = new MainPanel(model);
    add(mainPanel);
  }
  
  public void paint(Graphics g) {
    System.out.println(model);
  }
  
  public void resetComponents() {
    mainPanel.resetComponents();
  }

}
