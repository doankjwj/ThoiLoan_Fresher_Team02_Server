package ThoiLoan.Config.Buildings.Upgrades.Barracks;
import ThoiLoan.Config.Buildings.Upgrades.*;
import ThoiLoan.Config.*;
import ThoiLoan.Config.RawJsonConfig;
import com.google.gson.*;
import java.util.*;
public class SpecialBarrackLevelConfig extends BarrackLevelConfig
{
    public SpecialBarrackLevelConfig(int Level)
    {
        MaxTroopType = Level;
        JsonObject BAR_2 = null;
        try
        {
            BAR_2 = RawJsonConfig.Barrack.getAsJsonObject("BAR_2").getAsJsonObject(String.valueOf(Level));
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_2 (Level " + Level + ")");
        }
        try
        {
            HP = BAR_2.getAsJsonPrimitive("hitpoints").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_2" + ".HP (Level " + Level + ")");
        }
        try
        {
            QueueLength = BAR_2.getAsJsonPrimitive("queueLength").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_2" + ".QueueLength (Level " + Level + ")");
        }
        try
        {
            Cost[0] = BAR_2.getAsJsonPrimitive("gold").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_2" + ".Cost[0] (Level " + Level + ")");
        }
        try
        {
            Cost[1] = BAR_2.getAsJsonPrimitive("elixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_2" + ".Cost[1] (Level " + Level + ")");
        }
        try
        {
            Cost[2] = BAR_2.getAsJsonPrimitive("darkElixir").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_2" + ".Cost[2] (Level " + Level + ")");
        }
        try
        {
            BuildTime = BAR_2.getAsJsonPrimitive("buildTime").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_2" + ".BuildTime (Level " + Level + ")");
        }
        try
        {
            TownHallLevelRequired = BAR_2.getAsJsonPrimitive("townHallLevelRequired").getAsInt();
        }
        catch (Exception e)
        {
            System.out.print(new Date() + ": ");
            System.out.print(e + ": ");
            System.out.println(this.toString() + ".BAR_2" + ".TownHallLevelRequired (Level " + Level + ")");
        }
    }
}
