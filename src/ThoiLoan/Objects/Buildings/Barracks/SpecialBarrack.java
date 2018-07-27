package ThoiLoan.Objects.Buildings.Barracks;
import ThoiLoan.Objects.Buildings.*;
public class SpecialBarrack extends Barrack
{
    public SpecialBarrack(int level, int x, int y,  java.util.Date finishBuildingOrUpgradeTime,
                   int type, java.util.ArrayList<int[]> trainingQueue, java.util.Date startTrainingTime)
    {
        super(level, x, y,finishBuildingOrUpgradeTime, type, trainingQueue, startTrainingTime);
        TroopGroup = 1;
    }
}
