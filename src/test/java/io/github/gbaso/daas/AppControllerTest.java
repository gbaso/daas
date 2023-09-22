package io.github.gbaso.daas;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(AppController.class)
class AppControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("Any request should be denied with a 418 code")
    void deny() throws Exception {
        mockMvc
                .perform(get("/"))
                .andExpect(status().is4xxClientError())
                .andExpect(status().isIAmATeapot());
    }

}
