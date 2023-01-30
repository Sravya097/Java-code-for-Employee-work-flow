import java.util.Scanner;
public class Timesheet
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    String answer;
  do{
    System.out.println("Enter EmployeeId: ");
    int employeeid = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter TaskName: ");
    String taskname= sc.nextLine();
    System.out.println("Enter Project: ");
    String project = sc.nextLine();
    System.out.println("Enter ActualHours: ");
    int actualhours = sc.nextInt();
       sc.nextLine();
  
    System.out.println("Enter StartDate: ");
    String startDate = sc.nextLine();
    System.out.println("Enter EndDate: ");
    String endDate = sc.nextLine();
    System.out.println("Do you want to apply leave? Yes or No");
    answer = sc.next();
}
while(answer.equalsIgnoreCase("Yes"));
{
 String data;
}
 

}
}

