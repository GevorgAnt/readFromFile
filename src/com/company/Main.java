package com.company;

import student.Student;
import studentService.StudentService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student[] students;
        int count = 0;
        int i = 0;
        try {
            File myObj = new File("C:\\Users\\Admin\\Desktop\\readfromfile\\src\\com\\company\\filename.txt");
            Scanner myReader = new Scanner(myObj);
            Scanner myCount = new Scanner(myObj);
            StudentService service = new StudentService();

            while (myCount.hasNextLine()) {
                myCount.nextLine();
                count++;
            }
            students = new Student[count];

            while (myReader.hasNextLine()) {
                String[] info = myReader.nextLine().split(",");
                students[i] = service.createStudent(info);
                i++;

            }

            myReader.close();
            System.out.println("-------Print full name of Studnets------------");
            service.fullName(students);
            System.out.println("------Print all male students------");
            service.malesOnly(students);
            System.out.println("----Print all female students who has mark greater then 50.4-----");
            service.highGrades(students);
            System.out.println("------Print student information having the minimal mark----");
            service.lowerGrade(students);
            System.out.println("-----Print biggest male student information-----");
            service.olderOne(students);
            System.out.println("-----Print students sorted by mark----");
            service.sortedByMark(students);
            System.out.println("-----Print female students sorted by year----");
            service.sortedByYear(students);


        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");

        }


    }
}
