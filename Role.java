import java.util.Scanner;
public class Role
{
  public static void main(String[] args)
  {
     String answer;
     Scanner sc = new Scanner(System.in);
     do{
     System.out.println("Enter EmployeeId: ");
     int employeeid = sc.nextInt();
     sc.nextLine();
     System.out.println("Enter RoleName: ");
     String rolename = sc.nextLine();
     System.out.println("Do you want to apply leave? Yes or No");
     answer = sc.next();
   }
   while(answer.equalsIgnoreCase("Yes"));
   {
   }
 }
}