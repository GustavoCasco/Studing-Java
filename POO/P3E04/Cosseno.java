package POO.P3E04;

public class Cosseno {
	// atributos
	private double x;
	private double [] parcelas;
	private double cosseno;
	
	// construtores
	public Cosseno() {
		parcelas = new double[10];
	}
    public Cosseno (double x) {
    	this.x = x;
    	parcelas = new double[10];
    }
    
	// getters
    public double getX() {
		return x;
	}
    public double getCosseno() {
		return cosseno;
	}
    
	// setters
    public void setX(double x) {
		this.x = x;
	}
    
	// m�todos pr�prios
    public void calculaParcelas() {
    	for (int i=0; i<10; i++) {
    		parcelas[i] = Math.pow(-1, i) / fatorial(2*i) * Math.pow(x, 2*i);
    	}
    }
    
    private long fatorial(int n) {
    	long fat = 1;
    	for (int i=1; i<=n; i++) fat *= i;
    	return fat;
    }
    
    public void somaParcela() {
    	double soma = 0.0;
    	for (double bacia:parcelas)
    		soma += bacia;
    	this.cosseno = soma;
    }
    
}