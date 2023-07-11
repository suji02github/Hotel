import java.util.*;
class Hotel
 {
   static Scanner sc=new Scanner(System.in);
   public static void main(String[] args)
    {
      System.out.println("\t\t\t*************SELECT THE HOTEL************");
      System.out.println("1.KMS\n2.KANAPPA");
      int SelectedHotel =sc.nextInt();
      switch(SelectedHotel)
       {
         case 1:
                 {
                    System.out.println("\t\t\tWELCOME TO KMS HOTEL");
                    System.out.println("\t\t\t*********select the dish*********");
                    System.out.println("1.Briyani\n2.Chicken65\n3.Mutton");
                    int SelectedDish=sc.nextInt();
                    if(SelectedDish==1)
                     {
                        System.out.println("Briyani");
                        System.out.println("The Amount Of Briyani = 350");
                        System.out.println("\t\t\t*********Enter The Quantity***************");
                        int Quant=sc.nextInt();
                        int result=Quant*350;
                        System.out.println("The Selected Quantity Amount is"+result);
                        System.out.println("If u Want To Place a Order If Yes Means Press 1 Or Press 2");
                        int PlaceOrder=sc.nextInt();
                        if(PlaceOrder==1)
                          {
                            System.out.println("Place a Order");
                          }
                        else
                         {
                           System.out.println(" Not Place a Order");
                         }
                            
                        System.out.println("\t\t\t************THANK YOU VISIT AGAIN*************");
                     }
                    else if(SelectedDish==2)
                     {
                       System.out.println("Chicken65");
                       System.out.println("the amount of chicken65 = 100");
                       System.out.println("\t\t\t*********Enter The Quantity***************");
                        int Quant=sc.nextInt();
                        int result2=Quant*100;
                        System.out.println("The Selected Quantity Amount is"+result2); 
                        System.out.println("If U Want To Place A Order If Yes Means Press 1 Or Press 2");
                        int PlaceOrder=sc.nextInt();
                        if(PlaceOrder==1)
                          {
                            System.out.println("Place A Order");
                          }
                        else
                         {
                           System.out.println(" Not Place A Order");
                         }
                        System.out.println("\t\t\t************THANK YOU VISIT AGAIN*************");
                     }
                    else
                     {
                        System.out.println("Mutton");
				  System.out.println("The Amount Of Mutton = 200");
                        System.out.println("\t\t\t*********Enter The Quantity***************");
                        int Quant=sc.nextInt();
                        int result3=Quant*200;
                        System.out.println("The Selected Quantity Amount is"+result3);
                        System.out.println("If U Want To Place A Order If Yes Means Press 1 Or Press 2");
                        int PlaceOrder=sc.nextInt();
                        if(PlaceOrder==1)
                          {
                            System.out.println("Place A Order");
                          }
                        else
                         {
                           System.out.println(" Not Place A Order");
                         }
                        System.out.println("\t\t\t************THANK YOU VISIT AGAIN*************");
                     }
                     
                    
                     
                     
                    break;
                 }
         case 2:
                {
                   System.out.println("\t\t\tWELCOME TO KANNAPPA HOTEL");
                   System.out.println("\t\t\t*********SELECT THE DISH*********");
                    System.out.println("1.Mutton Briyani\n2.Chicken Lolipop\n3.Chicken Grill");
                    int SelectedDish=sc.nextInt();
                    if(SelectedDish==1)
                     {
                        System.out.println("Mutton Briyani");
                        System.out.println("The Amount Of Mutton Briyani = 380");
                        System.out.println("\t\t\t*********Enter The Quantity***************");
                        int Quant=sc.nextInt();
                        int result=Quant*380;
                        System.out.println("The Selected Quantity Amount is"+result);
                        System.out.println("If U Want To Place A Order If Yes Means Press 1 Or Press 2");
                        int PlaceOrder=sc.nextInt();
                        if(PlaceOrder==1)
                          {
                            System.out.println("Place A Order");
                          }
                        else
                         {
                           System.out.println(" Not Place A Order");
                         }
                        System.out.println("\t\t\t************THANK YOU VISIT AGAIN*************");
                     }
                    else if(SelectedDish==2)
                     {
                       System.out.println("Chicken Lolipop");
                       System.out.println("The Amount Of Chicken Lolipop = 150");
                       System.out.println("\t\t\t*********Enter The Quantity***************");
                        int Quant=sc.nextInt();
                        int result2=Quant*150;
                        System.out.println("The Selected Quantity Amount is"+result2);
                        System.out.println("If U Want To Place A Order If Yes Means Press 1 Or Press 2");
                        int PlaceOrder=sc.nextInt();
                        if(PlaceOrder==1)
                          {
                            System.out.println("Place A Order");
                          }
                        else
                         {
                           System.out.println(" Not Place A Order");
                         } 
                        System.out.println("\t\t\t************THANK YOU VISIT AGAIN*************");
                     }
                    else
                     {
                        System.out.println("Chicken Grill");
				  System.out.println("The Amount Of Chicken Grill = 300");
                        System.out.println("\t\t\t*********Enter The Quantity***************");
                        int Quant=sc.nextInt();
                        int result3=Quant*300;
                        System.out.println("The Selected Quantity Amount is"+result3);
                        System.out.println("If U Want To Place A Order If Yes Means Press 1 Or Press 2");
                        int PlaceOrder=sc.nextInt();
                        if(PlaceOrder==1)
                          {
                            System.out.println("Place A Order");
                          }
                        else
                         {
                           System.out.println(" Not Place A Order");
                         }
                        System.out.println("\t\t\t************THANK YOU VISIT AGAIN*************");
                     }
                     
                   break;
                }
       }
   }
}