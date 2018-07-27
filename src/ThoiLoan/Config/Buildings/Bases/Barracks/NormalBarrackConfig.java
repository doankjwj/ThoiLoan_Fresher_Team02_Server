package ThoiLoan.Config.Buildings.Bases.Barracks;
import ThoiLoan.Config.Buildings.Bases.*;
import ThoiLoan.Config.Buildings.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
public class NormalBarrackConfig extends BarrackConfig
{
    public NormalBarrackConfig()
    {
        TroopGroup = 0;
        try
        {
            JsonObject BAR_1 = (JsonObject)RawJsonConfig.Barrack.get("BAR_1");
            Size = BAR_1.getAsJsonObject("1").getAsJsonPrimitive("width").getAsInt();
            Levels = new BuildingLevelConfig[(BAR_1.entrySet().size() + 1)];
            for (int i = 0; i < Levels.length; i += 1)
                Levels[i] = new ThoiLoan.Config.Buildings.Upgrades.Barracks.NormaBarrackLevelConfig(i);
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_1");
        }
    }
}
