import java.util.Scanner;

public class ArrayConcept {
    public static void main(String[] args){
        System.out.println("Enter first line co-ordinates");
        Scanner sc = new Scanner(System.in);
        System.out.println("x1");
        int x1 = sc.nextInt();
        System.out.println("x2");
        int x2 = sc.nextInt();
        System.out.println("y1");
        int y1 = sc.nextInt();
        System.out.println("y2");
        int y2 = sc.nextInt();

        System.out.println("Enter first line co-ordinates");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("a1");
        int a1 = sc1.nextInt();
        System.out.println("a2");
        int a2 = sc1.nextInt();
        System.out.println("b1");
        int b1 = sc1.nextInt();
        System.out.println("b2");
        int b2 = sc1.nextInt();

        double length1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        //System.out.println(length1);
        double length2 = Math.sqrt(Math.pow((a2-a1),2) + Math.pow((b2-b1),2));
//        System.out.println(length2);

    if (length1<length2)
        System.out.println("Length 2 is greater then Length 1");
    else if (length1>length2)
        System.out.println("Length 1 is greater then Length 2");
    else
        System.out.println("Length 1 is equal to Length 2");
    }
}
