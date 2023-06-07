import javax.swing.JOptionPane;

public class Tabuada {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número para obter a tabuada:");
        int numero = Integer.parseInt(input);

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}

