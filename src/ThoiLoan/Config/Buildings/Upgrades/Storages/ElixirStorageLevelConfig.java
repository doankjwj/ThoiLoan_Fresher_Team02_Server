package ThoiLoan.Config.Buildings.Upgrades.Storages;
import ThoiLoan.Config.Buildings.Upgrades.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
import java.util.*;
public class ElixirStorageLevelConfig extends StorageLevelConfig
{
    public ElixirStorageLevelConfig(int Level)
    {
        JsonObject STO_2 = null;
        try
        {
            STO_2 = RawJsonConfig.Storage.getAsJsonObject("STO_2").getAsJsonObject(String.valueOf(Level));
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_2 (Level " + Level + ")");
        }
        try
        {
            HP = STO_2.getAsJsonPrimitive("hitpoints").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_2" + ".HP (Level " + Level + ")");
        }
        try
        {
            StorageCapacity[1] = STO_2.getAsJsonPrimitive("capacity").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_2" + ".Capacity (Level " + Level + ")");
        }
        try
        {
            Cost[0] = STO_2.getAsJsonPrimitive("gold").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_2" + ".Cost[0] (Level " + Level + ")");
        }
        try
        {
            Cost[1] = STO_2.getAsJsonPrimitive("elixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_2" + ".Cost[1] (Level " + Level + ")");
        }
        try
        {
            Cost[2] = STO_2.getAsJsonPrimitive("darkElixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_2" + ".Cost[2] (Level " + Level + ")");
        }
        try
        {
            BuildTime = STO_2.getAsJsonPrimitive("buildTime").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_2" + ".BuildTime (Level " + Level + ")");
        }
        try
        {
            TownHallLevelRequired = STO_2.getAsJsonPrimitive("townHallLevelRequired").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_2" + ".TownHallLevelRequired (Level " + Level + ")");
        }
    }
}
