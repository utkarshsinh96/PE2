package com.stackroute;
public class user {
    public user() {
    }
    private String fullName;
    private String firstName;
    private String lastname;
    private int age;
    private double salary;
    public user(String firstName, String lastname, int age, double salary) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    void CheckAge(){
        if (age > 100 || age < 0)
        {
            System.out.println("Invalid age !");
        }
    }
    int isValidAge(){
        if (age > 18 && age < 60){
            System.out.println("Age : " +age);
            return age;
        }
        else{
            System.out.println("Not a valid age.");
            return Integer.parseInt(null);
        }
    }
    public String getFullName(String firstName, String lastname){
        fullName = firstName +" "+ lastname;
        return fullName;
    }
}