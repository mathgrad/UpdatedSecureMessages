package securemessages.encryption.main;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int integer = 0; integer < Constants.integerMap.size(); integer++) {
			System.out.println(integer + " the respective key: "
					+ Constants.integerMap.get(integer));
		}
		BigInteger test = new BigInteger("999");
		System.out.println(test.pow(101));
	}
}
