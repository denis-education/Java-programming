import java.util.Scanner;

public class CreditCalculator {
    public static void notMagic() {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите ежегодную процентную ставку: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Введите сумму кредита: ");
        double loanAmount = input.nextDouble();

        System.out.print("Введите количество лет, на которые берется кредит: ");
        int loanYears = input.nextInt();

        int numberOfMonths = loanYears * 12;
        double monthlyInterestRate = annualInterestRate / (12 * 100);
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfMonths));
        double totalCost = monthlyPayment * numberOfMonths;

        System.out.printf("Ежемесячный платеж: %.2f%n", monthlyPayment);
        System.out.printf("Стоимость кредита: %.2f%n", totalCost);
    }
}
