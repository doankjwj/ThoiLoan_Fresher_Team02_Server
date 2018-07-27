package ThoiLoan.Config.Buildings.Upgrades.Storages.Resources;
import ThoiLoan.Config.Buildings.Upgrades.Storages.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
import java.util.*;
public class GoldResourceLevelConfig extends ResourceLevelConfig
{
    public GoldResourceLevelConfig(int Level)
    {
        JsonObject RES_1 = null;
        try
        {
            RES_1 = RawJsonConfig.Resource.getAsJsonObject("RES_1").getAsJsonObject(String.valueOf(Level));
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_1 (Level " + Level + ")");
        }
        try
        {
            HP = RES_1.getAsJsonPrimitive("hitpoints").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_1" + ".HP (Level " + Level + ")");
        }
        try
        {
            Productivity = RES_1.getAsJsonPrimitive("productivity").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_1" + ".Productivity (Level " + Level + ")");
        }
        try
        {
            StorageCapacity[2] = RES_1.getAsJsonPrimitive("capacity").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_1" + ".Capacity (Level " + Level + ")");
        }
        try
        {
            Cost[0] = RES_1.getAsJsonPrimitive("gold").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_1" + ".Cost[0] (Level " + Level + ")");
        }
        try
        {
            Cost[1] = RES_1.getAsJsonPrimitive("elixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_1" + ".Cost[1] (Level " + Level + ")");
        }
        try
        {
            Cost[2] = RES_1.getAsJsonPrimitive("darkElixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_1" + ".Cost[2] (Level " + Level + ")");
        }
        try
        {
            BuildTime = RES_1.getAsJsonPrimitive("buildTime").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_1" + ".BuildTime (Level " + Level + ")");
        }
        try
        {
            TownHallLevelRequired = RES_1.getAsJsonPrimitive("townHallLevelRequired").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_1" + ".TownHallLevelRequired (Level " + Level + ")");
        }
    }
}
