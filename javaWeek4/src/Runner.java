package javaWeek4;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MorseCodeTranslator translator = new MorseCodeTranslator();
		System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.- /"));
		System.out.println(translator.translate("- .... .. ... / .. ... / .- / - . ... -"));
	}

}
