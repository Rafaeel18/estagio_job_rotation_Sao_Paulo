package estagio;

public class Exerciso3 {

	public static void main(String[] args) {
		double minimo = 0;
		double maximo = 0;
		double soma = 0;
		double media = 0;
		double[] faturamentoMes = { 22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258,
				46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0,
				35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495,
				8414.61 };
		minimo = faturamentoMes[0];
		for (int i = 0; i < faturamentoMes.length; i++) {
			if (faturamentoMes[i] < minimo && faturamentoMes[i] != 0.0) {
				minimo = faturamentoMes[i];

			}

		}
		System.out.println("Faturamento minimo = " + minimo);

		maximo = faturamentoMes[0];
		for (int i = 0; i < faturamentoMes.length; i++) {
			if (faturamentoMes[i] > maximo) {
				maximo = faturamentoMes[i];

			}

		}
		System.out.println("Faturamento maximo= " + maximo);

		for (int i = 0; i < faturamentoMes.length; i++) {
			if (faturamentoMes[i] != 0.0) {
				soma += faturamentoMes[i];
				media = soma/faturamentoMes.length;

			}

		}
		System.out.println(soma);
		System.out.println("Media " + media);

	}
}
