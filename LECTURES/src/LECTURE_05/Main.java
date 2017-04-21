package LECTURE_05;

import java.util.Scanner;

/**
 * Created by ladislav on 24/03/17.
 */
public class Main {
    public static void main(String[] args) throws ContactListFullException {
        ContactList2 list = new ContactList2();

        System.out.println("Enter num of contacts");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {

            try{
                Contact c = new Contact(sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine());
                list.add(c);
            }
            catch (ContactListFullException e){
                System.out.println("Can not be added");
                //break;
            }
            catch (Exception e){
                System.out.println("Wrong format");
            }

            System.out.println(list);
        }
        list.sort();
        System.out.println(list);



    }
}
