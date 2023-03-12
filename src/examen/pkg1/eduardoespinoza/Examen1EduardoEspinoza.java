/*Eduardo José Espinoza Rodríguez EXAMEN MEJORADO, 
muchas gracias profe por la oportunidad. Espero le agrade esta mejora*/
package examen.pkg1.eduardoespinoza;
import java.util.Scanner;

public class Examen1EduardoEspinoza {
    Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Partido 5/11/2018");
        Clientes.Incluir_Compradores();
        new Consultar_Factura().setVisible(true);//Al no incluir mas clientes, se abrira una ventana para mostrar cuantas personas optaron por cierta localidad
        
                
        
    }
    
}
