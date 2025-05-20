# JavaFX GUI Task Management System

## BICS 1304 Object-Oriented Programming - Assignment 2
**Semester 2 2024/2025**

## Overview
This project is Assignment 2 for the BICS 1304 Object-Oriented Programming course. It builds upon Assignment 1 by implementing a JavaFX GUI for a Task Management System. The application demonstrates object-oriented design principles applied to a user-facing interface.

## Deadline
Week 11, Sunday, 25th May 2025

## Learning Outcomes
- CLO2: Implement object-oriented programming systems to address computing-related challenges, demonstrating problem-solving skills.

## Project Requirements

### 1. Reuse Assignment 1 Classes
- Import and utilize existing `Task`, `TaskValidator`, and `TaskManagerApp` classes
- Classes may be modified if necessary to support GUI interaction

### 2. JavaFX GUI Implementation
The application must include:
- TextField components for:
  - Task name
  - Category
  - Due date (text input)
  - Priority
- Button for adding tasks
- Label for displaying validation feedback
- ListView or TextArea for displaying added tasks
- Appropriate layout containers (VBox, HBox, GridPane, etc.)

### 3. Functionality
- User enters task details via input fields
- On button click:
  - Input is captured to create a `Task` object
  - `TaskValidator` validates the task
  - Valid tasks are added to a list and displayed
  - Invalid tasks trigger error messages in the feedback Label

### 4. Optional Styling
Encouraged (but optional) UI enhancements:
- Font customization
- Insets and padding
- Border and color settings

### 5. Restrictions
- Use only basic JavaFX components listed in requirements
- Do not use Scene Builder or CSS styling
- Advanced GUI components (ComboBox, DatePicker, TableView) are not allowed

### 6. Code Documentation
- Document any modifications to existing classes
- Explain what was changed and why
- Good programming practices are encouraged

## Submission Requirements
- Group leader must submit:
  - `GUIApp.java` (Main GUI application file)
  - `Task.java` (Task class implementation)
  - `TaskValidator.java` (Validation logic)
  - `TaskManagerApp.java` (Application class)
  - Any helper classes created
  - Filled rubric with group information
  - Files should be submitted as a `.zip` archive (no other formats accepted)

## Group Work Guidelines
- If issues occur within a group, each member must submit a peer evaluation
- Marks may be deducted based on average peer evaluation scores

## Future Extensions
This assignment prepares for the Group Project, which will extend the system with:
- Additional components
- Improved UI design
- Advanced object-oriented features