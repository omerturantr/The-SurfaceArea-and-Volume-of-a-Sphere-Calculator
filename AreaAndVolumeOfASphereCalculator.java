import java.util.Scanner;

public class AreaAndVolumeOfASphereCalculator {
    public static void main(String[] args) {
        double radiusOfTheSphere;
        double areaOfTheSphere, volumeOfTheSphere;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the RADIUS of the Sphere: ");     radiusOfTheSphere = input.nextFloat();

        areaOfTheSphere = 4*(Math.PI)*Math.pow(radiusOfTheSphere, 2);
        volumeOfTheSphere = (4/3)*(Math.PI)*Math.pow(radiusOfTheSphere, 3);

        System.out.println("\nThe AREA of the Sphere is " + areaOfTheSphere + " square meters.");
        System.out.print("The VOLUME of the Sphere is " + volumeOfTheSphere + " cubic meters.");
    }
}