package edu.cscc;

/*
 *** NOTE: This class file is for the Extra Credit portion only! Turn in this file ONLY if you did the Extra Credit.
 */

public class Cone {
    private int size;
    private int largestRow;

    // *** Create a constructor!
    public Cone(int size) {
        this.size = size;
        largestRow = (size * 2) - 1;
    }

    // *** Call this method in order to generate an asterisk cone ...
    public String generate() {
        String cone = generateScoop();
        int currentRow = largestRow;

        for (int row = size; row > 0; row--) {
            int numberOfSpaces = (size - row);
//            for (int spaces = numberOfSpaces; spaces > 0; spaces--) {
//                cone += " ";
//            }
            cone += " ".repeat(numberOfSpaces);

//            for (int stars = currentRow; stars > 0; stars--) {
//                cone += "*";
//            }
            cone += "*".repeat(currentRow) + "\n";

//            cone += "\n";
            currentRow -= 2;
        }

        return cone; // *** Change this so it returns the asterisk cone
    }

    private String generateScoop() {
        String scoop = "";
        int lines;
        int numberOfMiddleRows;

        if (size % 2 == 0) {
            lines = (size / 2 - 1);
            numberOfMiddleRows = 2;
        }
        else {
            lines = ((size - 1) / 2);
            numberOfMiddleRows = 1;
        }

        // *** Generate the "middle" of the scoop
        for (int middle = 0; middle < numberOfMiddleRows; middle++) {
//            for (int pluses = 0; pluses < largestRow; pluses++) {
//                scoop += "+";
//            }
            scoop += "+".repeat(largestRow) + "\n";
        }

        // *** Now mirror the rows of the scoop going from just outside the middle to the ends ...
        int lineSize = largestRow - 2;
        String plusLine;
        for (int outer = 0; outer < lines; outer++) {
            plusLine = "";
//            for (int spaces = 0; spaces <= outer; spaces++) {
//                plusLine += " ";
//            }
            plusLine += " ".repeat((outer + 1));

//            for(int pluses = 0; pluses < lineSize; pluses++) {
//                plusLine += "+";
//            }
            plusLine += "+".repeat(lineSize);

            scoop = plusLine + "\n" + scoop + plusLine + "\n";
            lineSize -= 2;
        }

        return scoop;
    }
}
