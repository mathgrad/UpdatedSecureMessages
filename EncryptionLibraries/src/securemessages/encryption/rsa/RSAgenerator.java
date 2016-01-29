/**
 * 
 */
package securemessages.encryption.rsa;

import java.math.BigInteger;

import securemessages.encryption.main.*;

/**
 * The purpose of this class is to generate the important public and private key
 * of RSA to be used with application to application communication
 * 
 * @author Joshua
 * 
 */
public class RSAgenerator extends Constants {

	private BigInteger encryptor;
	private BigInteger decryptor;
	private BigInteger modulous;
	private int p;
	private int q;
	private int n;
	private int pin;
	private int e;
	private int d;

	/**
	 * Constructor, it goes through the process of generating a general RSA key,
	 * based on the blockSize: Either size 2 or 3;
	 * 
	 * @param blockSize
	 *            ==2 || ==3
	 */
	public RSAgenerator(int blockSize) {

		if (blockSize == 3) {
			generateKeyForBlockThree();
		} else if (blockSize == 2) {
			generateKeyForBlockTwo();
		}
	}

	private void generateKeyForBlockTwo() {
		p = generator.nextInt(primeListForBlockLengthTwo.size());
		q = generator.nextInt(primeListForBlockLengthTwo.size());
		p = primeListForBlockLengthTwo.get(p);
		q = primeListForBlockLengthTwo.get(q);
		n = p * q;
		pin = (p - 1) * (q - 1);
		e = 0;

		createEncryptor();
		createDecryptor();

		encryptor = new BigInteger(String.valueOf(e));
		decryptor = new BigInteger(String.valueOf(d));
		modulous = new BigInteger(String.valueOf(n));
	}

	private void generateKeyForBlockThree() {
		p = generator.nextInt(primeListForBlockLengthThree.size());
		q = generator.nextInt(primeListForBlockLengthThree.size());
		p = primeListForBlockLengthThree.get(p);
		q = primeListForBlockLengthThree.get(q);
		n = p * q;
		pin = (p - 1) * (q - 1);
		e = 0;

		createEncryptor();
		createDecryptor();

		encryptor = new BigInteger(String.valueOf(e));
		decryptor = new BigInteger(String.valueOf(d));
		modulous = new BigInteger(String.valueOf(n));
	}

	private void createEncryptor() {
		while (true) {
			e = generator.nextInt(generalPrimeList.size());
			e = generalPrimeList.get(e);

			if (e < pin && gcdIsZero()) {
				break;
			}
		}
	}

	private boolean gcdIsZero() {
		BigInteger eB = new BigInteger(String.valueOf(e));
		BigInteger pinB = new BigInteger(String.valueOf(pin));
		BigInteger gcd = pinB.gcd(eB);
		return gcd.intValue() == 0;
	}

	private void createDecryptor() {
		d = 0;

		while (e * d % pin == 1) {
			d++;
		}
	}

	public BigInteger getEncryptor() {
		return encryptor;
	}

	public BigInteger getDecryptor() {
		return decryptor;
	}

	public BigInteger getModulous() {
		return modulous;
	}
}
