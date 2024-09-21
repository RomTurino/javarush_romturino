package level12;

public class Solution {

    public static void main(String[] args) {

        System.out.println("Человечество живет в Солнечной системе.");
        System.out.printf("Ее возраст около %d лет.%n", SolarSystem.age);
        System.out.printf("В Солнечной системе %d известных планет.%n", SolarSystem.planetsCount);
        System.out.printf("Как и большинство звездных систем, состоит из %d звезды.%n", SolarSystem.starsCount);
        System.out.printf("Звезды по имени %s.%n", SolarSystem.starName);
        System.out.printf("Расстояние к центру галактики составляет %d световых лет.%n", SolarSystem.galacticCenterDistance);
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");


        Planet earth = new Planet();
        earth.name = "Земля";
        earth.age = 4_540_000_000L;
        earth.speed = 170_218;
        earth.area = 510_072_000;
        earth.printInformation();


        System.out.println("Презентация роботов произведенных компанией " + Robot.vendor);

        Robot robot1 = new Robot("RCV-322", 2019);
        robot1.displayInformation();

        Robot robot2 = new Robot("JavaTron-008", 2017);
        robot2.displayInformation();

        Robot robot3 = new Robot("BugDestroyer-007", 1998);
        robot3.displayInformation();

        Robot robot4 = new Robot("Gundam-14", 2004);
        robot4.displayInformation();

        Robot robot5 = new Robot("Eve-2", 2012);
        robot5.displayInformation();

    }
}