
//version 2 uses a large elif statement and uses a gui to get the inputs and to output

import javax.swing.JOptionPane;
public class starsignv2 {
public static void main(String args[]){
    String monthstr = JOptionPane.showInputDialog("Enter the month you were born (Eg: January):");
    String date1 = JOptionPane.showInputDialog("Enter the date you were born(Eg: 15):");

    int date = Integer.parseInt(date1);

    //JOptionPane.showMessageDialog( null, "You entered "+monthstr+" "+date,  "TEST", JOptionPane.PLAIN_MESSAGE ); 
    //JOptionPane.showMessageDialog( null, "The sum is " + sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE ); 
    
    if(date >31){
        JOptionPane.showMessageDialog( null, "RELOAD PROGRAM",  "ERROR", JOptionPane.PLAIN_MESSAGE ); 

    }
    else{
        //aries -- done
        if((monthstr.equals("March")&& (date <=21)) || (monthstr.equals("April")&&(date<=19))){
            System.out.println("You are an Aries");
            JOptionPane.showMessageDialog( null, "You are an Aries!",  "Conclusion", JOptionPane.PLAIN_MESSAGE ); 

        }

        //taurus -- done
        else if((monthstr.equals("April")&& (date >=20)) || (monthstr.equals("May")&&(date<=20))){
            JOptionPane.showMessageDialog( null, "You are a Taurus!",  "Conclusion", JOptionPane.PLAIN_MESSAGE ); 
        }
        //gemini -- done 
        else if((monthstr.equals("May")&& (date >=21)) || (monthstr.equals("June")&&(date<=21))){
            JOptionPane.showMessageDialog( null, "You are a Gemini!",  "Conclusion", JOptionPane.PLAIN_MESSAGE ); 
        }
        //cancer -- done
        else if((monthstr.equals("June")&& (date >=22)) || (monthstr.equals("July")&&(date<=22))){
            JOptionPane.showMessageDialog( null, "You are a Cancer!",  "Conclusion", JOptionPane.PLAIN_MESSAGE ); 
        }
        //leo -- done 
        else if((monthstr.equals("July")&& (date >=23)) || (monthstr.equals("August")&&(date<=22))){
            JOptionPane.showMessageDialog( null, "You are a Leo!",  "Conclusion", JOptionPane.PLAIN_MESSAGE ); 
        }
        //virgo -- done 
        else if((monthstr.equals("August")&& (date >=23)) || (monthstr.equals("September")&&(date<=22))){
            JOptionPane.showMessageDialog( null, "You are a Virgo!",  "Conclusion", JOptionPane.PLAIN_MESSAGE ); 
        }
        //libra
        else if((monthstr.equals("September")&& (date >=23)) || (monthstr.equals("October")&&(date<=23))){
            JOptionPane.showMessageDialog( null, "You are a Libra!",  "Conclusion", JOptionPane.PLAIN_MESSAGE ); 
        }
        //scorpio
        else if((monthstr.equals("October")&& (date >=24)) || (monthstr.equals("November")&&(date<=21))){
            JOptionPane.showMessageDialog( null, "You are a Scorpio!",  "Conclusion", JOptionPane.PLAIN_MESSAGE ); 
        }
        //saggy
        else if((monthstr.equals("November")&& (date >=22)) || (monthstr.equals("December")&&(date<=21))){
            JOptionPane.showMessageDialog( null, "You are a Sagitaurius!",  "Conclusion", JOptionPane.PLAIN_MESSAGE ); 

        }
        //capricorn
        else if((monthstr.equals("December")&& (date >=22)) || (monthstr.equals("January")&&(date<=19))){
            JOptionPane.showMessageDialog( null, "You are a Capricorn!"+"\n"+"Capricorn is the 10th zodiac sign, represented by a goat. People born under this sign are said to be disciplined, hardworking, and practical."+"\n "+"They are also known for being reserved, ambitious, and responsible. Capricorns value tradition and stability, and they often have a strong sense of duty.",  "Conclusion", JOptionPane.PLAIN_MESSAGE ); 
        }
        //Aquarius
        else if((monthstr.equals("January")&& (date >=20)) || (monthstr.equals("February")&&(date<=18))){
            JOptionPane.showMessageDialog( null, "You are an Aquarius!",  "Conclusion", JOptionPane.PLAIN_MESSAGE ); 
        }
        //pisces
        else if((monthstr.equals("February")&& (date >=19)) || (monthstr.equals("March")&&(date<=20))){
            JOptionPane.showMessageDialog( null, "You are a Pisces!",  "Conclusion", JOptionPane.PLAIN_MESSAGE ); 
        }
       else{
        JOptionPane.showMessageDialog( null, "ERROR: Check Caps, spelling, and ensure date is formatted correctly",  "Conclusion", JOptionPane.PLAIN_MESSAGE ); 
    }
    }
}
}


