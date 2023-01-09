/* Este programa é um exercício para organizar uma lista de acordo com um critério. Foi considerado uma lista de ides com 3 atribudos: nome, ano e a companhia que fez a ide. */
import java.util.*;
class Main {
  public static void main(String[] args) {    
    
    Ides ide_1 = new Ides("VScode",1995,"Microsoft");
    Ides ide_2 = new Ides("Eclipse",1990,"Oracle");
    Ides ide_3 = new Ides("Intellij",2000,"Jetbrain");
    
    List <Ides> minhasides = new ArrayList<>();
    minhasides.add(ide_1);
    minhasides.add(ide_2);
    minhasides.add(ide_3);
    System.out.println("");
    System.out.println("1 - Exiba os objetos (as ides) em ordem de inserção:");  
    System.out.println("");
    for(int i = 0; i<=2; i++)
    System.out.println(minhasides.get(i));
    System.out.println("");
    System.out.println("2 - Exiba os objetos (ides) na ordem dos nomes de cada ide:");
    System.out.println("");
    Collections.sort(minhasides);
    for(int i = 0; i<=2; i++)
    System.out.println(minhasides.get(i));
    System.out.println("");
    System.out.println("3 - Exiba os objetos (ides) na ordem cada uma: ");
    System.out.println("");
    Collections.sort(minhasides,new comparatorAno());
    for(int i = 0; i <=2;i ++)
    System.out.println(minhasides.get(i));
  }
}
 class Ides implements Comparable<Ides> {
   private String nome;
   private Integer ano;
   private String companhia;

   public Ides(String nome, Integer ano, String companhia){
     this.nome = nome;
     this.ano = ano;
     this.companhia = companhia;
   }
   public String getNome(){
     return nome;
   }
   public Integer getAno(){
     return ano;
   }
   public String getCompanhia(){
     return companhia;
   }
   @Override
   public String toString(){
     return "{"+ "nome = " + nome +",\t" +"ano = " + this.ano + ",\t" + "companhia = " + this.companhia + "}\n";
   }
   @Override
   public int compareTo(Ides outraide){
     return this.nome.compareToIgnoreCase(outraide.nome);
   }
}
class comparatorAno implements Comparator <Ides>{
  @Override
  public int compare (Ides ide1,Ides ide2){
    return Integer.compare(ide1.getAno(),ide2.getAno());
  }
}