import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;


public class HealthPlanGraphicalOne extends JFrame 
{
    JFrame  windowHealthPlan;
    
    private final JPanel     panelOne;
    private final JPanel     panelTwo;
    

    private final JLabel     messageLabelOne;
    private final JTextField textPolicyNumber;
    private final JLabel     messageLabelTwo;
    private final JTextField textFullName;
    private final JLabel     messageLabelThree;
    private final JTextField textStreetAddress;
    private final JLabel     messageLabelFour;
    private final JTextField textCityName;
    private final JLabel     messageLabelFive;
    private final JTextField textStateCode;
    private final JLabel     messageLabelSix;
    private final JTextField textZipCode;
    private final JLabel     messageLabelSeven;
    private final JTextField textPhoneNumber;
    private final JLabel     messageLabelEight;
    private final JTextField textEmailAddress;
    private final JLabel     messageLabelNine;
    private final JTextField textGender;
    private final JLabel     messageLabelTen;
    private final JTextField textHeight;
    private final JLabel     messageLabelEleven;
    private final JTextField textWeight;
    private final JLabel     messageLabelTwelve;
    private final JTextField textDateOfBirth;
    private final JLabel     messageLabelThirteen;
    private final JTextField textHouseHoldIncome;
  
    private final JButton    acceptInputButton;
    private final JButton    exitButton;
            
    private final int  WINDOW_WIDTH  = 500;
    private final int  WINDOW_HEIGHT = 500;
    
    String policyType;
    
    HealthPlanGraphicalOne(String policyType)
    {
        this.policyType = policyType;
        panelOne = new JPanel();
        panelOne.setLayout(new GridLayout(20,1));
        
        // research to generate randomly
        messageLabelOne  = new JLabel("Please enter the policy number");
        textPolicyNumber = new JTextField(10);
        panelOne.add(messageLabelOne);
        panelOne.add(textPolicyNumber);
        
        messageLabelTwo  = new JLabel("Please enter your full name");
        textFullName = new JTextField(10);
        panelOne.add(messageLabelTwo);
        panelOne.add(textFullName);
        
        messageLabelThree  = new JLabel("Please enter your street address");
        textStreetAddress = new JTextField(10);
        panelOne.add(messageLabelThree);
        panelOne.add(textStreetAddress);
        
        messageLabelFour  = new JLabel("Please enter your city");
        textCityName = new JTextField(10);
        panelOne.add(messageLabelFour);
        panelOne.add(textCityName);
        
        messageLabelFive  = new JLabel("Please enter your state");
        textStateCode = new JTextField(10);
        panelOne.add(messageLabelFive);
        panelOne.add(textStateCode);
        
        messageLabelSix  = new JLabel("Please enter your zip code");
        textZipCode = new JTextField(10);
        panelOne.add(messageLabelSix);
        panelOne.add(textZipCode);
        
        messageLabelSeven  = new JLabel("Please enter your phone number");
        textPhoneNumber = new JTextField(10);
        panelOne.add(messageLabelSeven);
        panelOne.add(textPhoneNumber);
        
        messageLabelEight  = new JLabel("Please enter your email address");
        textEmailAddress = new JTextField(10);
        panelOne.add(messageLabelEight);
        panelOne.add(textEmailAddress);
        
        messageLabelNine  = new JLabel("Please enter your gender");
        textGender = new JTextField(10);
        panelOne.add(messageLabelNine);
        panelOne.add(textGender);
        
        messageLabelTen  = new JLabel("Please enter your height");
        textHeight = new JTextField(10);
        panelOne.add(messageLabelTen);
        panelOne.add(textHeight);
        
        messageLabelEleven  = new JLabel("Please enter your weight");
        textWeight = new JTextField(10);
        panelOne.add(messageLabelEleven);
        panelOne.add(textWeight);

        messageLabelTwelve  = new JLabel("Please enter your Date of Birth");
        textDateOfBirth = new JTextField(10);
        panelOne.add(messageLabelTwelve);
        panelOne.add(textDateOfBirth);
        
        messageLabelThirteen  = new JLabel("Please enter your household income");
        textHouseHoldIncome = new JTextField(10);
        panelOne.add(messageLabelThirteen);
        panelOne.add(textHouseHoldIncome);
        
        panelTwo = new JPanel();
        panelTwo.setLayout(new GridLayout(1,2));
        
        acceptInputButton = new JButton("Accept Input Data");
        acceptInputButton.addActionListener(new AcceptInputButtonListener());

        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ExitButtonListener());
        
        panelTwo.add(acceptInputButton);
        panelTwo.add(exitButton);
        
        windowHealthPlan = new JFrame();
        windowHealthPlan.setLayout(new FlowLayout());
        windowHealthPlan.setTitle("Health Plan Information");
        windowHealthPlan.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        windowHealthPlan.add(panelOne);
        windowHealthPlan.add(panelTwo);
        windowHealthPlan.setVisible(true);
    }
   
private class AcceptInputButtonListener implements ActionListener
{
   
