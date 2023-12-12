public class Name {
    private final String first;
    private final String middle;
    private final String last;

    public Name (String x, String y, String z){
        first = x;
        middle = y;
        last = z;
    }

    public String getFirstName() {
        return first;
    }

    public String getMiddleName() {
        return middle;
    }

    public String getLastName() {
        return last;
    }

    public boolean equals(Name name){
        return (first.equals(name.getFirstName()) && middle.equals(name.getMiddleName()) && last.equals(name.getLastName()));
    }

    public String toString() {
        return first + " " + middle + " " + last;
    }

    public int compareTo(Name name) {
        if (last.compareTo(name.getLastName()) < 0)
            return -1;
        else if (last.compareTo(name.getLastName()) > 0)
            return 1;
        else { //if last names match
            if (first.compareTo(name.getFirstName()) < 0)
                return -1;
            else if (first.compareTo(name.getFirstName()) > 0)
                return 1;
            else { //if first names match
                if (middle.compareTo(name.getMiddleName()) < 0)
                    return -1;
                else if (middle.compareTo(name.getMiddleName()) > 0)
                    return 1;
                else
                    return 0; //if middle names match too
            }
        }
    }
}
