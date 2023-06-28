public class Practice {

    private String sentence;
    private StringBuffer StrBuff;
    private String words[];
    private String reverse;

    public Practice() {
        sentence = "";
        StrBuff = new StringBuffer();
        reverse = "";
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void compute() {
        int wordCount = 0;

        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) == ' ') {
                wordCount = wordCount + 1;
            }
        }

        words = new String[wordCount + 1];
        int index = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == ' ') {
                words[index] = StrBuff.toString();
                StrBuff = new StringBuffer();
                index++;
            } else {
                StrBuff.append(c);
            }
        }
        words[index] = StrBuff.toString();
        StrBuff = new StringBuffer();

        for (int i = words.length - 1; i >= 0; i--) {

            reverse = reverse + " " + words[i];

        }

        for (int i = 0; i < reverse.length(); i++) {
            if (i == 1) {
                StrBuff.append(Character.toUpperCase(reverse.charAt(i)));
            } else {
                StrBuff.append(reverse.charAt(i));
            }
        }

        reverse = StrBuff.toString();
    }

    public String getReverse() {
        return reverse;
    }

}