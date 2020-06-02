package com.capgroup.digital.pdftemplate.domain.mockdata;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;



public class PriceItForm implements Serializable{
    private static final String CLASS_NAME = PriceItForm.class.getName();
    private static final long serialVersionUID = 1L;
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private static HashMap<String, String> planTypeMap = new HashMap<String, String>();

    private String clientName = "";
    private String planType = "";
    private String planAssets = "";
    private String estimatedAnnContributions = "";
    private String wilShireService = "";
    private Boolean isEDJ= false;
    private String numParticipants = "";
    private String shareClassTypesR2 = "";
    private String shareClassTypesR2E = "";
    private String shareClassTypesR3 = "";
    private String shareClassTypesR4 = "";
    private String shareClassTypesR5E = "";
    private String shareClassTypesR5 = "";
    private String shareClassTypesR6 = "";
    private String tpaFee = "";
    private String adviserFee = "";
    private String isDollarAdviserFee = "";
    private String mShareClassType = "";
    private String mileStone = "";
    private String mr2 = "";
    private String mr2e = "";
    private String mr3 = "";
    private String mr4 = "";
    private String mr5e = "";
    private String mr5 = "";
    private String mr6 = "";
    private String includeMileStone = "";
    private String includeResult = "";
    private String calculateCost = "";
    private String clientVersion = "";
    private String previous = "";
    private String fileName = "";
    private String pdfPluginInstalled = "";

    // GVA fields
    private String priceBand1 = "";
    private String priceBand2 = "";
    private String priceBand3 = "";
    private String priceBand4 = "";
    private String priceBand5 = "";
    private String priceBand6 = "";
    private String priceBand7 = "";
    private String priceBand8 = "";

    private String milestonePriceBand1 = "";
    private String milestonePriceBand2 = "";
    private String milestonePriceBand3 = "";
    private String milestonePriceBand4 = "";
    private String milestonePriceBand5 = "";
    private String milestonePriceBand6 = "";
    private String milestonePriceBand7 = "";
    private String milestonePriceBand8 = "";

    private String adviserFeeGVA = "";
    private String isDollarAdviserFeeGVA = "";

    private String isCompanyHeadQuarterInNewYork = "";
    private String adviserHighLowFee = "";

    private String creditR2 = "0";
    private String creditR2e = "0";
    private String creditR3 = "0";
    private String creditR4 = "0";
    private String creditR5 = "0";
    private String creditR5e = "0";
    private String creditR6 = "0";
    private String r2Fpo = "";
    private String r2eFpo = "";
    private String r3Fpo = "";
    private String r4Fpo = "";
    private String r5eFpo = "";
    private String r5po = "";
    private String r6po = "";
    public String getCreditR2() {
        return creditR2;
    }
    public void setCreditR2(String creditR2) {
        this.creditR2 = creditR2;
    }
    public String getCreditR2e() {
        return creditR2e;
    }
    public void setCreditR2e(String creditR2e) {
        this.creditR2e = creditR2e;
    }
    public String getR2Fpo() {
        return r2Fpo;
    }
    public void setR2Fpo(String r2Fpo) {
        this.r2Fpo = r2Fpo;
    }
    public String getR2eFpo() {
        return r2eFpo;
    }
    public void setR2eFpo(String r2eFpo) {
        this.r2eFpo = r2eFpo;
    }
    public String getR3Fpo() {
        return r3Fpo;
    }
    public void setR3Fpo(String r3Fpo) {
        this.r3Fpo = r3Fpo;
    }
    public String getR4Fpo() {
        return r4Fpo;
    }
    public void setR4Fpo(String r4Fpo) {
        this.r4Fpo = r4Fpo;
    }
    public String getCreditR5() {
        return creditR5;
    }
    public void setCreditR5(String creditR5) {
        this.creditR5 = creditR5;
    }
    public String getCreditR5e() {
        return creditR5e;
    }
    public void setCreditR5e(String creditR5e) {
        this.creditR5e = creditR5e;
    }
    public String getCreditR6() {
        return creditR6;
    }
    public void setCreditR6(String creditR6) {
        this.creditR6 = creditR6;
    }



    public String format(String inVal) {

        return inVal;
    }

    public String getMShareClassType() {
        return mShareClassType;
    }
    public void setMShareClassType(String shareClassType) {
        mShareClassType = shareClassType;
    }
    public String getPlanTypeDesc() {
        return (String)planTypeMap.get(this.planType);
    }

    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public Boolean getIsEDJ() {
        return isEDJ;
    }
    public void setIsEDJ(Boolean isEDJ) {
        this.isEDJ = isEDJ;
    }

