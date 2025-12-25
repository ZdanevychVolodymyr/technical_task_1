package technikal.task.fishmarket;

import org.junit.jupiter.api.Test;

import technikal.task.fishmarket.models.Fish;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FishPropertiesTest {

    @Test
    void testFishProperties(){
        Fish fish = new Fish();
        fish.setId(1);
        fish.setName("Korop");
        fish.setPrice(120.0);

        assertEquals(1, fish.getId());
        assertEquals("Korop", fish.getName());
        assertEquals(120.0, fish.getPrice());

    }
}
