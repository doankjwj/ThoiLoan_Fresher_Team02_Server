package ThoiLoan.Config.Buildings.Bases.Storages;
import ThoiLoan.Config.Buildings.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
public class TownHallConfig extends ThoiLoan.Config.Buildings.Bases.StorageConfig
{
    public TownHallConfig()
    {
        Size = 4;
        try
        {
            JsonObject TOW_1 = (JsonObject)RawJsonConfig.TownHall.get("TOW_1");
            Size = TOW_1.getAsJsonObject("1").getAsJsonPrimitive("width").getAsInt();
            Levels = new BuildingLevelConfig[(TOW_1.entrySet().size() + 1)];
            for (int i = 0; i < Levels.length; i += 1)
                Levels[i] = new ThoiLoan.Config.Buildings.Upgrades.Storages.TownHallLevelConfig(i);
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".TOW_1");
        }
    }
}
