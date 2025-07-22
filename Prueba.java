import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.ParseException;

public class Prueba {
    public static void main(String[] args) {
        String cadena=new String("Yo soy una cadena...\n\ty continua aquí");
        System.out.println(cadena);
        
        // The Epoch 01/01/1970 formato UNIX
        Date fecha1=new Date("1/1/2023");
        Date fecha2=new Date("5/25/2023");
        System.out.println(fecha2.compareTo(fecha1));
        
        SimpleDateFormat formatoFecha=new SimpleDateFormat("'Hoy es 'E dd' de 'MMMM' de 'y",Locale.CHINESE);
        System.out.println(formatoFecha.format(fecha2));
        
        try {
            String fechaTexto=new String("16/08/2025");// new Date("1 junio 2023");
            SimpleDateFormat formatoCorto=new SimpleDateFormat("dd/MM/yyyy");
            Date fecha3=formatoCorto.parse(fechaTexto);
            System.out.println(formatoCorto.format(fecha3));
        } catch (IllegalArgumentException error) {
            System.out.println("El formato de la fecha no es correcto.");
        } catch (ParseException error) {
            System.out.println("La fecha no cumple con el formato dd/mm/aaaa.");
        } finally {
            System.out.println(new Date());
        }
    }
}