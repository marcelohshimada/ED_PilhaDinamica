package model;

public class Pilha {

	No topo; // 1� elemento da pilha

	public Pilha() {
		topo = null; // Sempre come�ar uma pilha sem nada, estrutura vazia
	}

	public boolean isEmpty() { // Verificar se a pilha est� vazia, retornando um boolean
		if (topo == null) { // Verifica se o topo da piha � nulo
			return true;
		} else {
			return false;
		}
	}

	public void push(int e) { // Empilhar
		No elemento = new No();
		elemento.dado = e;
		if (isEmpty()) { // Verifica se est� vazia
			topo = elemento;
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}

	public int pop() throws Exception { // Desempilhar
		if (isEmpty()) {
			throw new Exception("N�o h� elementos para desempilhar");
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}

	public int top() throws Exception {
		if (isEmpty()) {
			throw new Exception("N�o h� elementos na pilha");
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
