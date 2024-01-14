package poly.ex8_pay.pay1;

// null object pattern
public class DefaultPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("기본 페이입니다. amount = " + amount);

        return false;
    }
}
