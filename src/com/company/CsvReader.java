package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CsvReader
{
    private BufferedReader br = null;
    private String line = "";
    private String splitBy = ";";
    private List<CountryCity> countries;
    private Set<CountryCity> uniqueContries;

    public void readFile()
    {
        countries = new ArrayList<>();
        uniqueContries = new HashSet<>();

        try
        {
            br = new BufferedReader(new FileReader("CitiesOfTheWorld.csv"));

            while((line = br.readLine()) != null)
            {
                String[] country = line.split(splitBy);
                String s = country[0];
                String s2 = country[1];
                int a1 = Integer.parseInt(country[2]);
                int a2 = Integer.parseInt(country[3]);

                boolean f = false;
                boolean f2 = false;
                if(country[4].equals(" N"))
                {
                    f = true;
                }
                if(country[7].equals(" E"))
                {
                    f2 = true;
                }

                int b1 = Integer.parseInt(country[5]);
                int b2 = Integer.parseInt(country[6]);

                uniqueContries.add(new CountryCity(s, s2, a1, a2, f, b1, b2, f2));
                countries.add( new CountryCity(s, s2, a1, a2, f, b1, b2, f2));

//                removeSpacings();
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if( br != null)
            {
                try
                {
                    br.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    public void removeSpacings()
    {
        uniqueContries.forEach(countryCity -> countryCity.setCountry(countryCity.getCountry().trim()));
        countries.forEach(countryCity -> countryCity.setCountry(countryCity.getCountry().trim()));
    }

    public List<CountryCity> getCountries()
    {
        return countries;
    }

    public Set<CountryCity> getUniqueContries()
    {
        return uniqueContries;
    }
}
