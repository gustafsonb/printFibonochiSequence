import java.util.Scanner;

    public class printFibonochiSequence{

        public static void main(String args[]){
        
        System.out.println("Enter the maximum no. of lines");
        
        Scanner ob=new Scanner(System.in);
        int ch = ob.nextInt();
        
        System.out.println("There you go with the "+ch+" series of Fibonochi Numbers");
        int a, b, s, n;
        a=b=1;
        
        System.out.println("I am not gonna lie I found this code on the interweb. I did however add this print out to the code and straighten the code out.");
                
                for(n=1;n<=ch;n++){
                
                        System.out.println(a);
                            s=a+b;
                            a=b;
                            b=s;
                }
        }
}