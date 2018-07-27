package ThoiLoan.Config.Buildings.Upgrades;
import ThoiLoan.Config.Buildings.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
import java.util.*;
public class LaboratoryLevelConfig extends BuildingLevelConfig
{
    public LaboratoryLevelConfig(int Level)
    {
        JsonObject LAB_1 = null;
        try
        {
            LAB_1 = RawJsonConfig.Laboratory.getAsJsonObject("LAB_1").getAsJsonObject(String.valueOf(Level));
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".LAB_1 (Level " + Level + ")");
        }
        try
        {
            HP = LAB_1.getAsJsonPrimitive("hitpoints").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".LAB_1" + ".HP (Level " + Level + ")");
        }
        try
        {
            Cost[0] = LAB_1.getAsJsonPrimitive("gold").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".LAB_1" + ".Cost[0] (Level " + Level + ")");
        }
        try
        {
            Cost[1] = LAB_1.getAsJsonPrimitive("elixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".LAB_1" + ".Cost[1] (Level " + Level + ")");
        }
        try
        {
            Cost[2] = LAB_1.getAsJsonPrimitive("darkElixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".LAB_1" + ".Cost[2] (Level " + Level + ")");
        }
        try
        {
            BuildTime = LAB_1.getAsJsonPrimitive("buildTime").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".LAB_1" + ".BuildTime (Level " + Level + ")");
        }
        try
        {
            TownHallLevelRequired = LAB_1.getAsJsonPrimitive("townHallLevelRequired").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".LAB_1" + ".TownHallLevelRequired (Level " + Level + ")");
        }
    }
}
