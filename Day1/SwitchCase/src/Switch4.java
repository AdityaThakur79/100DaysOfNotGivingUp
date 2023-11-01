import java.util.Scanner;

public class Switch4 {
    //Nested Switch Case
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Employee Id");
        int empId = input.nextInt();

        System.out.println("Enter Employee Department");
        String dept = input.next();

        switch (empId) {
            case 1 -> System.out.println("Aditya Thakur");
            case 2 -> System.out.println("Adarsh Thakur");
            case 3 -> {
                System.out.println("Ajay Thakur");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                }
            }
        }


    }
}
