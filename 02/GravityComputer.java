import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class GravityComputer{
    public static ArrayList<Integer> program;
    public static void main(String[] args) {
         program = new ArrayList<>();
        load();
        outchecker(); 
    }
    public static void load(){
        File file = new File("input.txt");
        program.clear();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                try{    
                    Scanner rs = new Scanner (sc.nextLine());
                    rs.useDelimiter(",");
                    while (rs.hasNextInt()){
                        program.add(rs.nextInt());
                    }
                    rs.close();

                }
                finally{
                }
            }
            sc.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void run(int n, int v){
        load();
        program.set(1,n);
        program.set(2,v);
        
        int iter = 0;
        while (program.get(iter) != 99){
            if (program.get(iter) == 1){
                int sum = program.get(program.get(iter + 1))  + program.get(program.get(iter + 2));
                program.set(program.get(iter + 3), sum);
                iter += 4;
                continue;
            }
            else if (program.get(iter) == 2){
                int prod = program.get(program.get(iter + 1))  * program.get(program.get(iter + 2));
                program.set(program.get(iter + 3), prod);
                iter += 4;
                continue;
            }
            else{
                System.out.println("Error at it " + iter);
               break;
            }
        }
    }
    public static void outchecker(){
        for (int i=0; i<100; i++){
            for (int j=0; j<100; j++){
                run(i,j);
                if (program.get(0) == 19690720){
                    System.out.println(i);
                    System.out.println(j);
                    break;
                }
    
            }
        }
    }

}