import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FuelFinder{
	public static int sum = 0;
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
		return ((inp/3)-2);
	}
}