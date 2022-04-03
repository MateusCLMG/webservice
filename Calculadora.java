package br.ufrpe.dc.soa;

import javax.jws.WebService;
import java.lang.Math;

@WebService(targetNamespace = "http://soa.dc.ufrpe.br/", portName = "CalculadoraPort", serviceName = "CalculadoraService")
public class Calculadora {
	
	public float somar(float x, float y) {
		return x + y;
	}
	
	public float sub(float x, float y) {
		return x - y;
	}
	
	public float mult(float x, float y) {
		return x * y;
	}
	
	public float div(float x, float y) {
		return x / y;
	}
	
	public float square(float x) {
		return x * x;
	}
	
	public double squarert(double x) {
		return Math.sqrt(x);
	}
	
	public int fatorial(int x) {
		int y = 1;
		while(x>0) {
			y = y * x;
			--x;
		}
		return y;
	}
		
	public float potenciaXY(float x, float y) {
		float z = 1;
		while(y>1) {
			z = x * x;
		}
		return z;
	}
	
	public double sin(double x) {
		return Math.sin(x);
	}

}
