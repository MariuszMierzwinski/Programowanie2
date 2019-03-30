package encryption;

public class ROT47 extends AbstractROT  {
    public char conertCharacter(char c){

        if       (c >= '!' && c <= '}') return c += 47;
        else if  (c >= '"' && c <= '~') return c -= 47;
        return c;
    }
}
