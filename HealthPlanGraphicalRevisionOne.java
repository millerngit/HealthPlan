import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class HealthPlanGraphicalRevisionOne 
{
    
    public static void main(String[] args)
    {
        // Define the local programmer-defined variables
        String  policyNumber;
        String  policyType;
        String  fullName;
        String  streetAddress;
        String  cityName;
        String  stateCode;
        long    zipCode = 0;
        String  phoneNumber;
        String  emailAddress;
        String  gender;
        float   height = 0.0f;
        float   weight = 0.0f;
        String  dateOfBirth;
        float   houseHoldIncome = 0.0f;
        
                
        int optionSelected;
        
        //
        Scanner keyboardInput = new Scanner(System.in);
        
        //
        System.out.println("Welcome to the Health Care Insurance Program");
        System.out.println();
        System.out.println("You can choose a Health Insurance Program");
        System.out.println("Choose 1 for a Health Plan with no Dental");
        System.out.println("Choose 2 for a Health Plan with Dental");
        System.out.print("Choose 3 for a Health Plan with Dental");
        System.out.println(" Vision, Prescription Drugs, and Gym");
        System.out.println("Choose 4 to exit without choosing a plan");
        
        //
        optionSelected = keyboardInput.nextInt();
        keyboardInput.nextLine();
        
        //
        if (optionSelected != 4)
        {
           System.out.print("Enter the Policy Number:  ");
           policyNumber   = keyboardInput.nextLine();
           
           if (optionSelected == 1)
           {
               policyType = "Basic Plan with No Dental";
           }
           else
           if (optionSelected == 2)
           {
               policyType = "Basic Plan with Dental";
           }    
           else
           {
               policyType = "Enhanced Health Plan";
           }
            
           System.out.print("Enter your Full Name ");
           fullName = keyboardInput.nextLine();
           
           System.out.print("Enter your Street Address ");
           streetAddress = keyboardInput.nextLine();
        
           System.out.print("Enter your City ");
           cityName = keyboardInput.nextLine();
           
           System.out.print("Enter your State Code ");
           stateCode = keyboardInput.nextLine();
           
           System.out.print("Enter your Zip Code ");
           
           try
           { 
              zipCode = keyboardInput.nextLong();
              keyboardInput.nextLine();
           }

           catch (InputMismatchException e)
           {
              System.out.println("A number must be entered for the zip code " +
                                  e.getMessage());
              keyboardInput.nextLine();
           }
           
           System.out.print("Enter your Phone Number ");
           phoneNumber = keyboardInput.nextLine();
           
           System.out.print("Enter your Email Address ");
           emailAddress = keyboardInput.nextLine();
           
           System.out.print("Enter your Gender ");
           gender = keyboardInput.nextLine();
           
           try
           { 
              System.out.print("Enter your Height ");
              height = keyboardInput.nextFloat();
              keyboardInput.nextLine();
           }
           
           catch (InputMismatchException e)
           {
              System.out.println("A number must be entered for the height " +
                                  e.getMessage());
              keyboardInput.nextLine();
           }
           
           try
           { 
              System.out.print("Enter your Weight ");
              weight = keyboardInput.nextFloat();
              keyboardInput.nextLine();
           }
           
           catch (InputMismatchException e)
           {
              System.out.println("A number must be entered for the weight " +
                                  e.getMessage());
              keyboardInput.nextLine();
           }
          
           System.out.print("Enter your Date of Birth ");
           dateOfBirth = keyboardInput.nextLine();
                     
           try
           { 
              System.out.print("Enter your HouseHold Income ");
              houseHoldIncome = keyboardInput.nextFloat();
              keyboardInput.nextLine();
           }
           
           catch (InputMismatchException e)
           {
              System.out.println("A number must be entered for the income " +
                                  e.getMessage());
              keyboardInput.nextLine();
           }
           
           if (optionSelected == 1)
           {
               //
                HealthPlanBasic healthObjectOne = new
                          HealthPlanBasic
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
               
               displayObjectInformation(healthObjectOne);
               
           }

           else
           
           if (optionSelected == 2)
           {
               //
               HealthPlanDental healthObjectTwo = new
                                HealthPlanDental
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
               
               displayObjectInformation(healthObjectTwo);
               
           }    
           
           else
           
           {
               //
               HealthPlanEnhanced healthObjectThree = new
                            HealthPlanEnhanced
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
               
               displayObjectInformation(healthObjectThree);
               
            } // End of the inner if statement
                
        } // End of the outer if statement
        
    } // End of the main class

// Display the information to the user
public static void displayObjectInformation(HealthPlan healthObject)
{    
    // Format the output 
    DecimalFormat formatOutput = new DecimalFormat("#####.00");
    
    // Display the information to the user
    System.out.println();
    System.out.println("The Policy Number is         " +
                        healthObject.getPolicyNumber());
    System.out.println("The Name   is                " + 
                        healthObject.getFullName());
    System.out.println("The Monthly Premium Cost is  " +
                      (formatOutput.format
                      (healthObject.getTotalMonthlyPremiumCost())));
    System.out.println("The Yearly Premium Cost is   " +
                      (formatOutput.format
                      (healthObject.getYearlyPremiumAmount())));
    System.out.println();    
}
    
} // End of the class
