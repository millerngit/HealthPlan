

public class HealthPlanBasic extends HealthPlan
{  
    protected float   monthlyPremiumCost;
    protected float   coPayAmount;
    protected float   medicalDeductable;
    
    private final float   MONTHLY_PREMIUM_COST_BASIC   =  300.00f;
    private final float   CO_PAY_BASIC                 =   50.00f;
    private final float   MEDICAL_DEDUCTABLE_BASIC     = 5000.00f;
    

//
public HealthPlanBasic ( String  policyNumber,
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
    setCoPay();
    setMedicalDeductable();
}
    
//
@Override
public void setMonthlyPremiumCost()
{
    monthlyPremiumCost = MONTHLY_PREMIUM_COST_BASIC;
}        

//
@Override
public float getMonthlyPremiumCost()
{
    return monthlyPremiumCost;
}

//
@Override
public float getTotalMonthlyPremiumCost()
{
    return getMonthlyPremiumCost();
}
        
//
@Override
public void setCoPay()
{
    coPayAmount = CO_PAY_BASIC;
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
    medicalDeductable = MEDICAL_DEDUCTABLE_BASIC;
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
    return getMonthlyPremiumCost() * 12;
}

} // End of the class
