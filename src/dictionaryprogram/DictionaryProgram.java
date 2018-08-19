package DictionaryProgram;
/*
 * Created by James Andrew Martinez
 * User: LENOVO
 * Date: 2018.08.02
 * Time: 9:00:37 PM
 */
import java.util.HashMap;
import java.util.Scanner;
public class DictionaryProgram {
//Sample of Editing of Code 
	
    public static void main(String[] args) {
        //Testing Git
		//Create a hasmap with the key and value are string
		HashMap<String,String> dictionary = new HashMap();
		//Adding vocabulary into the dictionary
               	//Kunwari nagcocode ka tapos gusto isave iclick mo to
		dictionary.put("algorithm", "A step-by-step procedure to achieve a specific goal.");
		dictionary.put("array", "An Oldfag is  is a user of an online community who has been\nwith the community a considerable amount of time");
		dictionary.put("bracket","Characters often used to surround text");
		dictionary.put("bug","A mistake in a program");
		dictionary.put("comment","Arbitrary text written around code, but which is never run,\nand is generally ignored by the computer. Used to leave notes\nand documentation for people who read the code later. ");
                
		Scanner keyboard = new Scanner(System.in);
		String input = " ";
		
		//Prompting the user to type a word
		do {
			System.out.println("\nEnter the word you should to look up.\nPress q to quit");
                        System.out.print("Input: ");
                        
			input = keyboard.nextLine();
			//Formating the user input 
			input = input.toLowerCase(); //Changing it to lower case
			input = input.replace(" ",""); //Removing the whitespace
                        input = input.replace(",", "");//Removing commas 
                        input = input.replace(".", "");//Removing dots
                        input = input.replace("s", "");//Removing s
			//Taking the user input
			if ( dictionary.containsKey(input) ) {
				String definition = dictionary.get(input);
                                System.out.println(" ");
				System.out.println("Definition: \n" + definition);
			}
			else {
                            if(! input.equalsIgnoreCase("q")){
                                System.out.println("Word not found");
                            }	
			}
                }
                while (! input.equalsIgnoreCase("q") );
    }

}
