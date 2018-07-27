package ThoiLoan.Config.Buildings.Bases.Storages.Resources;
import ThoiLoan.Config.Buildings.Bases.Storages.*;
import ThoiLoan.Config.Buildings.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
public class GoldResourceConfig extends ResourceConfig
{
    public GoldResourceConfig()
    {
        ResourceType = 0;
        try
        {
            JsonObject RES_1 = (JsonObject)RawJsonConfig.Resource.get("RES_1");
            Size = RES_1.getAsJsonObject("1").getAsJsonPrimitive("width").getAsInt();
            Levels = new BuildingLevelConfig[(RES_1.entrySet().size() + 1)];
            for (int i = 0; i < Levels.length; i += 1)
                Levels[i] = new ThoiLoan.Config.Buildings.Upgrades.Storages.Resources.GoldResourceLevelConfig(i);
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_1");
        }
    }
}
