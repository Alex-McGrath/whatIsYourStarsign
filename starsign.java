
// Version one uses a large elif statement and prints to the terminal

import java.util.*;

public class starsign {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the month you were born (For example: January): ");
    String monthstr = sc.nextLine();

    System.out.print("Please enter the date you were born (For example: 14): ");
    int date = sc.nextInt();

    System.out.println("You have entered:  "+monthstr+" "+date);
    sc.close();
    
    if(date >31){
        System.out.println("ERROR: RELOAD PROGRAM");
    }
    else{
        //aries -- done
        if((monthstr.equals("March")&& (date <=21)) || (monthstr.equals("April")&&(date<=19))){
            System.out.println("You are an Aries");
        }

        //taurus -- done
        else if((monthstr.equals("April")&& (date >=20)) || (monthstr.equals("May")&&(date<=20))){
            System.out.println("You are a Taurus");
        }
        //gemini -- done 
        else if((monthstr.equals("May")&& (date >=21)) || (monthstr.equals("June")&&(date<=21))){
            System.out.println("You are a Gemini");
        }
        //cancer -- done
        else if((monthstr.equals("June")&& (date >=22)) || (monthstr.equals("July")&&(date<=22))){
            System.out.println("You are an Cancer");
        }
        //leo -- done 
        else if((monthstr.equals("July")&& (date >=23)) || (monthstr.equals("August")&&(date<=22))){
            System.out.println("You are an Leo");
        }
        //virgo -- done 
        else if((monthstr.equals("August")&& (date >=23)) || (monthstr.equals("September")&&(date<=22))){
            System.out.println("You are an Virgo");
        }
        //libra
        else if((monthstr.equals("September")&& (date >=23)) || (monthstr.equals("October")&&(date<=23))){
            System.out.println("You are an Libra");
        }
        //scorpio
        else if((monthstr.equals("October")&& (date >=24)) || (monthstr.equals("November")&&(date<=21))){
            System.out.println("You are an Scorpio");
        }
        //saggy
        else if((monthstr.equals("November")&& (date >=22)) || (monthstr.equals("December")&&(date<=21))){
            System.out.println("You are an Sagitaurius");
        }
        //capricorn
        else if((monthstr.equals("December")&& (date >=22)) || (monthstr.equals("January")&&(date<=19))){
            System.out.println("You are an Capricorn");
        }
        //Aquarius
        else if((monthstr.equals("January")&& (date >=20)) || (monthstr.equals("February")&&(date<=18))){
            System.out.println("You are an Aquarius");
        }
        //pisces
        else if((monthstr.equals("February")&& (date >=19)) || (monthstr.equals("March")&&(date<=20))){
            System.out.println("You are an Pisces");
        }
       else{
        System.out.println("ERROR: TRY AGAIN");
       }
    }
   

}
    
}

