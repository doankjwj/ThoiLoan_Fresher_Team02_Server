package ThoiLoan.Config.Buildings.Bases.Barracks;
import ThoiLoan.Config.Buildings.Bases.*;
import ThoiLoan.Config.Buildings.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
public class SpecialBarrackConfig extends BarrackConfig
{
    public SpecialBarrackConfig()
    {
        TroopGroup = 1;
        try
        {
            JsonObject BAR_2 = (JsonObject)RawJsonConfig.Barrack.get("BAR_2");
            Size = BAR_2.getAsJsonObject("1").getAsJsonPrimitive("width").getAsInt();
            Levels = new BuildingLevelConfig[(BAR_2.entrySet().size() + 1)];
            for (int i = 0; i < Levels.length; i += 1)
                Levels[i] = new ThoiLoan.Config.Buildings.Upgrades.Barracks.SpecialBarrackLevelConfig(i);
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_2");
        }
    }
}
