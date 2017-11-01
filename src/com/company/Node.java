package com.company;

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

    

}
