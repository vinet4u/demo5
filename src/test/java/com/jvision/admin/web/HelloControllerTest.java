package com.jvision.admin.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void helloNew() throws Exception {
        String hello = "Hello123";
        mvc.perform(get("/hello")).andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

    @Test
    public void helloDto() throws Exception {
        String name = "부이밍뚜안";
        int amount = 1000;
        String address = "jvision";
        mvc.perform(get("/helloDto").param("name", name)
                .param("amount", String.valueOf(amount))
                .param("address", address))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)))
                .andExpect(jsonPath("$.address", is(address)));
    }
}
