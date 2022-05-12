package encodeDecode;

import java.util.Base64;

public class MimeEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base64.Encoder encoder=Base64.getMimeEncoder();
		String message="This is important warning";
		String encodeName=encoder.encodeToString(message.getBytes());
		System.out.println("Encoded warning "+encodeName);
		Base64.Decoder decoder=Base64.getMimeDecoder();
		String decodeName=new String(decoder.decode(encodeName));
		System.out.println("Decoded warning: "+decodeName);

	}

}
