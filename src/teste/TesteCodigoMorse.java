package teste;


import static org.junit.Assert.*;

import org.junit.Test;

import main.PalavraCodigo;


public class TesteCodigoMorse {

	/*
	
	
	
	
	
	
	
	*/
	
	@Test
	public void testeCodificaMorse(){
		PalavraCodigo a = new PalavraCodigo(1,"Bernardo Dill") ;
		assertEquals("-... . .-. -. .- .-. -.. ---   -.. .. .-.. .-.. ", a.codifica());
	}
	
	@Test
	public void testeDecodificaMorse(){
		PalavraCodigo b = new PalavraCodigo(1,"-... . .-. -. .- .-. -.. ---   -.. .. .-.. .-..") ;
		System.out.println(b.decodifica());
		assertEquals(" BERNARDO DILL", b.decodifica());
	}
	
	@Test
	public void testeCodificaLeet(){
		PalavraCodigo c = new PalavraCodigo(2, "Bernardo Dill");
		assertEquals("|: & 12 /V @ 12 I> ()    I> ! 1_ 1_ ",c.codifica());
	}
	
	@Test
	public void testeDecodificaLeet(){
		PalavraCodigo d = new PalavraCodigo(2, "|: & 12 /V @ 12 I> ()   I> ! 1_ 1_");
		assertEquals(" BERNARDO DILL", d.decodifica());
	}
	
}
