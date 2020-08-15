public class PlugBoard {
    private char[] alph = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private char[] new_alph = new char[26];
    public String h = "";

    PlugBoard(String al){
        h = al;

    }

    public String LetterChange(String letter){
        for (int i = 0; i < h.length(); i++){
            new_alph[i] = h.charAt(i);
        }
        String res = "";
        for (int j = 0; j < letter.length(); j++){
            if (Character.isLetter(letter.charAt(j))){
                for (int i = 0; i < alph.length; i++){
                    if (alph[i] == letter.charAt(j)){
                        res += new_alph[i];
                        break;
                    }
                }
            }
            else{
                res += letter.charAt(j);
            }
        }
        return res;
    }
}
