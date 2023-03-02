package examen.pkg1.eduardoespinoza;

import java.util.Scanner;

/*El programa deberá desarrollarlo utilizando un ciclo hasta que ya no se deseen ingresar más 
datos. Por cada venta deberá leer los siguientes datos: número de factura, cedula y nombre 
del comprador, localidad (es un campo donde deberá indicar la localidad deseada, según lo 
siguiente: 1- Sol Norte/Sur 2- Sombra Este/Oeste 3-Preferencial), cantidad de entradas (el 
campo debe estar validado, 1 clientes solo puede comprar como máximo cuatro entradas).*/
public class Clientes {

    static int[] NFactura = new int[10];
    static int[] Cedula = new int[10];
    static String[] Nombre = new String[10];
    static byte[] Localidad = new byte[10];
    static int[] NEntradas = new int[10];
    static int limite = 0;
    static String[] Campo = new String[10];
    static int[] PEntrada=new int[10]; 
    static int[] SubTotal=new int[10];
    static int[] Total=new int[10];
    static int Adicional=1000;   
    static int Acumulador=0; 
    static int Contador=0;
    static int Cantidad_SolNS=0;
    static int Cantidad_SombraEO=0;
    static int Cantidad_Preferenciales=0;
    static int AcumuladorSol=0;
    static int AcumuladorSombra=0;
    static int AcumuladorPreferencial=0;
        
    public Clientes() {
    }

    public static void Incluir_Compradores() {
        Scanner leer = new Scanner(System.in);
        char continuar = ' ';
        do {
            if (limite > 10) {//limite para los datos ingresados
                System.out.println("No se puede admitir mas datos");
            } else {//Ingresar los datos
                System.out.println("Ingrese el #Factura: ");
                NFactura[limite] = leer.nextInt();
                System.out.println("Ingrese la cedula del comprador: ");
                Cedula[limite] = leer.nextInt();
                System.out.println("Ingrese el nombre del comprador: ");
                Nombre[limite] = leer.next();
                System.out.println("Ingrese el campo elegido   (1)Sol Norte/Sur    (2)Sombra Este/Oeste    (3)Preferencial: ");
                Localidad[limite] = leer.nextByte();
                if (Localidad[limite] == 1) {//campo Sol Norte/Sur
                    Campo[limite] = "Sol Norte/Sur";
                } else if (Localidad[limite] == 2) {//Sombra Este/Oeste
                    Campo[limite] = "Sombra Este/Oeste";
                } else if (Localidad[limite] == 3) {//Preferencial
                    Campo[limite] = "Preferencial";
                }
                System.out.println("Ingrese la cantidad de entradas(maximo 4): ");
                NEntradas[limite] = leer.nextByte();
                if (NEntradas[limite] >= 4) {
                    System.out.println("No puedes comprar mas de 4 entradas");
                }

                limite++;
                System.out.println("¿Desea agregar otro estudiante? Si(s)   No(n)");
                continuar = leer.next().charAt(0);
            }
        } while (continuar!= 'n');
                    
    }
/*El sistema deberá procesar el precio por entrada y el nombre de la localidad, en base a lo 
siguiente:
• Si la localidad es 1 (Sol Norte/Sur) el precio por entrada será de 10500 colones y el 
nombre de la localidad será “Sol Norte/Sur”.
• Si la localidad es 2 (Sombra Este/Oeste) el precio por entrada será de 20500 colones y 
el nombre de la localidad será “Sombra Este/Oeste”.
• Si la localidad es 3 (3-Preferencial) el precio por entrada será de 25500 colones y el 
nombre de la localidad será “Preferencial”
Además deberá calcular el subtotal de la compra (cantidad de entradas por precio por entrada, 
cargos por servicios (1000 colones adicionales por entrada) y el total a pagar.
Recordar deberá procesar también los datos para las estadísticas (cantidad de entradas por 
cada una de las localidades y el Acumulado de dinero por cada localidad (el acumulado de este 
dinero no deberá contemplar los cargos por servicios)*/
     
    public static void Cobro_Compradores() {//Factura de la entrada
          
     if (Localidad[limite]==1){PEntrada[limite]=10500;}
     if (Localidad[limite]==2){PEntrada[limite]=20500;}
     if (Localidad[limite]==3){PEntrada[limite]=25500;}
     SubTotal[limite]=PEntrada[limite]*NEntradas[limite];
     Total[limite]=SubTotal[limite]+Adicional;
     //Acumulador
     if(Localidad[limite] == 1){AcumuladorSol =Total[limite]+Acumulador;}
     if(Localidad[limite] == 2){AcumuladorSombra=Total[limite]+Acumulador;}
     if(Localidad[limite] == 3){AcumuladorPreferencial=Total[limite]+Acumulador;}
     //Contador
        if(Localidad[limite] == 1){for (int i = 0; i <Localidad[limite]; i++) {
            Cantidad_SolNS = Contador+NEntradas[limite];      
            }
        if(Localidad[limite] == 2){for (int i = 0; i <Localidad[limite]; i++) {
            Cantidad_SombraEO = Contador+NEntradas[limite];      
            }
        if(Localidad[limite] == 1){for (int i = 0; i <Localidad[limite]; i++) {
            Cantidad_Preferenciales = Contador+NEntradas[limite];      
            }
}
     } 
        }
    }
    public static void Imprimir_Recibo(){
        System.out.println("#Factura: "+NFactura[limite]+"\n"+"Cedula: "+Cedula[limite]+"\n"+"Nombre del comprador: "+Nombre[limite]+"\n"+"Localidad: "+Campo[limite]+"\n"+"Cantidad de entradas: "+NEntradas[limite]+"\n"+"Subtotal: "+SubTotal[limite]+"\n"+"Cargos por servicios: "+Adicional+"\n"+"Total a pagar: "+Total[limite]);
        System.out.println("    Entradas Sol: "+Cantidad_SolNS+"    Entradas sombra: "+Cantidad_SombraEO+"    Entradas preferenciales: "+Cantidad_Preferenciales+"\n"+"Dinero acumulado sol: "+AcumuladorSol+"Dinero acumulado sombra: "+AcumuladorSombra+"Dinero acumulado preferencial: "+AcumuladorPreferencial);
    }
            }
        
        
