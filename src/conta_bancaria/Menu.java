package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		Conta c1 = new Conta(1, 123, 1, "Fernanda", 500000);
		//System.out.println(c1.getTitular());//
		c1.visualizar();
		
		c1.sacar(200);
		c1.visualizar();
		
		c1.depositar(1000);
		c1.visualizar();
		
		// Alterar a propriedade titular //
		c1.setTitular("Fernanda Murched");
		c1.visualizar();
		
		
		while (true) {
			System.out.print(Cores.TEXT_BLACK+ Cores.ANSI_YELLOW_BACKGROUND);
			System.out.println("*******************************************************");
			System.out.println("*                                                     *");
			System.out.println("*                BANCO DO BRAZIL COM Z                *");
			System.out.println("*                                                     *");
			System.out.println("*******************************************************");
			System.out.println("*                                                     *");
			System.out.println("*           1 - Criar nova conta.                     *");
			System.out.println("*           2 - Visualizar todas as contas.           *");
			System.out.println("*           3 - Buscar conta por número.              *");
			System.out.println("*           4 - Atualizar informações da conta.       *");
			System.out.println("*           5 - Excluir uma conta.                    *");
			System.out.println("*           6 - Realizar saque.                       *");
			System.out.println("*           7 - Realizar depósito.                    *");
			System.out.println("*           8 - Realizar trasnferência.               *");
			System.out.println("*           9 - Encerrar sessão.                      *");
			System.out.println("*                                                     *");
			System.out.println("*******************************************************");
			System.out.println("*              Escolha a opção desejada:              *");
			System.out.println("*******************************************************");
					
		opcao = leia.nextInt();
		
		if (opcao == 9) {
				System.out.println("\nBanco do Brasil com Z - O seu futuro começa aqui!\n");
				sobre();
		leia.close();
				System.exit(0);
		}
		
		switch (opcao) {
				case 1:
					System.out.println("Criar nova conta.\n\n");
					break;
			
				case 2:
					System.out.println("Visualizar todas as contas.\n\n");
					break;
		
				case 3:
					System.out.println("Buscar conta por número.\n\n");
					break;
		
				case 4:
					System.out.println("Atualizar informações da conta.\n\n");
					break;
		
				case 5:
					System.out.println("Excluir uma conta.\n\n");
					break;
		
				case 6:
					System.out.println("Realizar saque.\n\n");
					break;
		
				case 7:
					System.out.println("Realizar depósito.\n\n");
					break;
		
				case 8:
					System.out.println("Realizar trasnferência.\n\n");
					break;
				
				case 9:
					System.out.println("Encerrar sessão.\n\n");
					break;
			
				default:
					System.out.println("Opção inválida. Tente novamente!\n");
					break;
			}
		}
	}
		
		public static void sobre() {
			System.out.println("""
			ꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀ
			Projeto desenvolvido por Fernanda Murched
			Generation Brasil - fernandao@genstudents.org
			GitHub- https://github.com/FernandaMurched
			ꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀꕀ		
			""");
		}
		
}
		
	
