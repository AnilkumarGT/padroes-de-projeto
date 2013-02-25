package com.metododecriacao.test;

import java.util.Date;

import com.metododecriacao.Loan;
import com.metododecriacao.strategy.CapitalStrategy;

public class CapitalCalculationTests {
	public void testTermLoanNoPayments() {
		double commitment = 0.0;
		int riskRating = 0;
		Date maturity = new Date();

		// 1º passo Extrair metodo (public e static)
		// Loan termLoan = new Loan(commitment, riskRating, maturity);

		Loan termLoan = Loan.createTermLoan(commitment, riskRating, maturity);
	}

	// Aplico mover metodo para Loan
	// public static Loan createTermLoan(double commitment, int riskRating, Date
	// maturity) {
	// return new Loan(commitment, riskRating, maturity);
	// }
	public void testTermLoanWithRiskAdjustedCapitalStrategy() {
		CapitalStrategy riskAdjustedCapitalStrategy = new CapitalStrategy();
		double commitment = 0.0;
		double outstanding = 0.0;
		int riskRating = 0;
		Date maturity = new Date();

		// Loan termLoan = new Loan(riskAdjustedCapitalStrategy, commitment,
		// outstanding, riskRating, maturity, null);
		Loan termLoan = Loan.createTermLoan(riskAdjustedCapitalStrategy,
				commitment, outstanding, riskRating, maturity);
	}
}
