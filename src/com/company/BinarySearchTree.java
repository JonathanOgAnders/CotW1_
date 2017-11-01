package com.company;

import java.util.Comparator;

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

    public void insert(CountryCity countryCity)
    {

        Node newNode = new Node(countryCity);

        if(root==null)
        {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent;

        Comparator<CountryCity> comp = Comparator.comparing(CountryCity::getCountry);

        while(true){
            parent = current;
            if(comp.compare(countryCity, current.getData()) == -1) {
                current = current.left;
                if(current==null){
                    parent.left = newNode;
                    return;
                }
            }else{
                current = current.right;
                if(current==null){
                    parent.right = newNode;
                    return;
                }
            }
        }
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
