public class Main {
    public static void main(String[] args) {
    CreditPaymentService service = new CreditPaymentService();
    double annuityPayment = service.calculate(1_000_000, 9.99, 36);
        System.out.println(annuityPayment);
    }
}
