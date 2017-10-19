package com.company;

public class Main
{
    public static void main(String[] args)
    {
        CsvReader csv = new CsvReader();
        csv.readFile();
        System.out.println(csv.getList());
    }
}
