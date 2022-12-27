package lr5;

public class example1 {
    public static void main(String[] args) {
        symbol mySymbol = new symbol();
        mySymbol.setSymbol('Z');
        mySymbol.printSymbol();
    }
}
    class symbol {
    private char symbol;

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    public int getSymbol() {
        return symbol;
    }
    public void printSymbol() {
        System.out.println("Символ: " + symbol);
        int cod = symbol;
        System.out.println("Код символа: " + cod);
    }
}
