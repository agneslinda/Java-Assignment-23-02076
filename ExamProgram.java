import java.util.Scanner;

public class ExamProgram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice;
    int ass1, ass2, ass3, cat1, cat2, finalExam;
    double coursework = 0, finalExamScore = 0, totalScore = 0;

    do {
      System.out.println("Menu:");
      System.out.println("1. View coursework results");
      System.out.println("2. View exam results");
      System.out.println("3. Exit the program");
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter assessment scores (out of 50):");
          System.out.print("Ass1: ");
          ass1 = scanner.nextInt();
          System.out.print("Ass2: ");
          ass2 = scanner.nextInt();
          System.out.print("Ass3: ");
          ass3 = scanner.nextInt();
          System.out.print("Cat1: ");
          cat1 = scanner.nextInt();
          System.out.print("Cat2: ");
          cat2 = scanner.nextInt();

          // Calculate coursework score
          coursework = (ass1 + ass2 + ass3 + cat1 + cat2) / 5.0;

          System.out.println("Coursework score: " + coursework);

          // Count the number of coursework assessments done
          int count = 0;
          for (int i = 0; i < 5; i++) {
            if (i == 0 && ass1 > 0) count++;
            if (i == 1 && ass2 > 0) count++;
            if (i == 2 && ass3 > 0) count++;
            if (i == 3 && cat1 > 0) count++;
            if (i == 4 && cat2 > 0) count++;
          }

          System.out.println("Number of coursework assessments done: " + count);

          // Check if student has done 2/3 of coursework
          if (count < 3) {
            System.out.println("You need to repeat the coursework!");
          } else {
            System.out.println("You have completed 2/3 of the coursework.");
          }

          break;

        case 2:
          System.out.print("Enter final exam score (out of 100): ");
          finalExam = scanner.nextInt();

          // Calculate final exam score
          finalExamScore = finalExam / 2.0;

          System.out.println("Final exam score: " + finalExamScore);

          // Calculate total score
          totalScore = coursework + finalExamScore;

          System.out.println("Total score: " + totalScore);

          break;

        case 3:
          System.out.println("Exiting program...");
          break;

        default:
          System.out.println("Invalid choice. Please try again.");
      }

    } while (choice!= 3);
  }
}