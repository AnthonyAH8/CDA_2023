import org.example.DiceScore;
import org.example.Ide;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DiceScoreTest {
    private DiceScore diceScore;
    private Ide ide = Mockito.mock(Ide.class);

    @Test
    public void equal_2_Dices(){
        diceScore = new DiceScore();
        Mockito.when(ide.getRoll()).thenReturn(6);

    }
    @Test
    public void equality(){
        diceScore = new DiceScore();
        Mockito.when(ide.getRoll()).thenReturn(30);
    }

    @Test
    public void random(){

        diceScore = new DiceScore();

        int scoreA = 2;
        int scoreB = 4;

        Mockito.when(diceScore.getScore()).thenReturn(scoreA);
        Mockito.when(diceScore.getScore()).thenReturn(scoreB);
        Mockito.when(ide.getRoll()).thenReturn(diceScore.getScore());
        int result = ide.getRoll();
        Assert.assertEquals(scoreA, result);
    }
}
