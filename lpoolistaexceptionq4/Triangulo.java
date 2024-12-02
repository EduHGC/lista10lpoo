package lpoolistaexceptionq4;

public class Triangulo {
	private int lado1;
	private int lado2;
	private int lado3;
	
	public Triangulo() {
		// TODO Auto-generated constructor stub
	}

	public Triangulo(int lado1, int lado2, int lado3) throws DimensoesInvalidasException{
		if(lado1 < (lado2 + lado3)){
			this.lado1 = lado1;
		}else {
			throw new DimensoesInvalidasException("O lado 1 não permite a condição de existência do triângulo.");
		}
		
		if(lado2 < (lado1 + lado3)) {
			this.lado2 = lado2;
		}else {
			throw new DimensoesInvalidasException("O lado 2 não permite a condição de existência do triângulo.");
		}
		
		if(lado3 < (lado1 + lado2)) {
			this.lado3 = lado3;
		}else {
			throw new DimensoesInvalidasException("O lado 3 não permite a condição de existência do triângulo.");
		}
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) throws DimensoesInvalidasException{
		if(lado1 < (this.lado2 + this.lado3)){
			this.lado1 = lado1;
		}else {
			throw new DimensoesInvalidasException("O lado 1 não pode ser modificado, não permite a existência do triângulo.");
		}
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) throws DimensoesInvalidasException{
		if(lado2 < (this.lado1 + this.lado3)) {
			this.lado2 = lado2;
		}else {
			throw new DimensoesInvalidasException("O lado 2 não pode ser modificado, não permite a existência do triângulo.");
		}
	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) throws DimensoesInvalidasException{
		if(lado3 < (this.lado1 + this.lado3)) {
			this.lado3 = lado3;
		}else {
			throw new DimensoesInvalidasException("O lado 3 não pode ser modificado, não permite a existência do triângulo.");
		}
	}
	
	
}
