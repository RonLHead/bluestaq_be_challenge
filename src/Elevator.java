public class Elevator {
    int floors; // Maximum floors for elevator
    int current_floor = 1; // Current floor elevator is at
    String direction = "Idle"; // Current elevator direction

    // Elevator constructor
    public Elevator(int initialFloors){
        floors = initialFloors;
    }

    // Elevator behavior method
    public void requestElevator(int requestedFloor) {
        // Check if the requested floor is within range of the maximum number of floors
        if (requestedFloor <= floors) {
            // Check if the elevator will go up to reach the requested floor
            if (requestedFloor > current_floor) {
                direction = "Up";
                System.out.println("Going " + direction + ". . .");
                current_floor = requestedFloor;
                direction = "Idle";
                System.out.println("You are now at floor " + requestedFloor);
            // Check if the elevator will down up to reach the requested floor
            } else if (requestedFloor < current_floor) {
                direction = "Down";
                System.out.println("Going " + direction + ". . .");
                current_floor = requestedFloor;
                direction = "Idle";
                System.out.println("You are now at floor " + requestedFloor);
            } else {
                // Let user know they are already at the requested floor
                System.out.println("You are already at floor " + requestedFloor);
            }
        } else {
            // If the requested floor is outside the range of floors in building, let the user know
            System.out.println("Floor requested doesn't exist in this building.");
        }
    }
}
