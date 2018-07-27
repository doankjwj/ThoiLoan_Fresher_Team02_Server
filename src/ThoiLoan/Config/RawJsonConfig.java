package ThoiLoan.Config;
import com.google.gson.*;
import java.io.*;
public class RawJsonConfig
{
    public static JsonParser JP;
    public static JsonObject ArmyCamp;
    public static JsonObject Barrack;
    public static JsonObject BuilderHut;
    public static JsonObject Laboratory;
    public static JsonObject Resource;
    public static JsonObject Storage;
    public static JsonObject TownHall;
    public static JsonObject Troop;
    public static JsonObject TroopBase;
    public static JsonObject NewPlayer;
    static
    {
        JP = new JsonParser();
        try
        {
            ArmyCamp = (JsonObject)JP.parse(new FileReader("res/Config Json/ArmyCamp.Json"));
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println("ArmyCamp config loaded not successfully");
        }
        try
        {
            Barrack = (JsonObject)JP.parse(new FileReader("res/Config Json/Barrack.Json"));
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println("Barrack config loaded not successfully");
        }
        try
        {
            BuilderHut = (JsonObject)JP.parse(new FileReader("res/Config Json/BuilderHut.Json"));
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println("BuilderHut config loaded not successfully");
        }
        try
        {
            Laboratory = (JsonObject)JP.parse(new FileReader("res/Config Json/Laboratory.Json"));
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println("Laboratory config loaded not successfully");
        }
        try
        {
            Resource = (JsonObject)JP.parse(new FileReader("res/Config Json/Resource.Json"));
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println("Resource config loaded not successfully");
        }
        try
        {
            Storage = (JsonObject)JP.parse(new FileReader("res/Config Json/Storage.Json"));
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println("Resource config loaded not successfully");
        }
        try
        {
            TownHall = (JsonObject)JP.parse(new FileReader("res/Config Json/TownHall.Json"));
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println("TownHall config loaded not successfully");
        }
        try
        {
            Troop = (JsonObject)JP.parse(new FileReader("res/Config Json/Troop.Json"));
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println("Troop config loaded not successfully");
        }
        try
        {
            TroopBase = (JsonObject)JP.parse(new FileReader("res/Config Json/TroopBase.Json"));
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println("TroopBase config loaded not successfully");
        }
        try
        {
            NewPlayer = (JsonObject)JP.parse(new FileReader("res/Config Json/InitGame.Json"));
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println("NewPlayer config loaded not successfully");
        }
    }
}
