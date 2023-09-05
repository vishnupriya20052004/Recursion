
    import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number :");
            int n=sc.nextInt();
            calculate c=new calculate();
            System.out.println("The odd numbers are :");
            c.print_oddnumbers(n);
        }
    }
    class calculate
    {
        void print_oddnumbers(int n){
            if (n%2==0){
                print_oddnumbers(n-1);
            }
            if (n%2==1){
                System.out.println(n);
                print_oddnumbers(n-2);
            }
        }
    }

