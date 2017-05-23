package scanner;

import java.util.Scanner;

class SimpleWordProcessor {

	public static void main(String args[]){

		String s;
		Scanner in = null;
		try{
			in= new Scanner(System.in);
			while(true){
				System.out.print("Enter a string:");
				s = in.nextLine();

				if(s.equals("exit")){
					System.out.println("exiting ");
					break; // breaks out of the while loop
				}
				

				System.out.println("You entered string: "+ s);
				System.out.println();
				System.out.println("The strings characters are being added to Glyphs.");
				
				Document doc = new Document(); // Document Object
				GlyphFactory glyphFac = GlyphFactory.getInstance(); //Singleton GlyphFactory object
				
				//enchanced for loop to get characters in string
				for (Character ch : s.toCharArray()){
					doc.in(glyphFac.getGlyph(ch));	//adding characters and glyphs
				}
				System.out.print("Returning the Entered String - ");
				System.out.println(doc.toString()); //invoking toString to print
			}
		}finally{
			if(in != null){
				in.close();
			}
		}
	}
}


