package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestCuenta {

	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(1, 1);
		CuentaAhorros ca = new CuentaAhorros(2, 3);
		cc.deposita(2000);
		cc.transfiere(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
	
}
