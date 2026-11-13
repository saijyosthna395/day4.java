import java.util.HashMap;
import java.util.Scanner;
import java.util.LinkedList;
public class Project 
{
   
    public static void main(String[] args) {
         LinkedList<String>student=new LinkedList<>();
         HashMap<Integer,String>mark=new HashMap<>();
        Scanner sc=new Scanner(System.in);
//Add a New Student
    int studentid,searchid,updateid,newmarks,marks,deleteid;
    String studentname,newname;
    do{
    System.out.println("Enter operations to perform:");
    System.out.println("1.Add a New Student:");
    System.out.println("2.Display all Students");
    System.out.println("3.search for a student:");
    System.out.println("4.update student Details:");
    System.out.println("5.Delete Student Details:");
    System.out.println("6.Exit Application: ");
    System.out.println("Enter a choice:");
    int choice=sc.nextInt();
    if(choice==1){
        System.out.println("Enter the StudentId");
        studentid=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter StudentName");
        studentname=sc.nextLine();
        System.out.println("Enter Marks:");
        newmarks=sc.nextInt();
        student.add("studentId");
        student.add("studentname");
        student.add("marks");
    }else if(choice==2){
        //Display student Details
       System.out.println(student);

    }
    else if(choice==3)
        {
            sc.nextLine();
            System.out.println("Enter Student id :");
            searchid=sc.nextInt();
            System.out.println(student.get(searchid));
        }
    else if(choice==4){
        System.out.println("Enetr student id to update:");
        updateid=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter new name :");
        newname=sc.nextLine();
        System.out.println("Enter new marks:");
        newmarks=sc.nextInt();
        student.add("updateid, newname");
        mark.put(updateid,"newmarks");
        System.out.println("Student UPDATED successfully");
    }
    else if(choice==5)
    {
        System.out.println("Enetr student id to delete:");
        deleteid=sc.nextInt();
        student.remove(deleteid);
        student.remove(deleteid);
        System.out.println("Student delete successfully");
    }
    else if(choice==6)
    {
        System.out.println("Exiting---Thankyou");
        break;
    }
    else{
        System.out.println("Invalid choice.plese try again!");
    }
}
    while(true);
  }
}