import java.util.Scanner;
public class changepass {
    public static void change()
    {
        System.out.println("If You Want to Change Password Type 1 Otherwise back to Main Menu Type 2");
                         Scanner g=new Scanner (System.in);
                         int code=g.nextInt();
                         switch(code)
                         {
                             case 1 : {
                                 System.out.println("Type  four Digits ");
                                 System.out.println("Digit - 1");
                                 Scanner  h =new Scanner (System.in);
                                 int one=h.nextInt();
                                 System.out.println("Digit - 2");
                                 Scanner  j =new Scanner (System.in);
                                 int two=j.nextInt();
                                 System.out.println("Digit - 3");
                                 Scanner k =new Scanner (System.in);
                                 int three= k.nextInt();
                                 System.out.println("Digit - 4");
                                 Scanner  l =new Scanner (System.in);
                                 int four  = l.nextInt();
                                 System.out.println("Your New Pin/Code is : "+one+","+two+","+three+","+four);
                                 break;
                                     }
                             default : {
                                 System.out.println(" Type 2 to Back to Main Menu ");
                             }
                    }
            }
    }