import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Enter a command");
      String input = scanner.nextLine();
      String[] vals = input.split(" ");
      String command = vals[0];
      int val_1 = Integer.parseInt(vals[1]);
      int val_2 = 0;
      if(vals.length == 3) {
        val_2 = Integer.parseInt(vals[2]);
      }
      if(command.equals("add")) {
        System.out.println(calculator.add(val_1, val_2));
      }
      else if(command.equals("subtract")) {
        System.out.println(calculator.subtract(val_1, val_2));
      }
      else if(command.equals("multiply")) {
        System.out.println(calculator.multiply(val_1, val_2));
      }
      else if(command.equals("divide")) {
        System.out.println(calculator.divide(val_1, val_2));
      }
      else if(command.equals("fibonacci")) {
        System.out.println(calculator.fibonacciNumberFinder(val_1));
      }
      else if(command.equals("binary")) {
        System.out.println(calculator.intToBinaryNumber(val_1));
      }
      else if(command.equals("quit")) {
        return;
      }
      else {
        System.out.println("Invalid Command");
      }
    }
  }
}
