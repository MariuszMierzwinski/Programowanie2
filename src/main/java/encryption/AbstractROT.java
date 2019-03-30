package encryption;

public abstract class AbstractROT implements EncryptDecrypt {


    public char[] forArray(char[] text) {
        char[] output = text;


        for (int i = 0; i < text.length; i++) {
            char c = text[i];

            output[i] = conertCharacter(c);
        }
        return output;
    }

    protected abstract char conertCharacter(char c);

    public char[] encrypt(char[] text) {
        return forArray(text);
    }

    public char[] decrypt(char[] text) {
        return forArray(text);
    }
}