import java.io.*;

public class java02 {
    public static void main(String[] args) throws IOException {

        int sum = 0;

        for (int i = 1; ; i++) {

            if (i % 2 != 0)
                sum += i;

            else
                sum += -i;

            if (sum >= 100) {
                System.out.println(i + " 까지 더해야 총 합이 100 이상 됩니다.");
                break;
            }
        }
    }
}
