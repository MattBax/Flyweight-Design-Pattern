package scanner;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GlyphTester {

	GlyphFactory factory = GlyphFactory.getInstance();
	Document doc = new Document();
	String testString;
	
	@Before
	public void setUp() throws Exception {
		
		testString = "Test"; //assigning a value
	}

	//testing toString() method
	@Test
	public void testString() {
		
		for (Character c : testString.toCharArray()){
			
			doc.in(factory.getGlyph(c));
		}
			
			String returnString = doc.toString();
			
			assertEquals(returnString, testString);
		}
	
	//testing that a single instance of GlyphFactory is always created
	@Test
	public void testSingleton(){

		GlyphFactory testFactory = GlyphFactory.getInstance();
		
		assert(testFactory.equals(factory));
	}
	
	

}