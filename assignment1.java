import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
 
     System.out.println("Enter number of subjects");
 
     int n=sc.nextInt();
 
    float[] marks=new float[n];
    float[] creditHour=new float[n];
    float[] gpa=new float[n];
     System.out.println("Enter marks");
     float totalHour=0;
     float gradeXcredit=0;
     for(int i=0;i<n;i++)
     {
        marks[i]=sc.nextFloat();
        if(marks[i]>=93) gpa[i]=4;
        else if(marks[i]>=90) gpa[i]=3.7;
        else if(marks[i]>=87) gpa[i]=3.3;
        else if(marks[i]>=83) gpa[i]=3.0;
        else if(marks[i]>=80) gpa[i]=2.7;
        else if(marks[i]>=77) gpa[i]=2.3;
        else if(marks[i]>=73) gpa[i]=2.0;
        else if(marks[i]>=70) gpa[i]=1.7;
        else if(marks[i]>=67) gpa[i]=1.3;
        else if(marks[i]>=60) gpa[i]=1.0;
        else gpa[i]=0.0; 
     }

    System.out.println("Enter Credit Hour");
 
     for(int i=0;i<n;i++)
     {
        creditHour[i]=sc.nextFloat();
        totalHour+=creditHour[i];
        gradeXcredit+= creditHour[i]*gpa[i];
     }
     cgpa=gradeXcredit/totalHour;
 
     System.out.println("cgpa="+cgpa);

 
   }
}