package encryption;

public class ROT13 extends AbstractROT {
    char[] passwd;
    public ROT13() {

    }

    public char conertCharacter(char c){

        if       (c >= 'a' && c <= 'm') return c += 13;
        else if  (c >= 'A' && c <= 'M') return c += 13;
        else if  (c >= 'n' && c <= 'z') return c -= 13;
        else if  (c >= 'N' && c <= 'Z') return c -= 13;
        return c;
    }

}
