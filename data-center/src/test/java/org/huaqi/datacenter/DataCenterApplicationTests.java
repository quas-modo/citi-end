package org.huaqi.datacenter;

import org.huaqi.datacenter.domain.vo.BalanceSheetVO;
import org.huaqi.datacenter.domain.vo.BasicInformationVO;
import org.huaqi.datacenter.domain.vo.ProfitVO;
import org.huaqi.datacenter.mapper.DebtServicingMapper;
import org.huaqi.datacenter.mapper.ProfitMapper;
import org.huaqi.datacenter.service.DataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@ActiveProfiles("dev")
class DataCenterApplicationTests {
    @Autowired
    private DataService dataService;

    @Test
    void contextLoads() {
    }

    @Test
    void testDebtServicing() {
        List<ProfitVO> list = dataService.getProfitTable("000001");
        list.forEach(System.out::println);

//        List<Profit> profits = profitMapper.selectList(new LambdaQueryWrapper<Profit>().eq(Profit::getShortName, "深发展A"));
//        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i).getB001000000());
//            System.out.println(profits.get(i).getB001000000());
//        }
    }

    @Test
    void testBalanceSheet() {
        List<BalanceSheetVO> list = dataService.getBalanceSheet("000001");
        list.forEach(System.out::println);
    }

    @Test
    void testBasicInformation(){
        BasicInformationVO vo = dataService.getBasicInformation("000001");
        System.out.println(vo);
    }

    @Test
    void testTTShReportDate(){
        List<String> list = dataService.getTTShReportDate("000001");
        list.forEach(System.out::println);
    }

    @Test
    void testTTSh() {
        List<String> reportDate = new ArrayList<>() {{
            add("2021 年报");
            add("2022 一季报");
            add("2022 中报");
        }};
        dataService.getTopTenShareholders("000001", reportDate).forEach(System.out::println);
    }

    @Test
    void testNumOfSh() {
        dataService.getShareholders("000001").forEach(System.out::println);
    }

    @Test
    void testRestrictedSale() {
        dataService.getRestrictedSale("000001").forEach(System.out::println);
    }

    @Test
    void testManageAbility() {
        dataService.getManageAbility("000001").forEach(System.out::println);
    }

    @Test
    void testProfitability() {
        dataService.getProfitability("000001").forEach(System.out::println);
    }

    @Test
    void testCapitalStructure() {
        dataService.getCapitalStructure("000001").forEach(System.out::println);
    }

    @Test
    void testTTPSh() {
        List<String> reportDate = new ArrayList<>() {{
            add("2021 年报");
            add("2022 一季报");
            add("2022 中报");
        }};
        dataService.getTopTenPublicShareholders("000001", reportDate).forEach(System.out::println);
    }

    @Test
    void testStockPledgeFreezeCustody() {
        dataService.getStockPledgeFreezeCustody("000001").forEach(System.out::println);
    }

    @Test
    void testCapitalChange() {
        dataService.getCapitalChange("000001").forEach(System.out::println);
    }

    @Test
    void testLitigationArbitration() {
        dataService.getLitigationArbitration("000004").forEach(System.out::println);
    }

    @Test
    void testGetFundHoldingsReportDate() {
        dataService.getFundHoldingsReportDate("000001").forEach(System.out::println);
    }

    @Test
    void testGetFundHoldings() {
        List<String> reportDate = new ArrayList<>() {{
            add("2018-10-07");
            add("2018-12-09");
            add("2020-11-22");
        }};
        dataService.getFundHoldings("000001", reportDate).forEach(System.out::println);
    }

    @Test
    void testGetStockName() {
        dataService.getStockList().forEach(System.out::println);
    }

    @Test
    void testGetLatestStockInvestment() {
        dataService.getLatestStockInvestment("000001").forEach(System.out::println);
    }

    @Test
    void testKPIs() {
        dataService.getKPIs("000001").forEach(System.out::println);
    }

    @Test
    void testActualController() {
        System.out.println(dataService.getActualController("000001"));
    }
}
