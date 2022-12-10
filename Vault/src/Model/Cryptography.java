package Model;

import org.jasypt.util.text.BasicTextEncryptor;

public class Cryptography {
    public static String criptografa(String senha) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPasswordCharArray("vault-senha".toCharArray());
        String novaSenha = senha.concat("vault");
        
        senha = encryptor.encrypt(novaSenha);

        return senha;
    }

    public static String descriptografa(String senhaCriptografada) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPasswordCharArray("vault-senha".toCharArray());

        String senhaDescriptografada = encryptor.decrypt(senhaCriptografada);

        senhaDescriptografada = senhaDescriptografada.substring(0, senhaDescriptografada.length()-5);

        return senhaDescriptografada;
    }
}
