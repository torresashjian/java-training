package arrays;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class UrlifyTest{
	@Test
	public void testUrilify(){
		Urlify uf = new Urlify();
		Character[] url = new Character[]{' ','H','E',' ',null, null, null, null};
		Character[] result = uf.urlify(url);
		assertEquals(new Character('%'), result[0]);
		assertEquals(new Character('2'), result[1]);
		assertEquals(new Character('0'), result[2]);
		assertEquals(new Character('H'), result[3]);
		assertEquals(new Character('E'), result[4]);
		assertEquals(new Character('%'), result[5]);
		assertEquals(new Character('2'), result[6]);
		assertEquals(new Character('0'), result[7]);
	}
}