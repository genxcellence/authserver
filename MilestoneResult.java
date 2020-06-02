package com.capgroup.digital.pdftemplate.domain.mockdata;

public class MilestoneResult implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private double planAsset=0.0;
    private double annualFee = 0.0;
    private double wilShireService = 0.00;
    private double wilShireFeePercent = 0.0;
    private double wilShireFeeDollar= 0.0;
    private double estimatedAnnContributions = 0.0;
    private double totalPlanAsset = 0.0;
    private int numParticipants=0;
    private double avgAccountBalance=0.0;
    private double planCredit=0.0;
    private double planCreditPercent = 0.0;
    private double netCredit=0.0;
    private double annualTPAFee=0.0;
    private double investDollarCost=0.0;
    private double adviserFeeDollar=0.0;
    private double planCostDollar=0.0;
    private double planCostPct=0.0;
    private String sectionType;
    private String chartRelativeUrl="";
    private boolean isRestricted;
    private double feeBasedCompPct=0.0;
    private double feeBasedCompDollar=0.0;
    private double creditAmountPct=0.0;
    private double creditAmountDollar=0.0;
    private double maxPlanCostPct=0.0;
    private double planCostPercent = 0.0;

    public double getAnnualTPAFee() {
        return Math.round(annualTPAFee);
    }
    public void setAnnualTPAFee(double annualTPAFee) {
        this.annualTPAFee = annualTPAFee;
    }
    public double getAvgAccountBalance() {
        return Math.round(avgAccountBalance);
    }
    public void setAvgAccountBalance(double avgAccountBalance) {
        this.avgAccountBalance = avgAccountBalance;
    }
    public double getInvestDollarCost() {
        return Math.round(investDollarCost);
    }
    public void setInvestDollarCost(double investDollarCost) {
        this.investDollarCost = investDollarCost;
    }
    public double getNetCredit() {
        return Math.round(netCredit);
    }
    public void setNetCredit(double netCredit) {
        this.netCredit = netCredit;
    }
    public int getNumParticipants() {
        return numParticipants;
    }
    public void setNumParticipants(int numParticipants) {
        this.numParticipants = numParticipants;
    }
    public double getPlanAsset() {
        return Math.round(planAsset);
    }
    public void setPlanAsset(double planAsset) {
        this.planAsset = planAsset;
    }
    public double getEstimatedAnnContributions() {
        return Math.round(estimatedAnnContributions);
    }
    public void setEstimatedAnnContributions(double estimatedAnnContributions) {
        this.estimatedAnnContributions = estimatedAnnContributions;
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
    public double getTotalPlanAsset() {
        return Math.round(totalPlanAsset);
    }
    public void setTotalPlanAsset(double totalPlanAsset) {
        this.totalPlanAsset = totalPlanAsset;
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
    public double getPlanCredit() {
        return Math.round(planCredit);
    }
    public void setPlanCredit(double planCredit) {
        this.planCredit = planCredit;
    }
    public double getAdviserFeeDollar() {
        return Math.round(adviserFeeDollar);
    }
    public void setAdviserFeeDollar(double dollarCost) {
        adviserFeeDollar = dollarCost;
    }
    public String getSectionType() {
        return sectionType;
    }
    public void setSectionType(String sectionType) {
        this.sectionType = sectionType;
    }
    public String getChartRelativeUrl() {
        return chartRelativeUrl;
    }
    public void setChartRelativeUrl(String chartRelativeUrl) {
        this.chartRelativeUrl = chartRelativeUrl;
    }
    public boolean getIsRestricted() {
        return isRestricted;
    }
    public void setRestricted(boolean isRestriction) {
        this.isRestricted = isRestriction;
    }
    public double getAnnualFee() {
        return Math.round(annualFee);
    }
    public void setAnnualFee(double annualFee) {
        this.annualFee = annualFee;
    }
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
    public double getMaxPlanCostPct() {
        return maxPlanCostPct;
    }
    public void setMaxPlanCostPct(double maxPlanCostPct) {
        this.maxPlanCostPct = maxPlanCostPct;
    }
    public double getPlanCostPercent() {
        return planCostPercent;
    }
    public void setPlanCostPercent(double planCostPercent) {
        this.planCostPercent = planCostPercent;
    }
    @Override
    public String toString() {
        return "MilestoneResult [planAsset=" + planAsset + ", annualFee=" + annualFee + ", wilShireService="
                + wilShireService + ", wilShireFeePercent=" + wilShireFeePercent + ", wilShireFeeDollar="
                + wilShireFeeDollar + ", estimatedAnnContributions=" + estimatedAnnContributions + ", totalPlanAsset="
                + totalPlanAsset + ", numParticipants=" + numParticipants + ", avgAccountBalance=" + avgAccountBalance
                + ", planCredit=" + planCredit + ", planCreditPercent=" + planCreditPercent + ", netCredit=" + netCredit
                + ", annualTPAFee=" + annualTPAFee + ", investDollarCost=" + investDollarCost + ", adviserFeeDollar="
                + adviserFeeDollar + ", planCostDollar=" + planCostDollar + ", planCostPct=" + planCostPct
                + ", sectionType=" + sectionType + ", chartRelativeUrl=" + chartRelativeUrl + ", isRestricted="
                + isRestricted + ", feeBasedCompPct=" + feeBasedCompPct + ", feeBasedCompDollar=" + feeBasedCompDollar
                + ", creditAmountPct=" + creditAmountPct + ", creditAmountDollar=" + creditAmountDollar
                + ", maxPlanCostPct=" + maxPlanCostPct + ", planCostPercent=" + planCostPercent + "]";
    }



}
