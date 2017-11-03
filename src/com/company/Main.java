package com.company;

public class Main
{
    public static void main(String[] args)
    {
        CsvReader csv = new CsvReader();
        csv.readFile();

        BinarySearchTree bst = new BinarySearchTree();

        //Specifik root. Forsøg på at balancere træet
//        for(CountryCity c: csv.getCountries())
//        {
//            if(c.getCountry().equalsIgnoreCase(" india") && c.getCity().equalsIgnoreCase("new delhi"))
//            {
//                bst.setRoot(new Node(c, 1));
//            }
//        }

        csv.getCountries().forEach(bst::add);

//        bst.printInorder(bst.getRoot());


//        System.out.println(bst.getRoot());

        bst.findMaxDepth(bst.getRoot());
        bst.printMaxDepth();


    }
}
