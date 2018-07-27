package ThoiLoan.Config.Buildings.Bases;
import ThoiLoan.Config.Buildings.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
public class LaboratoryConfig extends BaseBuildingConfig
{
    public LaboratoryConfig()
    {
        try
        {
            JsonObject LAB_1 = (JsonObject)RawJsonConfig.Laboratory.get("LAB_1");
            Size = LAB_1.getAsJsonObject("1").getAsJsonPrimitive("width").getAsInt();
            Levels = new BuildingLevelConfig[(LAB_1.entrySet().size() + 1)];
            for (int i = 0; i < Levels.length; i += 1)
                Levels[i] = new ThoiLoan.Config.Buildings.Upgrades.LaboratoryLevelConfig(i);
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".LAB_1");
        }
    }
}
