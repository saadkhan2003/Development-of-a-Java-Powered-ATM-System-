import java.util.Scanner;
public class billpayment {
    public static void bill()
    {
        System.out.println("Select Category Below");
                         System.out.println("For Electricity Bill Press 1");
                         System.out.println("For Gas Bill Press 2");
                         System.out.println("For Water Bill Press 3");
                         Scanner m=new Scanner(System.in);
                         int bill=m.nextInt();
                         switch(bill)
                         {
                         case 1 : {
                             System.out.println("Enter Consumer ID Containing Numbers Below 9");
                             Scanner x=new Scanner (System.in);
                             int Electricity=x.nextInt();
                             if(Electricity>=0){
                                 System.out.println("Press 1 For Payement");
                                 Scanner q=new Scanner (System.in);
                                 int payments=q.nextInt();
                                 switch(payments){
                                     case 1 : {
                                             System.out.println("Your Bill Hase been Payed Successfully");
                                             break;
                                             }
                                     default : System.out.println("Unsuccessfull. PLease Try Again");
                                     }
                             }
                             else if(Electricity<=9){
                                 System.out.println("Press 1 For Payement");
                                 Scanner q=new Scanner (System.in);
                                 int payments=q.nextInt();
                                 switch(payments){
                                     case 1 : {
                                             System.out.println("Your Bill Hase been Payed Successfully");
                                             break;
                                             }
                                     default : System.out.println("Unsuccessfull. PLease Try Again");
                                     }
                                 }
                             else
                                 {
                                 System.out.println("Type Only 9 Numbers");
                             }
                             break;
                             }
                         case 2 : {
                             System.out.println("Enter Consumer ID Containing Numbers Below 9 ");
                             Scanner x=new Scanner (System.in);
                             int Gas=x.nextInt();
                             if(Gas>=0){
                                 System.out.println("Press 1 For Payement");
                                 Scanner q=new Scanner (System.in);
                                 int payments=q.nextInt();
                                 switch(payments){
                                     case 1 : {
                                             System.out.println("Your Bill Hase been Payed Successfully");
                                             break;
                                             }
                                     default : System.out.println("Unsuccessfull. PLease Try Again");
                                     }
                             }
                             else if(Gas<=9){
                                 System.out.println("Press 1 For Payement");
                                 Scanner q=new Scanner (System.in);
                                 int payments=q.nextInt();
                                 switch(payments){
                                     case 1 : {
                                             System.out.println("Your Bill Hase been Payed Successfully");
                                             break;
                                             }
                                     default : System.out.println("Unsuccessfull. PLease Try Again");
                                     }
                                 }
                             else
                                 {
                                 System.out.println("Type Only 9 Numbers");
                             }
                             break;
                         }
                         case 3 : {
                             System.out.println("Enter Consumer ID Containing  Numbers  Below 9");
                             Scanner x=new Scanner (System.in);
                             int Water=x.nextInt();
                             if(Water>=0){
                                 System.out.println("Press 1 For Payement");
                                 Scanner q=new Scanner (System.in);
                                 int payments=q.nextInt();
                                 switch(payments){
                                     case 1 : {
                                             System.out.println("Your Bill Hase been Payed Successfully");
                                             break;
                                             }
                                     default : System.out.println("Unsuccessfull. PLease Try Again");
                                     }
                             }
                             else if(Water<=9){
                                 System.out.println("Press 1 For Payement");
                                 Scanner q=new Scanner (System.in);
                                 int payments=q.nextInt();
                                 switch(payments){
                                     case 1 : {
                                             System.out.println("Your Bill Hase been Payed Successfully");
                                             break;
                                             }
                                     default : System.out.println("Unsuccessfull. PLease Try Again");
                                     }
                                 }
                             else
                                 {
                                 System.out.println("Type Only 9 Numbers");
                             }
                             break;
                         }   
                }
       }
    
}
