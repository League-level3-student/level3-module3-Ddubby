package _00_Text_Funkifier;

public class CustomString extends SpecialString {
	public CustomString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			String slice = s.substring(i, i + 1);
			if (slice.contains("a")) {
				result += "@";
			} else {
				result += slice;
			}
		}
		System.out.println(result);
		return result;
	}
}
