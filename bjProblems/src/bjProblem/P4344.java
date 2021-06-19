package bjProblem;

import java.util.Scanner;

public class P4344 {
 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("테스트 횟수 > ");
        int tsCase = scn.nextInt();
        int st, sum, cnt;
        double avg;
        int scores[] = new int[1000];
         
        for (int i=0; i<tsCase; ++i) {
        	System.out.print("학생 수와 점수 > ");
            st = scn.nextInt();
            sum = 0;
            cnt = 0;
            for (int j=0; j<st; ++j) {
                scores[j] = scn.nextInt();
                sum += scores[j];
            }
            avg = (double)sum/st;
             
            for (int j=0; j<st; ++j) {
                if (scores[j] > avg) {
                    cnt++;
                }
            }
            System.out.printf("%.3f", 100.0*cnt/st);
            System.out.println("%");
        }
        scn.close();
    }
}
