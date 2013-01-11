package ui.panels;

import interfaces.Resettable;
import java.awt.GridLayout;
import java.awt.Panel;
import model.Model;

public class MainPanel extends Panel implements Resettable {
  ActionPanel actionPanel;
  ChoicePanel choicePanel;
  
  public MainPanel(Model model) {
    actionPanel = new ActionPanel(model);
    choicePanel = new ChoicePanel(model);
    setLayout(new GridLayout(2,1));
    add(actionPanel);
    add(choicePanel);
  }
  
  public void resetComponents() {
    actionPanel.resetComponents();
  }

}
