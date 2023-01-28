package SA2GRUPO8;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class SA2GRUPO8 {

	public static void main(String[] args) {
		
		//tabuada(); 						/*QUESTÃO NÚMERO 1*/
		
		//contador(); 					/*QUESTÃO NÚMERO 2*/
		
		//numerosAleatorios(); 				/*QUESTÃO NÚMERO 3*/
		
		//descontos(); 					/*QUESTÃO NÚMERO 4*/
		
		//lista(); 							/*QUESTÃO NÚMERO 5*/
		
		//calcularVolumeEsfera(); 		/*QUESTÃO NÚMERO 6*/
		
		//listaInteiros(); 					/*QUESTÃO NÚMERO 7*/
		
	}
	
	/*---QUESTÃO NÚMERO 1---*/
	
	public static void tabuada() {
		
			System.out.println("Digite abaixo a tabuada que você deseja solicitar: ");
			
		Scanner lerTabuada = new Scanner(System.in);
		int tabuada = lerTabuada.nextInt();
		
		for(int i = 0; i <= 10; i++){
			System.out.println(tabuada + "x" + i + " = " + tabuada * i);
		}
	}
	
	/*---QUESTÃO NÚMERO 2---*/
	
	public static void contador() {
		
			System.out.println("Solicitar números entre 0 e: ");
			
		Scanner lerContador = new Scanner(System.in);
		int contador = lerContador.nextInt();
		
		for(int i = 0; i <= contador; i++){
			System.out.println(i);
		}
	}
	
	/*---QUESTÃO NÚMERO 3---*/
	
	public static void numerosAleatorios () {
		
		int numeroContador = 0;
		Scanner lerNumeros = new Scanner(System.in);
		int numeroDigitado;
		float somaNumeros = 0;
		
		 do {
				
			System.out.println("Digite números reais maiores que 0. Logo após, digite 0 para finalizar: ");
			
			numeroDigitado = lerNumeros.nextInt();
			numeroContador++;
			somaNumeros = somaNumeros + numeroDigitado;
			
		 }while(numeroDigitado != 0);
		 
		 numeroContador--;
		 double media = somaNumeros/numeroContador;
		 
		 	System.out.println("Quantidade entrada antes do 0: "+numeroContador);
		 	System.out.println("Média dos números: "+media);
	}
	
	
	/*---QUESTÃO NÚMERO 4---*/
	
	public static void descontos () {
			
		Scanner lerCompra = new Scanner(System.in);
		Scanner lerOpçoes = new Scanner(System.in);
		
			System.out.println("Qual é o valor da sua compra?: ");
			double valorCompra = lerCompra.nextDouble();
			
			System.out.println("Possui qual tipo de cupom? | comum[1] / vip[2] / funcionário[3] | : ");
			String valorOpçoes = lerOpçoes.nextLine();
		
		switch(valorOpçoes) {
			case "1": 
				System.out.println("Valor da compra: " + (valorCompra));
					break;
			case "2": 
				System.out.println("Desconto vip ativado: " + (valorCompra - (valorCompra*0.05)));
					break;
			case "3": 
				System.out.println("Desconto funcionário ativado: " + (valorCompra - (valorCompra*0.10)));
					break;
			default:
					descontos();
					break;
		}	  
	}
		
	/*---QUESTÃO NÚMERO 5---*/
	
	public static void lista () {
		
		List<Integer> lista = new ArrayList<Integer>();
		Scanner lerLista = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++){
			System.out.println("Insira o " + (i + 1) + "° número: ");
			int numero = lerLista.nextInt();
			lista.add(numero);
		}
		Collections.sort(lista);
			System.out.println(lista);
		Collections.sort(lista, Collections.reverseOrder());
			System.out.println(lista);
	}
	
	/*---QUESTÃO NÚMERO 6---*/
	
	public static void calcularVolumeEsfera() {
		
		double pi = 3.14;
		Scanner lerRaio = new Scanner(System.in);
			System.out.println("Insira o valor do raio: ");
		double raio = lerRaio.nextDouble();
		raio = Math.pow(raio, 3);
		double volume = 4 * pi * raio/3;
			System.out.println("A esfera possui um limite de: "+volume+"m³");
	}
	
	/*---QUESTÃO NÚMERO 7---*/
	
	public static void listaInteiros () {
		
		List<Integer> lista = new ArrayList<Integer>();
		Scanner lerLista = new Scanner(System.in); 
		int numero = 0;	
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Insira 5 valores na lista: ");
			numero = lerLista.nextInt();
			lista.add(numero);
		}
			int valorMax = Collections.max(lista);
			int valorMin = Collections.min(lista);
			System.out.println("A lista é: " + lista);
			System.out.println("O maior valor da lista é: " + valorMax);
			System.out.println("O menor valor da lista é: " + valorMin);
	}
}