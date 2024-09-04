
public class TextFileTester {

	public static void main(String[] args) {
		// (put some text file into your project) 
		// TextFile tf = new TextFile("abc.txt");
		//
		// System.out.println(tf.getWords());
		// System.out.println(tf.getWordFrequencies());
		// System.out.println(tf.getLetterFrequencies());
		
		
		TextFile tf = new TextFile("C:\\Users\\Karuna\\Desktop\\Hello.txt");
		System.out.println(tf.getWords());
		System.out.println(tf.getWordFrequencies());
		System.out.println(tf.getLetterFrequencies());
		
	}
}
