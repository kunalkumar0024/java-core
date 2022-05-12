package encodeDecode;

import java.util.Base64;

public class EncryptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Base64.Encoder encoder = Base64.getEncoder();  
		    String str = encoder.encodeToString("Kunal Singh".getBytes());  
	        System.out.println("Encoded string: "+str);  
	        // Getting decoder  
	        Base64.Decoder decoder = Base64.getDecoder();  
	        // Decoding string  
	        String dStr = new String(decoder.decode(str));  
	        System.out.println("Decoded string: "+dStr);  
	        
	        String str1="S3VuYWwgU2luZ2g=";
	        String dStr1 = new String(decoder.decode(str1));
	        System.out.println("Decoded string: "+dStr1); 
	        
	        
	        Base64.Encoder encoder1 = Base64.getUrlEncoder();  
	        // Encoding URL  
	        String eStr = encoder1.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());  
	        System.out.println("Encoded URL: "+eStr);  
	        // Getting decoder  
	        Base64.Decoder decoder1 = Base64.getUrlDecoder();  
	        // Decoding URl  
	        String dStr2 = new String(decoder1.decode(eStr));  
	        System.out.println("Decoded URL: "+dStr2);  
		
	}

}
