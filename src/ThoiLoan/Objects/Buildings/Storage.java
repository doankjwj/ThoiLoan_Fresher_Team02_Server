package ThoiLoan.Objects.Buildings;
import ThoiLoan.Objects.*;
public abstract class Storage extends Building
{
    public Storage(int level, int x, int y, java.util.Date finishBuildingOrUpgradeTime, int type)
    {
        super(level, x, y,finishBuildingOrUpgradeTime, type);
    }
    public int[] GetCapacity()
    {
        return ((ThoiLoan.Config.Buildings.Upgrades.StorageLevelConfig)ThoiLoan.Config.BuildingConfig.Types[Type].Levels[Level])
               .StorageCapacity;
    }
}
