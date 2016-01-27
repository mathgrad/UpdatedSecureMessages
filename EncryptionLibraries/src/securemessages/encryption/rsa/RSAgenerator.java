/**
 * 
 */
package securemessages.encryption.rsa;

import java.math.BigInteger;

import securemessages.encryption.main.*;

/**
 * The purpose of this class is to generate the important public and private key
 * to be used with application to application communication
 * 
 * @author Joshua
 * 
 */
public class RSAgenerator extends Constants {

	private BigInteger encryptor;
	private BigInteger decryptor;

	public RSAgenerator() {

	}

	public void generateKey() {
		createDecryptor();
	}

	private void createDecryptor()
	{
		Math.random();
	}
}
