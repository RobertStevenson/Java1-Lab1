package edu.cscc;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Would you like a Tree or a Cone? ");
        String type = input.nextLine();
        System.out.print("What size would you like your " + type + "?: ");
        int size = input.nextInt();

        if ("tree".equalsIgnoreCase(type)) {
            Tree myTree = new Tree(size);
            System.out.println(myTree.generate());
        }
        else {
            Cone myCone = new Cone(size);
            System.out.println(myCone.generate());
        }
    }
}
