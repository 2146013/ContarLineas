package edu.escuelaing.arsw.loccount;

/**
 * Hello world!
 *
 */
public class CountLines
{
    public static void main( String[] args )
    {
        String typeOfcount = args[0];
        String fileName = args[1];

        System.out.println( "Type of count: " + typeOfcount);
        System.out.println( "File name: " + fileName);
    }
}
