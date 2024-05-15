import java.util.Scanner;

public class Task2 {
    public static void main(String arg[])
        {
            System.out.println("Enter the mark for each subject");
            Scanner sc = new Scanner(System.in);
            System.out.println("Subject 1");
            int a = sc.nextInt();
            System.out.println("Subject 2");
            int b = sc.nextInt();
            System.out.println("Subject 3");
            int c = sc.nextInt();
            System.out.println("Subject 4");
            int d = sc.nextInt();
            System.out.println("Subject 5");
            int e = sc.nextInt();
            float total = a+b+c+d+e;
            float Average = total*100/(100*5);
            System.out.println("Total marks:"+total);
            System.out.println("Average: "+Average);
            if(Average<35){
                System.out.println("Grade D");
            } else if (Average<65) {
                System.out.println("Grade C");
            } else if (Average<85) {
                System.out.println("Grade B");
            }else {
                System.out.println("Grade A");
            }

        }
}
