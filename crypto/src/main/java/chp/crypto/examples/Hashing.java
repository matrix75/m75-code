package chp.crypto.examples;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Simple Hashing examples
 */
public class Hashing 
{
    public static void main( String[] args )
    {
    	Hashing app = new Hashing();
    	app.hash("Hello World!");
    	
    }

	private void hash(String strToHash) {
		MessageDigest digest;
		try {
			System.out.println("String to Hash: "+strToHash);
			digest = MessageDigest.getInstance("SHA-256");
			byte[] byteHash = digest.digest(strToHash.getBytes(StandardCharsets.UTF_8));
			//System.out.println("Raw Bytes: "+byteHash);
			
			
	        //convert the byte to hex format method 1
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < byteHash.length; i++) {
	         sb.append(Integer.toString((byteHash[i] & 0xff) + 0x100, 16).substring(1));
	        }

	        System.out.println("Hex format (method 1): " + sb.toString());
			
	      //convert the byte to hex format method 2
	        StringBuffer hexString = new StringBuffer();
	    	for (int i=0;i<byteHash.length;i++) {
	    		String hex=Integer.toHexString(0xff & byteHash[i]);
	   	     	if(hex.length()==1) hexString.append('0');
	   	     	hexString.append(hex);
	    	}
	    	System.out.println("Hex format (method 2): " + hexString.toString());
			
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
