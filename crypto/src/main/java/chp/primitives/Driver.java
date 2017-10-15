package chp.primitives;

public class Driver {

	//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
	
	public static void main(String[] args) {
		HexUtil hex = new HexUtil();
		BinaryUtil binary = new BinaryUtil();
		
		String initalString = "1234";
		System.out.println("Char String: " + initalString);
		
		byte[] byteArray = initalString.getBytes();
		System.out.println("ByteArray Size:" + byteArray.length);
		
		//Hex methods
		String hexString = hex.bytesToHexStr(byteArray);
		System.out.println("HEX form: size: "+hexString.replaceAll("\\s+","").length()+": " + hexString);

		//Binary methods:
		String binaryString1 = binary.bytesToBinaryStr(byteArray);
		System.out.println("Binary form1: size:"+binaryString1.replaceAll("\\s+","").length() +": " +binaryString1);

		String binaryString2 = binary.bytesToBinaryStr2(byteArray);
		System.out.println("Binary form2: size:"+binaryString2.replaceAll("\\s+","").length() +": " +binaryString2);
		
		String binaryString3 = binary.bytesToBinaryStr3(byteArray);
		System.out.println("Binary form3: size:"+binaryString3.replaceAll("\\s+","").length() +": " +binaryString3);



	}

}
