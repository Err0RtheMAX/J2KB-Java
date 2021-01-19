import java.util.Scanner;
import java.io.IOException;

public class java06 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int array[] = new int[n];
        int i = 0;

        while(true){
            array[i] = scan.nextInt();
            i++;

            if(i == n) {
                i = 0;
                break;
            }
        }

        while(true){
            System.out.println(array[i]);
            i++;

            if(i == n)
                break;
        }
    }
}