package serializer;

import es.uniovi.asw.parser.Parser;
import es.uniovi.asw.parser.ParserGIFT;

public class ParserBuilder {
	public static Parser build(String inputFilePath, String inputFileFormat) {
		Parser p = new ParserGIFT(inputFilePath);
		if (inputFileFormat.equalsIgnoreCase("gift"))
			p = new ParserGIFT(inputFilePath);
		return p;
	}
}
