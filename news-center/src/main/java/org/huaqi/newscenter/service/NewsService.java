package org.huaqi.newscenter.service;

import org.huaqi.newscenter.domain.entity.News;
import org.huaqi.newscenter.domain.vo.NewsReqVO;
import org.huaqi.newscenter.utils.Result;

import java.util.List;

public interface NewsService {
    Result<News> getNewsById(Long id);

    Result<List<News>> getLatestNews(Long count);

    Result<List<News>> getTreasuredNews(Long count);

    Result<List<News>> getTodayNews(Long count);

    Result<String> addNews(NewsReqVO newsReqVO);

    Result<String> batchAddNews(List<NewsReqVO> NewsReqVOList);
}
