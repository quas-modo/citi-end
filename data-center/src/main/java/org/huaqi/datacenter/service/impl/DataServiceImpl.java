package org.huaqi.datacenter.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.huaqi.datacenter.domain.entity.*;
import org.huaqi.datacenter.domain.vo.*;
import org.huaqi.datacenter.mapper.*;
import org.huaqi.datacenter.service.DataService;
import org.huaqi.datacenter.utils.*;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author whm
 * @date 2024/2/28 22:21
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class DataServiceImpl implements DataService {
    private final ProfitMapper profitMapper;

    private final BalanceSheetMapper balanceSheetMapper;

    private final CashFlowMapper cashFlowMapper;

    private final DebtSCMapper debtSCMapper;

    private final DevSMapper devSMapper;

    private final ManageAbilityMapper manageAbilityMapper;

    private final ProfitabilityMapper profitabilityMapper;

    private final BasicInformationMapper basicInformationMapper;

    private final CapitalStructureMapper capitalStructureMapper;

    private final TTShMapper ttShMapper;

    private final TTPShMapper ttpShMapper;

    private final NumOfShMapper numOfShMapper;

    private final FundHoldingsMapper fundHoldingsMapper;

    private final StockPledgeFreezeCustodyMapper stockPledgeFreezeCustodyMapper;

    private final CapitalChangeMapper capitalChangeMapper;

    private final RestrictedSaleMapper restrictedSaleMapper;

    private final RelatedTransactionMapper relatedTransactionMapper;

    private final LitigationArbitrationMapper litigationArbitrationMapper;

    private final StockInvestmentMapper stockInvestmentMapper;

    private final RealTimeDataMapper realTimeDataMapper;

    private final KPIMapper kpiMapper;

    private final ActualControllerMapper actualControllerMapper;

    private final InformationMapper informationMapper;

    @Override
    public List<ProfitVO> getProfitTable(String stkCd) {
        log.info("查询证券 {} 的利润表", stkCd);
        LambdaQueryWrapper<Profit> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Profit::getStkCd, stkCd).eq(Profit::getTyprep, "A");
        List<Profit> list = profitMapper.selectList(queryWrapper);

        List<ProfitVO> profitVOList = ConvertUtil.entityToVoList(list, ProfitVO.class);
        if(profitVOList.isEmpty()) {
            log.warn("未查询到证券 {} 的利润表", stkCd);
        }
        return profitVOList;
    }

    @Override
    public List<BalanceSheetVO> getBalanceSheet(String stkCd) {
        log.info("查询证券 {} 的资产负债表", stkCd);
        LambdaQueryWrapper<BalanceSheet> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(BalanceSheet::getStkCd, stkCd).eq(BalanceSheet::getTyprep, "A");
        List<BalanceSheet> list = balanceSheetMapper.selectList(queryWrapper);

        List<BalanceSheetVO> balanceSheetVOList = ConvertUtil.entityToVoList(list, BalanceSheetVO.class);
        if(balanceSheetVOList.isEmpty()) {
            log.warn("未查询到证券 {} 的资产负债表", stkCd);
        }
        return balanceSheetVOList;
    }

    @Override
    public List<CashFlowVO> getCashFlow(String stkCd) {
        log.info("查询证券 {} 的现金流量表", stkCd);
        LambdaQueryWrapper<CashFlow> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(CashFlow::getStkCd, stkCd).eq(CashFlow::getTyprep, "A");
        List<CashFlow> list = cashFlowMapper.selectList(queryWrapper);

        List<CashFlowVO> cashFlowVOList = ConvertUtil.entityToVoList(list, CashFlowVO.class);
        if(cashFlowVOList.isEmpty()) {
            log.warn("未查询到证券 {} 的现金流量表", stkCd);
        }
        return cashFlowVOList;
    }

    @Override
    public List<DebtSCVO> getDebtSC(String stkCd) {
        log.info("查询证券 {} 的偿债能力", stkCd);
        LambdaQueryWrapper<DebtServicingCapacity> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DebtServicingCapacity::getStkCd, stkCd).eq(DebtServicingCapacity::getTyprep, "A");
        List<DebtServicingCapacity> list = debtSCMapper.selectList(queryWrapper);

        List<DebtSCVO> debtSCVOList = ConvertUtil.entityToVoList(list, DebtSCVO.class);
        if(debtSCVOList.isEmpty()) {
            log.warn("未查询到证券 {} 的偿债能力", stkCd);
        }
        return debtSCVOList;
    }

    @Override
    public List<DevCVO> getDevC(String stkCd) {
        log.info("查询证券 {} 的发展能力", stkCd);
        LambdaQueryWrapper<DevelopmentCapacity> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DevelopmentCapacity::getStkCd, stkCd).eq(DevelopmentCapacity::getTypreq, "A");
        List<DevelopmentCapacity> list = devSMapper.selectList(queryWrapper);

        List<DevCVO> devCVOList = ConvertUtil.entityToVoList(list, DevCVO.class);
        if(devCVOList.isEmpty()) {
            log.warn("未查询到证券 {} 的发展能力", stkCd);
        }
        return devCVOList;
    }

    @Override
    public List<ManageAbilityVO> getManageAbility(String stkCd) {
        log.info("查询证券 {} 的经营能力", stkCd);
        LambdaQueryWrapper<ManagerialAbility> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(ManagerialAbility::getStkCd, stkCd).eq(ManagerialAbility::getTyprep, "A");
        List<ManagerialAbility> list = manageAbilityMapper.selectList(queryWrapper);

        List<ManageAbilityVO> manageAbilityVOList = ConvertUtil.entityToVoList(list, ManageAbilityVO.class);
        if(manageAbilityVOList.isEmpty()) {
            log.warn("未查询到证券 {} 的经营能力", stkCd);
        }
        return manageAbilityVOList;
    }

    @Override
    public List<ProfitabilityVO> getProfitability(String stkCd) {
        log.info("查询证券 {} 的盈利能力", stkCd);
        LambdaQueryWrapper<Profitability> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Profitability::getStkCd, stkCd).eq(Profitability::getTyprep, "A");
        List<Profitability> list = profitabilityMapper.selectList(queryWrapper);

        List<ProfitabilityVO> profitabilityVOList = ConvertUtil.entityToVoList(list, ProfitabilityVO.class);
        if(profitabilityVOList.isEmpty()) {
            log.warn("未查询到证券 {} 的盈利能力", stkCd);
        }
        return profitabilityVOList;
    }

    @Override
    public BasicInformationVO getBasicInformation(String stkCd) {
        log.info("获取公司 {} 的基本信息", stkCd);
        LambdaQueryWrapper<BasicInformation> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(BasicInformation::getStkCd, stkCd);
        // 获取统计截止日期最新的一条
        queryWrapper.orderByDesc(BasicInformation::getEndDate).last("limit 1");
        BasicInformation basicInformation = basicInformationMapper.selectOne(queryWrapper);
        if(basicInformation == null) {
            log.warn("未查询到公司 {} 的基本信息", stkCd);
            return null;
        }
        return ConvertUtil.entityToVo(basicInformation,
                BasicInformationVO.class);
    }

    @Override
    public List<CapitalStructureVO> getCapitalStructure(String stkCd) {
        log.info("查询证券 {} 的股本结构", stkCd);
        LambdaQueryWrapper<CapitalStructure> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(CapitalStructure::getStkCd, stkCd);
        List<CapitalStructure> list = capitalStructureMapper.selectList(queryWrapper);

        List<CapitalStructureVO> capitalStructureVOList = ConvertUtil.entityToVoList(list, CapitalStructureVO.class);
        if(capitalStructureVOList.isEmpty()) {
            log.warn("未查询到证券 {} 的股本结构", stkCd);
        }
        return capitalStructureVOList;
    }

    @Override
    public List<String> getTTShReportDate(String stkCd) {
        log.info("获取公司 {} 的十大股东财报可选的日期", stkCd);
        LambdaQueryWrapper<Top_Ten_Shareholders> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Top_Ten_Shareholders::getStkCd, stkCd).select(Top_Ten_Shareholders::getReptDt)
                .groupBy(Top_Ten_Shareholders::getReptDt);
        List<String> list = ttShMapper.selectList(queryWrapper).stream().map(Top_Ten_Shareholders::getReptDt).toList();

        List<String> res = new ArrayList<>(list.size());
        for(String s : list) {
            StringBuilder sb = new StringBuilder(s.substring(0, 4) + " ");
            String date = s.substring(5);
            switch (date) {
                case "03-31":
                    sb.append("一季报");
                    break;
                case "06-30":
                    sb.append("中报");
                    break;
                case "09-30":
                    sb.append("三季报");
                    break;
                case "12-31":
                    sb.append("年报");
                    break;
                default:
                    sb.append("未知");
            }
            res.add(sb.toString());
        }
        return res;
    }

    @Override
    public List<TTShTable> getTopTenShareholders(String stkCd, List<String> reportDate) {
        log.info("查询公司 {} 的十大股东", stkCd);

        List<TTShTable> ans = new ArrayList<>(reportDate.size());
        for(String date : reportDate) {
            TTShTable table= new TTShTable();
            table.setTitle(date);
            ans.add(table);
        }

        changeTableType2Date(reportDate);
        LambdaQueryWrapper<Top_Ten_Shareholders> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Top_Ten_Shareholders::getStkCd, stkCd).in(Top_Ten_Shareholders::getReptDt, reportDate);
        List<Top_Ten_Shareholders> list = ttShMapper.selectList(queryWrapper);

        List<TTShVO> ttShVOList = ConvertUtil.entityToVoList(list, TTShVO.class);
        if(ttShVOList.isEmpty()) {
            log.warn("未查询到公司 {} 的十大股东", stkCd);
            return null;
        }

        for(int i = 0; i < ans.size(); i++) {
            TTShTable table = ans.get(i);
            List<TTShVO> data = new ArrayList<>();
            for(TTShVO vo : ttShVOList) {
                if(vo.getReptDt().equals(reportDate.get(i))) {
                    data.add(vo);
                }
            }
            data.sort((o1, o2) -> {
                int rank1 = Integer.parseInt(o1.getS0306a());
                int rank2 = Integer.parseInt(o2.getS0306a());
                return Integer.compare(rank1, rank2);
            });
            table.setData(data);
        }
        return ans;
    }

    private void changeTableType2Date(List<String> reportDate) {
        for(int i = 0;  i< reportDate.size(); i++) {
            String date = reportDate.get(i).substring(0, 4) + "-";
            switch (reportDate.get(i).substring(5)) {
                case "一季报":
                    date += "03-31";
                    break;
                case "中报":
                    date += "06-30";
                    break;
                case "三季报":
                    date += "09-30";
                    break;
                case "年报":
                    date += "12-31";
                    break;
                default:
                    date += "01-01";
            }
            reportDate.set(i, date);
        }
    }

    @Override
    public List<TTPShTable> getTopTenPublicShareholders(String stkCd, List<String> reportDate) {
        log.info("查询公司 {} 的十大流通股东", stkCd);

        List<TTPShTable> ans = new ArrayList<>(reportDate.size());
        for(String date : reportDate) {
            TTPShTable table= new TTPShTable();
            table.setTitle(date);
            ans.add(table);
        }
        changeTableType2Date(reportDate);
        LambdaQueryWrapper<Top_Ten_Public_Shareholders> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Top_Ten_Public_Shareholders::getStkCd, stkCd).in(Top_Ten_Public_Shareholders::getReptDt, reportDate);
        List<Top_Ten_Public_Shareholders> list = ttpShMapper.selectList(queryWrapper);

        List<TTPShVO> ttpShVOList = ConvertUtil.entityToVoList(list, TTPShVO.class);
        if(ttpShVOList.isEmpty()) {
            log.warn("未查询到公司 {} 的十大流通股东", stkCd);
            return null;
        }

        for(int i = 0; i < ans.size(); i++) {
            TTPShTable table = ans.get(i);
            List<TTPShVO> data = new ArrayList<>();
            for(TTPShVO vo : ttpShVOList) {
                if(vo.getReptDt().equals(reportDate.get(i))) {
                    data.add(vo);
                }
            }
            data.sort((o1, o2) -> {
                int rank1 = Integer.parseInt(o1.getS0404a());
                int rank2 = Integer.parseInt(o2.getS0404a());
                return Integer.compare(rank1, rank2);
            });
            table.setData(data);
        }
        return ans;
    }

    @Override
    public List<NumOfShVO> getShareholders(String stkCd) {
        log.info("查询公司 {} 的股东人数", stkCd);
        LambdaQueryWrapper<NumOfShareholders> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(NumOfShareholders::getStkCd, stkCd);
        List<NumOfShareholders> list = numOfShMapper.selectList(queryWrapper);

        List<NumOfShVO> res = new ArrayList<>(list.size());
        for(int i = 0; i < list.size(); i++) {
            NumOfShVO vo = new NumOfShVO();
            vo.setStkCd(list.get(i).getStkCd());
            vo.setReptDt(list.get(i).getReptDt());
            vo.setS0101(list.get(i).getS0101());
            if (i > 0) {
                Double rate = (Double.parseDouble(list.get(i).getS0101()) - Double.parseDouble(list.get(i - 1).getS0101())) / Double.parseDouble(list.get(i - 1).getS0101()) * 100;
                vo.setChangeRate(String.format("%.2f", rate));
            } else {
                vo.setChangeRate(null);
            }
            res.add(vo);
        }
        return res;
    }

    @Override
    public List<String> getFundHoldingsReportDate(String stkCd) {
        log.info("获取公司 {} 的基金持股可选的日期", stkCd);
        LambdaQueryWrapper<FundHoldings> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(FundHoldings::getStkCd, stkCd).select(FundHoldings::getReptDt).groupBy(FundHoldings::getReptDt);
        List<String> list = fundHoldingsMapper.selectList(queryWrapper).stream().map(FundHoldings::getReptDt).toList();
        if(list.isEmpty()) {
            log.warn("未查询到公司 {} 的基金持股可选的日期", stkCd);
            return null;
        }
        return list;
    }

    @Override
    public List<FundHoldingsVO> getFundHoldings(String stkCd, List<String> reportDate) {
        log.info("查询公司 {} 的基金持股", stkCd);
        LambdaQueryWrapper<FundHoldings> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(FundHoldings::getStkCd, stkCd).in(FundHoldings::getReptDt, reportDate);
        List<FundHoldings> list = fundHoldingsMapper.selectList(queryWrapper);

        List<FundHoldingsVO> res = ConvertUtil.entityToVoList(list, FundHoldingsVO.class);
        res.sort((o1, o2) -> {
            double hold1 = Double.parseDouble(o1.getFundHold());
            double hold2 = Double.parseDouble(o2.getFundHold());
            return Double.compare(hold2, hold1);
        });
        return res;
    }

    @Override
    public List<StockPledgeFreezeCustodyVO> getStockPledgeFreezeCustody(String stkCd) {
        log.info("查询公司 {} 的股票质押、冻结、托管", stkCd);
        LambdaQueryWrapper<StockPledgeFreezeCustody> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(StockPledgeFreezeCustody::getStkCd, stkCd);
        List<StockPledgeFreezeCustody> list = stockPledgeFreezeCustodyMapper.selectList(queryWrapper);

        List<StockPledgeFreezeCustodyVO> res = new ArrayList<>(list.size());
        for(StockPledgeFreezeCustody s : list) {
            StockPledgeFreezeCustodyVO vo = new StockPledgeFreezeCustodyVO();
            vo.setStkCd(stkCd);
            vo.setReptDt(s.getReptDt());
            vo.setS0301a(s.getS0301a());
            vo.setS0302b(s.getS0302b());

            LambdaQueryWrapper<CapitalStructure> queryWrapper1 = new LambdaQueryWrapper<>();
            queryWrapper1.eq(CapitalStructure::getStkCd, stkCd).eq(CapitalStructure::getReptDt, s.getReptDt());
            CapitalStructure capitalStructure = capitalStructureMapper.selectOne(queryWrapper1);
            if(capitalStructure != null) {
                double nshrttl = Double.parseDouble(capitalStructure.getNshrttl());
                double rate = Double.parseDouble(s.getS0302b()) / nshrttl * 100;
                vo.setRate(rate);
            }

            if (s.getS0303b() != null && !s.getS0303b().equals("0")) {
                vo.setStatus(Status.Pledge);
            }
            if(s.getS0304b() != null && !s.getS0304b().equals("0")) {
                vo.setStatus(Status.Freeze);
            }
            if(s.getS0305b() != null && !s.getS0305b().equals("0")) {
                vo.setStatus(Status.Custody);
            }
            // 其他找不到最终所属的都归到质押
            if (vo.getStatus() == null) {
                vo.setStatus(Status.Pledge);
            }

            res.add(vo);
        }
        return res;
    }

    @Override
    public List<CapitalChangeVO> getCapitalChange(String stkCd) {
        log.info("查询公司 {} 的股权变动", stkCd);
        LambdaQueryWrapper<CapitalChange> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(CapitalChange::getStkCd, stkCd);
        List<CapitalChange> list = capitalChangeMapper.selectList(queryWrapper);

        List<CapitalChangeVO> res = ConvertUtil.entityToVoList(list, CapitalChangeVO.class);
        for(CapitalChangeVO vo : res) {
            vo.setS0803a(CapitalChangeUtil.getChangeType(vo.getS0803a()));
            vo.setS0804a(CapitalChangeUtil.getChangeStatus(vo.getS0804a()));
            vo.setS0816a(CapitalChangeUtil.getControlChange(vo.getS0816a()));
        }
        return res;
    }

    @Override
    public List<RelatedTransactionVO> getRelatedTransaction(String stkCd) {
        log.info("查询公司 {} 的关联交易", stkCd);
        LambdaQueryWrapper<RelatedTransaction> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(RelatedTransaction::getStkCd, stkCd);
        List<RelatedTransaction> list = relatedTransactionMapper.selectList(queryWrapper);

        List<RelatedTransactionVO> res = ConvertUtil.entityToVoList(list, RelatedTransactionVO.class);
        for(RelatedTransactionVO vo : res) {
            vo.setDirection(RelatedTransactionUtil.getDirection(vo.getDirection()));
            vo.setTrasub(RelatedTransactionUtil.getTrasub(vo.getTrasub()));
            vo.setRepat(RelatedTransactionUtil.getRepat(vo.getRepat()));
            vo.setCurType(RelatedTransactionUtil.getCurType(vo.getCurType()));
            vo.setPrincipl(RelatedTransactionUtil.getPrincpl(vo.getPrincipl()));
        }
        return res;
    }

    @Override
    public List<RestrictedSaleVO> getRestrictedSale(String stkCd) {
        log.info("查询公司 {} 的限售解禁", stkCd);
        LambdaQueryWrapper<RestrictedSale> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(RestrictedSale::getStkCd, stkCd);
        List<RestrictedSale> list = restrictedSaleMapper.selectList(queryWrapper);

        List<RestrictedSaleVO> res = ConvertUtil.entityToVoList(list, RestrictedSaleVO.class);
        for(RestrictedSaleVO vo : res) {
            vo.setListedSharesType(RestrictedSaleUtil.getLSType(vo.getListedSharesType()));
        }

        /*
          依据解禁日期降序排序
         */
        res.sort((o1, o2) -> {
            String date1 = o1.getCirculationDate();
            String date2 = o2.getCirculationDate();
            return date2.compareTo(date1);
        });
        return res;
    }

    @Override
    public List<LitigationArbitrationVO> getLitigationArbitration(String stkCd) {
        log.info("查询公司 {} 的诉讼仲裁", stkCd);
        LambdaQueryWrapper<LitigationArbitration> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(LitigationArbitration::getStkCd, stkCd);
        List<LitigationArbitration> list = litigationArbitrationMapper.selectList(queryWrapper);

        List<LitigationArbitrationVO> res = ConvertUtil.entityToVoList(list, LitigationArbitrationVO.class);
        for(LitigationArbitrationVO vo : res) {
            vo.setPlaintiffToCo(LitigationArbitrationUtil.getPlaintiffToCo(vo.getPlaintiffToCo()));
            vo.setJtRespblyToCo(LitigationArbitrationUtil.getJtRespblyToCo(vo.getJtRespblyToCo()));
            vo.setDefendantToCo(LitigationArbitrationUtil.getDefendantToCo(vo.getDefendantToCo()));
            vo.setOthersToCo(LitigationArbitrationUtil.getOthersToCo(vo.getOthersToCo()));
        }
        return res;
    }

    /**
     * 查询股票列表
     */
    @Override
    public List<HashMap<String, String>> getStockList() {
        LambdaQueryWrapper<BasicInformation> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.select(BasicInformation::getStkCd, BasicInformation::getShortName);
        List<BasicInformation> list = basicInformationMapper.selectList(queryWrapper);
        List<HashMap<String, String>> res = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            if(i < list.size() - 1 && list.get(i).getStkCd().equals(list.get(i + 1).getStkCd())) {
                continue;
            }
            HashMap<String, String> map = new HashMap<>();
            map.put("value", list.get(i).getStkCd());
            map.put("label", list.get(i).getStkCd()+"   "+list.get(i).getShortName());
            res.add(map);
        }
        return res;
    }

    @Override
    public List<StockInvestmentVO> getLatestStockInvestment(String stkCd) {
        log.info("查询公司 {} 的最新股权投资", stkCd);
        LambdaQueryWrapper<StockInvestment> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(StockInvestment::getStkCd, stkCd);
        queryWrapper.orderByDesc(StockInvestment::getEndDate);
        List<StockInvestment> list = stockInvestmentMapper.selectList(queryWrapper);

        List<StockInvestmentVO> res = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            if(i > 0 && !list.get(i).getEndDate().equals(list.get(i - 1).getEndDate())) {
                break;
            } else {
                LambdaQueryWrapper<Information> queryWrapper1 = new LambdaQueryWrapper<>();
                queryWrapper1.eq(Information::getStkAbbr, list.get(i).getHoldInstitutionName());
                Information information = informationMapper.selectOne(queryWrapper1);
                String industry = null;
                if(information == null) {
                    log.warn("未查询到东方财富个股信息 {} ", list.get(i).getHoldInstitutionName());
                } else {
                    industry = information.getIndustry();
                }

                LambdaQueryWrapper<BasicInformation> queryWrapper2 = new LambdaQueryWrapper<>();
                queryWrapper2.eq(BasicInformation::getFullName,
                        list.get(i).getHoldInstitutionName()).or().eq(BasicInformation::getShortName, list.get(i).getHoldInstitutionName());
                queryWrapper2.orderByDesc(BasicInformation::getEndDate).last("limit 1");
                BasicInformation basicInformation = basicInformationMapper.selectOne(queryWrapper2);
                String investCompany = null;
                if(basicInformation != null) {
                    investCompany = basicInformation.getStkCd();
                } else {
                    log.warn("未查询到公司 {} 的基本信息", list.get(i).getHoldInstitutionName());
                }

                StockInvestmentVO stockInvestmentVO = new StockInvestmentVO(stkCd,
                        list.get(i).getEndDate(), list.get(i).getHoldInstitutionName(), list.get(i).getEndDateRatio(), industry, investCompany);
                res.add(stockInvestmentVO);
            }
        }
        res.sort(Comparator.comparing(StockInvestmentVO::getIndustry, Comparator.nullsLast(String::compareTo)));
        return res;
    }

    @Override
    public RealTimeData getRealTimeData(String stkCd) {
        log.info("查询公司 {} 的实时数据", stkCd);
        LambdaQueryWrapper<RealTimeData> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(RealTimeData::getStkCd, stkCd);
        RealTimeData data = realTimeDataMapper.selectOne(queryWrapper);
        if(data == null) {
            log.warn("未查询到公司 {} 的实时数据", stkCd);
            return null;
        }
        return data;
    }

    @Override
    public List<KPI> getKPIs(String stkCd) {
        LambdaQueryWrapper<KPI> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(KPI::getStkCd, stkCd);
        return kpiMapper.selectList(queryWrapper);
    }

    @Override
    public ActualControllerVO getActualController(String stkCd) {
        LambdaQueryWrapper<ActualController> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(ActualController::getStkCd, stkCd);
        queryWrapper.eq(ActualController::getS0701a, "2");
        List<ActualController> list = actualControllerMapper.selectList(queryWrapper);
        Arrays.sort(list.toArray(), (o1, o2) -> {
            ActualController a1 = (ActualController) o1;
            ActualController a2 = (ActualController) o2;
            return a2.getReptDt().compareTo(a1.getReptDt());
        });
        return ConvertUtil.entityToVo(list.get(list.size() - 1), ActualControllerVO.class);
    }
}
