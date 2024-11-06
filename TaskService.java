import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> tasks = new ArrayList<>();

    public void createTask(String name, String description) {
        Task task = new Task(name, description);
        tasks.add(task);
        System.out.println("Task created: " + task);
    }

    public void updateTask(int index, String name, String description) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setName(name);
            task.setDescription(description);
            System.out.println("Task updated: " + task);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.remove(index);
            System.out.println("Task deleted: " + task);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ": " + tasks.get(i));
            }
        }
    }
}
