
import java.util.*;
public class Main{
    public static void main(String[] args){
        
        System.out.println("SUMA DE 2 NUMEROS");        
        
        Scanner lector = new Scanner(System.in);
        Numero[] A = new Numero[2];
        int num;
        
        for(int i = 0; i < 2; i++){
            System.out.println("ingrese numero");
            num = lector.nextInt();
            A[i] = new Numero(num);
        }
        
        Numero f = new Numero(0);
        for(int i = 0; i < 2; i++){
            f = f.Sumar(A[i]);
        }
        System.out.println("Suma = " + f);

        
        
        System.out.println("SUMA DE 4 NUMEROS");
        
        Numero[] B = new Numero[4];
        int b;
        
        for(int i = 0; i < 4; i++){
            System.out.println("ingrese numero");
            b = lector.nextInt();
            B[i] = new Numero(b);
        }
        
        Numero b1 = new Numero(0);
        for(int i = 0; i < 4; i++){
            b1 = b1.Sumar(B[i]);
        }
        System.out.println("Suma = " + b1);
        
        
        
        System.out.println("SUMA DE 8 NUMEROS");
        
        Numero[] C = new Numero[8];
        int c;
        
        for(int i = 0; i<8; i++){
            System.out.print("ingrese numero " + (i+1) +  ": " + "\n");
            c = lector.nextInt();
            C[i] = new Numero(c);
        }
        
        Numero c1 = new Numero(0);
        for(int i = 0; i<8; i++){
            c1 = c1.Sumar(C[i]);
        }
        System.out.println("Suma = " + c1);
        
    }
}
