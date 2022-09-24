package oo.heranca.desafio;



public class Ferrari extends Carro{
	int atacar() {
		int acelerar = super.acelera()*3;
		
		return acelerar;
	}
}
