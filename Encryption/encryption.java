import java.util.*;

public class encryption {

    private Scanner scan;
    private Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char character;
    private char[] letters;



        random = new Random();
        list = new ArrayList();
        shuffledList = new ArrayList();
        character = ' ';

        newKey();
        askQuestion();
    }

    private void askQuestion() {
        while (true) {
            System.out.println("*** Choose the option ***");
            System.out.println("(N)ewKey, (G)etKey, (E)ncrypt, (D)ecrypt, (Q)uit:");

            char response = Character.toUpperCase(scan.nextLine().charAt(0));

            switch (response) {
                case 'N' -> newKey();
                case 'G' -> getKey();
                case 'E' -> encrypt();
                case 'D' -> decrypt();
                case 'Q' -> quit();
                default -> System.out.println("Invalid input :(");
            }
        }

    }

    private void newKey() {

        character = ' ';

        list.clear();
        shuffledList.clear();

        for (int i = 32; i < 127; i++) {
            list.add(Character.valueOf(character));
            character++;
        }
        shuffledList = new ArrayList(list);
        Collections.shuffle(shuffledList);
        System.out.println("\n***A new key has been generated***");



    private void getKey() {

        System.out.println("Key:");
        for (Character x : list) {
            System.out.print(x);
        }
        System.out.println();
        for (Character x : shuffledList) {
            System.out.print(x);
        }
        System.out.println();

    }

    private void encrypt() {
        System.out.println("Enter message to Encrypt:");
        String msg = scan.nextLine();

        letters = msg.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (letters[i] == list.get(j)) {
                    letters[i] = shuffledList.get(j);
                    break;
                }
            }
        }

        System.out.println("Encrypted:");
        for (Character x : letters) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void decrypt() {

        System.out.println("Enter message to Decrypt:");
        String msg = scan.nextLine();

        letters = msg.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < shuffledList.size(); j++) {
                if (letters[i] == shuffledList.get(j)) {
                    letters[i] = list.get(j);
                    break;
                }
            }
        }

        System.out.println("Encrypted:");
        for (Character x : letters) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void quit() {
        System.out.println("Byeeeee!");
        System.exit(0);
    }

    

