import java.util.Scanner;

public class Hackathon1a  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int familyMembers = 3;
        double waterConsumed = 320.5;
        int houseNumber = 103;
        char usageStatus = 'A'; 

        System.out.println("Number of family members: " + familyMembers);
        System.out.println("Water consumed in litres: " + waterConsumed);
        System.out.println("House Number: " + houseNumber);
        System.out.println("Water Usage Status: " + usageStatus);

        sc.close();
    }
}




