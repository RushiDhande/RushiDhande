package Day5;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        System.out.println("Enter the Element");
        int a [] = new int[size];
// input
        for(int i=0; i<size;i++)
            a[i] = sc.nextInt();
        System.out.println("Enter the x= value");
        int x = sc.nextInt();

// output
        for(int i=0; i<a.length;i++){
            if(a[i] ==x)
                System.out.println("no found on index " +i);
            }
    }

}
