package oo.heranca.desafio;

public class Carro {
int velocidadeAtual;

int acelera() {
	return velocidadeAtual+=5;
}
int freia() {
	if (velocidadeAtual > 0) {
		return velocidadeAtual -=5;
	}else  {
		 return 0;
	}
}
}