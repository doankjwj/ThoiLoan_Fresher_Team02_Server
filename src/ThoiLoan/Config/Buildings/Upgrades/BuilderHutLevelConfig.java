package ThoiLoan.Config.Buildings.Upgrades;
import ThoiLoan.Config.Buildings.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
import java.util.*;
public class BuilderHutLevelConfig extends BuildingLevelConfig
{
    public int GCost;
    public BuilderHutLevelConfig(int Times)
    {
        JsonObject BDH_1 = null;
        try
        {
            BDH_1 = RawJsonConfig.BuilderHut.getAsJsonObject("BDH_1").getAsJsonObject(String.valueOf(Times));
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BDH_1 (Times " + Times + ")");
        }
        try
        {
            HP = BDH_1.getAsJsonPrimitive("hitpoints").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BDH_1" + ".HP (Times " + Times + ")");
        }
        try
        {
            GCost = BDH_1.getAsJsonPrimitive("coin").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BDH_1" + ".GCost (Times " + Times + ")");
        }
    }
}
