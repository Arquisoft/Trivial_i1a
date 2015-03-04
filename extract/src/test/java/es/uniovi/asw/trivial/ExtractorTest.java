package es.uniovi.asw.trivial;

import static org.assertj.core.api.Assertions.*;

import java.io.FileNotFoundException;
import java.net.UnknownHostException;

import org.junit.Test;

import es.uniovi.asw.parser.Extractor;

public class ExtractorTest {
	
	@Test
	public void emptyExtractor() throws UnknownHostException, FileNotFoundException {
		String args[] = {};
		Extractor ext = new Extractor();
	    assertThat(ext.run(args)).isEqualTo(0);
	  }

}
