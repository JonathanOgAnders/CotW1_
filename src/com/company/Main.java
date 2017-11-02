package com.company;

public class Main
{
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        CsvReader csv = new CsvReader();
        csv.readFile();

        BinarySearchTree bst = new BinarySearchTree();

        csv.getCountries().forEach(bst::add);
        bst.printInorder(bst.getRoot());
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
