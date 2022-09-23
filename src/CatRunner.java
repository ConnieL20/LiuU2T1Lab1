import java.util.Scanner;

public class CatRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //user inputs
        System.out.println("Please type in the name of your cat: ");
        String name = scan.nextLine();

        System.out.println("Please type in the age of your cat: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Finally, please type in the weight of your cat: ");
        double weight = scan.nextDouble();
        scan.nextLine();

        //running
        Cat cat1 = new Cat(name, age, weight);
        cat1.introduce();
        cat1.printCatInfo();


    }
}
