package net.xdclass.demoproject;

import junit.framework.TestCase;
import net.xdclass.demoproject.domain.Video;
import net.xdclass.demoproject.service.VideoService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.nio.charset.Charset;
import java.util.List;

@RunWith(SpringRunner.class)//底层用Junit   SpringJUnit4ClassRunner
@SpringBootTest(classes = {DemoProjectApplication.class})//启动整个springboot工程
@AutoConfigureMockMvc
public class VideoTest {

    @Autowired
    private VideoService videoService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testVideoListApi() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/pub/video/list"))
                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        int status = mvcResult.getResponse().getStatus();
        System.out.println(status);
        String result = mvcResult.getResponse().getContentAsString(Charset.forName("UTF-8"));
        System.out.println(result);
    }


    @Before
    public void testBefore() {
        System.out.println("这个是测试@Before");
    }

    @Test
    public void testVideoList() {
        List<Video> videoList = videoService.queryAllVideoList();
        TestCase.assertTrue(videoList.size() > 0);
    }

    @After
    public void testAfter() {
        System.out.println("这个是测试@After");
    }
}
