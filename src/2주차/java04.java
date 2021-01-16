import java.util.ArrayList;
import java.util.Scanner;
public class java04 {
    public static void main(String[] args) throws NumberFormatException {
        Scanner scan = new Scanner(System.in);
        ArrayList<int[]> list = new ArrayList<>();

        int n = scan.nextInt();
        boolean a = false;

        for(int i = 0; i < n; i++) {
            int[] array = new int [2];
                array[0] = scan.nextInt();
                array[1] = scan.nextInt();
            list.add(array);
        }

        for(int i = 0; i < list.size() - 1; i++) {
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(j)[0] > list.get(i)[1] || list.get(j)[1] < list.get(i)[0]) {
                    continue;
                }
                else {
                    a = true;
                    break;
                }
            }
        }
        System.out.println(a);

    }
}