package main;



import java.util.Map;

public class PalavraCodigo {

	String mensagem;
	Biblioteca codigo;
	

	public PalavraCodigo(int codigo, String palavra){
		
		
		verificaCodigo(codigo);
		this.mensagem = palavra;
		
	}
	
	private void verificaCodigo(int tipo){
		if(tipo==1){
			codigo = new Morse();
		}
		if(tipo==2){
			codigo = new Leet();
		}
	}
	
	
	public String codifica(){		
		String palavra="";
		
		for(Character letra : mensagem.toCharArray()){	
			letra = Character.toUpperCase(letra);
			
				palavra += codigo.mapa.get(letra)+" ";
			
		}
		return palavra;
	}
	
	
	public String[] arrayPalavras(String frase){
		return frase.split("   ");
	}
	
	public String[] arrayLetras(String palavra){
		return palavra.split(" ");
	}
	
	
	
	public Character verificaLetra(String letra){
		for(Map.Entry<Character, String> s : codigo.mapa.entrySet()){
    		if(letra.equals(s.getValue())){
    			return s.getKey();
    		}	
    	}
		return null;
	}
	
	
	public String decodifica(){
		String result="";
		for(String palavra: arrayPalavras(mensagem)){
			result+=" ";
			for(String letra : arrayLetras(palavra)){
				
	        	result += verificaLetra(letra)+"";
			}
			
		}
		return result;
	}
	
	
}
