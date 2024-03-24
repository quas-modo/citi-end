package org.huaqi.newscenter.controller;

import lombok.RequiredArgsConstructor;
import org.huaqi.newscenter.domain.entity.News;
import org.huaqi.newscenter.domain.vo.NewsReqVO;
import org.huaqi.newscenter.service.NewsService;
import org.huaqi.newscenter.utils.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/news")
@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
public class NewsController {
    private final NewsService newsService;

    @GetMapping("/news")
    public Result<News> getNews(@RequestParam Long id) {
        return newsService.getNewsById(id);
    }

    @GetMapping("/latest_news")
    public Result<List<News>> getLatestNews(@RequestParam Long count) {
        return newsService.getLatestNews(count);
    }

    @GetMapping("/treasured_news")
    public Result<List<News>> getTreasuredNews(@RequestParam(defaultValue = "5") Long count) {
        return newsService.getTreasuredNews(count);
    }

    @GetMapping("/today_news")
    public Result<List<News>> getTodayNews(@RequestParam(defaultValue = "5") Long count) {
        return newsService.getTodayNews(count);
    }


    @PostMapping("/add")
    public Result<String> addNews(@RequestBody NewsReqVO newsReqVO) {
        return newsService.addNews(newsReqVO);
    }

    @PostMapping("/add_batch")
    public Result<String> addNewsBatch(@RequestBody List<NewsReqVO> newsReqVOList) {
        return newsService.batchAddNews(newsReqVOList);
    }
}
