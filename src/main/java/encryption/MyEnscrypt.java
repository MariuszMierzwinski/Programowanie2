package encryption;

public class MyEnscrypt implements EncryptDecrypt {
    private final char[] paswd;

    public MyEnscrypt(char[] paswd) {
        this.paswd = paswd;
    }

    private int iterator( int i) {
        return i % paswd.length;

    }

    @Override
    public char[] encrypt(char[] text) {
        char[] output = text;
        for (int i = 0; i < text.length; i++) {
            if (i % 2 == 0) {
                output[i] = (char) (output[i] + paswd[iterator( i)]);
            } else {
                output[i] = (char) (output[i] - paswd[iterator( i)]);
            }

        }
        return output;

    }


    @Override
    public char[] decrypt(char[] text) {
        return new char[0];
    }
}
