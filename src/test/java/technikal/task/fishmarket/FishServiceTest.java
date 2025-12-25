package technikal.task.fishmarket;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import technikal.task.fishmarket.models.Fish;
import technikal.task.fishmarket.services.FishRepository;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class FishServiceTest {

    @Mock
    private FishRepository repo;


    @Test
    void testFindFishById() {
        Fish fish = new Fish();
        fish.setId(5);
        fish.setName("Лящ")
        ;
        Mockito.when(repo.findById(5)).thenReturn(Optional.of(fish));

        Optional<Fish> result = repo.findById(5);

        assertTrue(result.isPresent(), "Риба має бути знайдена");
        assertEquals("Лящ", result.get().getName());
        verify(repo, times(1)).findById(5);
    }
}
