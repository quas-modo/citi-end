package org.huaqi.datacenter.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.huaqi.datacenter.domain.entity.KPI;
import org.huaqi.datacenter.domain.entity.RealTimeData;
import org.huaqi.datacenter.domain.vo.*;
import org.huaqi.datacenter.service.DataService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @author whm
 * @date 2024/2/28 22:22
 */
@Tag(name = "数据管理")
@RestController
@RequiredArgsConstructor
@RequestMapping("/data")
@CrossOrigin
public class DataController {
    private final DataService dataService;

    @Operation(summary = "获取利润表")
    @RequestMapping("/profitTable")
    public Response<List<ProfitVO>> getProfitTable(@RequestParam("stkCd") String stkCd) {
        List<ProfitVO> profitVOList = dataService.getProfitTable(stkCd);
        return Response.success(200, "获取利润表成功！", profitVOList);
    }

    @Operation(summary = "获取资产负债表")
    @RequestMapping("/balanceSheet")
    public Response<List<BalanceSheetVO>> getBalanceSheet(@RequestParam("stkCd") String stkCd) {
        List<BalanceSheetVO> balanceSheetVOList = dataService.getBalanceSheet(stkCd);
        return Response.success(200, "获取资产负债表成功！", balanceSheetVOList);
    }

    @Operation(summary = "获取现金流量表")
    @RequestMapping("/cashFlow")
    public Response<List<CashFlowVO>> getCashFlow(@RequestParam("stkCd") String stkCd) {
        List<CashFlowVO> cashFlowVOList = dataService.getCashFlow(stkCd);
        return Response.success(200, "获取现金流量表成功！", cashFlowVOList);
    }

    @Operation(summary = "获取偿债能力")
    @RequestMapping("/debtSC")
    public Response<List<DebtSCVO>> getDebtSC(@RequestParam("stkCd") String stkCd) {
        List<DebtSCVO> debtSCVOList = dataService.getDebtSC(stkCd);
        return Response.success(200, "获取偿债能力成功！", debtSCVOList);
    }

    @Operation(summary = "获取发展能力")
    @RequestMapping("/devC")
    public Response<List<DevCVO>> getDevC(@RequestParam("stkCd") String stkCd) {
        List<DevCVO> devCVOList = dataService.getDevC(stkCd);
        return Response.success(200, "获取发展能力成功！", devCVOList);
    }

    @Operation(summary = "获取经营能力")
    @RequestMapping("/manageAbility")
    public Response<List<ManageAbilityVO>> getManageAbility(@RequestParam("stkCd") String stkCd) {
        List<ManageAbilityVO> manageAbilityVOList = dataService.getManageAbility(stkCd);
        return Response.success(200, "获取经营能力成功！", manageAbilityVOList);
    }

    @Operation(summary = "获取盈利能力")
    @RequestMapping("/profitability")
    public Response<List<ProfitabilityVO>> getProfitability(@RequestParam("stkCd") String stkCd) {
        List<ProfitabilityVO> profitabilityVOList = dataService.getProfitability(stkCd);
        return Response.success(200, "获取盈利能力成功！", profitabilityVOList);
    }

    @Operation(summary = "获取基本信息")
    @RequestMapping("/basicInformation")
    public Response<BasicInformationVO> getBasicInformation(@RequestParam("stkCd") String stkCd) {
        BasicInformationVO basicInformationVO = dataService.getBasicInformation(stkCd);
        return Response.success(200, "获取基本信息成功！", basicInformationVO);
    }

    @Operation(summary = "获取股本结构")
    @RequestMapping("/capitalStructure")
    public Response<List<CapitalStructureVO>> getCapitalStructure(@RequestParam("stkCd") String stkCd) {
        List<CapitalStructureVO> capitalStructureVOList = dataService.getCapitalStructure(stkCd);
        return Response.success(200, "获取股本结构成功！", capitalStructureVOList);
    }

    @Operation(summary = "提供十大股东财报可选的日期")
    @RequestMapping("/getTTShReportDate")
    public Response<List<String>> getTTShReportDate(@RequestParam("stkCd") String stkCd) {
        List<String> list = dataService.getTTShReportDate(stkCd);
        return Response.success(200, "获取十大股东财报可选的日期成功！", list);
    }

    @Operation(summary = "查询十大股东")
    @RequestMapping("/getTopTenShareholders")
    public Response<List<TTShTable>> getTopTenShareholders(@RequestParam("stkCd") String stkCd, @RequestParam("reportDate") List<String> reportDate) {
        List<TTShTable> list = dataService.getTopTenShareholders(stkCd, reportDate);
        return Response.success(200, "查询十大股东成功！", list);
    }

    @Operation(summary = "查询十大流通股东")
    @RequestMapping("/getTopTenPublicShareholders")
    public Response<List<TTPShTable>> getTopTenPublicShareholders(@RequestParam("stkCd") String stkCd, @RequestParam("reportDate") List<String> reportDate) {
        List<TTPShTable> list = dataService.getTopTenPublicShareholders(stkCd, reportDate);
        return Response.success(200, "查询十大流通股东成功！", list);
    }

