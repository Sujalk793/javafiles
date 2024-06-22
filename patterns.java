public class patterns{
    public static void star(){
        int n=4;
        for(int line=1;line <=n;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void invertedstar(){
        int n=4;
        for(int line=1;line<=n;line++){
            for(int star=1;star<=n-line+1;star++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
    public static void halfpyramid(){
        int n=4;
        for(int line=1;line<=n;line++){
            for(int number=1;number<=line;number++){
            System.out.print( number + " ");

            }
            System.out.println();
        }
    }
    public static void character(){
        char alphabet='A';
        int n=4;
        for(int line=1;line<=n;line++){
            for(int character=1;character<=line;character++){
                System.out.print( alphabet + " ");
                alphabet++;

            }
            System.out.println();
            
        }
    }
    public static void hollowrectangle(){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
                

            }
            System.out.println();
        }
        
        
    }
    public static void invertedrotatedpyramid(){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void invertednumberpyramid() {
        int n=5;
        for(int i=1;i<=n;i++){
            int number=0;
            for(int j=n;j>=i;j--){
                number++;
                System.out.print(number);
            }
          
            
            System.out.println();
        }

        
    }
    public static void floyodtriangle(){
        int number=0;
        int n=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    number++;
                    System.out.print(number +" ");
                }
                System.out.println();
            }
        
    }
    public static void zeroonetriangle(){
        int n=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");

                    }

                    
                
            }
            System.out.println();
        
    }
}
    public static void butterfly(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                 System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
             }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void rhombus(){
        int n=5;
        for(int i=1;i<=n;i++){
           for(int j=1;j<=5-i;j++){
            System.out.print(" ");
           }
           for(int j=1;j<=n;j++){
            System.out.print("*");
           }
       
           System.out.println();
        }
    }

    public static void hollowrhombus(){
       int n=5;
       for(int i=1;i<=n;i++){
         for(int j=1;j<=n-i;j++){
            System.out.print(" ");
          }
          for(int j=1;j<=n;j++){
            if(i==1||i==n||j==1||j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            

          }
          System.out.println();
        }
    }
       public static void diamond(){
        int n=4;
        for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i;j++){
            System.out.print(" ");
           }
           for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
           } 
           for(int j=1;j<=n-i;j++){
            System.out.print(" ");
           }
           System.out.println();
            }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                 System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){
                 System.out.print("*");
                } 
                for(int j=1;j<=n-i;j++){
                 System.out.print(" ");
                }
                System.out.println();
        }
             
        
    }
           

    public static void main(String args[]){
        butterfly();
        

    }
    
}
