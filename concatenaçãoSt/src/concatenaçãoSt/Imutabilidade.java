package concatenaçãoSt;

public class Imutabilidade {

    /* public static void main(String[] args){
    	  
    	  String s = "1" ;
    	  String s2 = "2" ;
    	  
    	  String a = "21";
    	  String b = "00";
    	  
    	  a = b.concat(a);
    	  s = s.concat(s2);
    	  System.out.println("###########################################");
    	  System.out.println("resultado = " + s );
    	  System.out.println("resut = " + a );
      }*/
      
	
/* public static void main(String[] args) {
	
		//indexOf procura o indice (posição) onde ele encontrou o caracter (letra)
	    // nome.length e um metodo que retorna o tamanho da string
		String nome = "Joelson Douglas1";
        System.out.println(nome.length());
        System.out.println("client numero : " + nome.charAt(15));
        
        System.out.println(" INDECE " + nome.indexOf('1') ); 
        System.out.println(nome.indexOf("glas"));
        System.out.println(nome.indexOf('l'));
        System.out.println(nome.indexOf(97));
        System.out.println(nome.indexOf('s', 2));
        
        // substring  e um metodo que corta a string e faz uma nova string
        System.out.println(nome.substring(8));
        System.out.println(nome.substring(2, 7));
        System.out.println(nome.subSequence(0,7)); 
        
        // nome.toUppercase joga toda a string para maiusculo
        // nome.toLowercase() joga tudo para minusculo
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome);
        */
			
public static void main(String[] args) {
	    
	    String nome = "Douglas Farias";

        System.out.println(nome.contains("D"));          //true
        System.out.println(nome.contains("d"));          //false
        System.out.println(nome.contains("Douglas"));    //true
        System.out.println(nome.contains("douglas"));    //false 
        System.out.println(nome.contains(" "));          //true
        System.out.println(nome.contains(""));           //true
        System.out.println(nome);        
        
        
        }
	
	 }
		
	
	

