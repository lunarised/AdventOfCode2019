import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FuelFinderPartTwo{

	public static int sum;
	
	public static void main(String[] vala){
		File file = new File("input.txt");
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				int i = sc.nextInt();
			 	sum += FuelNeeded(i);
				}
			sc.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.print(sum);
	}
	public static int FuelNeeded(int inp){
		int remainder = inp;
		int sum = 0;
		while (remainder > 0){		
			remainder = ((remainder/3)-2);
			if (remainder > 0){
			sum += (remainder);
			System.out.println(remainder);
			}
		}	
		return sum;
	}
}