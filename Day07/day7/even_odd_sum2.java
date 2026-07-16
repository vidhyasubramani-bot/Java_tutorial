package day7;
import java.util.*;
public class even_odd_sum2 {
    public static void main(String[]args){
        int []id={1,2,34,65,23,65,3,54,686};
        int even=0;
        int odd=0;
        for(int num:id){
            int count=0;
            int org=num;
            while(num!=0){
                int pop=num%10;
                count+=pop;
                num/=10;
            }
            if(count %2==0) {
                even += org;
            }

            else{
                    odd += org;
                }
            }
        System.out.println(even);
        System.out.println(odd);

        }

    }

