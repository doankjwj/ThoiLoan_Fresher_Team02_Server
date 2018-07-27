package ThoiLoan.Objects.Buildings;
import ThoiLoan.Objects.*;
public class ArmyCamp extends Building
{
    public ArmyCamp(int level, int x, int y, java.util.Date finishBuildingOrUpgradeTime, int type)
    {
        super(level, x, y, finishBuildingOrUpgradeTime, type);
    }
    public int GetCapacity()
    {
        return ((ThoiLoan.Config.Buildings.Upgrades.ArmyCampLevelConfig)ThoiLoan.Config.BuildingConfig.Types[Type].Levels[Level])
               .Capacity;
    }
}
