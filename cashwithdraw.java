import java.util.Scanner;
public class cashwithdraw {
    public static int accountcash=1000;
    public static int i;
    public static void cash()
    {
        System.out.println("Enter Amount You Want to Withdrawal");
                         Scanner d = new Scanner (System.in);
                         int amount=d.nextInt();
                         if(amount>=1 && amount<=accountcash)
                         {
                             System.out.println("Take Your Card First Then Take Your Cash from Machine");
                             System.out.println("-----------------------------------------------------");
                             System.out.println("ThankYou For  Using Our ATM Machine");
                         }
                         else{
                             System.out.println("You Have Not So Much Money in Your Account");
                         }
        }
}
