
package BinaryTree;
public class BinaryTreeApp {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        TreeNODE node;
        
        node = new TreeNODE('D');
        tree.insert(node);
        
        node = new TreeNODE('B');
        tree.insert(node);
        
        node = new TreeNODE('A');
        tree.insert(node);
        
        node = new TreeNODE('C');
        tree.insert(node);
        
        node = new TreeNODE('F');
        tree.insert(node);
        
        node = new TreeNODE('E');
        tree.insert(node);
        
        node = new TreeNODE('G');
        tree.insert(node);
        
        
        System.out.print("Traversal dengan preorder :");
        tree.preOrder();
        System.out.print("/nTraversal dengan postorder :");
        tree.postorder();
        System.out.print("/nTraversal dengan inorder :");
        tree.inOrder();
        System.out.println();
    }
    
}
