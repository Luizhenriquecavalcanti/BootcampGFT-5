package DIO.src;

import java.util.Scanner;

public class exercicioBasico_4 {
    //Alterar o nome da classe para Main
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String T = scan.nextLine();
    String respostasCompetidores = scan.nextLine();
    String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");  
    
    int count = 0;
    for ( int i = 0 ; i < respostasCompetidoresSplit.length ; i++) {
      if (  respostasCompetidoresSplit[i].equals(T)) 
        count++;
    }
    
    System.out.println(count);

    scan.close();
  }
}