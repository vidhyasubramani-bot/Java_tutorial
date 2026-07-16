package Day07;

public class evenodd {
    public static void main(String[]args){
        int odd=0;
        int even=0;
        int []id={2,5,3,7,5,9,6,7,1,0,3,5,};
        for(int num:id){
            if(num%2==0){
                even++;
            }
            else{
                odd++;
            }


        }
        System.out.println("even="+ even);
        System.out.println("odd="+ odd);
    }
}
