import java.io.*;
import java.util.Arrays;

class Time{

    public boolean timeTerm(int[][] time){

    }
}


public class java04{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        Time time = new Time();
        String stringTime = br.readLine();
        String[] stringTimeArray = stringTime.split(",");

        int[] intTimeArray = Arrays.stream(stringTimeArray).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i < intTimeArray.length; i++) {
            if(i % 2 != 0) {
                intTimeArray.
            }
        }

        time.timeTerm(intTimeArray);

        br.close();
        bw.close();
    }
}