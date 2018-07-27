package ThoiLoan.Config;
import ThoiLoan.Config.Troops.*;
import ThoiLoan.Config.Troops.Bases.*;
public class TroopConfig
{
    public static BaseTroopConfig[][] Type = new BaseTroopConfig[][] {
            { new NormalTroopLevelConfig(0), new NormalTroopLevelConfig(1), new NormalTroopLevelConfig(2), new NormalTroopLevelConfig(3), new NormalTroopLevelConfig(4), new NormalTroopLevelConfig(5), new NormalTroopLevelConfig(6),
              new NormalTroopLevelConfig(7), new NormalTroopLevelConfig(8), new NormalTroopLevelConfig(9), new NormalTroopLevelConfig(10), new NormalTroopLevelConfig(11), new NormalTroopLevelConfig(12) },
            { new SpecialTroopLevelConfig(0), new SpecialTroopLevelConfig(1), new SpecialTroopLevelConfig(2), new SpecialTroopLevelConfig(3), new SpecialTroopLevelConfig(4), new SpecialTroopLevelConfig(5),
              new SpecialTroopLevelConfig(6) }
        };
}
