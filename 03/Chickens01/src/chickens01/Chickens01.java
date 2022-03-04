
package chickens01;

public class Chickens01 {
    public static void main(String[] args) {
       
       int eggsPerChicken = 5;
       int ChickenCount = 3;
        int totalEggs ;
        totalEggs = eggsPerChicken * ChickenCount;
//totalEggs = 15
        ChickenCount = ChickenCount + 1;
//ChickenCount = 4
//totalEggs = 15 + 4 * 5
        totalEggs += eggsPerChicken * ChickenCount;
        ChickenCount /= 2;
//ChickenCount = 2
//totalEggs = 35 + 2 x 5
        totalEggs += eggsPerChicken * ChickenCount;

        
        System.out.println(totalEggs);
        
        eggsPerChicken = 4;
        ChickenCount = 8;
        
        totalEggs = eggsPerChicken * ChickenCount;
//totalEggs = 32
        ChickenCount = ChickenCount + 1;
//ChickenCount = 9
//totalEggs = 32 + 9 * 4
        totalEggs += eggsPerChicken * ChickenCount;
        ChickenCount /= 2;
//ChickenCount = 4
//totalEggs = 68 + 4 x 4
        totalEggs += eggsPerChicken * ChickenCount;

        
        System.out.println(totalEggs);
    }   
public static void Scenario2(String[] args) {
       
       
    }   
}
