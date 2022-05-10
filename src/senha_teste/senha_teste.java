
package senha_teste;

import java.util.Scanner;

public class senha_teste {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int senha, decisao = 2, senhaComp, dados;
		boolean primeiroAcesso = true;
		
		
		
		if(primeiroAcesso == true) {
			do {
			System.out.println("Crie uma senha: ");
			senha = entrada.nextInt();
			System.out.print("A senha definida é: "+ senha + "\n");
			System.out.println("-------------");
			System.out.print("1- Confirmar \n2- Redefinir \n");
			System.out.println("-------------");
			decisao = entrada.nextInt();
			}while(decisao == 2);
			primeiroAcesso =false;
			System.out.println("digite a senha: ");
			senhaComp = entrada.nextInt();
			if(senhaComp == senha) {
				
				System.out.println("Prezado cliente, esses são seus dados cadastrados em nosso sistema: ");
				System.out.print("nome: xxxx\n data de nascimento: xx/xx/xxxx\nsexo: x\ntelefone: xx xxxx-xxxx\n"
						+ "cep: xxxxx-xxx\nCPF: xxxxxxxxxxx\n\n");
				System.out.println("Caso queira alterar digite: \n"
						+ "1- nome\n2- data de nascimento\n3- sexo\n4- telefone\n 5- cep\n6- CPF");
				dados = entrada.nextInt();
				
			}
			else {
				System.out.println("Senha incorreta");
			}
		}
		
				
		
		

	}

}
