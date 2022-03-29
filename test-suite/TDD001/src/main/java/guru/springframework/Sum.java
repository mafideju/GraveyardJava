package guru.springframework;

public class Sum {
    Expression augmend;
    Expression addmend;

    public Sum(Sum sum, Expression addmend) {}

    public Sum(Money augmend, Money addmend) {
        this.augmend = (Expression) augmend;
        this.addmend = (Expression) addmend;
    }

    //    @Override
//    public Money reduce(Bank bank, String to) {
//        int amount = augmend.reduce(bank, to).amount + addmend.reduce(bank, to).amount;
//        return new Money(amount, to);
//    }
//
//    @Override
    public Expression plus(Expression addend) {
        return (Expression) new Sum(this, addmend);
    }
//
//    @Override
    public Expression times(int multiplier) {
        return (Expression) new Sum((Money) augmend.times(multiplier), (Money) addmend.times(multiplier));
    }
}
