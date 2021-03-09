package Fatura;

import java.util.Date;

public class Fatura {
	 
	 private String nomeCliente;
	 private double valorTotal;
	 private int codFatura;
	 Date data = new Date();
	 	 
	 public Fatura (String nomeCliente, double valorTotal, int codFatura, Date data) {
		 this.nomeCliente = nomeCliente;
		 this.valorTotal = valorTotal;
		 this.data = data;
	 }
}