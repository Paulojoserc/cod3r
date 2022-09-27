package oo.heranca;

public class Jogador {
	int vida = 100;
	int x;
	int y;

	public Jogador(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	boolean atacar(Jogador oponente) {
		//Math.abs server para calcular o valor absoluto
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY ==1) {
			oponente.vida -=10;
			return true;
		}else if (deltaX == 1 && deltaY ==0) {
			oponente.vida -=10;
			return true;
		}
				
		return false;
	}
	
	boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
		y--;
		break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		return true;
	}
}
