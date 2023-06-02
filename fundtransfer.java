import java.util.Scanner;
public class fundtransfer {
    public static int accountcash=1000;
    public static void fund()
    {
        System.out.println("Enter Account Number Containing 5 Numbers");
                         Scanner e=new Scanner (System.in);
                         int accountnumber=e.nextInt();
                         if(accountnumber>0)
                         {
                             System.out.println("Enter Amount You Want to Sent");
                             Scanner f  =new Scanner (System.in);
                             int useramount=f.nextInt();
                             if(useramount<=accountcash)
                             {
                                 System.out.println("--------------------------");
                                 System.out.println("Money Has Been Transfered");
                                 int LeftMoney=accountcash - useramount;
                                 System.out.println("---------------------------------------");
                                 System.out.println("You Have Left : "+LeftMoney+"/Rs in Your Account");
                             }
                             else
                             {
                                 System.out.println("Insufficent Balance to Transfer ");
                             }
                         }
                         else{
                             System.out.println("Type 5 Correct Account Numbers");
                         }
    }
    
}
