import java.util.Scanner;
public class Leaves
{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  String answer;
  do{
    System.out.println("Enter EmployeeId: ");
    int employeeid = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter LeaveType: ");
    String leavetype= sc.nextLine();
    System.out.println("Enter StartDate: ");
    String startdate = sc.nextLine();
    System.out.println("Enter EndDate: ");
    String enddate = sc.nextLine();
  
    System.out.println("Enter Reason: ");
    String reason = sc.nextLine();
    System.out.println("Do you want to apply leave? Yes or No");
    answer = sc.next();
}
while(answer.equalsIgnoreCase("Yes"));

}
}
  