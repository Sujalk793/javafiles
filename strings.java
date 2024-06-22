import java.util.*;
public class strings {
    public static boolean palindrome(String str){//O(n)
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;

    }
    public static float shortestpath(String str){//O(n)
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y++;
            }
            if(str.charAt(i)=='S'){
                y--;
            }
            if(str.charAt(i)=='E'){
                x++;
            }
            if(str.charAt(i)=='W'){
                x--;
            }
        }
        int X2=(int)Math.pow(x, 2);
        int Y2=(int)Math.pow(y, 2);
        return (float)Math.sqrt(X2+Y2);




    }
    public static String largeststring(String arr[]){//O(x(length of largest character)*arr.length)
        String largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(largest.compareTo(arr[i])<0){
                largest=arr[i];
            }

        }
       return largest;


    }
    public static StringBuilder Lettertouppercase(String str){//O(str.length())
        StringBuilder newstr=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        newstr.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                newstr.append(str.charAt(i));
                i++;
                newstr.append(Character.toUpperCase(str.charAt(i)));

            }
            else{
                newstr.append(str.charAt(i));
            }
        }
        return newstr;

    }
    public static String stringcompression(String str){//O(n)
       
        StringBuilder newStr=new StringBuilder("");
        

        for(int i=0;i<str.length();i++){
            Integer count=1;
          
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;

            } 
            newStr.append(str.charAt(i));
            if(count>1){
            
                newStr.append(count.toString().charAt(0));
               
            }
          
        }
        return newStr.toString();

    }




    
    public static void main(String[] args) {
        String str1="madam";
        System.out.println(palindrome(str1));
        String str2="WNEENESENNN";
        System.out.println(shortestpath(str2));
        String arr[]={"mango","apple","banana"};
        System.out.println(largeststring(arr));
        String str3="hi, my name is sujal kumar";
        System.out.println(Lettertouppercase(str3));
        String str4="aaabbbccc";
        System.out.println(stringcompression(str4));

        
    
    }
    
}
