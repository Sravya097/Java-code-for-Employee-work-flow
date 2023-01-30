import java.util.Scanner;
public class Employee
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    String answer;
  do{
    System.out.println("Enter EmployeeId: ");
    int employeeid = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter EmployeeName: ");
    String employeename= sc.nextLine();
    System.out.println("Enter Email: ");
    String email = sc.nextLine();
    System.out.println("Enter Password: ");
    String password = sc.nextLine();
    System.out.println("Do you want to apply leave? Yes or No");
    answer = sc.next();
}
while(answer.equalsIgnoreCase("Yes"));
{
 
}
 

}
}