import java.util.*;
public class bitmanupilation {
    public static void checkevenodd(int num){
        int bitmask=1;
        if((bitmask&num) == 0){
            System.out.println("number is even");

        }
        else{
            System.out.println("number is odd");
        }

    }
    public static int getith(int num,int i){
        int bitmask=1<<i;
        if((num&bitmask)==0){
            return 0;
        }
       else{
        return 1;
       }

    }
    public static int setith(int num,int i){
        int bitmask=1<<i;
        return num|bitmask;


    }
    public static int clearith(int num,int i){
        int bitmask=~(1<<i);
        return num&bitmask;

       
    }
    public static int  updateith(int num,int i,int newbit){
        int n=clearith(num,i);
        int bitmask=(newbit<<i);
        return n|bitmask;
    }
    public static int lastith(int num,int i){
        int bitmask=-1<<i;
        return num&bitmask;
    }
    public static int rangeclear(int n,int i,int j){
        int a=(-1<<j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    public static boolean poweroftwo(int num){
        return (num&num-1)==0;


    }
    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int fastexpo(int num,int pow){//O(logn)
        int ans=1;
        while(pow>0){
           
            if((pow&1)!=0){
               ans=ans*num;
                
            }
            num=num*num;
            pow=pow>>1;
        }
        return ans;

    }


    public static void main(String[] args) {
        checkevenodd(4);
        System.out.println(getith(4,1));
        System.out.println(clearith(7, 1));
        System.out.println(setith(10, 2));
        System.out.println(updateith(10,1, 1));
        System.out.println(lastith(10,2));
        System.out.println(poweroftwo(12));
        System.out.println(countsetbits(10));
        System.out.println(rangeclear(10, 2, 4));
        System.out.println(fastexpo(5, 3));


        
    }
    
}
