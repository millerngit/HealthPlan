

public class HealthPlanEnhanced extends HealthPlan
{
    
    protected float   monthlyPremiumCost;
    protected float   coPayAmount;
    protected float   medicalDeductable;
    
    private   float   monthlyPremiumDentalCostEnhanced;
    private   float   visionPremiumCost;
    private   float   prescriptionPremiumCost;
    private   Boolean gymMembership;
    
    private final float   MONTHLY_PREMIUM_COST_ENHANCED =  400.00f;
    private final float   DENTAL_PREMIUM_COST_ENHANCED  =   30.00f;
    private final float   VISION_PREMIUM_COST           =   10.00f;
    private final float   PRESCRIPTION_PREMIUM_COST     =   25.00f;
    private final float   MONTHLY_COPAY_ENHANCED        =   25.00f;
    private final float   MEDICAL_DEDUCTABLE_ENHANCED   = 3000.00f;
    
//
public HealthPlanEnhanced (  String  policyNumber,
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
    setMonthlyPremiumDentalCostEnhanced();
    setMonthlyVisionPremiumCost();
    setMonthlyPrescriptionPremiumAmount();
    setGymMembership();
    setCoPay();
    setMedicalDeductable();
}
      
//
@Override
public void setMonthlyPremiumCost() 
{
    monthlyPremiumCost = MONTHLY_PREMIUM_COST_ENHANCED;
}

//
@Override
public float getMonthlyPremiumCost() 
{
    return monthlyPremiumCost;
}

//
public void setMonthlyPremiumDentalCostEnhanced()
{
    monthlyPremiumDentalCostEnhanced = DENTAL_PREMIUM_COST_ENHANCED;
}

//
public float getMonthlyPremiumDentalCostEnhanced()
{
    return monthlyPremiumDentalCostEnhanced;
}

//
public void setMonthlyVisionPremiumCost()
{
    visionPremiumCost = VISION_PREMIUM_COST;
}
//
public float getMonthlyVisionPremiumCost()
{
    return visionPremiumCost;
}

//
public void setMonthlyPrescriptionPremiumAmount()
{
    prescriptionPremiumCost = PRESCRIPTION_PREMIUM_COST;
}

//
public float getMonthlyPrescriptionPremiumCost()
{
    return prescriptionPremiumCost;
}  

//
@Override
public float getTotalMonthlyPremiumCost()
{
    return getMonthlyPremiumCost() + getMonthlyPremiumDentalCostEnhanced() +
           getMonthlyVisionPremiumCost()  + getMonthlyPrescriptionPremiumCost();
}

//
public void setGymMembership()
{
    gymMembership = true;
}

//
public Boolean getGymMembership()
{
    return gymMembership;
}

//
@Override
public void setCoPay()
{
    coPayAmount = MONTHLY_COPAY_ENHANCED;
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
    medicalDeductable = MEDICAL_DEDUCTABLE_ENHANCED;
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
