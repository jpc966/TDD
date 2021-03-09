package Fatura;

import java.util.Date;

public class Fatura {
	 
	 private String nomeCliente;
	 private double valorTotal;
	 private int codFatura;
	 private boolean paga;
	 Date data = new Date();
	 	 
	 public Fatura (String nomeCliente, double valorTotal, int codFatura, boolean paga, Date data) {
		 this.nomeCliente = nomeCliente;
		 this.valorTotal = valorTotal;
		 this.paga = paga;
		 this.data = data;
	 }
	 
	 public boolean foiPago(){
		 return this.paga;
	 }
	 
	 public void pagar() {
		 this.paga = true;
	 }
	 
	 public double getValorTotal() {
		 return this.valorTotal;
	 }
	 
}