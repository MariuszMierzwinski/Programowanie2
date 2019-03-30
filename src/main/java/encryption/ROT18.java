package encryption;

public class ROT18 extends AbstractROT {

    public ROT18() {

    }


    public char conertCharacter(char c) {
        if (Character.isLetter(c)) return new ROT13().conertCharacter(c);
        if ((c >= '0') && (c < '5')) return c += 5;
        if ((c >= '5') && (c <= '9')) return c -= 5;
        return c;

    }


}

