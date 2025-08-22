import java.util.Scanner;

class Variables {
    int a, b, c, d, x, z;
    }

public class Vectors {
    public static Variables Computation(){
        Scanner sc = new Scanner(System.in);
        Variables result = new Variables();
        
        System.out.println("Enter the values x [a] z [c]");
        System.out.println("                   [b]   [d]");

        System.out.println("Enter the value for a: ");
        result.a = sc.nextInt();

        System.out.println("Enter the value for b: ");
        result.b = sc.nextInt();

        System.out.println("Enter the value for c: ");
        result.c = sc.nextInt();

        System.out.println("Enter the value for d: ");
        result.d = sc.nextInt();

        System.out.println("Enter the value for x: ");
        result.x = sc.nextInt();

        System.out.println("Enter the value for z: ");
        result.z = sc.nextInt();

        System.out.println("Enter the values: " + result.x + " [" + result.a + "] " + result.z + " [" + result.c + "] " );
        System.out.println("                    [" + result.b + "]  " + " [" + result.d + "] ");

        int cresult1 = result.x * result.a;
        int cresult2 = result.x * result.b;
        int cresult3 = result.z * result.c;
        int cresult4 = result.z * result.d;
        int cresult5 = cresult1 + cresult3;
        int cresult6 = cresult2 + cresult4;

        System.out.println("is equal to = ");
        System.out.println("[" + cresult1 + " + " + cresult3 + "]");
        System.out.println("[" + cresult2 + " + " + cresult4 + "]");
        System.out.println("is equal to = ");
        System.out.println("[" + cresult5 + "]");
        System.out.println("[" + cresult6 + "]");


        sc.close();
        return result;
    }

    public static void displayComputation(Variables result) {
        System.out.println("\nComputed Values:");
        System.out.println("a: " + result.a);
        System.out.println("b: " + result.b);
        System.out.println("c: " + result.c);
        System.out.println("d: " + result.d);
        System.out.println("x: " + result.x);
        System.out.println("z: " + result.z);
    }
    public static void main(String[] args) {
        Variables result = Computation();
        displayComputation(result);
    }
}
