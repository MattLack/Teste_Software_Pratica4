package test.lift;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLift6 {

	/**
	 * Testa os parâmetros do contrutor Lift
	 */
	
	@Test
	public void testConstructor() {
		Lift l = new Lift(0);
		assertEquals("Numero incorreto TopFloor", 0, l.getTopFloor());
		assertEquals("Numero incorreto CurrentFloor", 0, l.getCurrentFloor());
		assertEquals("Numero incorreto Capacity", 10, l.getCapacity());
		assertEquals("Numero incorreto NumRiders", 0, l.getNumRiders());
	}
	
	/**
	 * Testa os parâmetros addriders e isfulll
	 */
	
	@Test
	public void TestAdd10RidersAndIsFull(){
		
		Lift l = new Lift(0);
		l.addRiders(10);

		assertEquals("Numero incorreto NumRiders", 10, l.getNumRiders());
		if(l.isFull() == false){
			fail("Not is Full " + l.getNumRiders() + " =! " +l.getCapacity());
		}
	
	}
	
	
	/**
	 * Testa o parâmetro AddRiders 
	 * Enviando como entrada um número acima da capacidade
	 */
	
	@Test
	public void TestAdd11Riders(){
		
		Lift l = new Lift(0);
		l.addRiders(11);

		assertEquals("Numero incorreto NumRiders", 10, l.getNumRiders());
	
	}
	
	
	/**
	 * Testa os Parâmetros GoUp e GoDown
	 * Inicializando o TopFloor com o valor 2
	 */
	@Test
	public void TestGoUp0to1AndDown(){
		Lift l = new Lift(2);
		l.goUp();
		assertEquals("Numero incorreto CurrentFloor", 1, l.getCurrentFloor());
		l.goDown();
		assertEquals("Numero incorreto CurrentFloor", 0, l.getCurrentFloor());

	}
	
	/**
	 * Testa o parâmetro call
	 */
	
	@Test
	public void TestCall(){
		
		Lift l = new Lift(15);
		l.call(15);
		assertEquals("Numero incorreto CurrentFloor", 15, l.getCurrentFloor());
		
	}
	


}
