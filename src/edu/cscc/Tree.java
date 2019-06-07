package edu.cscc;

public class Tree {
    private int size;

    // *** Create a constructor!
    public Tree(int size) {
        this.size = size;
    }

    // *** Call this method in order to generate an asterisk tree ...
    public String generate() {
        String tree = "";
        int count = 1;

        for (int row = 1; row <= size; row++) {
//            for (int spaces = 0; spaces < (size - row); spaces++) {
//                tree += " ";
//            }
            tree += " ".repeat((size - row));

//            for (int stars = 0; stars < count; stars++) {
//                tree += "*";
//            }
            tree += "*".repeat(count) + "\n";

//            tree += "\n";
            count += 2;
        }

        return tree; // *** Change this so it returns the asterisk tree
    }
}
