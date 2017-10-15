package chp.primitives;

public class HexUtil {	
	
	private final static char[] hexArray = "0123456789ABCDEF".toCharArray(); // All possible HEX symbols

	public String bytesToHexStr(byte[] bytes) {

		char[] hexChars = new char[bytes.length * 2];
		for (int j = 0; j < bytes.length; j++) {
			// The hex literal 0xFF is equal to int(255). Java represents int as 32 bits. It
			// look like this in binary: 00000000 00000000 00000000 11111111
			int v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];// Bit shift to the right by 4 bits. NOTE: The unsigned right shift
												// operator ">>>" shifts a zero into the leftmost position
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		
		//formating logic - simply space hex out by pairs
		StringBuilder sb = new StringBuilder(new String(hexChars));
		int j = 0;
		for (int i = 2; i < sb.length(); i += 2) {
		    if(!(i+j>=sb.length())) {
			  sb.insert(i+j, ' ');
		    }
		    j++;
		}
		
		return sb.toString();

	}
	
}
