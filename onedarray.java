import java.util.*;
public class onedarray {
    public static int linearsearch(String menu[]){//linear search using string
        for(int i=0;i<=menu.length;i++){
            if(menu[i]=="dosa"){
                return i;
            }
        }
        return -1;
    }
    public static void reverse(int arr[]){// reverse array
        int first=0;
        int last=arr.length-1;
        while(first<last){
            //switch
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;

        }
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int binarysearch(int arr[],int key){// binary search;prerequisite-numbers should be sorted
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                end=start-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
        
    }
    public static void pairs(int arr[]){//array pairs
        int  totalpairs=0;
        for(int i=0;i<=arr.length-1;i++){
            int current=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ current +","+ arr[j]+")");
                totalpairs++;

            }

            System.out.println();
        }
        System.out.print("total pairs of array:"+" "+ totalpairs);
    }
    public static void subarray(int arr[]){//subarray
        int totalsubarray=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                totalsubarray++;
                System.out.println();
            }
            System.out.println();
        }   
        System.out.println("totalsubarray is"+" "+ totalsubarray);

    }
    public static void subarraysumone(int arr[]){//subarraysum by brute force
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int currentsum =0;
                for(int k=start;k<=end;k++){
                    currentsum+=arr[k];
                    
                }
                if(currentsum>maxsum){
                    maxsum=currentsum;
                }
                
            }
           
        }   
        System.out.println("maximum subarray sum is"+" "+ maxsum);

    }
    public static void subarraysumtwo(int arr[]){//subarraysum by prefix sum
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            int currentsum=0;
            for(int j=i;j<arr.length;j++){
                int end=j;
                if((start-1)<0){
                    currentsum=prefix[end];
                }
                else{
                    currentsum=prefix[end]-prefix[start-1];
                }
                 if(currentsum>maxsum){
                    maxsum=currentsum;
                }
                
            }
           
        }   
        System.out.println("maximum subarray sum is"+" "+ maxsum);

    }
    public static void subarraysumthree(int arr[]){//kadanes algorithm(atleast one positive number)
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0;i<arr.length;i++){
            currentsum+=arr[i];
            if(currentsum<0){
                currentsum=0;
            }
            maxsum=Math.max(maxsum,currentsum);

        }
       
         System.out.println("maximum subarray sum is"+" "+ maxsum);

    }
    public static void trappingrainwater(int height[]) {//trapping rainwater
        int leftmax[]= new int[height.length];
        int rightmax[]=new int[height.length];
        leftmax[0]=height[0];
        int trappedwater=0;
        int n=height.length;
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);

        }
     rightmax[n-1]=height[n-1];
     for(int i=n-2;i>=0;i--){
        rightmax[i]=Math.max(height[i],rightmax[i+1]);
    }
    
    for(int i=0;i<n;i++){
       int waterlevel=Math.min(leftmax[i],rightmax[i]);
        trappedwater+=waterlevel-height[i];
    }
    System.out.println("totalwater is"+" "+ trappedwater );


    }
    public static void buysellstocks(int prices[]) {// buy and sell stocks with maximum profit
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        if(buyprice<prices[i]){
            int profit=prices[i]-buyprice;
            maxprofit=Math.max(maxprofit,profit);
        }
        else{
            buyprice=prices[i];
        }
        System.out.println("maximum profit is"+" "+ maxprofit);
    }
       
    
        
        
    

        
    
    public static void main(String args[]){
        String menu[]= {"dosa","bhature","chatt"};
        int arr[]={1,2,4,6,9};
        int key=9;
        int height[]={4,2,0,6,3,2,5};
        int prices[]={7,1,5,3,6,4};
     
      
       
        
        
       

        
    }
    
}
