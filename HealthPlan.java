//noah miller

public abstract class HealthPlan
{
    private   String  policyNumber;
    private   String  policyType;
    private   String  fullName;
    private   String  streetAddress;
    private   String  cityName;
    private   String  stateCode;
    private   long    zipCode;
    private   String  phoneNumber;
    private   String  emailAddress;
    private   String  gender;
    private   float   height;
    private   float   weight;
    private   String  dateOfBirth;
    private   float   houseHoldIncome;
    
//
public HealthPlan   ( String  policyNumber,
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
    this.policyNumber       = policyNumber;
    this.policyType         = policyType;
    this.fullName           = fullName;
    this.streetAddress      = streetAddress;
    this.cityName           = cityName;
    this.stateCode          = stateCode;
    this.zipCode            = zipCode;
    this.phoneNumber        = phoneNumber;
    this.emailAddress       = emailAddress;
    this.gender             = gender;
    this.height             = height;
    this.weight             = weight;
    this.dateOfBirth        = dateOfBirth;
    this.houseHoldIncome    = houseHoldIncome;
}

// 
public void setPolicyNumber(String policyNumber)
{
    this.policyNumber = policyNumber;
}

//
public String getPolicyNumber()
{
    return policyNumber;
}

//
public void setPolicyType(String policyType)
{
    this.policyType = policyType;
}
        
//
public String getPolicyType()
{
    return policyType;
}

//
public void setFullName(String fullName)
{
    this.fullName = fullName;
}

//
public String getFullName()
{
    return fullName;
}

//
public void setStreetAddress(String streetAddress)
{
    this.streetAddress = streetAddress;
}

//
public String getStreetAddress()
{
    return streetAddress;
}  

//
public void setCityName(String cityName)
{
     this.cityName = cityName;
}

// 
public String getCityName()
{
    return cityName;
}

//
public void setStateCode(String stateCode)
{
    this.stateCode = stateCode;
}

// 
public String getStateCode()
{
    return stateCode;
}

//
public void setZipCode(long zipCode)
{
    this.zipCode = zipCode;
}

//
public long getZipCode()
{
    return zipCode;
}

//
public void setPhoneNumber(String phoneNumber)
{
    this.phoneNumber = phoneNumber;
}

//
public String getPhoneNumber()
{
    return phoneNumber;
}

//
public void setEmailAddress(String emailAddress)
{
    this.emailAddress = emailAddress;
}

//
public String getEmailAddress()
{
    return emailAddress;
}

//
public void setGender(String gender)
{
    this.gender = gender;
}

//
public String getGender()
{
     return gender;
}

//
public void setHeight(float height)
{
    this.height = height;
}

//
public float getHeight()
{
    return height;
}

//
public void setWeight(float weight)
{
    this.weight = weight;
}

//
public float getWeight()
{
    return weight;
}

//
public void setDateOfBirth(String dateOfBirth)
{
    this.dateOfBirth = dateOfBirth;
}

//
public String getDateOfBirth()
{
    return dateOfBirth;
}

//
public void setHouseHoldIncome(float houseHoldIncome)
{
    this.houseHoldIncome = houseHoldIncome;
}

//
public float getHouseHoldIncome()
{
    return houseHoldIncome;
}

//
public abstract void setMonthlyPremiumCost();

//
public abstract float getMonthlyPremiumCost();

//
public abstract float getTotalMonthlyPremiumCost();

//
public abstract void setCoPay();

//
public abstract float getCoPayAmount();

//
public abstract void setMedicalDeductable();

//
public abstract float getMedicalDeductable();

//
public abstract float getYearlyPremiumAmount();

} // End of the class
