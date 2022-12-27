package lr5;

public class example2 {
    public static void main(String[] args) {
    symbol_output symbol = new symbol_output();
    symbol.setSymbol('A', 'D');
    symbol.getSymbol();
    }
}
class symbol_output {
    private char symbol_1, symbol_2;
     public void setSymbol(char symbol_1, char symbol_2) {
        this.symbol_1 = symbol_1;
        this.symbol_2 = symbol_2;
    }
    public void getSymbol() {
    if (symbol_1 < symbol_2){
        for (int i = symbol_1; i <= symbol_2; i++){
            System.out.print((char) i + " ");
        }
    }
    }

}
