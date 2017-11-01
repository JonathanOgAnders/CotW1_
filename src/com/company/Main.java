package com.company;

public class Main
{
    public static void main(String[] args)
    {
        CsvReader csv = new CsvReader();
        csv.readFile();

        BinarySearchTree bst = new BinarySearchTree();

        csv.getUniqueContries().forEach(bst::insert);

        System.out.println(csv.getUniqueContries());


//        System.out.println(csv.getUniqueContries());
        bst.printInorder(bst.getRoot());
    }
}
