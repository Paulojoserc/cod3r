package oo.heranca.desafio;

public class Carro {
int velocidadeAtual;

void acelera() {
	 velocidadeAtual+=5;
}
void freia() {
	if (velocidadeAtual >= 5) {
		 velocidadeAtual -=5;
	}else  {
		 velocidadeAtual = 0;
	}
}
public String toString() {
	return "Velocidade atual é "+velocidadeAtual+" KM/h"; 
}
}