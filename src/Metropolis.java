public class Metropolis {

    public static void main(String[] args) {

        boolean check1 = isMetropolis(false,120000,4000);
        System.out.println("check1 = " + check1);

        /*
        if(isMetropolis(false,120000,4000)){
        System.out.println("Diese Stadt ist eine Metropole!");
        }
        else{
        System.out.println("Diese Stadt ist keine Metropole :C");
        }
         */

    }

    public static boolean isMetropolis(boolean Cap, int inhab, double taxPP){
/*
        boolean resultA = Cap && inhab >= 100000;
        boolean resultB = (inhab > 200000) && (taxPP * 12 * inhab);
        return resultA || resultB;
*/
        if((inhab >= 100000 && Cap)
            || (inhab > 200000 && taxPP > 720000000/12/inhab)) {
            return true;
        }
        else{
            return false;
        }

    }
}
