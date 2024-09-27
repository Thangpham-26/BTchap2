import java.util.Scanner;

public class EX6 {
    private String name;
    private String address;
    private double cost;
    private double income;

    public EX6(String name, String address, double cost, double income) {
        this.name = name;
        this.address = address;
        this.cost = cost;
        this.income = income;
    }
    public double calculateBenefit() {
        return income - cost;
    }

    public void displayInformation() {
        System.out.println("Company Name: " + name);
        System.out.println("Company Address: " + address);
        System.out.println("Cost: " + cost);
        System.out.println("Income: " + income);
        System.out.println("Benefit: " + calculateBenefit());
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the name of the company: ");
        String name = keyboard.nextLine();
        System.out.print("Enter the address of the company: ");
        String address = keyboard.nextLine();
        System.out.print("Enter the cost of the company: ");
        double cost = keyboard.nextDouble();
        System.out.print("Enter the income of the company: ");
        double income = keyboard.nextDouble();
        System.out.print("The benefit of the company: ");
        double benefit = income - cost;

        //Display company information and benefit
        System.out.println("\nCompany Information:");
        System.out.println("Company Name: " + name);
        System.out.println("Company Address: " + address);
        System.out.println("Cost: " + cost);
        System.out.println("Income: " + income);
        System.out.println("Benefit: " + benefit);

    }
}
