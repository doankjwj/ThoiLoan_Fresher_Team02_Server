package ThoiLoan.Config.Buildings.Bases.Storages;
import ThoiLoan.Config.Buildings.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
public class ElixirStorageConfig extends ThoiLoan.Config.Buildings.Bases.StorageConfig
{
    public ElixirStorageConfig()
    {
        try
        {
            JsonObject STO_2 = (JsonObject)RawJsonConfig.Storage.get("STO_2");
            Size = STO_2.getAsJsonObject("1").getAsJsonPrimitive("width").getAsInt();
            Levels = new BuildingLevelConfig[(STO_2.entrySet().size() + 1)];
            for (int i = 0; i < Levels.length; i += 1)
                Levels[i] = new ThoiLoan.Config.Buildings.Upgrades.Storages.ElixirStorageLevelConfig(i);
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_2");
        }
    }
}
