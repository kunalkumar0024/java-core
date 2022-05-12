package encodeDecode;

import java.util.Base64;

public class UrlEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base64.Encoder encoder=Base64.getUrlEncoder();
		String encodeName=encoder.encodeToString("https://www.google.com/".getBytes());
		System.out.println("Encoded URL "+encodeName);
		Base64.Decoder decoder=Base64.getUrlDecoder();
		String decodeName=new String(decoder.decode(encodeName));
		System.out.println("Decoded URL: "+decodeName);

	}

}
