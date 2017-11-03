package com.company;

/**
 * Created by Anders on 31-Oct-17.
 */
public class BinarySearchTree
{
    private Node root;
    private int maxDepth;

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

    public void findMaxDepth(Node root)
    {
        if(root != null)
        {
            if(root.getDepth() > maxDepth) maxDepth = root.getDepth();
            findMaxDepth(root.left);
            findMaxDepth(root.right);
        }
    }

    public void printMaxDepth()
    {
        System.out.println(maxDepth);
    }

    public boolean add(CountryCity c)
    {
        if (root == null)
        {
            root = new Node(c, 1);
            maxDepth = root.getDepth();
            return true;
        } else
            return root.add(c);
    }

    public Node getRoot()
    {
        return root;
    }

    public void setRoot(Node node)
    {
        this.root = node;
    }
}
