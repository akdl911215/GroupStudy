import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("시작값을 입력하세요: ");
        int start = scan.nextInt();

        System.out.print("끝값을 입력하세요: ");
        int end = scan.nextInt();

        int i, sum = 0;

        for(i = start; i <= end; i++) {
            sum += i;
        }

        System.out.printf("%d ~ %d까지의 합 = %d\n",
                start, end, sum);
    }
}
