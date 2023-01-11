import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("1 - Crie um dicionário e relacione os estados e suas populações:");
    System.out.println("");
    Map<String, Integer> estadosNordeste = new HashMap<>();
    estadosNordeste.put("PE ", 9616621);
    estadosNordeste.put("AL ", 3351543);
    estadosNordeste.put("CE ", 9187103);
    estadosNordeste.put("RN ", 3534265);
    System.out.println("");
    System.out.println(estadosNordeste.toString());
    System.out.println("");
    System.out.println("2 - Substitua a população do RN por 3534200:");
    estadosNordeste.put("RN ", 3534200);
    System.out.println("");
    System.out.println(estadosNordeste.toString());
    System.out.println("");
    System.out.println("3 - Confira se o estado PB está no dicionário. Caso não adicione: PB - 4039277");
    System.out.println("");
    System.out.println("O estado da Paraíba (PB) está no dicionário?");
    System.out.println("");
    System.out.println("Resposta: " + estadosNordeste.containsKey("PB "));
    System.out.println("");
    System.out.println("Acrescente o estado da PB.");
    System.out.println("");
    estadosNordeste.put("PB ", 4039277);
    System.out.print(estadosNordeste);
    System.out.println("");
    System.out.println("O estado da Paraíba (PB) está no dicionário?");
    System.out.println("");
    System.out.println("Resposta: " + estadosNordeste.containsKey("PB "));
    System.out.println("");
    System.out.println("4 - Exiba a população de PE.");
    System.out.println("");  
    System.out.println("A população de PE é " + estadosNordeste.get("PE "));
    System.out.println("");
    System.out.println("5 - Exiba todas as populações na ordem de inserção: ");
    System.out.println("");
     Map<String, Integer> estadosNordeste1 = new LinkedHashMap<>(estadosNordeste);
     for(Map.Entry <String, Integer> estado: estadosNordeste1.entrySet())
       System.out.println(estado.getKey() + " - " + estado.getValue());
  System.out.println("");
  System.out.println("6 - Exiba todas as populações na ordem alfabética dos estados.");
  System.out.println("");
    Map<String, Integer> estadosNordeste2 = new TreeMap<>(estadosNordeste1);
    for(Map.Entry <String, Integer> estado: estadosNordeste2.entrySet())
       System.out.println(estado.getKey() + " - " + estado.getValue());
    System.out.println("");
    System.out.println("7 - Exiba o estado com a menor população e sua quantidade.");
    System.out.println("");
    Integer menorPopulacao = Collections.min(estadosNordeste.values());    for(Map.Entry<String,Integer>entry:estadosNordeste.entrySet()){
      if(entry.getValue().equals(menorPopulacao))        
        System.out.println(entry);
    }
    System.out.println("");
    System.out.println("8 - Exiba o estado com a maior população e sua quantidade.");
    System.out.println("");
    Integer maiorPopulacao = Collections.max(estadosNordeste.values());    for(Map.Entry<String,Integer>entry:estadosNordeste.entrySet()){
      if(entry.getValue().equals(maiorPopulacao))        
        System.out.println(entry);
    }
    System.out.println("");
    System.out.println("9 - Exiba a soma das populações.");
    System.out.println("");
    Iterator <Integer> iterator = estadosNordeste.values().iterator();
    Integer soma = 0;
    while(iterator.hasNext()){
      soma += iterator.next();
    }
    System.out.println("Resposta: " + soma);
    System.out.println("");
    System.out.println("10 - Exiba a média das populações.");
    System.out.println("");
    System.out.println("Resposta: " + (soma/estadosNordeste.size()));
    System.out.println("");
    System.out.println("11 - Remova todos os estados com população menor que 4.000.000");
    Iterator <Integer> iterator1 = estadosNordeste.values().iterator();
    while(iterator1.hasNext()){
      if(iterator1.next() < 4000000)  iterator1.remove();
    }
    System.out.println(estadosNordeste);
    System.out.println("");
    System.out.println("12 - Apague o dicionário.");
    estadosNordeste.clear();
    System.out.println("");
    System.out.println("13 - Confira se o dicionário está vazio: ");
    System.out.println("");
    System.out.println("Resposta: " + estadosNordeste.isEmpty());
    }
 }
class Estado{
      private String estado;
      private Integer populacao;

      public Estado (String estado, Integer populacao){
        this.estado = estado;
        this.populacao = populacao;
      }
      public String getEstado(){
        return estado;
      }
      public Integer getPopulacao(){
        return populacao;
      }
   }