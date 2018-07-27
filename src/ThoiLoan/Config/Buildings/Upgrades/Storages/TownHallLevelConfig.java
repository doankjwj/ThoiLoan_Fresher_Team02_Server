package ThoiLoan.Config.Buildings.Upgrades.Storages;
import ThoiLoan.Config.Buildings.Upgrades.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
import java.util.*;
public class TownHallLevelConfig extends StorageLevelConfig
{
    public int[] BuildingCapacity = new int[12];
    public int GoldRopRate;
    public int ElixirRopRate;
    public int DarkElixirRopRate;
    public int MaxDarkElixirRop;
    public int Capacity;
    public TownHallLevelConfig(int Level)
    {
        BuildingCapacity[0] = 1;
        BuildingCapacity[BuildingCapacity.length - 1] = 5;
        JsonObject TOW_1;
        try
        {
            TOW_1 = RawJsonConfig.TownHall.getAsJsonObject("TOW_1").getAsJsonObject(String.valueOf(Level));
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".TOW_1 (Level " + Level + ")");
            TOW_1 = null;
        }
        try
        {
            HP = TOW_1.getAsJsonPrimitive("hitpoints").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".TOW_1" + ".HP (Level " + Level + ")");
        }
        try
        {
            StorageCapacity[0] = TOW_1.getAsJsonPrimitive("capacityGold").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".TOW_1" + ".StorageCapacity[0] (Level " + Level + ")");
        }
        try
        {
            StorageCapacity[1] = TOW_1.getAsJsonPrimitive("capacityElixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".TOW_1" + ".StorageCapacity[1] (Level " + Level + ")");
        }
        try
        {
            StorageCapacity[2] = TOW_1.getAsJsonPrimitive("capacityDarkElixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".TOW_1" + ".StorageCapacity[2] (Level " + Level + ")");
        }
        try
        {
            Cost[0] = TOW_1.getAsJsonPrimitive("gold").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".TOW_1" + ".Cost[0] (Level " + Level + ")");
        }
        try
        {
            Cost[1] = TOW_1.getAsJsonPrimitive("elixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".TOW_1" + ".Cost[1] (Level " + Level + ")");
        }
        try
        {
            Cost[2] = TOW_1.getAsJsonPrimitive("darkElixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".TOW_1" + ".Cost[2] (Level " + Level + ")");
        }
        try
        {
            BuildTime = TOW_1.getAsJsonPrimitive("buildTime").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".TOW_1" + ".BuildTime (Level " + Level + ")");
        }
        try
        {
            TownHallLevelRequired = TOW_1.getAsJsonPrimitive("townHallLevelRequired").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".TOW_1" + ".TownHallLevelRequired (Level " + Level + ")");
        }
        try
        {
            GoldRopRate = TOW_1.getAsJsonPrimitive("goldRopRate").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".TOW_1" + ".GoldRopRate (Level " + Level + ")");
        }
        try
        {
            ElixirRopRate = TOW_1.getAsJsonPrimitive("elixirRopRate").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".TOW_1" + ".ElixirRopRate (Level " + Level + ")");
        }
        try
        {
            DarkElixirRopRate = TOW_1.getAsJsonPrimitive("darkElixirRopRate").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".TOW_1" + ".DarkElixirRopRate (Level " + Level + ")");
        }
        try
        {
            MaxDarkElixirRop = TOW_1.getAsJsonPrimitive("maxDarkElixirRop").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".TOW_1" + ".MaxDarkElixirRop (Level " + Level + ")");
        }
        try
        {
            Capacity = TOW_1.getAsJsonPrimitive("capacity").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".TOW_1" + ".Capacity (Level " + Level + ")");
        }
        try
        {
            BuildingCapacity[1] = TOW_1.getAsJsonPrimitive("STO_1").getAsInt();
            BuildingCapacity[2] = TOW_1.getAsJsonPrimitive("STO_2").getAsInt();
            BuildingCapacity[3] = TOW_1.getAsJsonPrimitive("STO_3").getAsInt();
            BuildingCapacity[4] = TOW_1.getAsJsonPrimitive("RES_1").getAsInt();
            BuildingCapacity[5] = TOW_1.getAsJsonPrimitive("RES_2").getAsInt();
            BuildingCapacity[6] = TOW_1.getAsJsonPrimitive("RES_3").getAsInt();
            BuildingCapacity[7] = TOW_1.getAsJsonPrimitive("LAB_1").getAsInt();
            BuildingCapacity[8] = TOW_1.getAsJsonPrimitive("AMC_1").getAsInt();
            BuildingCapacity[9] = TOW_1.getAsJsonPrimitive("BAR_1").getAsInt();
            BuildingCapacity[10] = TOW_1.getAsJsonPrimitive("BAR_2").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".TOW_1" + ".BuildingCapacity (Level " + Level + ")");
        }
    }
}
