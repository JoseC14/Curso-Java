
package aula2;



public class Aula2 {


    public static void main(String[] args) {
       
       
      /* int nota=80;
       int media=60;
       
       if(media>nota){
           System.out.println("Reprovado");
       }else if(nota>media){
           System.out.println("Aprovado");
       }else{
           System.out.println("Nota inválida");
       }*/
      
      int pos=1;
      
      switch(pos){
          case 1:
              System.out.println("Primeiro Lugar");
              break;
          case 2:
              System.out.println("Segundo Lugar");
              break;
          case 3:
              System.out.println("Terceiro Lugar");
              break;
          default:
              System.out.println("Não subiu ao pódio");
              break;
      }
        
    }
    
}
