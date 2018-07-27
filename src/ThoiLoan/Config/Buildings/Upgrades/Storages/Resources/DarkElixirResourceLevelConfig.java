package ThoiLoan.Config.Buildings.Upgrades.Storages.Resources;
import ThoiLoan.Config.Buildings.Upgrades.Storages.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
import java.util.*;
public class DarkElixirResourceLevelConfig extends ResourceLevelConfig
{
    public DarkElixirResourceLevelConfig(int Level)
    {
        JsonObject RES_3 = null;
        try
        {
            RES_3 = RawJsonConfig.Resource.getAsJsonObject("RES_3").getAsJsonObject(String.valueOf(Level));
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_3 (Level " + Level + ")");
        }
        try
        {
            HP = RES_3.getAsJsonPrimitive("hitpoints").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_3" + ".HP (Level " + Level + ")");
        }
        try
        {
            Productivity = RES_3.getAsJsonPrimitive("productivity").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_3" + ".Productivity (Level " + Level + ")");
        }
        try
        {
            StorageCapacity[2] = RES_3.getAsJsonPrimitive("capacity").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_3" + ".Capacity (Level " + Level + ")");
        }
        try
        {
            Cost[0] = RES_3.getAsJsonPrimitive("gold").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_3" + ".Cost[0] (Level " + Level + ")");
        }
        try
        {
            Cost[1] = RES_3.getAsJsonPrimitive("elixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_3" + ".Cost[1] (Level " + Level + ")");
        }
        try
        {
            Cost[2] = RES_3.getAsJsonPrimitive("darkElixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_3" + ".Cost[2] (Level " + Level + ")");
        }
        try
        {
            BuildTime = RES_3.getAsJsonPrimitive("buildTime").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_3" + ".BuildTime (Level " + Level + ")");
        }
        try
        {
            TownHallLevelRequired = RES_3.getAsJsonPrimitive("townHallLevelRequired").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_3" + ".TownHallLevelRequired (Level " + Level + ")");
        }
    }
}
