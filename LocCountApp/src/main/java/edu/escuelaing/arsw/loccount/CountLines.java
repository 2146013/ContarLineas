package edu.escuelaing.arsw.loccount;
// Loc lee lineas sin comentarios y newline retorna la cantidada de lineas cumplinedo las reglas
//Phy lee todas las lineas de archivo txt y retorna el numero total de lineas del archivo
/**
 * Hello world!
 *
 */
public class CountLines {
    public static void main( String[] args )
    {//loc demo.txt
        String typeOfcount = args[0];//palabra loc o phy
        String fileName = args[1];//nombre del archivo(demo.txt)

        System.out.println( "Type of count: " + typeOfcount);
        System.out.println( "File name: " + fileName);
        if (typeOfcount.toLowerCase().equals("loc")){
            Loc loc = new Loc(fileName);
            loc.getCantidad();


        }
        else (typeOfcount.toLowerCase().equals("phy")){
            Phy phy = new Phy(fileName);
            phy.getCantidad();
        }
    }
}
