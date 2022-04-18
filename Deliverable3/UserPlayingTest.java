/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package blackjack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Yusen
 */
public class UserPlayingTest {
    
    public UserPlayingTest() {
    }

    @Test
    public void testSetName() {
        String name ="Peter";
        Player instance = new UserPlaying(null);
        instance.setName(name);
    }
    
}
