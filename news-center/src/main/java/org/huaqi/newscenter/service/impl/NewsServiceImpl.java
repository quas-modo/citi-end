package org.huaqi.newscenter.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.huaqi.newscenter.domain.entity.News;
import org.huaqi.newscenter.domain.vo.NewsReqVO;
import org.huaqi.newscenter.mapper.NewsMapper;
import org.huaqi.newscenter.service.NewsService;
import org.huaqi.newscenter.utils.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {
    private final NewsMapper newsMapper;

    @Override
    public Result<News> getNewsById(Long id) {
        return Result.success(newsMapper.selectById(id));
    }

    @Override
    public Result<List<News>> getLatestNews(Long count) {
        LambdaQueryWrapper<News> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByDesc(false, News::getDate); // 按照 pub_date 字段倒序排序

        // 创建分页对象，限制返回的结果数量为10条
        Page<News> page = new Page<>(1, count);

        List<News> newsList = newsMapper.selectPage(page, queryWrapper).getRecords();
        return Result.success(newsList);
    }

    @Override
    public Result<List<News>> getTreasuredNews(Long count) {
        LambdaQueryWrapper<News> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(News::getIsTreasured, true);
        queryWrapper.last("limit " + count);
        List<News> newsList = newsMapper.selectList(queryWrapper);
        return Result.success(newsList);
    }

    @Override
    public Result<List<News>> getTodayNews(Long count) {
        LambdaQueryWrapper<News> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByDesc(false, News::getDate); // 按照 pub_date 字段倒序排序
        queryWrapper.last("limit " + count);
        List<News> newsList = newsMapper.selectList(queryWrapper);
        return Result.success(newsList);
    }

    @Override
    public Result<String> addNews(NewsReqVO newsReqVO) {
        News news = new News(newsReqVO.getTitle(),
                newsReqVO.getSource(),
                newsReqVO.getDate(),
                newsReqVO.getContent(),
                newsReqVO.getIsTreasured());

        newsMapper.insert(news);
        return Result.success("Add a news to database.");
    }

    @Override
    public Result<String> batchAddNews(List<NewsReqVO> newsReqVOList) {
        for (NewsReqVO newsReqVO : newsReqVOList) {
            News news = new News(newsReqVO.getTitle(),
                    newsReqVO.getSource(),
                    newsReqVO.getDate(),
                    newsReqVO.getContent(),
                    newsReqVO.getIsTreasured());
            newsMapper.insert(news);
        }
        return Result.success("Add " + newsReqVOList.size() + " news to database.");
    }
}
