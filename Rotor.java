public class Rotor {
    private char[] alph = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public int position = 2;

    Rotor(int pos1){
        position = pos1;
    }

    private void pos_remaster(){
        position++;
        position = position%26;
    }

    private int forwcode(char Letter){
        int c = 0;
        for (int i = 0; i < 26; i++){
            if (Letter == alph[i]){
                c = i;
                break;
            }
        }
        c = c+position;
        c = c%26;
        return c;
    }

    private int decode(char Letter){
        int c = 0;
        for (int i = 0; i < 26; i++){
            if (Letter == alph[i]){
                c = i;
                break;
            }
        }
        c = c-position+26;
        c = c%26;
        return c;
    }

    public String Code(String Message){
        String res = "";

        for (int i = 0; i < Message.length(); i++){
            char curr = Message.charAt(i);
            if (Character.isLetter(curr)) {
                res += alph[forwcode(curr)];
            }
            else{
                res += curr;
            }
            pos_remaster();

        }

        position -= Message.length();
        return res;
    }

    public String DeCode(String Message){
        String res = "";
        for (int i = 0; i < Message.length(); i++){
            char curr = Message.charAt(i);
            if (Character.isLetter(curr)){
                res += alph[(decode(curr))];
            }
            else{
                res += curr;
            }
            pos_remaster();
        }
        position -= Message.length();
        return res;
    }
}
