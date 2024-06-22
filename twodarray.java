import java.util.Scanner;

public class twodarray {
    
      
        public static void printtwodarray(int matrix[][]){
            int n=matrix.length;
            int m=matrix[0].length;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }

        }
        public static void  createarray(int matrix[][]){
            Scanner sc=new Scanner(System.in);
            int n=matrix.length;
            int m=matrix[0].length;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }
        }
        public static void spiralmatrix(int matrix[][]){//to create spiral matrix
           int startrow=0;
           int  startcol=0;
           int endrow=matrix.length-1;
           int endcol=matrix[0].length-1;
           while(startrow<=endrow && startcol<=endcol ){
            for(int i=startcol;i<=endcol;i++){
                System.out.print(matrix[startrow][i]);
            }
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]);
            }
            for(int i=endcol-1;i>=startcol;i--){
                System.out.print(matrix[endrow][i]);
            }
            for(int i=endrow-1;i>=startrow+1;i--){
                System.out.print(matrix[i][startcol]);
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;


           }

        }
        public static void diagonalsum(int matrix[][]){//O(n)
            int n=matrix.length;
            int m=matrix[0].length;
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=matrix[i][i];
                if(i !=matrix.length-1-i){
                    sum+=matrix[i][matrix.length-1-i];
                }

            }
            System.out.println("siagonal sum of array is"+sum);


        }
        public static boolean sortedarraysearch(int matrix[][],int key) {//O(n+m){n=matrix.length,m=matrix[0].length}
        int row=matrix.length-1;
        int  column=0;
        while(row>=0 && column<=matrix[0].length-1){
            if(matrix[row][column]==key){
                System.out.println("the key is present in "+"("+row+","+column+")");
                return true;
            }
            if(key>matrix[row][column]){
                column++;
            }
            if(key<matrix[row][column]){
                row--;
            }
        }

        System.out.println("key is not present");
        return false;
            
        }
        
  
        
        
    
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int spiral[][]={{1,2,3,5},
        {4,5,6,3},{2,4,7,4},{3,5,7,0}
        };
        int sorted[][]={
            {1,2,3,4},{5,6,7,8},{9,10,11,12}
        };
       
        sortedarraysearch(sorted,12);

        
      

    }
    
}
