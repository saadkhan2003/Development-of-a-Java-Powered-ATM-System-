import java.util.Scanner;

public class atm_working
{

    public static void main (String[]Arg)
    {
        System.out.println("Welcome to Our ATM Machine");
        System.out.println("Enter  Your Card");
        System.out.println("If You Entered Your Card Then Press 1 OtherWise Press 2 : ");
        Scanner a=new Scanner(System.in);
        int card = a.nextInt();
        switch(card)
        {
         case 1 : 
         {
             System.out.println("Enter Your Card Pin/Code");
             Scanner b = new  Scanner (System.in);
             int pin = 12345;
             int  enteredpin=b.nextInt();
             if(enteredpin==pin)
             {
                 System.out.println("Enter 1 For Cash Withdraw ");
                 System.out.println("Enter 2 For Bill Payement");
                 System.out.println("Enter 3 For Mini Statement ");
                 System.out.println("Enter 4 For Tranfer Money  to Another Account");
                 System.out.println("Enter 5 For  Change Password ");
                 Scanner c = new Scanner (System.in);
                 int cash=c.nextInt();
                 switch(cash)
                 {
                     case 1 : {
                        cashwithdraw obj = new cashwithdraw();
                        obj.cash();
                        break;
                     }    
                     case 2 : {
                        billpayment obj =new billpayment();
                        obj.bill();
                        break;                         
                 }
                     case 3 : {
                         System.out.println("Mini Statement Service Currently Not Working");
                     break;
                     }
                     case 4 : {
                        fundtransfer obj = new fundtransfer();
                        obj.fund();
                         break;
                     }
                     case 5 : {
                        changepass obj=new changepass();
                        obj.change();
                        break;
                    }
                   default : System.out.println("Choose Correct Option From Above");
               }
             }
             else
             {
              System.out.println("Enter Coorect Pin/Code OR Forget Password");
             }
         break;
          }
      
         
         case  2 : {
              System.out.println("Enter Your Card ");
              break;
         }
         default : System.out.println("Invalid");
        }
     }
}

