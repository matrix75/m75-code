package chp.crypto.examples;

public class Hex {

	private final static char[] hexArray = "0123456789ABCDEF".toCharArray(); //All possible HEX symbols
	
    public static void main( String[] args )
    {
    	bytesToHex("Hello World!".getBytes());
    	
    }
	
	public static String bytesToHex(byte[] bytes) {
		
	    char[] hexChars = new char[bytes.length * 2];
	    for ( int j = 0; j < bytes.length; j++ ) {
	    	//The hex literal 0xFF is equal to int(255). Java represents int as 32 bits. It look like this in binary: 00000000 00000000 00000000 11111111
	        int v = bytes[j] & 0xFF;
	        hexChars[j * 2] = hexArray[v >>> 4];//Bit shift to the right by 4 bits. NOTE: The unsigned right shift operator ">>>" shifts a zero into the leftmost position
	        hexChars[j * 2 + 1] = hexArray[v & 0x0F];
	    }
	    return new String(hexChars);
	
}
}
