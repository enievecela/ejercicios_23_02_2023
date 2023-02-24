/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author wssa8
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        areaTriangulo();
    }
    public static void jCedenio(){
        Scanner leer= new Scanner(System.in);
        int[] x=new int[10];
        for(int i=0;i<10;i++){
            x[i]=i+1;
        }
        
        System.out.println(Arrays.toString(x));
       
    }
    
    public static void sSolis(){
        Scanner leer= new Scanner(System.in);
        int n1,n2;
        int [] a=new int[12];
        int [] b=new int[12];
        System.out.println("Ingrese el numero n1 para generar la tabla de multiplicar");
        n1=leer.nextInt();
        System.out.println("Ingrese el numero n2 para generar la tabla de multiplicar");
        n2= leer.nextInt();
        //este for genera y almacena la tabla del primer numero
        for (int i = 0; i < 12; i++) {
            a[i]=(i+1)*n1;
        }
        
        for(int i=0;i<12;i++){
            b[i]=(i+1)*n2;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < 12; i++) {
            System.out.print(" "+a[i]+" "+b[i]+" ");
            
        }
    }
    
    public static void eFlores(){
        Scanner leer= new Scanner(System.in);
        int dim;
        int acu=0;
        double prom=0;
        System.out.println("Ingresa el numero de elementos a generar");
        dim=leer.nextInt();
        int listaNum[]= new int[dim];
        for (int i = 0; i < dim; i++) {
            listaNum[i]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(listaNum));
        
        for (int i = 0; i < listaNum.length; i++) {
            acu=acu+listaNum[i];
        }
        prom=(double)(acu)/(double)(listaNum.length);
        System.out.println("el promedio es: "+prom);
        
    }
    
    public static void calculosEdades(){
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingresa el numero de edades");
        int dim=leer.nextInt();
        int acu=0;
        double prom=0;
        int edades[]=new int[dim];
        for (int i = 0; i < dim; i++) {
            System.out.println("Ingresa la edad del estudiante: ["+i+"]");
            edades[i]=leer.nextInt();
            acu=acu+edades[i];
        }
        prom=(double)(acu)/(double)(dim);
        System.out.println(Arrays.toString(edades)+"\n"
                + "En donde el promedio es: "+prom);
            
    }
    
    public static void medidasTendencia(){
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la dimensión del arreglo");
        int dim=leer.nextInt();
        int[] datos= new int[dim];
        for (int i = 0; i < datos.length; i++) {
            datos[i]=(int)(Math.random()*100);            
        }
        System.out.println(Arrays.toString(datos));
        //ordenar el arreglo
        Arrays.sort(datos);
         System.out.println(Arrays.toString(datos));
         if (datos.length%2==0) {
             System.out.println("Es par");
            int x,y;
            x=dim/2;
            y=x-1;
             System.out.println(x+" & "+y);
            int mediana= (datos[x]+datos[y])/2;
             System.out.println("la mediana es: "+mediana);
        } else {
              System.out.println("Es impar");
              int mediana=datos[dim/2];
              System.out.println("La nediana es: "+mediana);
        }
    }
    
    public static void areaTriangulo(){
        Scanner leer = new Scanner(System.in);
        int base=0,altura=0;
        double area, hipotenusa;
        do{
        System.out.println("Ingresa la base: ");
        base= leer.nextInt();
        System.out.println("Ingresa la altura: ");
        altura=leer.nextInt();
        }while(base<0 || altura<0);
        
        hipotenusa=Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
        System.out.println("La hipotenusa mide: "+hipotenusa);
        
        area=base*altura/2;
        System.out.println("El area del triangulo es: "+area);
    }
}






