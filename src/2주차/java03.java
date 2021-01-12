import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class java03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), ", ");
        Scanner scan = new Scanner(System.in);

        int[] nums = new int[1000];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            if(nums[i] == 0)
                break;
        }

        int target = scan.nextInt();

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    bw.write("Output : [" + String.valueOf(i) + ", " + String.valueOf(j) + "]");
                    bw.flush();
                    break;
                }

            }
        }
        br.close();
        bw.close();
    }
}