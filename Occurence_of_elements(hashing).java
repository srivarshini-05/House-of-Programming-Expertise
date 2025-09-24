import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int c;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==null){
                map.put(arr[i],1);
            }
            else{
                c=map.get(arr[i]);
                c++;
                map.put(arr[i],c);
            }
        }
        for (int value : map.values()) {
    System.out.print(value+" ");
}

        
    }
}
