package estagio;

public class exerciso4 {
	
	public static void main(String[] args) {
		double percentualSp = 0;
		double percentualRj = 0;
		double percentualMg = 0;
		double percentualEs = 0;
		double outros = 0;
		
		int i=0;
		double[] faturamentoPorEstado = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};
    double soma = 0;
    for( i = 0 ; i < faturamentoPorEstado.length; i++ ) {
    	
    	soma +=  faturamentoPorEstado[i];
    	
    	percentualSp =	(faturamentoPorEstado[0]* 100/soma);
    	percentualRj = (faturamentoPorEstado[1]* 100/soma);
    	percentualMg =  (faturamentoPorEstado[2]* 100/soma);
    	percentualEs =  (faturamentoPorEstado[3]* 100/soma);
    	outros =  (faturamentoPorEstado[4]* 100/soma);
    
    }System.out.println(" *percentual de representação que cada estado teve dentro do valor total mensal da distribuidora");
    
    
    System.out.println("\nSP: " + percentualSp + " %");
	System.out.println("RG: " + percentualRj + " %");
	System.out.println("MG: " + percentualMg + " %");
	System.out.println("ES: " + percentualEs + " %");
	System.out.println("OUTROS: " + outros + " %");
		
		
	}

}
