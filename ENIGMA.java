public class ENIGMA {

    public Rotor r1 = new Rotor(0);
    public Rotor r2 = new Rotor(0);
    public Rotor r3 = new Rotor(0);
    public PlugBoard p = new PlugBoard("");

    ENIGMA(int p1, int p2, int p3, String nalph){
        r1.position = p1;
        r2.position = p2;
        r3.position = p3;
        p.h = nalph;

    }

    public  String MessCode(String baseMess){
        return p.LetterChange(r3.Code(r2.Code(r1.Code(baseMess))));
    }

    public  String MessDecode(String baseMess){
        return r1.DeCode(r2.DeCode(r3.DeCode(p.LetterChange(baseMess))));
    }
}