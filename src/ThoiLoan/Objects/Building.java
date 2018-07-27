package ThoiLoan.Objects;
import java.util.*;
import util.database.*;
public abstract class Building
{
    public long FinishBuildingOrUpgradeTime;
    public byte Type;
    public byte Level;
    public byte X;
    public byte Y;
    public Building(int level, int x, int y, Date finishBuildingOrUpgradeTime, int type)//for super constructor
    {
        super();
        Level = (byte)level;
        X = (byte)x;
        Y = (byte)y;
        if (finishBuildingOrUpgradeTime != null)
            FinishBuildingOrUpgradeTime = finishBuildingOrUpgradeTime.getTime();
        Type = (byte)type;
    }
    public boolean CheckUpgradability()
    {
        UpdateLevel();
        return (Level < ThoiLoan.Config.BuildingConfig.Types[Type].Levels.length - 1 &&
                FinishBuildingOrUpgradeTime < new Date().getTime());
    }
    public void StartUpgrade()
    {
                    FinishBuildingOrUpgradeTime =
                        (new Date().getTime() + ThoiLoan.Config.BuildingConfig.Types[Type].Levels[Level + 1].BuildTime * 1000);                
    }
    public void CancelUpgrade()
    {
        UpdateLevel();
        if (FinishBuildingOrUpgradeTime > 0)
        {
            FinishBuildingOrUpgradeTime = 0;
        }
    }
    public void UpdateLevel()
    {
        if (FinishBuildingOrUpgradeTime > 0)
            if (FinishBuildingOrUpgradeTime < (new Date().getTime()))
            {
                Level += 1;
                FinishBuildingOrUpgradeTime = 0;
            }
    }
    public void MoveTo(int x, int y)
    {
            X = (byte)x;
            Y = (byte)y;
    }
    public boolean CheckImmediateFinishUpgradeOrBuildResource()
    {
        // TODO Implement this method
        return false;
    }
    public void ImmediateFinishUpgradeOrBuild()
    {
        // TODO Implement this method
    }
    public int GetLevel()
    {
        return Level;
    }
    public int GetType()
    {
        return Type;
    }
    public int GetX()
    {
        return X;
    }
    public int GetY()
    {
        return Y;
    }
}

//prefix: BuildingCfg :building config
// BuildingModel
// BuildingHandler
// BuildingMgr.isValidTiles(type, pos, asd ) {
// true/fallse;
//}