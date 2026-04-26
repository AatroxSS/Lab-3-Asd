import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public boolean add(Student student) {
        long key = student.getKey();
        TreeNode newNode = new TreeNode(student);

        if (root == null) {
            root = newNode;
            System.out.println("Added root: " + student);
            return true;
        }

        TreeNode current = root;
        TreeNode parent = null;

        while (current != null) {
            parent = current;
            if (key < current.getKey()) {
                current = current.left;
            } else if (key > current.getKey()) {
                current = current.right;
            } else {
                System.out.println("Error: student with key " + key + " already exists!");
                return false;
            }
        }

        if (key < parent.getKey()) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
        System.out.println("Added: " + student);
        return true;
    }

    public void printBFS() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        System.out.println("\n========== BFS TRAVERSAL ==========");
        System.out.println("Level | LastName     FirstName   Course StudentID  Service");
        System.out.println("-------|--------------------------------------------------");

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                System.out.printf("  %d    | %s%n", level, current.student.toString());

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            level++;
        }
        System.out.println("=====================================");
    }

    public boolean isEmpty() {
        return root == null;
    }
}
