import java.io.*;
import java.lang.Math;

public class java01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = (int)(Math.random() * 100 + 1);
        int count = 1;


        while (true) {

            System.out.println("1과 100사이의 값을 입력하세요 : ");
            int n = Integer.parseInt(br.readLine());

                if (n > m) {
                    bw.write("더 작은 수를 입력하세요");
                    bw.newLine();
                    bw.flush();
                    count++;
                }

                else if (n < m) {
                    bw.write("더 큰 수를 입력하세요");
                    bw.newLine();
                    bw.flush();
                    count++;
                }

                else {
                    bw.write("맞혔습니다.");
                    bw.newLine();
                    bw.write("시도 횟수는 " + count + "번입니다.");
                    break;
                }

        }

        br.close();
        bw.close();
    }

}

