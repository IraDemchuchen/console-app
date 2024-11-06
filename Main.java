import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Створення тестових даних
        taskService.createTask("Test Task 1", "Description for Task 1");
        taskService.createTask("Test Task 2", "Description for Task 2");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Task");
            System.out.println("2. Update Task");
            System.out.println("3. Delete Task");
            System.out.println("4. List Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskService.createTask(name, description);
                    break;
                case 2:
                    System.out.print("Enter task index to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); // Clear the newline
                    System.out.print("Enter new task name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new task description: ");
                    String newDescription = scanner.nextLine();
                    taskService.updateTask(updateIndex, newName, newDescription);
                    break;
                case 3:
                    System.out.print("Enter task index to delete: ");
                    int deleteIndex = scanner.nextInt();
                    taskService.deleteTask(deleteIndex);
                    break;
                case 4:
                    taskService.listTasks();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
