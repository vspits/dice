// VIVIAN SPITS
package dice;
import java.util.Random;
import java.util.Arrays;

public class Dice {
    public static void main(String[] args) {
        
        Random random = new Random();
        int[] trackingRolls = {0,0,0,0,0,0,0,0,0,0,0};
        
        for(int i = 0; i < 36000; i++){
            int rollOne = random.nextInt(6)+1;
            int rollTwo = random.nextInt(6)+1;
            int total = rollOne + rollTwo;
            switch(total){
                case 2:
                    trackingRolls[0] += 1;
                    break;
                case 3:
                    trackingRolls[1] += 1;
                    break;
                case 4:
                    trackingRolls[2] += 1;
                    break;
                case 5:
                    trackingRolls[3] += 1;
                    break;
                case 6:
                    trackingRolls[4] += 1;
                    break;
                case 7:
                    trackingRolls[5] += 1;
                    break;
                case 8:
                    trackingRolls[6] += 1;
                    break;
                case 9:
                    trackingRolls[7] += 1;
                    break;
                case 10:
                    trackingRolls[8] += 1;
                    break;
                case 11:
                    trackingRolls[9] += 1;
                    break;
                case 12:
                    trackingRolls[10] += 1;
                    break;
            }
        }
        
//        System.out.println(Arrays.toString(trackingRolls));
        
        System.out.printf("%s%20s%20s\n", "Sum", "Frequency", "Percentage");
        System.out.printf("%d %16d %18.1f%%\n", 2, trackingRolls[0], trackingRolls[0]/360d);
        System.out.printf("%d %16d %18.1f%%\n", 3, trackingRolls[1], trackingRolls[1]/360d);
        System.out.printf("%d %16d %18.1f%%\n", 4, trackingRolls[2], trackingRolls[2]/360.00);
        System.out.printf("%d %16d %18.1f%%\n", 5, trackingRolls[3], trackingRolls[3]/360.00);
        System.out.printf("%d %16d %18.1f%%\n", 6, trackingRolls[4], trackingRolls[4]/360.00);
        System.out.printf("%d %16d %18.1f%%\n", 7, trackingRolls[5], trackingRolls[5]/360.00);
        System.out.printf("%d %16d %18.1f%%\n", 8, trackingRolls[6], trackingRolls[6]/360.00);
        System.out.printf("%d %16d %18.1f%%\n", 9, trackingRolls[7], trackingRolls[7]/360.00);
        System.out.printf("%d %15d %18.1f%%\n", 10, trackingRolls[8], trackingRolls[8]/360.00);
        System.out.printf("%d %15d %18.1f%%\n", 11, trackingRolls[9], trackingRolls[9]/360.00);
        System.out.printf("%d %15d %18.1f%%\n", 12, trackingRolls[10], trackingRolls[10]/360.00);
    }
}
