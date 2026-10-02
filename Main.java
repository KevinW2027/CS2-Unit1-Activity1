/*
On [day of the week], [name1] took the [mode of transport] to [place]. It took [length of time] minutes to get there. [name1] [action1] and [action2] with [name2] at the [place]. After that, they were hungry and decided to have some [food], they payed [money] dollars for the [food]. They had a [adjective] time.
*/
import java.util.Scanner;
public class Main {


   public static void main(String []args) {
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter a day of the week: ");
      String dayWeek = scan.nextLine();
      System.out.print("Enter a name: ");
      String name1 = scan.nextLine();
      System.out.print("Enter a mode of transport: ");
      String transportMode = scan.nextLine();
      System.out.print("Enter a place: ");
      String place = scan.nextLine();
      System.out.print("Enter a number of minutes: ");
      int minutes = scan.nextLine();
      System.out.print("Enter an action: ");
      String action1 = scan.nextLine();
      System.out.print("Enter another action: ");
      String action2 = scan.nextLine();
      System.out.print("Enter another name: ");
      String name2 = scan.nextLine();
      System.out.print("Enter a food: ");
      String food = scan.nextLine();
      System.out.print("Enter an amount of dollars: ");
      double money = scan.nextLine();
      System.out.print("Enter an adjective: ");
      String attitude = scan.nextLine();

      String sentence1 = "On" + dayWeek + ", " + name1 + "took the" + transportMode + "to the" + place + ". It took " + minutes +  "minutes to get there." + name1 + action1 + "and" + action2 + "with" + name2 + "at the" + place + ". After that, they were hungry and decided to have some" + food + ", they payed " + money + "dollars for the" + food + ". They had a "+ adjective + "time.";
 
      System.out.println(sentence1);
   }
}
