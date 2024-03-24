package org.huaqi.datacenter.service;

import org.huaqi.datacenter.domain.entity.KPI;
import org.huaqi.datacenter.domain.entity.RealTimeData;
import org.huaqi.datacenter.domain.vo.*;

import java.util.HashMap;
import java.util.List;

/**
 * @author whm
 * @date 2024/2/28 22:21
 */
public interface DataService {
    List<ProfitVO> getProfitTable(String stkCd);

    List<BalanceSheetVO> getBalanceSheet(String stkCd);

    List<CashFlowVO> getCashFlow(String stkCd);

    List<DebtSCVO> getDebtSC(String stkCd);

    List<DevCVO> getDevC(String stkCd);

    List<ManageAbilityVO> getManageAbility(String stkCd);

    List<ProfitabilityVO> getProfitability(String stkCd);

    BasicInformationVO getBasicInformation(String stkCd);

    List<CapitalStructureVO> getCapitalStructure(String stkCd);

    List<String> getTTShReportDate(String stkCd);

    List<TTShTable> getTopTenShareholders(String stkCd, List<String> reportDate);

    List<TTPShTable> getTopTenPublicShareholders(String stkCd, List<String> reportDate);

    List<NumOfShVO> getShareholders(String stkCd);

    List<String> getFundHoldingsReportDate(String stkCd);

    List<FundHoldingsVO> getFundHoldings(String stkCd, List<String> reportDate);

    List<StockPledgeFreezeCustodyVO> getStockPledgeFreezeCustody(String stkCd);

    List<CapitalChangeVO> getCapitalChange(String stkCd);

    List<RestrictedSaleVO> getRestrictedSale(String stkCd);

    List<RelatedTransactionVO> getRelatedTransaction(String stkCd);

    List<LitigationArbitrationVO> getLitigationArbitration(String stkCd);

    List<HashMap<String, String>> getStockList();

    List<StockInvestmentVO> getLatestStockInvestment(String stkCd);

    RealTimeData getRealTimeData(String stkCd);

    List<KPI> getKPIs(String stkCd);

    ActualControllerVO getActualController(String stkCd);
}
