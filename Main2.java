/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main2;

import java.util.Scanner;

class Student {
    // Class variable
    static String university = "ULAB University";

    // Object variables
    int id;
    String name;
    String department;
    double cgpa;

    // Parameterized constructor
    Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
    }

    // Object method to display student details
    void displayStudentDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
        System.out.println();
    }

    // Class method to display total number of students
    static int count = 0;
    public static void displayTotalStudents() {
        System.out.println("Total number of students: " + count);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create 3 student objects
        Student student1 = new Student(Integer.parseInt(getInput("Input ID 1: ")), getInput("Input name 1: "), getInput("Input department 1: "), Double.parseDouble(getInput("Input CGPA 1: ")));
        Student student2 = new Student(Integer.parseInt(getInput("Input ID 2: ")), getInput("Input name 2: "), getInput("Input department 2: "), Double.parseDouble(getInput("Input CGPA 2: ")));
        Student student3 = new Student(Integer.parseInt(getInput("Input ID 3: ")), getInput("Input name 3: "), getInput("Input department 3: "), Double.parseDouble(getInput("Input CGPA 3: ")));

        // Increment the count for each student object created
        Student.count++;
        Student.count++;
        Student.count++;

        // Display student details
        System.out.println("1st student details:");
        student1.displayStudentDetails();
        System.out.println("2nd student details:");
        student2.displayStudentDetails();
        System.out.println("3rd student details:");
        student3.displayStudentDetails();

        // Display total number of students
        Student.displayTotalStudents();
    }

    // Helper method to get input from user
    static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
