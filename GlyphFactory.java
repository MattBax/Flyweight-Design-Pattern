package scanner;

import java.util.HashMap;

//a flyweight class implemented as a singleton
public class GlyphFactory {
	
	private static GlyphFactory instance = new GlyphFactory(); //Singleton
	private HashMap<Character, Glyph> glyphMap = new HashMap<Character, Glyph>(); //Collection to hold glyphs and characters
	
	
	//Default Constructor
	private GlyphFactory(){
		
	}

	public static GlyphFactory getInstance(){
	
	return instance;	
	}
	
	// return corresponding glyph
	public Glyph getGlyph(Character character){
		Glyph glyph = glyphMap.get(character);
		
		// if the glyph does not exist
		if(glyph == null){
			
			glyph = new Glyph(character);
			glyphMap.put(character, glyph);
		}
		
		return glyph;
	}

}
