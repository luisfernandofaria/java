package lista02;

import javax.swing.JOptionPane;

//Fazer um algoritmo que dado  4 notas de provas, a b, c, e d calcule e escreva o valor das seguintes médias: 
//aritimética, harmônica, geométrica e quadrática

public class Exercicio16 {

	float resultado;

	public static void main(String[] args) {

		Exercicio16 aluno = new Exercicio16();

		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota: \n"));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota: \n"));
		float n3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a terceira nota: \n"));
		float n4 = Float.parseFloat(JOptionPane.showInputDialog("Informe a quarta nota: \n"));
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a média desejada: \n" + "1 - Média Aritmética \n"
						+ "2 - Média Harmônica \n" + "3 - Média Geométrica \n" + "4 - Média Quadrática \n"));
		
			switch (opcao) {
			case 1:
				aluno.calculaMediaAritmetica(n1, n2, n3, n4);
				JOptionPane.showMessageDialog(null, "Média aritmética: " + aluno.obterResultado());
				break;
			case 2:
				aluno.calculaMediaHarmonica(n1, n2, n3, n4);
				JOptionPane.showMessageDialog(null, "Média harmônica: " + aluno.obterResultado());
				break;
			case 3:
				aluno.calculaMediaGeometrica(n1, n2, n3, n4);
				JOptionPane.showMessageDialog(null, "Média geométrica: " + aluno.obterResultado());
				break;
			case 4:
				aluno.calculaMediaQuadratica(n1, n2, n3, n4);
				JOptionPane.showMessageDialog(null, "Média quadrática: " + aluno.obterResultado());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");

			}
	}

	float obterResultado() {
		return resultado;
	}

	void calculaMediaAritmetica(float n1, float n2, float n3, float n4) {

		resultado = (n1 + n2 + n3 + 4) / 4;
	}

	void calculaMediaHarmonica(float n1, float n2, float n3, float n4) {

		resultado = 4 / (1 / n1 + 1 / n2 + 1 / n3 + 1 / n4);
	}

	void calculaMediaGeometrica(float n1, float n2, float n3, float n4) {

		resultado = (float) Math.pow(n1 * n2 * n3 * n4, 1 / 4);
	}

	void calculaMediaQuadratica(float n1, float n2, float n3, float n4) {

		resultado = (float) Math.sqrt(((n1 * n1) + (n2 * n2) + (n3 * n3) + (n4 * n4)) / 4);
	}

}
