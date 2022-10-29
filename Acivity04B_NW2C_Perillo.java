/*PERILLO, ALLYZA DIANE J.
  BSIT-NW2C
  ACTIVITY 04B
 */

package dsaa;

import java.util.Scanner;
public class Acivity04B_NW2C_Perillo  {
     public static void main(String[] args) {
        Act04BSortedArray_NW2C_Perillo sortedLinearArray = new Act04BSortedArray_NW2C_Perillo ();
        Scanner in = new Scanner(System.in);
        String choice;
        while (true) {
            System.out.println("\n1. Insert a value"
                    + "\n2. Delete a value"
                    + "\n3. Traverse the array"
                    + "\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Enter element to inserted: ");
                    sortedLinearArray.insertItem(Integer.parseInt(in.nextLine()));
                    break;
                case "2":
                    System.out.print("Enter element to deleted: ");
                    sortedLinearArray.deleteItem(Integer.parseInt(in.nextLine()));
                    break;
                case "3":
                    sortedLinearArray.printArray();
                    break;
                case "4":
                    System.exit(0);
            }

        }
    }
 }
