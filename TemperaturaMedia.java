import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
class Main {
  public static void main(String[] args) {
    System.out.println("");
    Double temp;
    Double soma = 0.0;
    System.out.println("Digite 6 temperaturas: ");
    List <Double> temperaturas = new ArrayList<Double>();
    Scanner scan = new Scanner(System.in);
    for(int i=1; i<=6; i++){
      System.out.print("Digita a temperatura " + i +": ");
      temp = scan.nextDouble();
      temperaturas.add(temp);
    }
    System.out.println("");
    System.out.println("Temperaturas: " + temperaturas);
    System.out.println("");
    Iterator <Double> iterator = temperaturas.iterator();
    while(iterator.hasNext()){
        Double next = iterator.next();
        soma += next;
    }
    System.out.println("A média das temperaturas é igual a " + (soma/temperaturas.size()));
    System.out.println("");
    System.out.println("Temperaturas acima da média");
    Double media = soma/temperaturas.size();
    System.out.println("");
    Iterator <Double> iterator1 = temperaturas.iterator();
    while(iterator1.hasNext()){
      Double next = iterator1.next();
      if(next > media){
        System.out.println("temperatura " + 
             (temperaturas.indexOf(next) + 1) + " :  " + next);}
    }
  }
}