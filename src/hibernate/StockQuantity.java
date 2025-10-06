package hibernate;

public class StockQuantity {

    private int wholeQty;
    private double loseQty;

    public StockQuantity(int wholeQty, double loseQty) {
        this.wholeQty = wholeQty;
        this.loseQty = loseQty;
    }

    public int getWholeQty() {
        return wholeQty;
    }

    public double getLoseQty() {
        return loseQty;
    }

    @Override
    public String toString() {
        return "StockQuantity{"
                + "wholeQty=" + wholeQty
                + ", loseQty=" + loseQty
                + '}';
    }
}
