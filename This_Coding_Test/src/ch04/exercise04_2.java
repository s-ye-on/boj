package ch04;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//p.113 예제 4-2 시각
public class exercise04_2 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int count =0;

        for(int i=0; i<=N; i++){
            for(int j=0; j<60; j++){
                for(int k=0; k<60; k++){
                    if(check(i,j,k)){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
    public static boolean check(int h, int m, int s){
        if(h%10 ==3 || m/10==3 || m%10==3 || s/10==3 || s%10==3){
            return true;
        }
        return false;
    }
}
