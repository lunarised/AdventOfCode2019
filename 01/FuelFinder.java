public class FuelFinder{
    public static void main(String[] vala){
        int[] tVals = {12,14,1969,100756};
        for (int a:tVals){
            System.out.println(FuelNeeded(a));
        }
    }
    public static int FuelNeeded(int inp){
        return ((inp/3)-2);
    }
}