    public String getNumParticipants() {
        return numParticipants;
    }
    public void setNumParticipants(String numParticipants) {
        this.numParticipants = format(numParticipants);
    }
    public String getEstimatedAnnContributions() {
        return estimatedAnnContributions;
    }
    public void setEstimatedAnnContributions(String estimatedAnnContributions) {
        this.estimatedAnnContributions = format(estimatedAnnContributions);
    }
    public String getWilShireService() {
        return wilShireService;
    }
    public void setWilShireService(String wilShireService) {
        this.wilShireService = wilShireService;
    }
    public String getPlanAssets() {
        return planAssets;
    }
    public void setPlanAssets(String planAssets) {
        this.planAssets = format(planAssets);
    }
    public String getPlanType() {
        return planType;
    }
    public void setPlanType(String planType) {
        this.planType = planType;
    }
    public String getIsDollarAdviserFee() {
        return isDollarAdviserFee;
    }
    public void setIsDollarAdviserFee(String isDollarAdviserFee) {
        this.isDollarAdviserFee = isDollarAdviserFee;
    }
    public String getAdviserFee() {
        return adviserFee;
    }
    public void setAdviserFee(String fee) {
        adviserFee = format(fee);
    }
    public String getTpaFee() {
        return tpaFee;
    }
    public void setTpaFee(String tpaFee) {
           this.tpaFee = "";
    }
    public String getCalculateCost() {
        return calculateCost;
    }
    public void setCalculateCost(String calculateCost) {
        this.calculateCost = calculateCost;
    }
    public String getClientVersion() {
        return clientVersion;
    }
    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }
    public String getMileStone() {
        return mileStone;
    }
    public void setMileStone(String mileStone) {
        this.mileStone = mileStone;
    }
    public String getShareClassTypesR2() {
        return shareClassTypesR2;
    }
    public void setShareClassTypesR2(String shareClassTypesR2) {
        this.shareClassTypesR2 = shareClassTypesR2;
    }
    public String getShareClassTypesR2E() {
        return shareClassTypesR2E;
    }
    public void setShareClassTypesR2E(String shareClassTypesR2E) {
        this.shareClassTypesR2E = shareClassTypesR2E;
    }
    public String getShareClassTypesR3() {
        return shareClassTypesR3;
    }
    public void setShareClassTypesR3(String shareClassTypesR3) {
        this.shareClassTypesR3 = shareClassTypesR3;
    }
    public String getShareClassTypesR4() {
        return shareClassTypesR4;
    }
    public void setShareClassTypesR4(String shareClassTypesR4) {
        this.shareClassTypesR4 = shareClassTypesR4;
    }
    public String getShareClassTypesR5() {
        return shareClassTypesR5;
    }
    public void setShareClassTypesR5(String shareClassTypesR5) {
        this.shareClassTypesR5 = shareClassTypesR5;
    }
    public String getShareClassTypesR5E() {
        return shareClassTypesR5E;
    }
    public void setShareClassTypesR5E(String shareClassTypesR5E) {
        this.shareClassTypesR5E = shareClassTypesR5E;
    }
    public String getShareClassTypesR6() {
        return shareClassTypesR6;
    }
    public void setShareClassTypesR6(String shareClassTypesR6) {
        this.shareClassTypesR6 = shareClassTypesR6;
    }
    public String getIncludeMileStone() {
        return includeMileStone;
    }
    public void setIncludeMileStone(String includeMileStone) {
        this.includeMileStone = includeMileStone;
    }
    public String getMr2() {
        return mr2;
    }
    public void setMr2(String mr2) {
        this.mr2 = mr2;
    }

    public String getMr2e() {
        return mr2e;
    }

    public void setMr2e(String mr2e) {
        this.mr2e = mr2e;
    }

    public String getMr3() {
        return mr3;
    }
    public void setMr3(String mr3) {
        this.mr3 = mr3;
    }
    public String getMr4() {
        return mr4;
    }
    public void setMr4(String mr4) {
        this.mr4 = mr4;
    }
    public String getMr5() {
        return mr5;
    }
    public void setMr5(String mr5) {
        this.mr5 = mr5;
    }
    public String getMr5e() {
        return mr5e;
    }
    public void setMr5e(String mr5e) {
        this.mr5e = mr5e;
    }
    public String getMr6() {
        return mr6;
    }
    public void setMr6(String mr6) {
        this.mr6 = mr6;
    }
    public String getIncludeResult() {
        return includeResult;
    }
    public void setIncludeResult(String includeResult) {
        this.includeResult = includeResult;
    }
    public String getPrevious() {
        return previous;
    }
    public void setPrevious(String previous) {
        this.previous = previous;
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getPdfPluginInstalled() {
        return pdfPluginInstalled;
    }
    public void setPdfPluginInstalled(String pdfPluginInstalled) {
        this.pdfPluginInstalled = pdfPluginInstalled;
    }
    public String getPriceBand1() {
        return priceBand1;
    }
    public void setPriceBand1(String priceBand1) {
        this.priceBand1 = priceBand1;
    }
    public String getPriceBand2() {
        return priceBand2;
    }
    public void setPriceBand2(String priceBand2) {
        this.priceBand2 = priceBand2;
    }
    public String getPriceBand3() {
        return priceBand3;
    }
    public void setPriceBand3(String priceBand3) {
        this.priceBand3 = priceBand3;
    }
    public String getPriceBand4() {
        return priceBand4;
    }
    public void setPriceBand4(String priceBand4) {
        this.priceBand4 = priceBand4;
    }
    public String getPriceBand5() {
        return priceBand5;
    }
    public void setPriceBand5(String priceBand5) {
        this.priceBand5 = priceBand5;
    }
    public String getPriceBand6() {
        return priceBand6;
    }
    public void setPriceBand6(String priceBand6) {
        this.priceBand6 = priceBand6;
    }
    public String getPriceBand7() {
        return priceBand7;
    }
    public void setPriceBand7(String priceBand7) {
        this.priceBand7 = priceBand7;
    }
    public String getPriceBand8() {
        return priceBand8;
    }
    public void setPriceBand8(String priceBand8) {
        this.priceBand8 = priceBand8;
    }
    public void setIsCompanyHeadQuarterInNewYork(String companyHeadQuarter) {
        this.isCompanyHeadQuarterInNewYork = companyHeadQuarter;
    }

    public String getIsCompanyHeadQuarterInNewYork() {
        return isCompanyHeadQuarterInNewYork;
    }

    public void setAdviserHighLowFee(String adviserHighLowFee) {
        this.adviserHighLowFee = format(adviserHighLowFee);
    }

    public String getAdviserHighLowFee() {
        return adviserHighLowFee;
    }

    public void setAdviserFeeGVA(String adviserFeeGVA) {
        this.adviserFeeGVA = format(adviserFeeGVA);
    }

    public String getAdviserFeeGVA() {
        return adviserFeeGVA;
    }

    public void setIsDollarAdviserFeeGVA(String isDollarAdviserFeeGVA) {
        this.isDollarAdviserFeeGVA = isDollarAdviserFeeGVA;
    }

    public String getIsDollarAdviserFeeGVA() {
        return isDollarAdviserFeeGVA;
    }

    public static HashMap<String, String> getPlanTypeMap() {
        return planTypeMap;
    }

    public static void setPlanTypeMap(HashMap<String, String> planTypeMap) {
        PriceItForm.planTypeMap = planTypeMap;
    }

    public String getmShareClassType() {
        return mShareClassType;
    }

    public void setmShareClassType(String mShareClassType) {
        this.mShareClassType = mShareClassType;
    }

    public String getMilestonePriceBand1() {
        return milestonePriceBand1;
    }

    public void setMilestonePriceBand1(String milestonePriceBand1) {
        this.milestonePriceBand1 = milestonePriceBand1;
    }

    public String getMilestonePriceBand2() {
        return milestonePriceBand2;
    }

    public void setMilestonePriceBand2(String milestonePriceBand2) {
        this.milestonePriceBand2 = milestonePriceBand2;
    }

    public String getMilestonePriceBand3() {
        return milestonePriceBand3;
    }

    public void setMilestonePriceBand3(String milestonePriceBand3) {
        this.milestonePriceBand3 = milestonePriceBand3;
    }

    public String getMilestonePriceBand4() {
        return milestonePriceBand4;
    }

    public void setMilestonePriceBand4(String milestonePriceBand4) {
        this.milestonePriceBand4 = milestonePriceBand4;
    }

    public String getMilestonePriceBand5() {
        return milestonePriceBand5;
    }

    public void setMilestonePriceBand5(String milestonePriceBand5) {
        this.milestonePriceBand5 = milestonePriceBand5;
    }

    public String getMilestonePriceBand6() {
        return milestonePriceBand6;
    }

    public void setMilestonePriceBand6(String milestonePriceBand6) {
        this.milestonePriceBand6 = milestonePriceBand6;
    }

    public String getMilestonePriceBand7() {
        return milestonePriceBand7;
    }

    public void setMilestonePriceBand7(String milestonePriceBand7) {
        this.milestonePriceBand7 = milestonePriceBand7;
    }

    public String getMilestonePriceBand8() {
        return milestonePriceBand8;
    }

    public void setMilestonePriceBand8(String milestonePriceBand8) {
        this.milestonePriceBand8 = milestonePriceBand8;
    }

    public String getCreditR3() {
        return creditR3;
    }
    public void setCreditR3(String creditR3) {
        this.creditR3 = creditR3;
    }
    public String getCreditR4() {
        return creditR4;
    }
    public void setCreditR4(String creditR4) {
        this.creditR4 = creditR4;
    }
    public String getR5eFpo() {
        return r5eFpo;
    }
    public void setR5eFpo(String r5eFpo) {
        this.r5eFpo = r5eFpo;
    }
    public String getR5po() {
        return r5po;
    }
    public void setR5po(String r5po) {
        this.r5po = r5po;
    }
    public String getR6po() {
        return r6po;
    }
    public void setR6po(String r6po) {
        this.r6po = r6po;
    }








    @Override
    public String toString() {
        return "PriceItForm [clientName=" + clientName + ", planType=" + planType + ", planAssets=" + planAssets
                + ", estimatedAnnContributions=" + estimatedAnnContributions + ", wilShireService=" + wilShireService
                + ", isEDJ=" + isEDJ + ", numParticipants=" + numParticipants + ", shareClassTypesR2=" + shareClassTypesR2
                + ", shareClassTypesR2E=" + shareClassTypesR2E + ", shareClassTypesR3=" + shareClassTypesR3
                + ", shareClassTypesR4=" + shareClassTypesR4 + ", shareClassTypesR5E=" + shareClassTypesR5E
                + ", shareClassTypesR5=" + shareClassTypesR5 + ", shareClassTypesR6=" + shareClassTypesR6 + ", tpaFee="
                + tpaFee + ", adviserFee=" + adviserFee + ", isDollarAdviserFee=" + isDollarAdviserFee
                + ", mShareClassType=" + mShareClassType + ", mileStone=" + mileStone + ", mr2=" + mr2 + ", mr2e=" + mr2e
                + ", mr3=" + mr3 + ", mr4=" + mr4 + ", mr5e=" + mr5e + ", mr5=" + mr5 + ", mr6=" + mr6
                + ", includeMileStone=" + includeMileStone + ", includeResult=" + includeResult + ", calculateCost="
                + calculateCost + ", clientVersion=" + clientVersion + ", previous=" + previous + ", fileName=" + fileName
                + ", pdfPluginInstalled=" + pdfPluginInstalled + ", priceBand1=" + priceBand1 + ", priceBand2=" + priceBand2
                + ", priceBand3=" + priceBand3 + ", priceBand4=" + priceBand4 + ", priceBand5=" + priceBand5
                + ", priceBand6=" + priceBand6 + ", priceBand7=" + priceBand7 + ", priceBand8=" + priceBand8
                + ", milestonePriceBand1=" + milestonePriceBand1 + ", milestonePriceBand2=" + milestonePriceBand2
                + ", milestonePriceBand3=" + milestonePriceBand3 + ", milestonePriceBand4=" + milestonePriceBand4
                + ", milestonePriceBand5=" + milestonePriceBand5 + ", milestonePriceBand6=" + milestonePriceBand6
                + ", milestonePriceBand7=" + milestonePriceBand7 + ", milestonePriceBand8=" + milestonePriceBand8
                + ", adviserFeeGVA=" + adviserFeeGVA + ", isDollarAdviserFeeGVA=" + isDollarAdviserFeeGVA
                + ", isCompanyHeadQuarterInNewYork=" + isCompanyHeadQuarterInNewYork + ", adviserHighLowFee="
                + adviserHighLowFee + ", creditR2=" + creditR2 + ", creditR2e=" + creditR2e + ", creditR3=" + creditR3
                + ", creditR4=" + creditR4 + ", creditR5=" + creditR5 + ", creditR5e=" + creditR5e + ", creditR6="
                + creditR6 + ", r2Fpo=" + r2Fpo + ", r2eFpo=" + r2eFpo + ", r3Fpo=" + r3Fpo + ", r4Fpo=" + r4Fpo
                + ", r5eFpo=" + r5eFpo + ", r5po=" + r5po + ", r6po=" + r6po + "]";
    }



}

