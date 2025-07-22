import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.ParseException;

/**
 * Write a description of class Prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prueba {
    public static void main(String[] args) {
        String cadena=new String("Yo soy una cadena...\n\ty continua aquí");
        System.out.println(cadena);
        
        // The Epoch 01/01/1970, formato UNIX
        Date fecha1=new Date("1/1/2023");
        Date fecha2=new Date("1 jun 2023");
        Date fecha3=new Date("30/12/2023");
        
        System.out.println(fecha1);
        System.out.println(fecha2);
        System.out.println(fecha3);
        
        Date fecha4=new Date("5/25/2023");
        System.out.println(fecha4);
        System.out.println(fecha4.compareTo(fecha1));
        
        SimpleDateFormat formatoFecha=new SimpleDateFormat("y");
        System.out.println(formatoFecha.format(fecha4));
        SimpleDateFormat formatoFecha1=new SimpleDateFormat("MM-y");
        System.out.println(formatoFecha1.format(fecha4));
        SimpleDateFormat formatoFecha2=new SimpleDateFormat("d-MM/y");
        System.out.println(formatoFecha2.format(fecha4));
        SimpleDateFormat formatoFecha3=new SimpleDateFormat("'Hoy es 'E dd' de 'MMMM' de 'y");
        System.out.println(formatoFecha3.format(fecha4));
        SimpleDateFormat formatoFecha4=new SimpleDateFormat("'Hoy es 'E dd' de 'MMMM' de 'y",Locale.CHINESE);
        System.out.println(formatoFecha4.format(fecha4));
        
        try {
            Date fecha5=new Date("1 junio 2023");
            System.out.println(fecha5);
        } catch (IllegalArgumentException error) {
            System.out.println("El formato de la fecha no es correcto");
        }
        
        try {
            Date fecha6=new Date("16/08/2025");
            System.out.println(fecha6);
        } catch (IllegalArgumentException error) {
            System.out.println("El formato de la fecha no es correcto");
        }
        
        try {
            String fechaTexto=new String("16/08/2025");
            SimpleDateFormat formatoCorto=new SimpleDateFormat("dd/MM/yyyy");
            Date fecha7=formatoCorto.parse(fechaTexto);
            System.out.println(formatoCorto.format(fecha7));
        } catch (IllegalArgumentException error) {
            System.out.println("El formato de la fecha no es correcto");
        } catch (ParseException error) {
            System.out.println("La fecha no cumple con el formato");
        } finally {
            System.out.println(new Date());
        }
    }
}