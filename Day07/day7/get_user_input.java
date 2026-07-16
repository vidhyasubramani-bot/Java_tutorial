package day7;
import java.util.*;
public class get_user_input {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your size:");
        int a=sc.nextInt();

        int[] id=new int[a];
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            id[i]=b;
        }
        for(int i=0;i<a;i++)
        System.out.println(id[i]);
    }

}
