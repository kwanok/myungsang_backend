package com.myungsang.myungsang_backend.main_feed;


import com.myungsang.myungsang_backend.file.vo.FileVO;
import com.myungsang.myungsang_backend.main_feed.iservice.MainFeedIService;
import com.myungsang.myungsang_backend.main_feed.vo.MainFeedVO;
import com.myungsang.myungsang_backend.user.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MainFeedController {

    @Autowired
    public MainFeedController(MainFeedIService mainFeedIService) {
        this.mainFeedIService = mainFeedIService;
    }

    MainFeedIService mainFeedIService;

    @GetMapping("/main/videos")
    public List<MainFeedVO> getFeed() {
        return mainFeedIService.getFeed();
    }
}
