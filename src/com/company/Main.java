package com.company;

public class Main
{
    public static void main(String[] args)
    {
        CsvReader csv = new CsvReader();
        csv.readFile();

        BinarySearchTree bst = new BinarySearchTree();

        csv.getCountries().forEach(bst::add);

        bst.printInorder(bst.getRoot());
    }
}
