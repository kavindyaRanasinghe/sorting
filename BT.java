package Algorithms;

public class BT {

    // Node Class
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Class to create Binary Tree
    static class BinaryTree {
        Node root;

        // Preorder Traversal 
        void preorderTraversal(Node node) {
            if (node == null)
                return;

            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }

        // Inorder Traversal 
        void inorderTraversal(Node node) {
            if (node == null)
                return;

            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }

        // Postorder Traversal 
        void postorderTraversal(Node node) {
            if (node == null)
                return;

            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }

        // Insert a new node
        Node insert(Node node, int data) {
            if (node == null) {
                node = new Node(data);
                return node;
            }

            if (data < node.data) {
                node.left = insert(node.left, data);
            } else if (data > node.data) {
                node.right = insert(node.right, data);
            }

            return node;
        }

        // Find the minimum value node
        Node minValueNode(Node node) {
            Node current = node;

            while (current.left != null) {
                current = current.left;
            }

            return current;
        }

        // Delete a node
        Node delete(Node root, int data) {
            if (root == null) {
                return root;
            }

            if (data < root.data) {
                root.left = delete(root.left, data);
            } else if (data > root.data) {
                root.right = delete(root.right, data);
            } else {
                // Node with only one child or no child
                if (root.left == null)
                    return root.right;
                else if (root.right == null)
                    return root.left;

                // Node with two children: Get the inorder successor (smallest in the right subtree)
                root.data = minValueNode(root.right).data;

                // Delete the inorder successor
                root.right = delete(root.right, root.data);
            }

            return root;
        }
    }

    // Main function
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.preorderTraversal(tree.root);
        System.out.println("\nInorder traversal of binary tree is ");
        tree.inorderTraversal(tree.root);
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.postorderTraversal(tree.root);

        tree.root = tree.insert(tree.root, 6);
        System.out.println("\nAfter inserting 6, Inorder traversal is ");
        tree.inorderTraversal(tree.root);

        tree.root = tree.delete(tree.root, 3);
        System.out.println("\nAfter deleting 3, Inorder traversal is ");
        tree.inorderTraversal(tree.root);
    }
}