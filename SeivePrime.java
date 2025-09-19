// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] arr=new boolean[n+1];
        for(int i=2;i<=Math.sqrt(n);i++){
            if(!arr[i]){
                for(int j=i*i;j<=n;j=j+i){ //j<-- i*i to n means 2 already 6 divides 2 again 3 also divides
                    //if(j%i==0){
                        arr[j]=true;
                    //}
                }}
        }
        for(int i=1;i<=n;i++){
            if(!arr[i]){
                System.out.println(i+" ");
            }
        }
    }
}//n log(log n)
