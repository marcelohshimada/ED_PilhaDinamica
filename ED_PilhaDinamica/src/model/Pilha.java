package model;

public class Pilha {

	No topo; // 1º elemento da pilha

	public Pilha() {
		topo = null; // Sempre começar uma pilha sem nada, estrutura vazia
	}

	public boolean isEmpty() { // Verificar se a pilha está vazia, retornando um boolean
		if (topo == null) { // Verifica se o topo da piha é nulo
			return true;
		} else {
			return false;
		}
	}

	public void push(int e) { // Empilhar
		No elemento = new No();
		elemento.dado = e;
		if (isEmpty()) { // Verifica se está vazia
			topo = elemento;
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}

	public int pop() throws Exception { // Desempilhar
		if (isEmpty()) {
			throw new Exception("Não há elementos para desempilhar");
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}

	public int top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não há elementos na pilha");
		}
		int valor = topo.dado;
		return valor;
	}

	public int size() {
		int cont = 0;
//		if (isEmpty == false) {
//		if (isEmpty != true) {
		if (!isEmpty()) {
			No auxiliar = topo;
			cont = 1;
			while (auxiliar.proximo != null) {
				auxiliar = auxiliar.proximo;
				cont++;
			}
		}
		return cont;
	}

}
