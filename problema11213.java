/* Problema 1.12.13
Deseja-se fazer uma pesquisa a respeito do consumo mensal de energia elétrica em uma determinada cidade. Para isso, são
fornecidos os seguintes dados:
- preço do kwh consumido;
- numero do consumidor;
- quantidade de kwh consumido durante o mês;
- código do tipo de consumidor (residencial, comercial, industrial);
- numero do consumidor igual a zero deve ser usado como flag.

Fazer um algoritmo que leia os dados descritos acima e calcule:
a) para cada consumidor o total a pagar;
b) o maior consumo verificado;
c) o menor consumo verificado;
d) o total do consumo para cada um dos três tipos de consumidores;
e) a media geral de consumo 
Escreva:
a) para cada consumidor, o total a pagar;
b) o que foi calculado nos itens acima.*/

------------------------------------------------------------------------

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Problema11213 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00"); //formata no tipo 0,00

        double precoKWH, quantMesKWH, totalPagarConsumidor;
        double maiorConsumo = 0, menorConsumo = 0, totalConsumoResidencial = 0, totalConsumoComercial = 0, totalConsumoIndustrial = 0;
        double mediaGeral = 0;
        int numConsumidor = 0;
        int tipoConsumidor;
        int contArrayConsumidor = 0;
        ArrayList<String> consumidor = new ArrayList();

        precoKWH = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do quilowatt/hora: "));

        do {

            numConsumidor = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número do consumidor: "));
            if (numConsumidor == 0) {
                break; //encerra os cálculos e mostra dos dados capturados até o momento
            }
            quantMesKWH = Double.parseDouble(JOptionPane.showInputDialog("Insira o consumo mensal desse consumidor: "));
            do {
                tipoConsumidor = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo do consumidor (1 - residencial, 2 - comercial ou 3 - industrial):"));
                if ((tipoConsumidor < 1 || tipoConsumidor > 3)) {
                    JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro!", 2); //mensagem de erro caso opção seja diferente de 1, 2 ou 3
                }
            } while (tipoConsumidor < 1 || tipoConsumidor > 3); //repete a entra do tipo de consumidor caso sera diferente de 1,2 ou 3

            totalPagarConsumidor = quantMesKWH * precoKWH;

            if (maiorConsumo < totalPagarConsumidor) {
                maiorConsumo = totalPagarConsumidor;
            }

            if (menorConsumo > totalPagarConsumidor | menorConsumo == 0) {
                menorConsumo = totalPagarConsumidor;
            }

            switch (tipoConsumidor) {
                case 1:
                    totalConsumoResidencial += totalPagarConsumidor;
                    break;
                case 2:
                    totalConsumoComercial += totalPagarConsumidor;
                    break;
                case 3:
                    totalConsumoIndustrial += totalPagarConsumidor;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro!", 2);
            }

            if (numConsumidor > 0) {
                consumidor.add("O consumidor " + numConsumidor + " pagou no total R$ " + df.format(totalPagarConsumidor));
            } // adiciona o consumidor na próxima posição do arraylist se for maior que zero

            mediaGeral += totalPagarConsumidor;

        } while (numConsumidor > 0);

        for (String consumidor1 : consumidor) { //contador para verificar o tamanho do arraylist
            contArrayConsumidor++;
        }

        mediaGeral /= (double) contArrayConsumidor;

        StringBuilder verticalConsumidor = new StringBuilder(); //divide os dados do arraylist para cada posição aparecer na próxima linha
        for (String texto : consumidor) {
            verticalConsumidor.append(texto).append("\n");
        }

        JOptionPane.showMessageDialog(null, verticalConsumidor.toString() + "\nO maior consumo foi: " + df.format(maiorConsumo)
                + "\nO menor consumo foi: " + df.format(menorConsumo) + "\nValor total Residencial: " + df.format(totalConsumoResidencial)
                + "\nValor total comercial: " + df.format(totalConsumoComercial) + "\nValor total industrial: " + df.format(totalConsumoIndustrial)
                + "\n\nA média geral de consumo foi: " + df.format(mediaGeral));
    }

}
