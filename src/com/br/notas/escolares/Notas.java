package com.br.notas.escolares;
import java.util.Scanner;
public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe a primeira nota : ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("informe a segunda nota :");
		double nota2 = entrada.nextDouble();
		
		System.out.println("informe a terceira nota : ");
		double nota3 = entrada.nextDouble();
		
		System.out.println("informe a quarta nota : ");
		double nota4 = entrada.nextDouble();
		
		double média = (nota1 + nota2 + nota3 + nota4) / 4 ;
		
		if (média >= 7.0) {
			System.out.println("você foi aprovado, com média de " + média + ", parabéns !");
		}else {
			System.out.println("você foi reprovado, com média de " + média);
		}
	}

}
