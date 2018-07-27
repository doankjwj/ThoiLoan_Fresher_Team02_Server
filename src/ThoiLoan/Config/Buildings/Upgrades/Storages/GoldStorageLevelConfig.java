package ThoiLoan.Config.Buildings.Upgrades.Storages;
import ThoiLoan.Config.Buildings.Upgrades.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
import java.util.*;
public class GoldStorageLevelConfig extends StorageLevelConfig
{
    public GoldStorageLevelConfig(int Level)
    {
        JsonObject STO_1 = null;
        try
        {
            STO_1 = RawJsonConfig.Storage.getAsJsonObject("STO_1").getAsJsonObject(String.valueOf(Level));
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_1 (Level " + Level + ")");
        }
        try
        {
            HP = STO_1.getAsJsonPrimitive("hitpoints").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_1" + ".HP (Level " + Level + ")");
        }
        try
        {
            StorageCapacity[0] = STO_1.getAsJsonPrimitive("capacity").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_1" + ".Capacity (Level " + Level + ")");
        }
        try
        {
            Cost[0] = STO_1.getAsJsonPrimitive("gold").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_1" + ".Cost[0] (Level " + Level + ")");
        }
        try
        {
            Cost[1] = STO_1.getAsJsonPrimitive("elixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_1" + ".Cost[1] (Level " + Level + ")");
        }
        try
        {
            Cost[2] = STO_1.getAsJsonPrimitive("darkElixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_1" + ".Cost[2] (Level " + Level + ")");
        }
        try
        {
            BuildTime = STO_1.getAsJsonPrimitive("buildTime").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_1" + ".BuildTime (Level " + Level + ")");
        }
        try
        {
            TownHallLevelRequired = STO_1.getAsJsonPrimitive("townHallLevelRequired").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".STO_1" + ".TownHallLevelRequired (Level " + Level + ")");
        }
    }
}
