package ThoiLoan.Config.Buildings.Bases.Storages;
import ThoiLoan.Config.Buildings.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
public class DarkElixirStorageConfig extends ThoiLoan.Config.Buildings.Bases.StorageConfig
{
    public DarkElixirStorageConfig()
    {
        try
        {
            JsonObject STO_3 = (JsonObject)RawJsonConfig.Storage.get("STO_3");
            Size = STO_3.getAsJsonObject("1").getAsJsonPrimitive("width").getAsInt();
            Levels = new BuildingLevelConfig[(STO_3.entrySet().size() + 1)];
            for (int i = 0; i < Levels.length; i += 1)
                Levels[i] = new ThoiLoan.Config.Buildings.Upgrades.Storages.DarkElixirStorageLevelConfig(i);
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_3");
        }
    }
}
