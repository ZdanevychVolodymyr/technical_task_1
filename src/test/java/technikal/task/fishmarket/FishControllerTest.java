package technikal.task.fishmarket;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class FishControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @WithMockUser(username = "user", roles = {"USER"})
    public void testHomePageLoads() throws Exception {
        mockMvc.perform(get("/fish"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
                .andExpect(model().attributeExists("fishlist"));

    }

    @Test
    @WithMockUser(username = "admin", roles = {"ADMIN"})
    void testAddFishFormLoads() throws Exception {
        mockMvc.perform(get("/fish/create"))
                .andExpect(status().isOk())
                .andExpect(view().name("createFish"));
    }


}
