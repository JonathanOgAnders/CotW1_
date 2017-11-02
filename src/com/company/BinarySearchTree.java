package com.company;

/**
 * Created by Anders on 31-Oct-17.
 */
public class BinarySearchTree
{
    private Node root;

    public BinarySearchTree()
    {
        this.root = null;
    }

    public void printInorder(Node root)
    {
        if (root != null)
        {
            printInorder(root.left);
            System.out.println(" " + root.getData());
            printInorder(root.right);
        }
    }

    public boolean add(CountryCity c)
    {
        if (root == null)
        {
            root = new Node(c);
            return true;
        } else
            return root.add(c);
    }


    public Node getRoot()
    {
        return root;
    }
}
