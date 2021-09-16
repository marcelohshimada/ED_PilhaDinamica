package view;

import model.Pilha;

public class Principal {

	public static void main(String[] args) {

		Pilha p = new Pilha();
		boolean vazia = p.isEmpty();
		System.out.println(vazia);

		int totalNodes = (int) ((Math.random() * 10) + 1);

		for (int i = 0; i < totalNodes; i++) { // EMPILHAMENTO
			int e = (int) ((Math.random() * 100) + 1);
			p.push(e);
		}

		int top = 0;
		try {
			top = p.top();
			System.out.println(top);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < totalNodes; i++) { // DESEMPILHAMENTO
			try {
				int valor = p.pop();
				System.out.println("Pop: " + valor);
			} catch (Exception e) {
				e.printStackTrace();
			}
			vazia = p.isEmpty();
			System.out.println("Vazia: " + vazia);
		}
		
		try {
			p.pop(); //Desempilhar em uma pilha vazia
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
