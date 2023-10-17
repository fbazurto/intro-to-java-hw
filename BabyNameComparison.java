import java.util.*;
public class BabyNameComparison {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a name pls >> ");
        String name1 = input.nextLine();
        System.out.println("Enter a second name pls>>");
        String name2 = input.nextLine();
        System.out.println("Enter a third name please >> ");
        String name3 = input.nextLine();
        System.out.println("The combinations are: " +"\n" + name1 + " " +
         name2 + "\n" + name2 + " " + name1 +  "\n" + name1 +" " + name3 
         + "\n" + name3 + " " + name1 + "\n" + name2 + " " + name3 + "\n" + name3 + " " + name2);
    }
}
/*Implement the BabyNameComparison application so 
that it prompts the user for three first names and
 concatenates them in every possible two-name 
 combination so that new parents can easily 
 compare them to find the most pleasing baby name.*/