    @Operation(summary = "查询股东人数")
    @RequestMapping("/getShareholders")
    public Response<List<NumOfShVO>> getShareholders(@RequestParam("stkCd") String stkCd) {
        List<NumOfShVO> list = dataService.getShareholders(stkCd);
        return Response.success(200, "查询股东人数成功！", list);
    }

    @Operation(summary = "查询基金持股")
    @RequestMapping("/getFundHoldings")
    public Response<List<FundHoldingsVO>> getFundHoldings(@RequestParam("stkCd") String stkCd, @RequestParam("reportDate") List<String> reportDate) {
        List<FundHoldingsVO> list = dataService.getFundHoldings(stkCd, reportDate);
        return Response.success(200, "查询基金持股成功！", list);
    }

    @Operation(summary = "查询股份质押、冻结或托管情况")
    @RequestMapping("/getStockPledgeFreezeCustody")
    public Response<List<StockPledgeFreezeCustodyVO>> getStockPledgeFreezeCustody(@RequestParam("stkCd") String stkCd) {
        List<StockPledgeFreezeCustodyVO> list = dataService.getStockPledgeFreezeCustody(stkCd);
        return Response.success(200, "查询股份质押、冻结或托管情况成功！", list);
    }

    @Operation(summary = "查询股权变动")
    @RequestMapping("/getCapitalChange")
    public Response<List<CapitalChangeVO>> getCapitalChange(@RequestParam("stkCd") String stkCd) {
        List<CapitalChangeVO> list = dataService.getCapitalChange(stkCd);
        return Response.success(200, "查询股权变动成功！", list);
    }

    @Operation(summary = "查询限售解禁")
    @RequestMapping("/getRestrictedSale")
    public Response<List<RestrictedSaleVO>> getRestrictedSale(@RequestParam("stkCd") String stkCd) {
        List<RestrictedSaleVO> list = dataService.getRestrictedSale(stkCd);
        return Response.success(200, "查询限售解禁成功！", list);
    }

    @Operation(summary = "查询关联交易")
    @RequestMapping("/getRelatedTransaction")
    public Response<List<RelatedTransactionVO>> getRelatedTransaction(@RequestParam("stkCd") String stkCd) {
        List<RelatedTransactionVO> list = dataService.getRelatedTransaction(stkCd);
        return Response.success(200, "查询关联交易成功！", list);
    }

    @Operation(summary = "查询诉讼仲裁")
    @RequestMapping("/getLitigationArbitration")
    public Response<List<LitigationArbitrationVO>> getLitigationArbitration(@RequestParam("stkCd") String stkCd) {
        List<LitigationArbitrationVO> list = dataService.getLitigationArbitration(stkCd);
        return Response.success(200, "查询诉讼仲裁成功！", list);
    }

    @Operation(summary = "查询基金持股可选日期")
    @RequestMapping("/getFundHoldingsReportDate")
    public Response<List<String>> getFundHoldingsReportDate(@RequestParam("stkCd") String stkCd) {
        List<String> list = dataService.getFundHoldingsReportDate(stkCd);
        return Response.success(200, "查询基金持股可选日期成功！", list);
    }

    @Operation(summary = "查询股票列表")
    @RequestMapping("/getStockList")
    public Response<List<HashMap<String, String>>> getStockList() {
        List<HashMap<String, String>> list = dataService.getStockList();
        return Response.success(200, "查询股票列表成功！", list);
    }

    @Operation(summary = "查询最新股权投资")
    @RequestMapping("/getLatestStockInvestment")
    public Response<List<StockInvestmentVO>> getLatestStockInvestment(@RequestParam("stkCd") String stkCd) {
        List<StockInvestmentVO> list = dataService.getLatestStockInvestment(stkCd);
        return Response.success(200, "查询最新股权投资成功！", list);
    }

    @Operation(summary = "查询实时数据")
    @RequestMapping("/getRealTimeData")
    public Response<RealTimeData> getRealTimeData(@RequestParam("stkCd") String stkCd) {
        RealTimeData realTimeData = dataService.getRealTimeData(stkCd);
        if(realTimeData == null) {
            return Response.failed(999, "未查询到实时价量数据！");
        }
        return Response.success(200, "查询实时价量数据成功！", realTimeData);
    }

    @Operation(summary = "查询KPI")
    @RequestMapping("/getKPIs")
    public Response<List<KPI>> getKPIs(@RequestParam("stkCd") String stkCd) {
        List<KPI> kpiList = dataService.getKPIs(stkCd);
        return Response.success(200, "查询KPI成功！", kpiList);
    }

    @Operation(summary = "查询实际控制人")
    @RequestMapping("/getActualController")
    public Response<ActualControllerVO> getActualController(@RequestParam("stkCd") String stkCd) {
        ActualControllerVO actualControllerVO = dataService.getActualController(stkCd);
        return Response.success(200, "查询实际控制人成功！", actualControllerVO);
    }
}
