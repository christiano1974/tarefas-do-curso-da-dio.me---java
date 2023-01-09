import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    Set <String> cores = new HashSet <>(Arrays.asList("verde","amarelo","azul","violeta","rosa","dourado")); 
    System.out.println("");
    System.out.println("cores: " + cores.toString());  
    System.out.println("");
    Iterator <String> iterator = cores.iterator();
    System.out.println("");
    System.out.println("1 - Exiba todas as cores uma abaixo da outra: ");
    System.out.println("");
    while(iterator.hasNext()){
      String next = iterator.next();
      System.out.println(next);
    }
    System.out.println("");
    System.out.println("2 - Exiba a quantidade de cores: ");
    int quant = cores.size();
    System.out.println("");
    System.out.println("A quantidade de cores: " + quant);
    System.out.println("");
    
    System.out.println("3 - Exiba as cores em ordem alfabética: ");
    System.out.println("");
    Set <String> cores_2 = new TreeSet <> (cores);
    System.out.println(cores_2);
    System.out.println("");
    List <String> listacores = new ArrayList<>();
    Iterator <String> iterator1 = cores.iterator();
    while(iterator1.hasNext()){
          String next = iterator1.next();
          listacores.add(next);
    }
    System.out.println("4 - Exiba as cores na ordem inversa a informada:");
    System.out.println("");
    Collections.reverse(listacores);
    Iterator <String> iterator2 = listacores.iterator();
    while(iterator2.hasNext()){
      String next = iterator2.next();
      System.out.println(next);
    }
    System.out.println("");
    System.out.println("5 - Exiba todas as cores que inicia com a letra v");
    System.out.println("");
    Iterator <String> iterator3 = cores.iterator();
    while(iterator3.hasNext()){
      String next = iterator3.next();
      if (next.equals("verde") || next.equals("violeta")){
        System.out.println(next);}
    }
    System.out.println("");
    System.out.println("6 - Remova todos os elementos que não comece com a letra v.");
    Iterator <String> iterator4 = listacores.iterator();
    List <String> listacores1 =new ArrayList<>();
    while(iterator4.hasNext()){
      String next = iterator4.next();
      if(next.equals("verde") | next.equals("violeta")){
        listacores1.add(next);
      }
    }
    System.out.println("");
    for(int i = 0; i<=1; i++)
    System.out.println(listacores1.get(i));
    System.out.println("");
    System.out.println("7 - Limpe o conjunto: ");
    listacores1.clear();
    System.out.println("");
    System.out.println("8 - O conjunto está vazio? ");
    System.out.println(listacores1.isEmpty());
  }
}