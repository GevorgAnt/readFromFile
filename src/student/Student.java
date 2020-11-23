package student;
//Student: First Name, Last Name, year, gender, mark

public class Student {
 private String firstname;
 private String lastname;
 private int year;
 private char gender;
 private double mark;

    public Student(String firstname, String lastname, int year, char gender, double mark) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.year = year;
        this.gender = gender;
        this.mark = mark;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getYear() {
        return year;
    }

    public char getGender() {
        return gender;
    }

    public double getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return
                "" + firstname +
                ", " + lastname  +
                ", " + year +
                ", " + gender +
                ", " + mark
                ;
    }
}
