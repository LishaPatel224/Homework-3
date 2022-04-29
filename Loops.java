package HW3;
import java.util.Scanner;

public class Loops {

    //NOTE: DO NOT change anything in the boiler plate
    //If I added default code it is meant to be there
    //and should not be adjusted unless otherwise noted
    //(return statments are usually changed)

    //Make a method that will return true if a given 
    //String contains between 1 and 3 'e' chars.
    //Ex.
    //loopE("eat") -> true
    //eeat -> true
    //eeeat -> true
    //eeeeat -> false
    public static boolean loopE(String str){
        char[] A = str.toCharArray();
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 'e') {
                count++;
            }
        }
        if (count == 1 || count== 2 || count == 3) {
            return true;
        }
        return false; //<- this should be changed
    }


    //Given a String str and int n return a larger string
    //that is n copies of the original string 
    //Ex.
    //stringTimes("Code",2) ->"CodeCode"
    //stringTimes("Code",4) ->"CodeCodeCodeCode"
    public static String stringTimes(String str, int n) {
        String s = "";
        for ( int i = 0; i < n; i++ )
        {
            s = s + str;
        }
        return s; // <- this should be changed 
    } 


    //Create a method Given a string, return the string where all of the "z"
    //Have been removed. Except do not remove a z at the start
    //or end
    //Ex.
    //stringT("zHelloz") -> "zHelloz"
    //stringT("nozthaznks") -> "nothanks"
    //stringT("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz"
    public static String stringZ(String str){
        for (int i = 0 ;i < str.length();){
            if (str.substring(0,1).equals("z") && str.substring(str.length()-1).equals("z"))
            {
                return str = "z"+ str.replace("z", "")+"z";
            }
            else if (str.substring(0,1).equals("z"))
            {
                return str ="z"+ str.replace("z", "");
            }
            else if(str.substring(str.length()-1).equals("z"))
            {
                return str =str.replace("z", "") +"z";
            }
            else{
               return str= str.replace("z", "");
            }
        }
        return str;      
    }

    //Create a method that contains a while loop that allows for
    //The user to input numbers until the number 0 is entered. Each time a number is 
    //entered the total will be summed and then prompted for a second number. 
    //NOTE: I require the use of scanner here to get each integer from the user
    //Assume the numbers entered are integers
    //Also note that the method is void meaning you will not need to return anything
    //It will need to sysout the numbers however
    //Below is a sample output what I would like
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 2
    // The total so far is 24.
    // Number: 3
    // The total so far is 27.
    // Number: 0
    // TOTAL ENDED --- The total is 27.
    public static void sums(){
        System.out.println("Adding Numbers");
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter Number:");
        int value = Keyboard.nextInt();
        int sum = 0;
        while (value!=0) {
            sum += value;
            System.out.println("The total so far is:");
            System.out.println(sum);
            System.out.println("Enter Number:");
            value = Keyboard.nextInt();
        }
        System.out.println("TOTAL ENDED --- ");
        System.out.println("The total is "+ sum);
    {   
        Keyboard.close();
    }
}
    public static void main(String[] args) {
       
        System.out.println(Loops.loopE("eat"));
        System.out.println(Loops.loopE("eeat"));
        System.out.println(Loops.loopE("eeeat"));
        System.out.println(Loops.loopE("eeeeat"));
        System.out.println(stringTimes("Code", 2));
        System.out.println(stringTimes("Code", 4));
        System.out.println(stringZ("zHelloz"));
        System.out.println(stringZ("nozthaznks"));
        System.out.println(stringZ("xksiazdjaasldzsajzasdz"));
    
        sums();
    }
}
