package ThoiLoan.Config.Buildings.Bases.Storages.Resources;
import ThoiLoan.Config.Buildings.Bases.Storages.*;
import ThoiLoan.Config.Buildings.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
public class ElixirResourceConfig extends ResourceConfig
{
    public ElixirResourceConfig()
    {
        ResourceType = 1;
        try
        {
            JsonObject RES_2 = (JsonObject)RawJsonConfig.Resource.get("RES_2");
            Size = RES_2.getAsJsonObject("1").getAsJsonPrimitive("width").getAsInt();
            Levels = new BuildingLevelConfig[(RES_2.entrySet().size() + 1)];
            for (int i = 0; i < Levels.length; i += 1)
                Levels[i] = new ThoiLoan.Config.Buildings.Upgrades.Storages.Resources.ElixirResourceLevelConfig(i);
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_2");
        }
    }
}
