/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst7;

/**
 *
 * @author user
 */
public class DST7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q1
        BST<Integer> tree = new BST<>();
        tree.addNode(50);
        tree.addNode(30);
        tree.addNode(25);
        tree.addNode(71);
        tree.addNode(80);
        tree.addNode(99);
        tree.addNode(40);
        tree.addNode(1);
        tree.addNode(7);
        tree.addNode(5);
        System.out.println("The number of elements int the tree is "+tree.getSize());
        System.out.println("The 4th element is "+tree.getElement(3));
        System.out.println("Tree preOrder show");
        tree.setOrder(BST.preorder);
        tree.showTree();
        System.out.println("\nTree inOrder show");
        tree.setOrder(BST.inorder);
        tree.showTree();
        System.out.println("\nTree postOrder show");
        tree.setOrder(BST.postorder);
        tree.showTree();
        
        //Q2
        char[] ch = {'F','A','C','U','L','T','Y'};
        BST<Character> treechar = new BST<>();
        for(char i:ch){
            treechar.addNode(i);
        }
        System.out.println("\n\nThe number of element in the tree : "+treechar.getSize());
        
        System.out.println("Tree elements- PREORDER");
        treechar.setOrder(BST.preorder);
        treechar.showTree();
        System.out.println("\nTree elements- INORDER");
        treechar.setOrder(BST.inorder);
        treechar.showTree();
        System.out.println("\nTree elements- POSTORDER");
        treechar.setOrder(BST.postorder);
        treechar.showTree();
        
        System.out.println("\nRemove one character : "+treechar.remove('L'));
        System.out.println("\nThe number of elements in the tree : "+treechar.getSize());
        
        System.out.println("Tree elements- PREORDER");
        treechar.setOrder(BST.preorder);
        treechar.showTree();
        System.out.println("\nTree elements- INORDER");
        treechar.setOrder(BST.inorder);
        treechar.showTree();
        System.out.println("\nTree elements- POSTORDER");
        treechar.setOrder(BST.postorder);
        treechar.showTree();
        
        //Q3
        
    }
    
}
