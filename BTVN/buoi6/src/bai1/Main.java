package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice=1;
        do{
            System.out.println("-------MENU-------");
            System.out.println("1, Circle.");
            System.out.println("2, Square.");
            System.out.println("3, Rectangle.");
            System.out.println("4, Exit.");
            choice = sc.nextInt();
            if(choice == 1){
                System.out.print("Input r: ");
                double r = sc.nextDouble();
                Circle circle = new Circle(r);
                System.out.println(circle.toString());
            }
            else if(choice == 2){
                System.out.print("Input side: ");
                double s = sc.nextDouble();;
                Square square = new Square(s);
                System.out.println(square.toString());
                System.out.println("--Draw square--");
                for(int i = 0; i < s; i++){
                    for(int j = 0; j< s; j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            else if(choice == 3){
                double wigth, length;
                do {
                    System.out.print("Input width: ");
                    wigth = sc.nextDouble();
                    System.out.print("Input length: ");
                    length = sc.nextDouble();
                }while (wigth > length);
                Rectangle rectangle = new Rectangle(wigth, length);
                System.out.println(rectangle.toString());
                System.out.println("--Draw rectangle--");
                for(int i = 0; i < wigth; i++){
                    for(int j = 0; j< length; j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            else if(choice == 4){
                System.out.println("FINISH");
            }
            else {
                System.out.println("INPUT AGAIN");
            }
        }while(choice != 4);
    }
}
