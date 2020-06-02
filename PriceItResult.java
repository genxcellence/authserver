package com.capgroup.digital.pdftemplate.domain.mockdata;

public class PriceItResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private boolean isRestricted;
    private String shareClassType;
    private double oneTimeFee = 0.0;
    private double annualFee = 0.0;
    private double baseFee = 0.0;
    private double perParticipantFee = 0.0;
    private double annualRKDFee = 0.0;
    private double wilShireService = 0.00;
    private double wilShireFeePercent = 0.0;
    private double wilShireFeeDollar= 0.0;
    private double planCredit = 0.0;
    private double planCreditPercent = 0.0;
    private double netCredit = 0.0;
    private double annualTPAFee = 0.0;
    private double investAvgExpRatio = 0.0;
    private double investDollarCost = 0.0;
    private double adviserFeePercent = 0.0;
    private double adviserFeeDollar = 0.0;
    private double planCostPct = 0.0;
    private double planCostDollar = 0.0;
    private double dealerCompPct = 0.0;
    private double dealerCompDollar = 0.0;
    private double feeBasedCompPct=0.0;
    private double feeBasedCompDollar=0.0;
    private double creditAmountPct=0.0;
    private double creditAmountDollar=0.0;
    // GVA only data points
   // private AdviserHighLowCompensation adviserHighLowComp;

    public double getAnnualFee() {
        return Math.round(annualFee);
    }
    public void setAnnualFee(double annualFee) {
        this.annualFee = annualFee;
    }
    public double getBaseFee() {
        return Math.round(baseFee);
    }
    public void setBaseFee(double baseFee) {
        this.baseFee = baseFee;
    }
    public double getPerParticipantFee() {
        return Math.round(perParticipantFee);
    }
    public void setPerParticipantFee(double perParticipantFee) {
        this.perParticipantFee = perParticipantFee;
    }
    public double getAnnualRKDFee() {
        return Math.round(annualRKDFee);
    }
    public void setAnnualRKDFee(double annualRKDFee) {
        this.annualRKDFee = annualRKDFee;
    }
    public double getWilShireService() {
        return wilShireService;
    }
    public void setWilShireService(double wilShireService) {
        this.wilShireService = wilShireService;
    }
    public double getWilShireFeePercent() {
        return wilShireFeePercent;
    }
    public void setWilShireFeePercent(double wilShireFeePercent) {
        this.wilShireFeePercent = wilShireFeePercent;
    }
    public double getWilShireFeeDollar() {
        return Math.round(wilShireFeeDollar);
    }
    public void setWilShireFeeDollar(double wilShireFeeDollar) {
        this.wilShireFeeDollar = wilShireFeeDollar;
    }
    public double getDealerCompDollar() {
        return Math.round(dealerCompDollar);
    }
    public void setDealerCompDollar(double dealerCompDollar) {
        this.dealerCompDollar = dealerCompDollar;
    }
    public double getDealerCompPct() {
        return dealerCompPct;
    }
    public void setDealerCompPct(double dealerCompPct) {
        this.dealerCompPct = dealerCompPct;
    }
    public double getInvestAvgExpRatio() {
        return investAvgExpRatio;
    }
    public void setInvestAvgExpRatio(double investAvgExpRatio) {
        this.investAvgExpRatio = investAvgExpRatio;
    }
    public double getInvestDollarCost() {
        return Math.round(investDollarCost);
    }
    public void setInvestDollarCost(double investDollarCost) {
        this.investDollarCost = investDollarCost;
    }
    public double getOneTimeFee() {
        return Math.round(oneTimeFee);
    }
    public void setOneTimeFee(double oneTimeFee) {
        this.oneTimeFee = oneTimeFee;
    }
    public double getPlanCostDollar() {
        return Math.round(planCostDollar);
    }
    public void setPlanCostDollar(double planCostDollar) {
        this.planCostDollar = planCostDollar;
    }
    public double getPlanCostPct() {
        return planCostPct;
    }
    public void setPlanCostPct(double planCostPct) {
        this.planCostPct = planCostPct;
    }
    public String getShareClassType() {
        return shareClassType;
    }
    public void setShareClassType(String shareClassType) {
        this.shareClassType = shareClassType;
    }
    public double getNetCredit() {
        return Math.round(netCredit);
    }
    public void setNetCredit(double netCredit) {
        this.netCredit = netCredit;
    }
    public double getPlanCredit() {
        return Math.round(planCredit);
    }
    public void setPlanCredit(double planCredit) {
        this.planCredit = planCredit;
    }
    public double getAnnualTPAFee() {
        return Math.round(annualTPAFee);
    }
    public void setAnnualTPAFee(double annualTPAFee) {
        this.annualTPAFee = annualTPAFee;
    }
    public double getAdviserFeeDollar() {
        return Math.round(adviserFeeDollar);
    }
    public void setAdviserFeeDollar(double dollarCost) {
        adviserFeeDollar = dollarCost;
    }
    public double getAdviserFeePercent() {
        return adviserFeePercent;
    }
    public void setAdviserFeePercent(double pct) {
        adviserFeePercent = pct;
    }
    public boolean getIsRestricted() {
        return isRestricted;
    }
    public void setRestricted(boolean isRestriction) {
        this.isRestricted = isRestriction;
    }
   /* public void setAdviserHighLowComp(AdviserHighLowCompensation hiLoComp) {
        adviserHighLowComp = hiLoComp;
    }
    public AdviserHighLowCompensation getAdviserHighLowComp() {
        return adviserHighLowComp;
    }*/
    /**
     * @return the planCreditPercent
     */
    public double getPlanCreditPercent() {
        return planCreditPercent;
    }
    /**
     * @param planCreditPercent the planCreditPercent to set
     */
    public void setPlanCreditPercent(double planCreditPercent) {
        this.planCreditPercent = planCreditPercent;
    }
    public double getFeeBasedCompPct() {
        return feeBasedCompPct;
    }
    public void setFeeBasedCompPct(double feeBasedCompPct) {
        this.feeBasedCompPct = feeBasedCompPct;
    }
    public double getFeeBasedCompDollar() {
        return feeBasedCompDollar;
    }
    public void setFeeBasedCompDollar(double feeBasedCompDollar) {
        this.feeBasedCompDollar = feeBasedCompDollar;
    }
    public double getCreditAmountPct() {
        return creditAmountPct;
    }
    public void setCreditAmountPct(double creditAmountPct) {
        this.creditAmountPct = creditAmountPct;
    }
    public double getCreditAmountDollar() {
        return creditAmountDollar;
    }
    public void setCreditAmountDollar(double creditAmountDollar) {
        this.creditAmountDollar = creditAmountDollar;
    }

    @Override
    public String toString() {
        return "PriceItResult [isRestricted=" + isRestricted + ", shareClassType=" + shareClassType + ", oneTimeFee="
                + oneTimeFee + ", annualFee=" + annualFee + ", baseFee=" + baseFee + ", perParticipantFee="
                + perParticipantFee + ", annualRKDFee=" + annualRKDFee + ", wilShireService=" + wilShireService
                + ", wilShireFeePercent=" + wilShireFeePercent + ", wilShireFeeDollar=" + wilShireFeeDollar
                + ", planCredit=" + planCredit + ", planCreditPercent=" + planCreditPercent + ", netCredit=" + netCredit
                + ", annualTPAFee=" + annualTPAFee + ", investAvgExpRatio=" + investAvgExpRatio + ", investDollarCost="
                + investDollarCost + ", adviserFeePercent=" + adviserFeePercent + ", adviserFeeDollar="
                + adviserFeeDollar + ", planCostPct=" + planCostPct + ", planCostDollar=" + planCostDollar
                + ", dealerCompPct=" + dealerCompPct + ", dealerCompDollar=" + dealerCompDollar + ", feeBasedCompPct="
                + feeBasedCompPct + ", feeBasedCompDollar=" + feeBasedCompDollar + ", creditAmountPct="
                + creditAmountPct + ", creditAmountDollar=" + creditAmountDollar + ", adviserHighLowComp="
                + "]";
    }



}

