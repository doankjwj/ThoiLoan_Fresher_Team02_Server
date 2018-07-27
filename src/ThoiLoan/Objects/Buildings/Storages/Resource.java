package ThoiLoan.Objects.Buildings.Storages;
import ThoiLoan.Objects.Buildings.*;
import java.util.*;
public abstract class Resource extends Storage
{
    public long LastHarvestTime;
    public byte ResourceType;
    public Resource(int level, int x, int y,java.util.Date finishBuildingOrUpgradeTime, int type,
                    java.util.Date lastHarvestTime)
    {
        super(level, x, y, finishBuildingOrUpgradeTime, type);
        ResourceType =
            ((ThoiLoan.Config.Buildings.Bases.Storages.ResourceConfig)ThoiLoan.Config.BuildingConfig.Types[Type]).ResourceType;
        if (lastHarvestTime != null)
            LastHarvestTime = lastHarvestTime.getTime();
    }
    public int GetProductivity()
    {
        UpdateLevel();
        if (FinishBuildingOrUpgradeTime > 0)
            if (FinishBuildingOrUpgradeTime<(new Date().getTime()))
                return 0;
        return ((ThoiLoan.Config.Buildings.Upgrades.Storages.ResourceLevelConfig)ThoiLoan.Config.BuildingConfig.Types[Type]
                .Levels[Level]).Productivity;
    }
    public void Harvest()
    {
        //TODO rewrite this method
    }
    @Override
    public void StartUpgrade()
    {
        Harvest();
        super.StartUpgrade();
        LastHarvestTime = FinishBuildingOrUpgradeTime;
    }
    @Override
    public void CancelUpgrade()
    {
        super.CancelUpgrade();
        LastHarvestTime = new Date().getTime();
    }
    @Override
    public void UpdateLevel()
    {
        if (FinishBuildingOrUpgradeTime > 0)
            if (FinishBuildingOrUpgradeTime < (new java.util.Date().getTime()))
                LastHarvestTime = FinishBuildingOrUpgradeTime;
        super.UpdateLevel();
    }
}
