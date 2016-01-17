import java.util.*;
import java.util.Random;
import java.util.Scanner;


public class Initialization {
	//Scanner fileinput = new Scanner(System.in);
	//String file_input = fileinput.nextLine();
	String input = "Hello, World!";
	int strlength = input.length();
	char[] character = new char[strlength];
	String[] population = new String[50];
	
	public void Population () {
		for(int y = 0; y < 50; y++) {
			for (int z = 0; z < strlength; z++)
			{
				Random generator = new Random(); 
				int i = generator.nextInt(126) + 33;
				char c = (char)i;
				character[z] = c;
			}
			String random = new String(character);
			population[y] = random;
		}
	}
	
	public static void main(String[] args) {
		Initialization pop_1 = new Initialization();
		pop_1.Population();
		for (int j = 0; j < 50; j++) {
			System.out.println(pop_1.population[j]);
		};
	}
}
