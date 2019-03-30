package encryption;

public class MyEnscrypt implements EncryptDecrypt {
    private final char[] paswd;

    public MyEnscrypt(char[] paswd) {
        this.paswd = paswd;
    }
    private int iterator(char[] text,int i){
        return (text.length>paswd.length) ? i%paswd.length:i;

    }

    @Override
    public char[] encrypt(char[] text) {
        char[] output = text;
        for (int i = 0; i < text.length; i++) {
            if (i < paswd.length) {
                if (i % 2 == 0) {
                    output[i] = (char) (output[i] + paswd[i]);
                } else output[i] = (char) (output[i] - paswd[i]);
            } else if (i % 2 == 0) {
                output[i] = (char) (output[i] + paswd[iterator(text,i)]);
            } else {
                output[i] = (char) (output[i] - paswd[iterator(text,i)]);
            }

        }
        return output;

    }


    @Override
    public char[] decrypt(char[] text) {
        return new char[0];
    }
}
