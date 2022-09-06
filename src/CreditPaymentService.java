public class CreditPaymentService {
    public double calculate (int loanAmount, double percent, int loanTerm) {
        double monthPercent = (percent / 12) / 100;
        double annuityRatio = monthPercent + (monthPercent / (Math.pow((1 + monthPercent), loanTerm) - 1));
        double annuityPayment = annuityRatio * loanAmount;
        return annuityPayment;
    }

}
