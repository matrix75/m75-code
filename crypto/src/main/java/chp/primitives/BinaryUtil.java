package chp.primitives;

public class BinaryUtil {

	public String bytesToBinaryStr(byte[] bytes) {
		// https://stackoverflow.com/questions/38490760/how-to-print-bitset-as-series-of-bits
		StringBuilder binary = new StringBuilder();
		for (byte b : bytes) {
			int val = b;
			for (int i = 0; i < 8; i++) {
				binary.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}
			binary.append(' ');
		}

		return binary.toString();
	}

	public String bytesToBinaryStr2(byte[] bytes) {
		// https://stackoverflow.com/questions/11528898/convert-byte-to-binary-in-java
		StringBuilder binary = new StringBuilder(bytes.length * Byte.SIZE);
		for (int i = 0; i < Byte.SIZE * bytes.length; i++) {
			if (i % 8 == 0 && i != 0) {
				binary.append(' ');
			}
			// 0x80 is hex. is 128 decimal. Prefix 0x indicates HEX
			binary.append((bytes[i / Byte.SIZE] << i % Byte.SIZE & 0x80) == 0 ? '0' : '1'); 																				
		}

		return binary.toString();
	}

	public String bytesToBinaryStr3(byte[] bytes) {
		// https://stackoverflow.com/questions/6393873/how-to-get-the-binary-values-of-the-bytes-stored-in-byte-array
		StringBuilder binary = new StringBuilder(bytes.length * Byte.SIZE);
		for (byte b : bytes) {
			binary.append((Integer.toBinaryString(b & 255 | 256).substring(1)));
			binary.append(' ');
		}

		return binary.toString();
	}
}
