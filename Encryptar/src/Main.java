import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static String encrypToSHA256(String input){
        try{
            //crear instancia del algoritmo SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-512");

            //Aplicar el algoritmo al texto ingresado
            byte[] hash = digest.digest(input.getBytes("utf-8"));
            //CONVERTIR EL HASH EN UNA RESPRESENTACION HEXADECIMAL
            StringBuilder hexString = new StringBuilder();
            for(byte b : hash){
                String hex = Integer.toHexString(0xff & b);
                if(hex.length() == 1)
                    hexString.append('0');
                hexString.append(hex);


            }
            return hexString.toString();
        }catch (Exception e){
            throw new RuntimeException("Error al encriptar con SHA-256", e);
        }
    }
    //Eejemplo de uso
    public static void main (String[]args){
        String texto = "HolaMundo";
        String hash = encrypToSHA256(texto);
        System.out.println("texto original: " + texto);
        System.out.println("Hash SHA-256: "+ hash);

    }
}
