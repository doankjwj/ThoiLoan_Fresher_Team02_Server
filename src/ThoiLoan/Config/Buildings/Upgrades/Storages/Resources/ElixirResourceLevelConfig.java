package ThoiLoan.Config.Buildings.Upgrades.Storages.Resources;
import ThoiLoan.Config.Buildings.Upgrades.Storages.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
import java.util.*;
public class ElixirResourceLevelConfig extends ResourceLevelConfig
{
    public ElixirResourceLevelConfig(int Level)
    {
        JsonObject RES_2 = null;
        try
        {
            RES_2 = RawJsonConfig.Resource.getAsJsonObject("RES_2").getAsJsonObject(String.valueOf(Level));
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_2 (Level " + Level + ")");
        }
        try
        {
            HP = RES_2.getAsJsonPrimitive("hitpoints").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_2" + ".HP (Level " + Level + ")");
        }
        try
        {
            Productivity = RES_2.getAsJsonPrimitive("productivity").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_2" + ".Productivity (Level " + Level + ")");
        }
        try
        {
            StorageCapacity[2] = RES_2.getAsJsonPrimitive("capacity").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_2" + ".Capacity (Level " + Level + ")");
        }
        try
        {
            Cost[0] = RES_2.getAsJsonPrimitive("gold").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_2" + ".Cost[0] (Level " + Level + ")");
        }
        try
        {
            Cost[1] = RES_2.getAsJsonPrimitive("elixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_2" + ".Cost[1] (Level " + Level + ")");
        }
        try
        {
            Cost[2] = RES_2.getAsJsonPrimitive("darkElixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_2" + ".Cost[2] (Level " + Level + ")");
        }
        try
        {
            BuildTime = RES_2.getAsJsonPrimitive("buildTime").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_2" + ".BuildTime (Level " + Level + ")");
        }
        try
        {
            TownHallLevelRequired = RES_2.getAsJsonPrimitive("townHallLevelRequired").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".RES_2" + ".TownHallLevelRequired (Level " + Level + ")");
        }
    }
}
