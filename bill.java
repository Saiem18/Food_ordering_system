
// class object method operators if else 
/*
    name
1.starters
2.main coarse
3.Desert
4.drinks


menu of drinks
1.itm 1   50
2.itm 2   56
3.itm kh  56


enter choice of item:


do you want to add any oither

display again menu 

 */
import java.util.*;
public class bill{
    int Menu,Maincourse,total,finalamt,Desert,Starter,Drinks;
;
    String  Itemname;
    static char y,n,ans;
    static char back;
    static char backto;
    static char returnto;
    
    public static void main(String args[]){
        bill obj=new bill();
        Scanner sc=new Scanner(System.in);        
        //String    Drinks;
        System.out.println("**Welcome to my Restautant**");
        System.out.println("What would you like to order?");
        System.out.println("You can select from: \n 1.Starters \n 2.Main Course \n 3.Desert \n 4.Drinks");
        obj.Items();
        obj.choice();
        obj.choice1();
        obj.choice2();
        obj.choice3();
        obj.totalbill();


        System.out.println("Do you want to go back to mainmenu?\nEnter yes or no");
    // Scanner sc=new Scanner(System.in);
        back=sc.next().charAt(0);
        if(back=='y'||back=='Y'){
            main(null);
        
        }
        else{
            System.out.println("Thanks");
        }

        sc.close();      
    }
    public void Items(){
        
        System.out.println("Press the number according to your dishes (1-4)");

        Scanner sc=new Scanner(System.in);
        Menu=sc.nextInt();
        
        switch(Menu){
            case 1:
            System.out.println("1.Chicken Tikka  150rs\n 2.Veg Munchurian  100rs\n 3.Fish fry Dry  200rs\n 4.Todays Special  300rs");
            break;
            case 2:
            System.out.println("1.Chicken Biryani  350rs\n 2.Veg Biryani  300rs\n 3.Fish curry  250rs\n 4.Murg Musallam  400rs");
            break;
            case 3:
            System.out.println("1.Kunafa  350rs\n 2.Cheesecake  200rs\n 3.Custard  150rs\n 4.Caramel  100rs");
            break;
            case 4:
            System.out.println("1.Orange Juice  50rs\n 2.Mocktail  80rs\n 3.Lemonade  60rs\n 4.Mojito  50rs");

        }
        
           
    }
       public void choice(){

        if(Menu==1){
            System.out.println("Choose the dish You want to order:(1-4)");

            Scanner sc=new Scanner(System.in);       
            Starter=sc.nextInt();

        switch(Starter){
                case 1:
                System.out.println("Chicken tikka  150");
                total+=150;
                break;
                case 2:
                System.out.println("Veg Munchurian  100");
                total+=100;
                break;
                case 3:
                System.out.println("Fish fry dry  200");
                total+=200;
                break;
                case 4:
                System.out.println("Todays special  300");
                total+=300;
                break;
        }
          System.out.println("Do you want to add another Starter item?\nEnter yes or no");
        ans=sc.next().charAt(0);
        if(ans=='y'||ans=='Y'){
            choice();
        }else{
            System.out.println("your total of Starter: "+total);
        }


  

    }    

    }
      
    public void choice1(){
        
        if(Menu==2){
            System.out.println("Choose the dish You want to order:(1-4)");
            Scanner sc=new Scanner(System.in);
        Maincourse=sc.nextInt();
        

        switch(Maincourse){
            case 1:
            System.out.println("Chicken Biryani  350");
            total+=350;
            break;
            case 2:
            System.out.println("Veg Biryani  300");
            total+=300;
            break;
            case 3:
            System.out.println("Fish curry  250");
            total+=250;
            break;
            case 4:
            System.out.println("Murg musallam  400");
            total+=400;
            break;

        }
        System.out.println("Do you want to add another maincourse item?\nEnter yes or no");
        ans=sc.next().charAt(0);
        if(ans=='y'||ans=='Y'){
            choice1();
        }else{
            System.out.println("your total of main course: "+total);
        }
                
        }    
            
    }
    public void choice2(){
        
        if(Menu==3){
            System.out.println("Choose the dish You want to order:(1-4)");
            Scanner sc=new Scanner(System.in);
        Desert=sc.nextInt();
         switch(Desert){
                case 1:
                System.out.println("Kunafa  350");
                total+=350;
                break;
                case 2:
                System.out.println("Cheesecake  200");
                total+=200;
                break;
                case 3:
                System.out.println("Custard  150");
                total+=150;
                break;
                case 4:
                System.out.println("Caramel  100");
                total+=100;
                break;    
            }
              System.out.println("Do you want to add another Desert item?\nEnter yes or no");
        
             
        backto=sc.next().charAt(0);
        if(backto=='y'||backto=='Y'){
            choice2();  
        }
        else{
            System.out.println("Total of deserts: "+total);
        }       
        

         
     
        }  
      
    

    }
    public void choice3(){
        
        if(Menu==4){
            System.out.println("Choose the dish You want to order:(1-4)");
            Scanner sc=new Scanner(System.in);

            System.out.println("1.Orange Juice  50rs\n 2.Mocktail  80rs\n 3.Lemonade  60rs\n 4.Mojito  50rs");
            Drinks=sc.nextInt();
            switch(Drinks){
                case 1:
                System.out.println("Orange Juice  50");
                total+=50;
                break;
                case 2:
                System.out.println("Mocktail  80");
                total+=80;
                break;
                case 3:
                System.out.println("Lemonade  60");
                total+=60;
                break;
                case 4:
                System.out.println("Mojito  50");
                total+=50;
                break;    
            }
            
            System.out.println("Do you want to add another Drink?\nEnter yes or no");          
            returnto=sc.next().charAt(0);
            if(returnto=='y'||returnto=='Y'){
            choice3();  
            }
            else{
            System.out.println("Total of Drinks: "+total);
            }       
        
        }
         
     
    }  
    
    public void totalbill(){
        finalamt+=total;
        System.out.println("Your bill is: "+finalamt);
    }




}
        




