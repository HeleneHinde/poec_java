package test;

import java.util.Arrays;

public class Test {

    static class Node {
        int valeur;
        Node gauche;
        Node droite;

        Node(int valeur) {
            this.valeur = valeur;
            this.gauche = null;
            this.droite = null;
        }
    }

    public static void main(String[] args) {

        // Example of a simple program to swap two numbers without using a temporary
        // variable

        float numberA = 10.4f;
        float numberB = 20.6f;

        System.out.println("Number A: " + numberA); // Output: Number A: 10
        System.out.println("Number B: " + numberB); // Output: Number B: 20

        numberA = numberA + numberB; // numberA is now 30
        numberB = numberA - numberB; // numberB is now 10 (original value of numberA)
        numberA = numberA - numberB; // numberA is now 20 (original value of numberB)

        System.out.println("Number A: " + numberA); // Output: Number A: 20
        System.out.println("Number B: " + numberB); // Output: Number B: 10

        // Example of a simple calculator with addition, subtraction, multiplication,
        // and division

        int numberFactorial = 5;
        int factorial = numberFactorial;
        for (int i = numberFactorial - 1; i > 0; i--) {
            factorial *= i; // Calculate factorial
        }

        System.out.println("Factorial of " + numberFactorial + " is: " + factorial); // Output: Factorial of 5 is: 120

        // Example of a voting system with candidates and their scores

        float candidat1 = 15f; // Example score for first candidate
        float candidat2 = 20f; // Example score for second candidate
        float candidat3 = 15f; // Example score for third candidate
        float candidat4 = 10f; // Example score for fourth candidate

        if (candidat1 > 50f) {
            System.out.println("Le premier candidat est élu.");
        } else if ((candidat1 < 12.5f) || (candidat2 > 50 || candidat3 > 50 || candidat4 > 50)) {
            System.out.println("Le premier candidat a perdu.");
        } else if (candidat1 > candidat2 && candidat1 > candidat3 && candidat1 > candidat4) {
            System.out.println("Le premier candidat est en ballotage favorable.");
        } else {
            System.out.println("Le premier candidat est en ballotage défavorable.");
        }

        // Example of a program to calculate the total price of items and give change

        int achat1 = 16; // Example price of first item
        int achat2 = 21; // Example price of second item
        int achat3 = 30; // Example price of third item

        int sum = achat1 + achat2 + achat3; // Calculate total price of items
        System.out.println("Total price of items: " + sum); // Output: Total price of items: 60

        int money = 100; // Example amount of money available

        int change = money - sum;
        while (change > 0) {

            if (change >= 10) {
                System.out.println("10 euros");
                change -= 10;
            } else if (change >= 5) {
                System.out.println("5 euros.");
                change -= 5;
            } else if (change >= 1) {
                System.out.println("1 euros.");
                change -= 1;
            } else {
                break;
            }

        } // Continue until enough money is available

        System.out.println("it's okay ");

        // Example of a program to sort an array of integers using bubble sort

        int[] tri = { 45, 12, 78, 34, 56, 23, 89, 67, 90, 11 };
        int temp;

        for (int i = 0; i < tri.length - 1; i++) {
            for (int j = 0; j < tri.length - 1; j++) {
                if (tri[j] > tri[j + 1]) {
                    temp = tri[j];
                    tri[j] = tri[j + 1];
                    tri[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(tri));

        // Example of a program to search for a value in a sorted array using binary

        int valeur = 90;
        int debut = 0;
        int fin = tri.length - 1;

        while (debut <= fin) {
            int milieu = (debut + fin) / 2;
            if (tri[milieu] == valeur) {
                System.out.println("trouvé à la position " + milieu); // found
                break; // Exit the loop if the value is found
            } else if (tri[milieu] < valeur) {
                debut = milieu + 1;
            } else {
                fin = milieu - 1;
            }
        }

        // Example of a program to create a 2D array (tableau) and fill it with values

        final int[][] tableau = new int[12][8];

        for (int k = 0; k < tableau.length; k++) {
            for (int m = 0; m < tableau[k].length; m++) {
                tableau[k][m] = 2 * k + (m + 1);
                System.out.print("tableau[" + k + "][" + m + "] = " + tableau[k][m] + " ");
            }
            System.out.println();
        }

        // Example of a program to find the maximum value in an array

        int max = 0;
        for (int[] tableau1 : tableau) {
            for (int j = 0; j < tableau1.length; j++) {
                if (tableau1[j] > max) {
                    max = tableau1[j];
                }
            }
        }

        System.out.println("Maximum value in the array: " + max);

        // Example of a program to count the number of people in a bus at the last stop

        int[][] bus = { { 5, 0 }, { 3, 4 }, { 8, 1 }, { 12, 5 }, { 5, 3 } };

        int nbPersonnes = 0;
        for (int[] bu : bus) {
            for (int j = 0; j < bu.length; j++) {
                if (j == 0) {
                    nbPersonnes += bu[j]; // Add the number of people getting on the bus
                } else {
                    nbPersonnes -= bu[j]; // Subtract the number of people getting off the bus
                }
            }
        }

        System.out.println(nbPersonnes + " personnes dans le bus au dernier arrêt");

        // Example of a program to calculate the Fibonacci series up to n terms

        int n = 10; // Number of terms in the Fibonacci series
        fibonacci(n); // Call the method to print the Fibonacci series

        // Example of a program to check if a string is a palindrome

        String palindrome = "madam, in eden i'm adam"; // Example string to check for palindrome

        String cleaned = sanitizeString(palindrome); // Sanitize the string by removing non-letter characters and
                                                     // converting to lowercase
        boolean isPalindrome = true; // Flag to check if the string is a palindrome
        int length = cleaned.length(); // Get the length of the cleaned string

        for (int i = 0; i < length / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(length - i - 1)) {
                isPalindrome = false; // If characters don't match, it's not a palindrome
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(palindrome + " est un palindrome"); // Output: radar est un palindrome
        } else {
            System.out.println(palindrome + " n'est pas un palindrome");
        }

        // Example of a program to check if two strings are anagrams

        String anagramme1 = "listen";
        String anagramme2 = "silent";
        String sanitizedAnagram1 = sanitizeString(anagramme1);
        String sanitizedAnagram2 = sanitizeString(anagramme2);
        boolean isAnagram;
        if (sanitizedAnagram1.length() != sanitizedAnagram2.length()) {
            isAnagram = false; // If lengths are different, they cannot be anagrams
        } else {
            char[] charArray1 = sanitizedAnagram1.toCharArray();
            char[] charArray2 = sanitizedAnagram2.toCharArray();
            Arrays.sort(charArray1); // Sort the characters of the first string
            Arrays.sort(charArray2); // Sort the characters of the second string
            isAnagram = Arrays.equals(charArray1, charArray2); // Check if sorted arrays are equal
        }

        if (isAnagram) {
            System.out.println(anagramme1 + " et " + anagramme2 + " sont des anagrammes");
        } else {
            System.out.println(anagramme1 + " et " + anagramme2 + " ne sont pas des anagrammes");
        }

        // Example of a program to encrypt a string using Caesar cipher

        String cesar = "Chiffrement de cesar";
        int decalage = 3; // Example shift for Caesar cipher
        StringBuilder encrypted = new StringBuilder();
        for (char c : cesar.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + decalage) % 26 + base); // Shift character by decalage
            }
            encrypted.append(c); // Append shifted character to the result
        }
        System.out.println("Chiffrement de César: " + encrypted.toString()); // Output: Chiffrement de César:
                                                                             // fkfivqphqwhqw gh fhdu

        int valeur2 = 90; // Reset value for binary search
        int debut2 = 0;
        int fin2 = tri.length - 1;

        while (debut2 <= fin2) {
            int milieu2 = (debut2 + fin2) / 2;
            if (tri[milieu2] == valeur2) {
                System.out.println("trouvé à la position " + milieu2);
                break;
            } else if (tri[milieu2] < valeur2) {
                debut2 = milieu2 + 1;
            } else {
                fin2 = milieu2 - 1;
            }
        }

        String chiffrement = "on va chiffrer ça";
        StringBuilder nouveauchiffrement = new StringBuilder();
        char[] buffer = new char[3];
        int count = 0;

        // On parcourt la chaîne et on traite chaque caractère
        for (int i = 0; i < chiffrement.length(); i++) {
            char c = chiffrement.charAt(i);
            if (Character.isLetter(c)) {
                buffer[count++] = c;
                if (count == 3) {
                    // Mélange : 3e, 1er, 2e
                    nouveauchiffrement.append(buffer[2]);
                    nouveauchiffrement.append(buffer[0]);
                    nouveauchiffrement.append(buffer[1]);
                    count = 0;
                }
            } else {
                // Avant d'ajouter l'espace, on vide le buffer si besoin
                for (int j = 0; j < count; j++) {
                    nouveauchiffrement.append(buffer[j]);
                }
                count = 0;
                nouveauchiffrement.append(c);
            }
        }
        // Ajouter les lettres restantes à la fin
        for (int j = 0; j < count; j++) {
            nouveauchiffrement.append(buffer[j]);
        }

        System.out.println("Chiffrement: " + nouveauchiffrement.toString());

        Node root = new Node(10);
        root.gauche = new Node(5);
        root.droite = new Node(15);
        int value = 6;

        while (true) {
            if (root.valeur > value) {
                if (root.gauche == null) {
                    System.out.println("c'est à gauche de " + root.valeur);
                    break;
                } else {
                    root = root.gauche;
                }
            } else if (root.valeur < value) {
                if (root.droite == null) {
                    System.out.println("c'est à droite de " + root.valeur);
                    break;
                } else {
                    root = root.droite;
                }
            } else {
                System.out.println("La valeur " + value + " existe déjà dans l'arbre.");
                break;
            }
        }

    }

    public static void fibonacci(int n) {
        int a = 1, b = 1, c;
        System.out.print("Fibonacci series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();

    }

    public static String sanitizeString(String input) {
        return input.replaceAll("[^a-zA-Z]", "").toLowerCase(); // Remove non-letter characters and convert to lowercase
    }

}
