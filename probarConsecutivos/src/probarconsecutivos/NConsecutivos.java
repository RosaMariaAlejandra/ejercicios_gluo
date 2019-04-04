/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probarconsecutivos;

/**
 *
 * @author ROSY
 */
import java.util.Scanner; 
import java.util.Arrays; 
public class NConsecutivos 
{ 
private static int numeros[] = new int[3]; 
 
public static boolean probarConsecutivos(int arreglo[]) 
{ 
 
Arrays.sort(arreglo); 
for(int i = 1; i < arreglo.length; i++) 
{ 
if((arreglo[i] - 1) != arreglo[i - 1])   
{ 
return false; 
} 
} 
 
return true; 
 
 
} 
 
public static boolean probarConsecutivos(int uno, int dos, int tres) 
{ 
int num[] = new int[3]; 
num[0] = uno; 
num[1] = dos; 
num[2] = tres; 
 
return probarConsecutivos(num); 
} 
 
public static void main(String args[]) 
{ 
 
 
Scanner entrada = new Scanner(System.in); 
int uno; 
int dos; 
int tres; 
 
System.out.print("Dame el primer numero: "); 
uno = entrada.nextInt(); 
System.out.print("Dame el segundo numero: "); 
dos = entrada.nextInt(); 
System.out.print("Dame el tercer numero: "); 
tres = entrada.nextInt(); 
 
if(probarConsecutivos(uno, dos, tres)) 
{ 
System.out.println("los numeros son consecutivos!"); 
}else 
{ 
System.out.println("los numeros no son consecutivos!"); 
} 
} 
}
