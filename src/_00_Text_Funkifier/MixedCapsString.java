package _00_Text_Funkifier;

import java.util.Random;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			String slice = s.substring(i, i + 1);
			Random random = new Random();
			int num = random.nextInt(2);
			if (num == 1) {
				result += slice.toLowerCase();
			}
			if (num == 0) {
				result += slice.toUpperCase();
			}
		}
		return result;
	}

}
