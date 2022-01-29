import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HealthPlanGraphicalComboBoxOne extends JFrame
{
    JFrame mainWindow;
    
    private final JLabel messageTitle;
    
    private final JPanel panelOne;
    private final JPanel panelTwo;
    
    private final int WINDOW_WIDTH  = 500;
    private final int WINDOW_HEIGHT = 900;
    
    private final JComboBox healthChoices;
  
    String policyType; 
    
    public HealthPlanGraphicalComboBoxOne()
    {
        mainWindow = new JFrame(); 
        
        mainWindow.setTitle("Health Plans");  
        
        mainWindow.setSize(WINDOW_WIDTH, WINDOW_HEIGHT); 
        
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        mainWindow.setLayout(new FlowLayout());
        
        messageTitle = new JLabel("CLICK ON THE HEALTH PLAN FROM THE LIST");

        panelOne = new JPanel();
        panelOne.add(messageTitle);
        
        panelTwo = new JPanel();
        panelTwo.setLayout(new FlowLayout());
        String[] comboChoices = { "Basic Health Plan",
                                  "Health Plan with Dental",
                                  "Health Plan with Enhancements" };
        healthChoices = new JComboBox();
        JComboBox healthChoices = new JComboBox(comboChoices);
        healthChoices.setSelectedIndex(0);
        healthChoices.addActionListener(new ComboBoxListener());
        panelTwo.add(healthChoices);
                
        mainWindow.add(panelOne);
        mainWindow.add(panelTwo);

        mainWindow.pack();
        mainWindow.setVisible(true);
    }
private class ComboBoxListener implements ActionListener
{
   public void actionPerformed(ActionEvent eventInfo)
   {
       JComboBox healthChoices = (JComboBox)eventInfo.getSource();
       
       String selectedItem = (String)healthChoices.getSelectedItem();
       
       switch (selectedItem)
       {
           case "Basic Health Plan":
             policyType = "1";
             break;
           case "Health Plan with Dental":
             policyType = "2";
             break;
           case "Health Plan with Enhancements":
             policyType = "3";
             break;
       }
       
       // 
       HealthPlanGraphicalOne healthPlanGraphicalOne;
       healthPlanGraphicalOne = new HealthPlanGraphicalOne(policyType);
    }
}

//
public static void main(String[] args)
{
    HealthPlanGraphicalComboBoxOne healthPlanObject;
    healthPlanObject = new HealthPlanGraphicalComboBoxOne();
}

} // End of the class
