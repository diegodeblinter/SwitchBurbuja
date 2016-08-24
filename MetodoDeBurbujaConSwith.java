/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IIsemestre2014;
import java.io.*;

/**
 *
 * @author David
 */
public class MetodoDeBurbujaConSwith{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
            BufferedReader dato = new BufferedReader (new InputStreamReader(System.in)); 
int selector            ;
double  sueldo, horasExtras, pagoTotal;      
System.out.println("categoria de trabajo");
selector=Integer.parseInt(dato.readLine());
System.out.println("sueldo");
sueldo=Double.parseDouble(dato.readLine());
System.out.println("horas extras");
horasExtras=Double.parseDouble(dato.readLine());
switch (selector){
    case 22:{pagoTotal=sueldo+(horasExtras*30);
    System.out.println("pago total "+pagoTotal);

    break;}
    case 2:{pagoTotal=sueldo+(horasExtras*38);
    System.out.println("pago total "+pagoTotal);

    break;}
    case 3:{pagoTotal=sueldo+(horasExtras*50);
    System.out.println("pago total "+pagoTotal);

    break;}
    case 4:{pagoTotal=sueldo+(horasExtras*60);
    System.out.println("pago total "+pagoTotal);

    break;}
    case 5:{pagoTotal=sueldo+(horasExtras*68);
    System.out.println("pago total "+pagoTotal);

    break;}
    case 6:{pagoTotal=sueldo+(horasExtras*74);
    System.out.println("pago total "+pagoTotal);
    

    break;}    
    case 7:{pagoTotal=sueldo+(horasExtras*80);
    System.out.println("pago total "+pagoTotal);

    break;}
    case 8:{pagoTotal=sueldo+(horasExtras*88);
    System.out.println("pago total "+pagoTotal);

    break;}
    case 9:{pagoTotal=sueldo+(horasExtras*94);
    System.out.println("pago total "+pagoTotal);

    break;}
    case 10:{pagoTotal=sueldo+(horasExtras*100);
    System.out.println("pago total "+pagoTotal);

    break;}
    case 11:{pagoTotal=sueldo+(horasExtras*105);
    System.out.println("pago total "+pagoTotal);

    break;}
    case 12:{pagoTotal=sueldo+(horasExtras*110);
    System.out.println("pago total "+pagoTotal);

    break;}     
   
}

        // TODO code application logic here
    }
}
