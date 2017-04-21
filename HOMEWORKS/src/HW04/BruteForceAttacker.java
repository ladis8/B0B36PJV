
package HW04;



public class BruteForceAttacker extends Thief {

    private char [] pass;
    private int sizeOfPassword;

    @Override
    public void breakPassword(int sizeOfPassword) {
        // write your code
        this.sizeOfPassword =sizeOfPassword;
        //System.out.println(sizeOfPassword);

        if (breakpass(0,new char[sizeOfPassword])){
            //print (pass);
            return;
        }

    }

    private void print (char []symb){
        for (char chr :symb){
            System.out.print(chr);
        }
        System.out.println();
    }

    private boolean breakpass (int depth, char [] symbols){
        if (depth == sizeOfPassword){
            //print (symbols);
            if (super.tryOpen(symbols)){
                pass = symbols;
                return true;
            }
            else{
                return false;
            }
        }
        else{
            for (char symbol: super.getCharacters()){
                symbols [depth]= symbol;
                if (breakpass(depth+1, symbols))
                    return true;
            }
        }
        return false;
    }
    
}
