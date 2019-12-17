public class PasswordCracker{
    public static void main(String[] args) {
        int possibleCount = 0;
        for (int i = 134564; i < 585159; i++){
            possibleCount = isViablePassword(i) ? ++possibleCount : possibleCount;
        } 
        System.out.print(possibleCount);
    }


    public static boolean isViablePassword(int inp){
        boolean containsDouble = false;
        int seq = 0;
        String inpS = String.valueOf(inp);
        char lastVal = inpS.charAt(0);
        for (int i = 1; i<inpS.length(); i++ ){
            if (inpS.charAt(i) < lastVal){
                return false;
            }
            else if(inpS.charAt(i) == lastVal){
                seq++;
            }
            else{  
                lastVal = inpS.charAt(i);
                if (seq == 1){
                    containsDouble = true;
                }
                seq = 0;
            }
        }
        if (seq == 1){
            containsDouble = true;
        }
        if (containsDouble){
            return true;
        }
        else{
            return false;
        }
    }
}
