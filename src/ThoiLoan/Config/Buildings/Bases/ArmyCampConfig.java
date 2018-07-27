package ThoiLoan.Config.Buildings.Bases;
import ThoiLoan.Config.Buildings.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
public class ArmyCampConfig extends BaseBuildingConfig
{
    public ArmyCampConfig()
    {
        try
        {
            JsonObject AMC_1 = (JsonObject)RawJsonConfig.ArmyCamp.get("AMC_1");
            Size = AMC_1.getAsJsonObject("1").getAsJsonPrimitive("width").getAsInt();
            Levels = new BuildingLevelConfig[(AMC_1.entrySet().size() + 1)];
            for (int i = 0; i < Levels.length; i += 1)
                Levels[i] = new ThoiLoan.Config.Buildings.Upgrades.ArmyCampLevelConfig(i);
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".AMC_1");
        }
    }
}
