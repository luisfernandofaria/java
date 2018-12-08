package principal;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        double a = 0, b = 0, c = 0;
        boolean valor;

        do {
            try {
                valor = true;
                a = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de a: "));
                b = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de b: "));
                c = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de c: "));
            } catch (NumberFormatException ex) { //impedir que o usuário avançe usando dados que não sejam números
                JOptionPane.showMessageDialog(null, "Digite apenas números!", "Erro!", 2);
                valor = false;
            }
        } while (!valor);

        Calculos equacao01 = new Calculos(a, b, c); //monta a equação

        equacao01.calculaDelta(); //calcula o delta usando a forma de bhaskara
        equacao01.calculaRaizes(); //calcula as raízes da equação

    }
}
