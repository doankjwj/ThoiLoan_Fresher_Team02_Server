package ThoiLoan.Config.Buildings.Bases;
import ThoiLoan.Config.Buildings.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
public class BuilderHutConfig extends BaseBuildingConfig
{
    public BuilderHutConfig()
    {
        try
        {
            JsonObject BDH_1 = (JsonObject)RawJsonConfig.BuilderHut.get("BDH_1");
            Size = BDH_1.getAsJsonObject("1").getAsJsonPrimitive("width").getAsInt();
            Levels = new BuildingLevelConfig[(BDH_1.entrySet().size() + 1)];
            for (int i = 0; i < Levels.length; i += 1)
                Levels[i] = new ThoiLoan.Config.Buildings.Upgrades.BuilderHutLevelConfig(i);
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BDH_1");
        }
    }
}
