import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== BINARY SEARCH TREE (STUDENTS) ==========");

        BinaryTree tree = new BinaryTree();

        System.out.println("\n========== ADDING STUDENTS ==========");

        tree.add(new Student("Ivanenko", "Ivan", 1, 101, false));
        tree.add(new Student("Petrenko", "Petro", 2, 105, true));
        tree.add(new Student("Sydorenko", "Mariia", 1, 98, false));
        tree.add(new Student("Kovalenko", "Olena", 3, 115, true));
        tree.add(new Student("Shevchenko", "Taras", 2, 103, false));
        tree.add(new Student("Bondarenko", "Andriy", 1, 95, true));
        tree.add(new Student("Lysenko", "Nataliia", 4, 120, false));
        tree.add(new Student("Melnyk", "Viktor", 3, 108, true));

        System.out.println("\n========== TRYING TO ADD DUPLICATE KEY ==========");
        tree.add(new Student("Kopystka", "Mykola", 2, 103, false));

        System.out.println("\n========== TREE CONTENT ==========");
        tree.printBFS();

        scanner.close();
    }
}
