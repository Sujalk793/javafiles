import java.util.*;
public class sort {// for increasing order
    public static void arrayprint(int arr[]){//to print sorted arrays
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void bubblesort(int arr[]){// bubblesort
        int n=arr.length;
        for(int i=0;i<=n-2;i++){
            for(int j=0;j<=n-2-i;j++){
                if(arr[j]>arr[j+1]){
                //swap
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                }
            }
        }

        arrayprint(arr);
    }
    public static void selectionsort(int arr[]){//selectionsort
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minpos=i;
            for(int j=i+1;j<n;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        

    }
    public static void insertionsort(int arr[]){//insertion sort
        int n=arr.length;
        for(int i=1;i<n;i++){
           int current=arr[i];
           int prev=i-1;
           while(prev>=0 && arr[prev]>current){
            arr[prev+1]=arr[prev];
            prev--;
           }
           arr[prev+1]=current;


        }

    }
    public static void countingsort(int arr[]){//counting sort
        int largest=Integer.MIN_VALUE;
        int j=0;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
                
            }
        }

    }

     
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        countingsort(arr);
        arrayprint(arr);
        
    }
    
}
