

public class HealthPlanDental extends HealthPlan
{
    protected float   monthlyPremiumCost;
    protected float   coPayAmount;
    protected float   medicalDeductable;
    
    private float monthlyPremiumCostDental;
    
    private final float   MONTHLY_PREMIUM_COST_DENTAL   =  350.00f;
    private final float   DENTAL_PREMIUM_COST           =   50.00f;
    private final float   CO_PAY_DENTAL                 =   40.00f;
    private final float   MEDICAL_DEDUCTABLE_DENTAL     = 4000.00f;
    
//
public HealthPlanDental( String  policyNumber,
                         String  policyType,
                         String  fullName,
                         String  streetAddress,
                         String  cityName,
                         String  stateCode,
                         long    zipCode,
                         String  phoneNumber,
                         String  emailAddress,
                         String  gender,
                         float   height,
                         float   weight,
                         String  dateOfBirth,
                         float   houseHoldIncome )
{   
    super( policyNumber,
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
    
    setMonthlyPremiumCost();
    setMonthlyPremiumCostDental();
    setCoPay();
    setMedicalDeductable();
}
   
//
@Override
public void setMonthlyPremiumCost() 
{
    monthlyPremiumCost = MONTHLY_PREMIUM_COST_DENTAL;
}

//
@Override
public float getMonthlyPremiumCost() 
{
    return monthlyPremiumCost;
}

//
public void setMonthlyPremiumCostDental() 
{
    monthlyPremiumCostDental = DENTAL_PREMIUM_COST;
}

//
public float getMonthlyPremiumCostDental() 
{
    return monthlyPremiumCostDental;
}

//
@Override
public float getTotalMonthlyPremiumCost()
{
    return getMonthlyPremiumCost() + getMonthlyPremiumCostDental();
}

//
@Override
public void setCoPay()
{
    coPayAmount = CO_PAY_DENTAL;
}        

//
@Override
public float getCoPayAmount()
{
    return coPayAmount;
}

//
@Override
public void setMedicalDeductable()
{
    medicalDeductable = MEDICAL_DEDUCTABLE_DENTAL;
}

//
@Override
public float getMedicalDeductable()
{
    return medicalDeductable;
}

//
@Override
public float getYearlyPremiumAmount()
{
    return getTotalMonthlyPremiumCost() * 12;
}
  
} // End of the class
