package com.stackroute;
import java.util.Scanner;
public class students   {
    public students() {
        // TODO Auto-generated constructor stub
    }
    int num;
    int[] marks;
    double average;
    int min;
    int max;
    public students(int num, int[] marks) {
        this.num = num;
        this.marks = marks;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int[] getMarks() {
        return marks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public static class StudentDetails
    {
        public static void main(String[] args)
        {   int num;
            int min;
            int max;
            int sum = 0;
            double avg = 0;
            Scanner sc = new Scanner (System.in);
            students s = new students();
            System.out.print(" Enter the number of students: ");
            num = sc.nextInt();
            int i = 0;
            int[] marks = new int[num];
            do{
                try{
                    for(int j=0; j< num; j++){
                        System.out.println("Enter the marks for student "+ (j+1) + "");
                        marks[j] = sc.nextInt();
                        if (marks[j] < 0 || marks[j] > 100)
                            throw new Exception("Enter the marks between 0 to 100");
                    }
                }
                catch (Exception e) {
                    System.out.println(e);
                }
            }while (marks[i] < 0 || marks[i] > 100);
            {
                max = marks[0];
                for(int j = 0; j < num; j++)
                {
                    if(max < marks[j])
                    {
                        max = marks[j];
                    }
                }
                System.out.println(" maximum marks = "+max);
            }
            {
                min = marks[0];
                for( int j = 0; j < num; j++)
                {
                    if(min > marks[j])
                    {
                        min = marks[j];
                    }
                }
                System.out.println(" minimum marks  = "+ min);
            }
            {
                for (int j=0; j<num; j++)
                {
                    sum = sum + marks[j];
                }
                avg = sum/num;
                System.out.println("average marks  = " + avg);
            }
        }
    }
}