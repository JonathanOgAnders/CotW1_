package com.company;

import java.util.Comparator;

/**
 * Created by Anders on 31-Oct-17.
 */
public class Node
{
    private CountryCity data;
    Node left;
    Node right;

    public Node(CountryCity data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public CountryCity getData()
    {
        return data;
    }

    public String toString()
    {
        return getData().toString();
    }

    public boolean add(CountryCity countryCity)
    {
        Comparator<CountryCity> comp = (CountryCity c1, CountryCity c2) -> c1.getCountry().compareTo(c2.getCountry());

        if(countryCity == this.data)
        {
            return false;
        }
        else if(comp.compare(countryCity, this.data) < 0)
        {
            if(left == null)
            {
                left = new Node(countryCity);
                return true;
            }
            else
            {
                return left.add(countryCity);
            }
        }
        else if(comp.compare(countryCity, this.data) > 0)
        {
            if(right == null)
            {
                right = new Node(countryCity);
                return true;
            }
            else
            {
                return right.add(countryCity);
            }
        }
        return false;
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
}
