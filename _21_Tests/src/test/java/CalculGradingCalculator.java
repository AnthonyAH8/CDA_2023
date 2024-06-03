import org.example.GradingCalculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculGradingCalculator {

    private CalculGradingCalculator calculGradingCalculator;

    @Test
    public void Score_1 (){
        GradingCalculator gradingCalculator = new GradingCalculator(95, 90);

        Assert.assertEquals('A', gradingCalculator.getGrade());
    }
    @Test
    public void Score_2(){
        GradingCalculator gradingCalculator = new GradingCalculator(85, 90);
            Assert.assertEquals('B', gradingCalculator.getGrade());
    }
    @Test
    public void Score_3(){
        GradingCalculator gradingCalculator = new GradingCalculator(65, 90);
        Assert.assertEquals('C', gradingCalculator.getGrade());
    }
    @Test
    public void Score_4(){
        GradingCalculator gradingCalculator = new GradingCalculator(95, 65);
        Assert.assertEquals('B', gradingCalculator.getGrade());
    }
    @Test
    public void Score_5(){
        GradingCalculator gradingCalculator = new GradingCalculator(95, 55);
        Assert.assertEquals('F', gradingCalculator.getGrade());
    }
    @Test
    public void Score_6(){
        GradingCalculator gradingCalculator = new GradingCalculator(65, 55);
        Assert.assertEquals('F', gradingCalculator.getGrade());
    }
    @Test
    public void Score_7(){
        GradingCalculator gradingCalculator = new GradingCalculator(50, 90);
        Assert.assertEquals('F', gradingCalculator.getGrade());
    }
}
