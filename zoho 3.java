/*

Eg 1: Input: 13,2 4,15,12,10,5
        Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
        Output: 9,2,7,4,5,6,3,8,1 
        
*/


// if the size of array is not given 
import java.util.*;
import java.util.Scanner;

public class Main
{
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s[]=sc.nextLine().split(" ");
        int len=s.length,arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        
        for(int i=0;i<len;i+=2){
            for(int j=i;j<len;j+=2){
                if(arr[i]<arr[j]){
                    arr[i]+=arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]-=arr[j];
                }
            }
        }
        for(int i=1;i<len;i+=2){
            for(int j=i;j<len;j+=2){
                if(arr[i]>arr[j]){
                    arr[i]+=arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]-=arr[j];
                }
            }
        }
        for(int i: arr)System.out.print(i+" ");
		
	}
}



/* 

if the size of array is given 

import java.util.*;
import java.util.Scanner;

public class Main
{
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt(),k=0,h=0,u=0,r=0;
        int odd[]=new int[len], eve[]=new int[len];
        for(int i=0;i<len;i++){
            if((i&1)>0){
                odd[u++]=sc.nextInt();
            }else{
                eve[r++]=sc.nextInt();
            }
        }
      
        for(int i=0;i<u;i++){
            for(int j=i+1;j<u;j++){
                if(odd[i]>odd[j]){
                    odd[i]+=odd[j];
                    odd[j]=odd[i]-odd[j];
                    odd[i]-=odd[j];
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=i+1;j<r;j++){
                if(eve[i]<eve[j]){
                    eve[i]+=eve[j];
                    eve[j]=eve[i]-eve[j];
                    eve[i]-=eve[j];
                }
            }
        }
        for(int i=0;i<len;i++){
            if((i&1)>0){
                System.out.print(odd[k++]+" ");
            }else{
                System.out.print(eve[h++]+" ");
            }
        }
		
	}
}

*/
