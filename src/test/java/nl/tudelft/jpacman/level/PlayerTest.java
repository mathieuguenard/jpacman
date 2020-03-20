package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 * Simple test class for all methods of the class Player
 */
public class PlayerTest {
    static private PlayerFactory playerFactory;
    private Player player;

   @BeforeAll
    static void setupPlayerFactory() {
        playerFactory = new PlayerFactory(new PacManSprites());
    }

    @BeforeEach
    void setupPlayer() {
        player = playerFactory.createPacMan();
    }

    /**
     * Validate that the method isAlive() return the correct value
     */
    @Test
    void isAlive() {
        assertThat(player.isAlive()).isTrue();
        player.setAlive(false);
        assertThat(player.isAlive()).isFalse();
    }
}
