package technikal.task.fishmarket;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import technikal.task.fishmarket.models.Fish;
import technikal.task.fishmarket.services.FishRepository;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class FishRepositoryTest {

    @Autowired
    private FishRepository fishRepository;

    @Test
    void testSaveAndFind() {
        Fish fish = new Fish();
        fish.setName("Лящ");
        fish.setPrice(90.0);

        Fish saved = fishRepository.save(fish);
        Fish found = fishRepository.findById(saved.getId()).orElse(null);

        assertThat(found).isNotNull();
        assertThat(found.getName()).isEqualTo("Лящ");
    }
}
