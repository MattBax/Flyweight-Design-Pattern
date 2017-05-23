package scanner;

import java.util.*;

public class Document {
	
	private String fullWord = "";
	private LinkedList<Glyph> docList = new LinkedList<Glyph>(); //Collection to hold glyph objects
	GlyphFactory fact = GlyphFactory.getInstance(); //Singleton instance
	
	//adds glyphs to List
	public void in (Glyph glyph){
		docList.add(glyph);
	}
	
	// Overridden toString method
	public String toString(){
	
		
		for (Glyph g : docList){
			
			fullWord += g.getG();
		}
		
		return fullWord;
	}

}
