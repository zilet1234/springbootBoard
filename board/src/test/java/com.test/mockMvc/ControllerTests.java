package com.test.mockMvc;

import com.general.controller.home.MainController;
import com.test.ApplicationTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ContextConfiguration(classes= ApplicationTests.class)
@RunWith(SpringRunner.class)
@WebMvcTest(MainController.class)
@ActiveProfiles("home")
public class ControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void sampleTest() throws Exception {
        this.mockMvc.perform(
                get("/sample/Test")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .param("first", "first")
                .param("second", "40")
        ).andDo(print())
        .andExpect(status().isOk());
    }

    @Test
    public void printTest() {
        System.out.println("printTest ~ ");
    }

}
