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
    private int depth;

    public Node(CountryCity data, int depth)
    {
        this.data = data;
        this.left = null;
        this.right = null;
        this.depth = depth;
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
        Comparator<CountryCity> comp = (c1, c2) -> {
            if(c1.getCountry().equals(c2.getCountry()))
            {
                return c1.getCity().compareTo(c2.getCity());
            }
            return c1.getCountry().compareTo(c2.getCountry());
        };

        if(countryCity == this.data)
        {
            return false;
        }
        else if(comp.compare(countryCity, this.data) < 0)
        {
            if(left == null)
            {
                left = new Node(countryCity, this.getDepth()+1);
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
                right = new Node(countryCity, this.getDepth()+1);
                return true;
            }
            else
            {
                return right.add(countryCity);
            }
        }
        return false;
    }

    public int getDepth()
    {
        return depth;
    }
}
