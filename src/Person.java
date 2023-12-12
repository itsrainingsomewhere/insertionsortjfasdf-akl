public class Person {
    protected Name name; //should be final. TODO?
    protected String age; //switch this back
    protected String gender; //I cannot in good conscience make this immutable //switch this back
    protected String streetAddress;
    protected String city;
    protected String state;
    protected String zip; //switch this back?
    protected String phoneNumber; //switch this back? but like? do I need to?

    public Person () {
        name = new Name("bleh", "fjakl", "jflak ");
    }

    public Person (String name) { //this literally doesn't matter I'm just going to override it
        this.name = new Name(name, name, name);
    }

    public Name getName(){
        return name;
    }

    public String getAge(){
        return age;
    }

    public void setAge(String x){
        age = x;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String x){
        gender = x;
    }

    public String getStreetAddress(){
        return streetAddress;
    }

    public void setStreetAddress(String x){
        streetAddress = x;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String x){
        city = x;
    }

    public String getState(){
        return state;
    }

    public void setState (String x){
        state = x;
    }

    public String getZip(){
        return zip;
    }

    public void setZip(String x){
        zip = x;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String x){
        phoneNumber = x;
    }

    //TODO
    public String toString(){
        return name.getLastName() + ", " + name.getFirstName() + " " + name.getMiddleName();
    }

    public boolean equals(Person x){
        return (name.equals(x.getName()) && age == x.getAge() && gender == x.getGender() && streetAddress.equals(x.getStreetAddress()) && city.equals(x.getCity()) && state.equals(x.getState()) && zip == x.getZip());
    }

    public int compareTo(Person x){
        if (name.compareTo(x.getName()) < 0)
            return -1;
        else if (name.compareTo(x.getName()) > 0)
            return 1;
        else {
            if (age.compareTo(x.getAge()) < 0)
                return -1;
            else if (age.compareTo(x.getAge()) < 0)
                return 1;
            else {
                if (gender.equals("F") && x.getGender().equals("M"))
                    return -1;
                else if (gender.equals("M") && x.getGender().equals("F"))
                    return 1;
                else 
                    return 0;
            }
        }
    }

}
