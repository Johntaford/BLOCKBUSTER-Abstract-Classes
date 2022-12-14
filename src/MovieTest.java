import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MovieTest {

	@Test
	void testDVD () {
	ArrayList<String> TILLScenes = new ArrayList<>(Arrays.asList("TILL"));
		
		DVD dvd1 = new DVD("TILL", 130, TILLScenes);
		
		assertEquals(dvd1.toString(), new DVD("TILL", 130, TILLScenes).toString());
	}
	
	@Test
	void testDVDTitleSetter() {
		
		ArrayList<String> TILLScenes = new ArrayList<>(Arrays.asList("TILL"));
		
		DVD dvd1 = new DVD("TILL", 130, TILLScenes);
		dvd1.setTitle("P");
		
		assertEquals("P", dvd1.getTitle());
	}
	
	@Test
	void testDVDRuntimeSetter() {
		
		ArrayList<String> TILLScenes = new ArrayList<>(Arrays.asList("TILL"));
		
		DVD dvd1 = new DVD("UNTILL", 130, TILLScenes);
		dvd1.setRunTime(130);
		
		assertEquals(130, dvd1.getRunTime());
	}
	
	@Test
	void testVHSInstanceCreation() {
		
		ArrayList<String> TILLScenes = new ArrayList<>(Arrays.asList("TILL"));
		
		VHS vhs1 = new VHS("TILL", 130, TILLScenes);
		
		assertEquals(vhs1.toString(), new VHS("TILL", 130, TILLScenes).toString());
	}
	
	@Test
	void testVHSTitleSetter() {
		
		ArrayList<String> TILLScenes = new ArrayList<>(Arrays.asList("TILL"));
		
		VHS vhs1 = new VHS("TILL", 130, TILLScenes);
		vhs1.setTitle("A");
		
		assertEquals("A", vhs1.getTitle());
	}
	
	@Test
	void testVHSRuntimeSetter() {
		
		ArrayList<String> TILLScenes = new ArrayList<>(Arrays.asList("TILL"));
		
		VHS vhs1 = new VHS("TILL", 130, TILLScenes);
		vhs1.setRunTime(130);
		
		assertEquals(130, vhs1.getRunTime());
	}
	
	@Test
	void testVHSCurrentTimeSetPoint() {
		
		ArrayList<String> TILLScenes = new ArrayList<>(Arrays.asList("TILL"));
		
		VHS vhs1 = new VHS("TILL", 130, TILLScenes);
		
		assertEquals(0, vhs1.getCurrenttime());
	}
	
	@Test
	void testVHSPlayMethod() {
		
		ArrayList<String> TILLScenes = new ArrayList<>(Arrays.asList("TILL"));
		
		VHS vhs1 = new VHS("TILL", 130, TILLScenes);
		vhs1.play();
		vhs1.play();
		vhs1.play();
		
		assertEquals(0, vhs1.getCurrenttime());
	}
	
	
	@Test
	void testVHSrewindMethod() {
		
		ArrayList<String> TILLScenes = new ArrayList<>(Arrays.asList(" TILL"));
		
		VHS vhs1 = new VHS("TILL", 130, TILLScenes);
		vhs1.setRunTime(3);
		vhs1.rewind();
		
		
		assertEquals(0, vhs1.getCurrenttime());
	}
	
	@Test
	void testVHSrewindMethod1() {
		
		ArrayList<String> TILLScenes = new ArrayList<>(Arrays.asList("TILL"));
		
		VHS vhs1 = new VHS("TILL", 130, TILLScenes);
		vhs1.play();
		vhs1.play();
		vhs1.play();
		vhs1.play();
		
		assertEquals(0, vhs1.getCurrenttime());
		
	}

}