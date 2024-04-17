package org.example.todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    private ArrayList<Task> tasks;

    public ToDoList() { // Corrected constructor name
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description){
        tasks.add(new Task(description));
    }

    public void TaskCompleted(int index){
        if (index >=0 && index < tasks.size()){
            tasks.get(index).markAsCompleted();
        } else{
            System.out.println("Tache invalide");
        }
    }

    public void displayTasks(){
        if (tasks.isEmpty()){
            System.out.println("Liste vide");
        } else{
            System.out.println("To do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Tâche supprimée avec succès.");
        } else {
            System.out.println("Index de tâche invalide.");
        }
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\n1: Ajouter tâche \n2: Marquer tâche comme accomplie \n3: Voir les tâches \n4: Supprimer une tâche \n0: Quitter");
            System.out.println("Votre choix:");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    scanner.nextLine();
                    System.out.println("Entrez la tâche");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    System.out.println("Tache ajoutée avec succès");
                    break;
                case 2:
                    System.out.println("Entrez l'index de la tâche accomplie");
                    int index = scanner.nextInt() - 1; /* index 0 */
                    toDoList.TaskCompleted(index);
                    break;
                case 3:
                    toDoList.displayTasks();
                    break;
                case 4:
                    System.out.println("Entrer un index de tâche à supprimer");
                    int deleteTask = scanner.nextInt() - 1;
                    toDoList.deleteTask(deleteTask);
                    break;
                case 0:
                    System.out.println("Au revoir");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Choix invalide, veuillez tapez un nombre entre 0 et 3");
            }
        }
    }
}
