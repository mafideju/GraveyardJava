package guru.springframework;

import java.util.Objects;

public class Dollar {

    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public int times(int multiplier) {
        return amount = multiplier * amount;
    }

    public int plus(int summer) {
        return amount = summer + amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dollar)) return false;
        Dollar dollar = (Dollar) o;
        return getAmount() == dollar.getAmount();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAmount());
    }
}
