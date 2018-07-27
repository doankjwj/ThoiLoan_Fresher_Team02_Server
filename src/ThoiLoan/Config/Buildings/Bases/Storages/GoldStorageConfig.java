package ThoiLoan.Config.Buildings.Bases.Storages;
import ThoiLoan.Config.Buildings.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
public class GoldStorageConfig extends ThoiLoan.Config.Buildings.Bases.StorageConfig
{
    public GoldStorageConfig()
    {
        try
        {
            JsonObject STO_1 = (JsonObject)RawJsonConfig.Storage.get("STO_1");
            Size = STO_1.getAsJsonObject("1").getAsJsonPrimitive("width").getAsInt();
            Levels = new BuildingLevelConfig[(STO_1.entrySet().size() + 1)];
            for (int i = 0; i < Levels.length; i += 1)
                Levels[i] = new ThoiLoan.Config.Buildings.Upgrades.Storages.GoldStorageLevelConfig(i);
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_1");
        }
    }
}
