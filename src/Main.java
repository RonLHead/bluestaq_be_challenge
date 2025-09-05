//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Initialize a new elevator object
        Elevator testElevator = new Elevator(10);

        // Print out current elevator properties
        System.out.println("Number of floors in building: " + testElevator.floors);
        System.out.println("Current floor elevator is at: " + testElevator.current_floor);
        System.out.println("Current elevator direction: " + testElevator.direction);

        // Go to floor 10 - should go up
        testElevator.requestElevator(10);

        // Go to floor 5 - should go down
        testElevator.requestElevator(5);

        // Request floor 5 - should already be there...
        testElevator.requestElevator(5);

        // Go to floor 50, which doesn't exist
        testElevator.requestElevator(20);

        // Print out current elevator properties
        System.out.println("Number of floors in building: " + testElevator.floors);
        System.out.println("Current floor elevator is at: " + testElevator.current_floor);
        System.out.println("Current elevator direction: " + testElevator.direction);
    }
}