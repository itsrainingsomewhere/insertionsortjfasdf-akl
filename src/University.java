//import java.util.Optional;

public class University {
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    // not confident about the stuff that follows
    private String inStateUpTo12;
    private String inState12to18;
    private String inStateOver18;
    private String outOfStateUpTo12;
    private String outOfState12to18;
    private String outOfStateOver18;
    private String lateFees;
    private String incidentalFees; // per credit to some max fee
    private String healthPerCreditUpTo12;
    private String healthPerCredit12to18;
    private String healthPerCreditOver18;
    private String mealPlan1;
    private String mealPlan2;
    private String mealPlan3;
    private String incidentalFeesMax;

    public University(String x) {
        String[] words = x.split(",");
        name = words[0];
        streetAddress = words[1];
        city = words[2];
        state = words[3];
        zip = words[4];
        phoneNumber = words[5];
        inStateUpTo12 = words[6];
        inState12to18 = words[7];
        inStateOver18 = words[8];
        outOfStateUpTo12 = words[9];
        outOfState12to18 = words[10];
        outOfStateOver18 = words[11];
        mealPlan1 = words[12];
        mealPlan2 = words[13];
        mealPlan3 = words[14];
        healthPerCreditUpTo12 = words[15];
        healthPerCredit12to18 = words[16];
        healthPerCreditOver18 = words[17];
        lateFees = words[18];
        incidentalFees = words[19];
        incidentalFeesMax = words[20];

    }

    public String getName() {
        return name;
    }

    public void setName(String x) {
        name = x;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String x) {
        streetAddress = x;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String x) {
        city = x;
    }

    public String getState() {
        return state;
    }

    public void setState(String x) {
        state = x;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String x) {
        zip = x;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String x) {
        phoneNumber = x;
    }

    public String getInStateUpTo12() {
        return inStateUpTo12;
    };

    public String getInState12to18() {
        return inState12to18;
    };

    public String getInStateOver18() {
        return inStateOver18;
    };

    public String getOutOfStateUpTo12() {
        return outOfStateUpTo12;
    };

    public String getOutOfState12to18() {
        return outOfState12to18;
    };

    public String getOutOfStateOver18() {
        return outOfStateOver18;
    };

    public String getLateFees() {
        return lateFees;
    };

    public String getIncidentalFees() {
        return incidentalFees;
    }; // per credit to some max fee

    public String getHealthPerCreditUpTo12() {
        return healthPerCreditUpTo12;
    };

    public String getHealthPerCredit12to18() {
        return healthPerCredit12to18;
    };

    public String getHealthPerCreditOver18() {
        return healthPerCreditOver18;
    };

    public String getMealPlan1() {
        return mealPlan1;
    };

    public String getMealPlan2() {
        return mealPlan2;
    };

    public void setInStateUpTo12(String x) {
        inStateUpTo12 = x;
    };

    public void setInState12to18(String x) {
        inState12to18 = x;
    }

    public void setInStateOver18(String x) {
        inStateOver18 = x;
    }

    public void setOutOfStateUpTo12(String x) {
        outOfStateUpTo12 = x;
    }

    public void setOutOfState12to18(String x) {
        outOfState12to18 = x;
    }

    public void setOutOfStateOver18(String x) {
        outOfStateOver18 = x;
    }

    public void setLateFees(String x) {
        lateFees = x;
    }

    public void setIncidentalFees(String x) {
        incidentalFees = x;
    }

    public void setHealthPerCreditUpTo12(String x) {
        healthPerCreditUpTo12 = x;
    }

    public void setHealthPerCredit12to18(String x) {
        healthPerCredit12to18 = x;
    }

    public void setHealthPerCreditOver18(String x) {
        healthPerCreditOver18 = x;
    }

    public void setMealPlan1(String x) {
        mealPlan1 = x;
    }

    public void setMealPlan2(String x) {
        mealPlan2 = x;
    }

    public String toString() {
        return name + " at " + streetAddress + ", " + city + ", " + state + " " + zip;
    }

    public boolean equals(University x) {
        return (name.equals(x.getName()) && streetAddress.equals(x.getStreetAddress()));
    }

    public String getincidentalFeesMax(){
        return incidentalFeesMax;
    }

    public String getMealPlan3(){
        return mealPlan3;
    }
}
