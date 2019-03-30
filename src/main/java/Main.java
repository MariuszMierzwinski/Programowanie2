import encryption.EncryptDecrypt;
import encryption.ROT13;
import encryption.ROT18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        run();

    }
    private static void run(){
        List<EncryptDecrypt> list= new ArrayList<>();
        EncryptDecrypt root13 = new ROT13();
        EncryptDecrypt root18 = new ROT18();
        list.add(root13);
        list.add(root18);
        for (EncryptDecrypt encryptorDescryptor: list) {
            System.out.println();

        }
    }
}