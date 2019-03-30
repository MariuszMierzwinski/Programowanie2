import encryption.EncryptDecrypt;
import encryption.ROT13;
import encryption.ROT18;
import encryption.ROT47;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EncryptionTest {

    /* @Override
     *//* public char[] encrypt(char[] text){
        char[] output = new char[text.length];
        for (int i=0;i<text.length;i++) {
            char c=text[i];
            if

        }return output;
    }*/
    @Test
    public void root13TestEnscyption2() {
        char[] text = "a".toCharArray();
        EncryptDecrypt encoder = new ROT13();
        char[] output = encoder.encrypt(text);
        assertEquals("Text doesn't match expected result.", "n", new String(output));
    }

   /* @Test
    public void root47TestEnscyption2() {
        char[] text = "123qreeqr".toCharArray();
        EncryptDecrypt encoder = new ROT47();
        char[] output = encoder.encrypt(text);
        assertEquals("Text doesn't match expected result.", "`abBC66BC", new String(output));
    }*/
    @Test
    public void root18TestEnscyptionDescryption() {
        char[] text = "Ala ma kota312749813275918)(**()&*^".toCharArray();
        EncryptDecrypt encoder = new ROT18();
        char[] output = encoder.encrypt(text);
        output = encoder.encrypt(output);
        assertEquals("Text doesn't match expected result.", "Ala ma kota312749813275918)(**()&*^", new String(output));
    }

    @Test
    public void root18TestEnscyption2() {
        char[] text = "132214986abc".toCharArray();
        EncryptDecrypt encoder = new ROT18();
        char[] output = encoder.encrypt(text);
        assertEquals("Text doesn't match expected result.", "687769431nop", new String(output));
    }


}