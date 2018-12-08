package principal;

import javax.swing.JOptionPane;

public class Calculos {

    private double a;
    private double b;
    private double c;
    private double delta;

    public Calculos(double a, double b, double c) { //construtor
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculaDelta() {
        this.delta = (b * b) - 4 * a * c; //formula de bhaskara para calcular o delta
        if (delta < 0) { // testa das raízes da equação
            JOptionPane.showMessageDialog(null, "Essa equação não possui raízes reais.");
        } else if (delta > 0) {
            JOptionPane.showMessageDialog(null, "Essa equação possui duas raízes reais.");
        } else {
            JOptionPane.showMessageDialog(null, "Essa equação possui apenas uma raiz real.");
        }
    }

    public void calculaRaizes() { //calcula as raízes usando a forma de bhaskara
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        JOptionPane.showMessageDialog(null, "O valor da raíz 1 é: " + x1 + "\n E o valor da raíz 2 é: " + x2);
    }
}
