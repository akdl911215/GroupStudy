public class Homework3 {
    public static void main(String[] args) {
        int diceA = (int)(Math.random() * 6) + 1;
        int diceB = (int)(Math.random() * 6) + 1;
        int diceC = (int)(Math.random() * 6) + 1;

        System.out.printf("A = %d, B = %d, C = %d\n",
                diceA, diceB, diceC);

        if(diceA > diceB) {
            if(diceA > diceC) {
                System.out.println("A 승리!");
            } else if(diceC > diceA) {
                System.out.println("C 승리!");
            } else {
                System.out.println("무승부");
            }
        } else if(diceB > diceA) {
            if(diceB > diceC) {
                System.out.println("B 승리!");
            } else if(diceC > diceB) {
                System.out.println("C 승리!");
            } else {
                System.out.println("무승부");
            }
        } else {  // A 와 B 가 같다
            if(diceA > diceC) {
                System.out.println("A - B 무승부");
            } else {
                System.out.println("C 승리!");
            }
        }
    }
}
