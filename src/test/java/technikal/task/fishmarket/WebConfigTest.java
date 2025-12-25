package technikal.task.fishmarket;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class WebConfigTest {

    @Autowired
    private WebConfig webConfig;

    @Test
    void testWebConfigContext(){
        assertNotNull(webConfig, "Конфігурація WebConfig має бути ініціалізована");
    }
}
