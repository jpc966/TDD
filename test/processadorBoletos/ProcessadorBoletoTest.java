package processadorBoletos;

import Fatura.*;
import Boleto.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProcessadorBoletoTest {
	private Fatura fatura;
	private ArrayList<Boleto> boletos = new ArrayList();
	private ProcessadorBoleto processadorBoleto;
	
	@BeforeEach
	public void inicializaFatura() {
		fatura = new Fatura("Jean", 60000.00, 1, false, new Date());
		Boleto boleto1 = new Boleto(1, "142536", 20000.0);
		
		boletos.add(boleto1);
		
		ProcessadorBoleto processaBoleto = new ProcessadorBoleto();
	}
	
	@Test
	public void testFaturaPagaError() {
		processadorBoleto.pagar(boletos, fatura);
		
		assertFalse(fatura.foiPago());
	}

	@Test
	public void testFaturaPagaSucesso() {
		Boleto boleto2 = new Boleto(1, "1267", 20000.0);
		Boleto boleto3 = new Boleto(1, "5802", 20000.0);
		
		boletos.add(boleto2);
		boletos.add(boleto3);
		
		processadorBoleto.pagar(boletos, fatura);
		
		assertTrue(fatura.foiPago());
	}
}