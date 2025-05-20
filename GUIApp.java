import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import Task.Task;
import Task.TaskValidator;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class GUIApp extends Application {

    private TextField taskNameField;
    private TextField categoryField;
    private TextField dueDateField;
    private TextField priorityField;
    private Button addTaskButton;
    private Label feedbackLabel;
    private ListView<String> taskListView;
    private List<Task> taskList = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Task Management System");

        // Input Fields
        taskNameField = new TextField();
        taskNameField.setPromptText("Task Name");

        categoryField = new TextField();
        categoryField.setPromptText("Category");

        dueDateField = new TextField();
        dueDateField.setPromptText("Due Date (YYYY-MM-DD)");

        priorityField = new TextField();
        priorityField.setPromptText("Priority (High, Medium, Low)");

        // Button
        addTaskButton = new Button("Add Task");

        // Feedback Label
        feedbackLabel = new Label();

        // Task List Display
        taskListView = new ListView<String>();

        // Button Action
        addTaskButton.setOnAction(e -> addTask());

        // Layout
        VBox root = new VBox(10);
        root.getChildren().addAll(
                taskNameField,
                categoryField,
                dueDateField,
                priorityField,
                addTaskButton,
                feedbackLabel,
                taskListView
        );

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addTask() {
        String taskName = taskNameField.getText();
        String category = categoryField.getText();
        String dueDateText = dueDateField.getText();
        String priority = priorityField.getText();

        LocalDate dueDate = null;
        try {
            dueDate = LocalDate.parse(dueDateText);
        } catch (DateTimeParseException e) {
            feedbackLabel.setText("Invalid date format. Use YYYY-MM-DD.");
            return;
        }

        Task newTask = new Task(taskName, category, dueDate, priority, null);
        String validationResult = TaskValidator.validateTask(newTask);

        if (validationResult.equals("Task is valid.")) {
            taskList.add(newTask);
            taskListView.getItems().add(newTask.toString());
            feedbackLabel.setText("Task added successfully!");
            // Clear fields
            taskNameField.clear();
            categoryField.clear();
            dueDateField.clear();
            priorityField.clear();
        } else {
            feedbackLabel.setText("Validation Error: " + validationResult);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
