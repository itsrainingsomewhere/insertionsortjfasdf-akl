public class Student extends Person {
    private String studentID;
    private String universityName;
    private String credits; //CHANGE BACK
    private String inState;
    private String lateFee;
    private String mealPlan;
    private String healthPlan;

    public Student(){ //I hate this but I'm so tired
        super(); //stop FIGHTING ME JAVAj f;alksdf
    }

    public Student (String x){
        String[] words = x.split(",");
        name = new Name(words[0], words[1], words[2]); //first middle last
        age = words[3]; //TODOOOOOO //making this a String temporarily :(
        gender = words[4]; //TODO
        streetAddress = words[5];
        city = words[6];
        state = words[7];
        zip = words[8]; //TODO
        phoneNumber = words[9]; //TODO
        universityName = words[10];
        studentID = words[11];
        credits = words[12]; //TODO
        inState = words[13]; 
        healthPlan = words[14]; 
        mealPlan = words[15]; 
        lateFee = words[16]; 
        //starting at studentID: 28566121TZ,5,Y,N,A,Y
    }

    public String getLastName() {
        return name.getLastName();
    }

    public String getStudentID(){
        return studentID;
    }

    public void setStudentID(String x){
        studentID = x;
    }

    public String getUniversityName(){
        return universityName;
    }

    public void setUniversityName(String x){
        universityName = x;
    }

    public String getCredits(){
        return credits;
    }

    public void setCredits(String x){
        credits = x;
    }

    public String getInState(){
        return inState;
    }

    public void setInState(String x){
        inState = x;
    }

    public String getLateFee(){
        return lateFee;
    }

    public void setLateFee(String x){
        lateFee = x;
    }

    public String getMealPlan(){
        return mealPlan;
    }

    public void setMealPlan(String x){
        mealPlan = x;
    }

    public String getHealthPlan(){
        return healthPlan;
    }

    public void setHealth(String x){
        healthPlan = x;
    }

    //TODO 
    public String toString(){
        return name.getLastName() + ", " + name.getFirstName() + " " + name.getLastName();
    }

    public boolean equals(Student x){
        return (name.equals(x.getName()) && studentID.equals(x.getStudentID()));
    }

    public int compareTo(Student x){
        if (name.compareTo(x.getName()) < 0)
            return -1;
        else if (name.compareTo(x.getName()) > 0)
            return 1;
        else {
            if (age.compareTo(x.getAge()) < 0)
                return -1;
            else if (age.compareTo(x.getAge()) > 0)
                return 1;
            else {
                if (gender.equals("F") && x.getGender().equals("M"))
                    return -1;
                else if (gender.equals("M") && x.getGender().equals("F"))
                    return 1;
                else {
                    if (studentID.compareTo(x.getStudentID()) < 0)
                        return -1;
                    else if (studentID.compareTo(x.getStudentID()) > 0)
                        return 1;
                    else
                        return 0;
                }
            }
        } 
    }
}
