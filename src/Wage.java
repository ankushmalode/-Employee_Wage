import java.util.Random;

public class Wage {
    public static void main(String[] args) {
        int rate=20, empHrs=0, totalSalary=0, count=0;
        Random days = new Random();
        int number;
        for (int i=1; i<=20; i++) {
            number = days.nextInt(3);
//            System.out.printf(number + " ");
            if (empHrs<=100) {
                switch (number) {
                    case 1:
                        empHrs= empHrs+8;
                        break;
                    case 2:
                        empHrs=empHrs+4;
                        break;
                    default:
                        empHrs=empHrs+0;
                }
                count = count+1;
                System.out.println(count);
                System.out.println(empHrs);
            }
//            System.out.println(empHrs);
//            z= z+1;
//            System.out.println(z);
        }
        int salary= empHrs*rate;
        totalSalary= salary+totalSalary;
        System.out.printf("\nTotal salary is "+ totalSalary);
    }
}