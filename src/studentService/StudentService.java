package studentService;

import student.Student;

public class StudentService {

    public Student createStudent(String[] info)
    {
        String name=info[0];
        String lname=info[1];
        int year=Integer.parseInt(info[2]);
        char gender=info[3].charAt(0);
        double mark=Double.parseDouble(info[4]);

        return new Student(name,lname,year,gender,mark);
    }
    public void print(Student[] students)
    {
        for (Student student:students
             ) {
            System.out.println(student.toString());


        }
    }

    public void fullName(Student[] students)
    {
        for (Student student:students
             ) {
            System.out.println(student.getFirstname()+" "+student.getLastname());

        }
    }

    public void malesOnly(Student[] students)
    {
        for (Student student:students
        ) {
            if (student.getGender()=='m')
                System.out.println(student.toString());

        }
    }
    public void highGrades(Student[] students)
    {
        for (Student student:students
        ) {
            if (student.getMark()>=50.4)
                System.out.println(student.toString());

        }
    }
    public void lowerGrade(Student[] students)
    {
        Student min=students[0];
        for (int i = 0; i <students.length ; i++) {
            if(min.getMark()>students[i].getMark())
                min=students[i];
        }
        System.out.println(min.toString());
    }
    public void olderOne(Student[] students)
    {
        Student min=students[0];
        for (int i = 0; i <students.length ; i++) {
            if(min.getYear()>students[i].getYear())
                min=students[i];
        }
        System.out.println(min.toString());
    }
    public void sortedByMark(Student[] students)
    {
        int i, j ;
        Student temp;
        boolean swapped;
        for (i = 0; i < students.length - 1; i++)
        {
            swapped = false;
            for (j = 0; j < students.length - i - 1; j++)
            {
                if (students[j].getMark() > students[j + 1].getMark())
                {

                    temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }

        print(students);
    }

    public void sortedByYear(Student[] students)
    {
        int i, j ;
        Student temp;
        boolean swapped;
        for (i = 0; i < students.length - 1; i++)
        {
            swapped = false;
            for (j = 0; j < students.length - i - 1; j++)
            {
                if (students[j].getYear() > students[j + 1].getYear())
                {

                    temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }

        for (Student student:students
             ) {
            if(student.getGender()=='f')
                System.out.println(student.toString());
        }
    }
}
