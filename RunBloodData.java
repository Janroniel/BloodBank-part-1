import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {
        BloodData bds = new BloodData();
        System.out.println("Enter blood type of patient:");
        System.out.println("Enter the Rhesus factor (+ or -):");
        bds.display();
        System.out.println("");
        BloodData bd = new BloodData();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter blood type of patient: ");
        String bt = input.nextLine();
        if (bt.isEmpty()) {
            System.out.println("Blood type is required");
            return;
        }
        System.out.print("Enter the Rhesus factor (+ or -): ");
        String rh = input.nextLine();

        if (rh.isEmpty()) {
            System.out.println("rhFactor is required");
            return;
        }
        bd.BloodData(bt, rh);
    }

    public RunBloodData() {
    }
}
