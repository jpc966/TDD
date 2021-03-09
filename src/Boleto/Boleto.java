package boleto;

import java.util.Date;

public class Boleto {
	 private int codFatura;
	 private String codBoleto; 
	 private double valorPago;
	 Date data;
	 
	 public Boleto(int codFatura, String codBoleto, double valorPago) {
		 this.codFatura = codFatura;
		 this.valorPago = valorPago;
		 this.codBoleto = codBoleto;
		 this.data = new Date();
	 }
}