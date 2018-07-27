package ThoiLoan.Config.Buildings.Upgrades;
import ThoiLoan.Config.Buildings.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
import java.util.*;
public class ArmyCampLevelConfig extends BuildingLevelConfig
{
    public int Capacity;
    public ArmyCampLevelConfig(int Level)
    {
        JsonObject AMC_1 = null;
        try
        {
            AMC_1 = RawJsonConfig.ArmyCamp.getAsJsonObject("AMC_1").getAsJsonObject(String.valueOf(Level));
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".AMC_1 (Level " + Level + ")");
        }
        try
        {
            HP = AMC_1.getAsJsonPrimitive("hitpoints").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".AMC_1" + ".HP (Level " + Level + ")");
        }
        try
        {
            Capacity = AMC_1.getAsJsonPrimitive("capacity").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".AMC_1" + ".Capacity (Level " + Level + ")");
        }
        try
        {
            Cost[0] = AMC_1.getAsJsonPrimitive("gold").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".AMC_1" + ".Cost[0] (Level " + Level + ")");
        }
        try
        {
            Cost[1] = AMC_1.getAsJsonPrimitive("elixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".AMC_1" + ".Cost[1] (Level " + Level + ")");
        }
        try
        {
            Cost[2] = AMC_1.getAsJsonPrimitive("darkElixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".AMC_1" + ".Cost[2] (Level " + Level + ")");
        }
        try
        {
            BuildTime = AMC_1.getAsJsonPrimitive("buildTime").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".AMC_1" + ".BuildTime (Level " + Level + ")");
        }
        try
        {
            TownHallLevelRequired = AMC_1.getAsJsonPrimitive("townHallLevelRequired").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".AMC_1" + ".TownHallLevelRequired (Level " + Level + ")");
        }
    }
}
