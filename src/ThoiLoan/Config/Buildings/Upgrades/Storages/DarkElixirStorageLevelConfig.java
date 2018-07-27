package ThoiLoan.Config.Buildings.Upgrades.Storages;
import ThoiLoan.Config.Buildings.Upgrades.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
import java.util.*;
public class DarkElixirStorageLevelConfig extends StorageLevelConfig
{
    public DarkElixirStorageLevelConfig(int Level)
    {
        JsonObject STO_3 = null;
        try
        {
            STO_3 = RawJsonConfig.Storage.getAsJsonObject("STO_3").getAsJsonObject(String.valueOf(Level));
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_3 (Level " + Level + ")");
        }
        try
        {
            HP = STO_3.getAsJsonPrimitive("hitpoints").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_3" + ".HP (Level " + Level + ")");
        }
        try
        {
            StorageCapacity[2] = STO_3.getAsJsonPrimitive("capacity").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_3" + ".Capacity (Level " + Level + ")");
        }
        try
        {
            Cost[0] = STO_3.getAsJsonPrimitive("gold").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_3" + ".Cost[0] (Level " + Level + ")");
        }
        try
        {
            Cost[1] = STO_3.getAsJsonPrimitive("elixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_3" + ".Cost[1] (Level " + Level + ")");
        }
        try
        {
            Cost[2] = STO_3.getAsJsonPrimitive("darkElixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_3" + ".Cost[2] (Level " + Level + ")");
        }
        try
        {
            BuildTime = STO_3.getAsJsonPrimitive("buildTime").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_3" + ".BuildTime (Level " + Level + ")");
        }
        try
        {
            TownHallLevelRequired = STO_3.getAsJsonPrimitive("townHallLevelRequired").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_3" + ".TownHallLevelRequired (Level " + Level + ")");
        }
    }
}
