package ThoiLoan.Config.Buildings.Upgrades.Barracks;
import ThoiLoan.Config.Buildings.Upgrades.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
import java.util.*;
public class NormaBarrackLevelConfig extends BarrackLevelConfig
{
    public NormaBarrackLevelConfig(int Level)
    {
        MaxTroopType = Level;
        JsonObject BAR_1 = null;
        try
        {
            BAR_1 = RawJsonConfig.Barrack.getAsJsonObject("BAR_1").getAsJsonObject(String.valueOf(Level));
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_1 (Level " + Level + ")");
        }
        try
        {
            HP = BAR_1.getAsJsonPrimitive("hitpoints").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_1" + ".HP (Level " + Level + ")");
        }
        try
        {
            QueueLength = BAR_1.getAsJsonPrimitive("queueLength").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_1" + ".QueueLength (Level " + Level + ")");
        }
        try
        {
            Cost[0] = BAR_1.getAsJsonPrimitive("gold").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_1" + ".Cost[0] (Level " + Level + ")");
        }
        try
        {
            Cost[1] = BAR_1.getAsJsonPrimitive("elixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_1" + ".Cost[1] (Level " + Level + ")");
        }
        try
        {
            Cost[2] = BAR_1.getAsJsonPrimitive("darkElixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_1" + ".Cost[2] (Level " + Level + ")");
        }
        try
        {
            BuildTime = BAR_1.getAsJsonPrimitive("buildTime").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_1" + ".BuildTime (Level " + Level + ")");
        }
        try
        {
            TownHallLevelRequired = BAR_1.getAsJsonPrimitive("townHallLevelRequired").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_1" + ".TownHallLevelRequired (Level " + Level + ")");
        }
    }
}
