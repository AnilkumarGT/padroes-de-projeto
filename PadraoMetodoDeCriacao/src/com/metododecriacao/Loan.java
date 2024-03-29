package com.metododecriacao;

import java.util.Date;

import com.metododecriacao.strategy.CapitalStrategy;
import com.metododecriacao.strategy.CapitalStrategyRCTL;
import com.metododecriacao.strategy.CapitalStrategyRevolver;
import com.metododecriacao.strategy.CapitalStrategyTermLoan;

public class Loan {
	private double commitment;
	private double outstanding;
	private int riskRating;
	private Date maturity;
	private Date expiry;
	private CapitalStrategy capitalStrategy;

	// internalizar construtor
	// public Loan(double commitment, int riskRating, Date maturity) {
	// this(commitment, 0.00, riskRating, maturity, null);
	// }

	// public Loan(double commitment, int riskRating, Date maturity, Date
	// expiry) {
	// this(commitment, 0.00, riskRating, maturity, expiry);
	// }

	// public Loan(double commitment, double outstanding, int riskRating,
	// Date maturity, Date expiry) {
	// this(null, commitment, outstanding, riskRating, maturity, expiry);
	// }

	// Tornar construtor private
	private Loan(CapitalStrategy capitalStrategy, double commitment,
			double outstanding, int riskRating, Date maturity, Date expiry) {
		this.commitment = commitment;
		this.outstanding = outstanding;
		this.riskRating = riskRating;
		this.maturity = maturity;
		this.expiry = expiry;
		this.capitalStrategy = capitalStrategy;

		if (capitalStrategy == null) {
			if (expiry == null) {
				this.capitalStrategy = new CapitalStrategyTermLoan();
			} else if (maturity == null) {
				this.capitalStrategy = new CapitalStrategyRevolver();
			} else {
				this.capitalStrategy = new CapitalStrategyRCTL();
			}
		}

	}

	public static Loan createTermLoan(double commitment, int riskRating,
			Date maturity) {
		return new Loan(null, commitment, 0.0, riskRating, maturity, null);
	}

	public static Loan createTermLoan(
			CapitalStrategy riskAdjustedCapitalStrategy, double commitment,
			double outstanding, int riskRating, Date maturity) {
		return new Loan(riskAdjustedCapitalStrategy, commitment, 0.00,
				riskRating, maturity, null);
	}

	public double getCommitment() {
		return commitment;
	}

	public void setCommitment(double commitment) {
		this.commitment = commitment;
	}

	public double getOutstanding() {
		return outstanding;
	}

	public void setOutstanding(double outstanding) {
		this.outstanding = outstanding;
	}

	public int getRiskRating() {
		return riskRating;
	}

	public void setRiskRating(int riskRating) {
		this.riskRating = riskRating;
	}

	public Date getMaturity() {
		return maturity;
	}

	public void setMaturity(Date maturity) {
		this.maturity = maturity;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public CapitalStrategy getCapitalStrategy() {
		return capitalStrategy;
	}

	public void setCapitalStrategy(CapitalStrategy capitalStrategy) {
		this.capitalStrategy = capitalStrategy;
	}

}
