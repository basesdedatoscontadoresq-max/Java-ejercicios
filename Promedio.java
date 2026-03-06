import java.util.Scanner;

public class Promedio { 
    public static void main(String [] args) { 
        
        
        int val1;
        int val2;
        int val3;
        double promedio;
        int residuo;
        String apellidos;
        int  i;
        
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ingrese el valor 1:\n");
        val1 = sc.nextInt();
        
        System.out.print("ingrese el valor 2:\n");
        val2 = sc.nextInt();
        
        System.out.print("ingrese el valor 3:\n");
        val3 = sc.nextInt();
        
        System.out.print("ingrese el apellido juan:\n");
        apellidos = sc.next();
        
        
        int suma = val1 + val2 + val3;
        
        promedio = suma / 3;
        residuo  = suma % 3;
        
        
        System.out.println("el promedio es: "+ promedio + " reales");
        System.out.println("el apellido de juan es: "+ apellidos + " quisuroco");
        
        
        if (promedio >=18){ 
            
            System.out.println("Excelente");
            
        } else if( promedio >=14){ 
            
            System.out.println("bueno");
        } else if( promedio>= 11){ 
            System.out.println("con las justas");
            
        } else {
            System.out.println("desaprobado");
            
        }
        
        i = 1;
        
        while(i<=15){
        System.out.println("i");
        i++;
        
        }
    
    }
    
}
