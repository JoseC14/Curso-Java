
package aula3;

import java.util.Scanner;
public class Aula3 {


    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int n1=0,n2=0,res=0;
       
        System.out.println("Digite um numeral");
        n1=scan.nextInt();
        System.out.println("Digite outro numeral");
        n2=scan.nextInt();
        res=n1+n2;
        System.out.println(n1+" mais "+n2+" é igual a "+res);
    }
    
}