    public void actionPerformed(ActionEvent e)
    {
        String policyNumber    = textPolicyNumber.getText();
        String fullName        = textFullName.getText();
        String streetAddress   = textStreetAddress.getText();
        String cityName        = textCityName.getText();
        String stateCode       = textStateCode.getText();
        long   zipCode         = Long.parseLong(textZipCode.getText());
        String phoneNumber     = textPhoneNumber.getText();
        String emailAddress    = textEmailAddress.getText();
        String gender          = textGender.getText();
        float  height          = Float.parseFloat(textHeight.getText());
        float  weight          = Float.parseFloat(textWeight.getText());
        String dateOfBirth     = textDateOfBirth.getText();
        float  houseHoldIncome = Float.parseFloat(textHouseHoldIncome.getText());
        
        //
        switch (policyType) 
        {
            case "1":
              
              HealthPlanBasic healthObjectBasic = new HealthPlanBasic
                       ( policyNumber,
                         policyType,
                         fullName,
                         streetAddress,
                         cityName,
                         stateCode,
                         zipCode,
                         phoneNumber,
                         emailAddress,
                         gender,
                         height,
                         weight,
                         dateOfBirth,
                         houseHoldIncome );
              displayObjectInformation(healthObjectBasic);
              break;
                
            case "2":
              
              //
              HealthPlanDental healthObjectDental = new HealthPlanDental
                             ( policyNumber,
                               policyType,
                               fullName,
                               streetAddress,
                               cityName,
                               stateCode,
                               zipCode,
                               phoneNumber,
                               emailAddress,
                               gender,
                               height,
                               weight,
                               dateOfBirth,
                               houseHoldIncome );
              displayObjectInformation(healthObjectDental);
              break;

            case "3":
         
              //
              HealthPlanEnhanced healthObjectEnhanced = new HealthPlanEnhanced
                               ( policyNumber,
                                 policyType,
                                 fullName,
                                 streetAddress,
                                 cityName,
                                 stateCode,
                                 zipCode,
                                 phoneNumber,
                                 emailAddress,
                                 gender,
                                 height,
                                 weight,
                                 dateOfBirth,
                                 houseHoldIncome);
              displayObjectInformation(healthObjectEnhanced);
              break;
          
            default:
              System.out.println("error");
                
        } // End of the switch statement
        
     } // End of the method
    
}// End of the class
    
private class ExitButtonListener implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        windowHealthPlan.setVisible(false);
    }        
 }
    
// Display the information to the user
public void displayObjectInformation(HealthPlan healthObject)
{    
    // Format the output 
    DecimalFormat formatOutput = new DecimalFormat("#####.00");
    
    JFrame displayPlanWindow = new JFrame();
    
    displayPlanWindow.setLayout(new FlowLayout());
    displayPlanWindow.setTitle("Your Health Plan Information");  
    displayPlanWindow.setSize(500, 500); 
    displayPlanWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    
    JPanel panelThree = new JPanel();
    panelThree.setLayout(new GridLayout(5,1));
    
    JLabel messageLabelOne = new JLabel("Your Policy Number is ");
    panelThree.add(messageLabelOne);
    JTextField outputPolicyNumber = new 
               JTextField(healthObject.getPolicyNumber());
    panelThree.add(outputPolicyNumber);
    
    JLabel messageLabelTwo = new JLabel("Your Monthly Premium Cost is ");
    panelThree.add(messageLabelTwo);
    JTextField outputMonthlyPremiumCost = new 
               JTextField(String.valueOf
               ((formatOutput.format(healthObject.getTotalMonthlyPremiumCost()))));
    panelThree.add(outputMonthlyPremiumCost); 
    
    JLabel messageLabelThree = new JLabel("Your Co Pay is ");
    panelThree.add(messageLabelThree);
    JTextField outputCoPayAmount = new 
               JTextField(String.valueOf
               ((formatOutput.format(healthObject.getCoPayAmount()))));
    panelThree.add(outputCoPayAmount); 
    
    JLabel messageLabelFour = new JLabel("Your Medical Deductable is ");
    panelThree.add(messageLabelFour);
    JTextField outputMedicalDeductable = new 
               JTextField(String.valueOf
               ((formatOutput.format(healthObject.getMedicalDeductable()))));
    panelThree.add(outputMedicalDeductable); 
    
    JLabel messageLabelFive = new JLabel("Your Yearly Health Plan Cost is ");
    panelThree.add(messageLabelFive);
    JTextField outputYearlyPremiumAmount = new 
               JTextField(String.valueOf
               ((formatOutput.format(healthObject.getYearlyPremiumAmount()))));
    panelThree.add(outputYearlyPremiumAmount); 
    
    displayPlanWindow.add(panelThree);
  
    displayPlanWindow.setVisible(true);
    
}    

public static void main(String[] args, String policyType)
{
    HealthPlanGraphicalOne healthPlanGraphical = new 
                           HealthPlanGraphicalOne(policyType);
}
} // End of the class
