package _8.exececao;

public class Causadora {
	public static void main(String[] args) {
		try {
			metodaA(null);
		} catch (Exception e) {
			if(e.getCause() !=null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		
		metodaA(null);
	}

	static void metodaA(Aluno aluno) {
		try {
			metodoB(aluno);
		}catch (Exception causa) {
			throw new IllegalArgumentException(causa);
				}
	}

	static void metodoB(Aluno aluno) {
		if (aluno == null) {
			throw new NullPointerException("Aluno está Nuuullllooo");
		}
		System.out.println(aluno.nome);
	}
}
