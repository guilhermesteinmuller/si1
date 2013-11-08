package lab1TDD;

public class NumeroPoExtenso {

	public String[] ZeroANove;
	public String[] DezADezenove;
	
	
	public NumeroPoExtenso() {
		
		ZeroANove = new String[] { "zero","um","dois","tres","quatro","cinco","seis","sete","oito","nove"};
		DezADezenove = new String[] {"dez", "onze", "doze", "treze", "catorze",
                "quinze", "dezesseis", "dezessete", "dezoito", "dezenove" };
	}
	
	
	
	public String extenso(String n){
		
		if (n == "")
			return "Por favor, digite um numero";
		
		int numero = Integer.parseInt(n);
	
		if (numero < 10){
			return ZeroANove[numero];
		}else if(numero <= 19){
			return DezADezenove[numero - 10];
		}
		
		return ZeroANove[numero];
	}
	
}
