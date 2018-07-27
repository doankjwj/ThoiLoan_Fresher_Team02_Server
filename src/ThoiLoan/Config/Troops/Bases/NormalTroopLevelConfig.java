package ThoiLoan.Config.Troops.Bases;
import ThoiLoan.Config.RawJsonConfig;
import ThoiLoan.Config.Troops.*;
import com.google.gson.*;
public class NormalTroopLevelConfig extends BaseTroopConfig
{
    public NormalTroopLevelConfig(int Type)
    {
        JsonObject TroopType;
        try
        {
            TroopType =
                RawJsonConfig.TroopBase.getAsJsonObject(RawJsonConfig.Barrack.getAsJsonObject("BAR_1").getAsJsonObject(String.valueOf(Type))
                                              .getAsJsonPrimitive("unlockedUnit").getAsString());
        }
        catch (Exception e)
        {
            TroopType = null;
        }
        try
        {
            AttackType = TroopType.getAsJsonPrimitive("attackType").getAsInt();
        }
        catch (Exception e)
        {
        }
        try
        {
            AttackArea = TroopType.getAsJsonPrimitive("attackArea").getAsInt();
        }
        catch (Exception e)
        {
        }
        try
        {
            AttackRadius = TroopType.getAsJsonPrimitive("attackRadius").getAsDouble();
        }
        catch (Exception e)
        {
        }
        try
        {
            HousingSpace = TroopType.getAsJsonPrimitive("housingSpace").getAsInt();
        }
        catch (Exception e)
        {
        }
        try
        {
            TrainingTime = TroopType.getAsJsonPrimitive("trainingTime").getAsInt();
        }
        catch (Exception e)
        {
        }
        try
        {
            MoveSpeed = TroopType.getAsJsonPrimitive("moveSpeed").getAsInt();
        }
        catch (Exception e)
        {
        }
        try
        {
            AttackSpeed = TroopType.getAsJsonPrimitive("attackSpeed").getAsDouble();
        }
        catch (Exception e)
        {
        }
        try
        {
            BarracksLevelRequired = TroopType.getAsJsonPrimitive("barracksLevelRequired").getAsInt();
        }
        catch (Exception e)
        {
        }
        try
        {
            AttackRange = TroopType.getAsJsonPrimitive("attackRange").getAsDouble();
        }
        catch (Exception e)
        {
        }
        try
        {
            switch (TroopType.getAsJsonPrimitive("favoriteTarget").getAsString())
            {
                case "RES":
                    FavoriteTarget = 1;
                    break;
                case "DEF":
                    FavoriteTarget = 2;
                    break;
                case "WAL":
                    FavoriteTarget = 3;
                    break;
            }
        }
        catch (Exception e)
        {
        }
        try
        {
            Cost = TroopType.getAsJsonPrimitive("cost").getAsInt();
        }
        catch (Exception e)
        {
        }
        try
        {
            TimeDiscountPercent = TroopType.getAsJsonPrimitive("timeDiscountPercent").getAsInt();
        }
        catch (Exception e)
        {
        }
        try
        {
            TimeDiscountStart = TroopType.getAsJsonPrimitive("timeDiscountStart").getAsInt();
        }
        catch (Exception e)
        {
        }
        try
        {
            TimeDiscountEnd = TroopType.getAsJsonPrimitive("timeDiscountEnd").getAsInt();
        }
        catch (Exception e)
        {
        }
        try
        {
            DmgScale = TroopType.getAsJsonPrimitive("dmgScale").getAsInt();
        }
        catch (Exception e)
        {
        }
        try
        {
            DeathDamageRadius = TroopType.getAsJsonPrimitive("deathDamageRadius").getAsInt();
        }
        catch (Exception e)
        {
        }
        try
        {
            Levels =
                new ResearchTroopLevelConfig[RawJsonConfig.Troop.getAsJsonObject(RawJsonConfig.Barrack.getAsJsonObject("BAR_1")
                                                       .getAsJsonObject(String.valueOf(Type))
                                                       .getAsJsonPrimitive("unlockedUnit").getAsString()).entrySet()
                .size() + 1];
            for (int i = 0; i < Levels.length; i += 1)
                Levels[i] = new ResearchTroopLevelConfig();
        }
        catch (Exception e)
        {
            Levels = null;
        }
        try
        {
            TroopType =
                RawJsonConfig.Troop.getAsJsonObject(RawJsonConfig.Barrack.getAsJsonObject("BAR_1").getAsJsonObject(String.valueOf(Type))
                                          .getAsJsonPrimitive("unlockedUnit").getAsString());
        }
        catch (Exception e)
        {
            TroopType = null;
        }
        try
        {
            for (int i = 0; i < Levels.length; i += 1)
            {
                try
                {
                    Levels[i].DamagePerSecond =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("damagePerSecond").getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].DamagePerAttack =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("damagePerAttack").getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].DamagePerSecondOnResources =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("damagePerSecondOnResources")
                        .getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].DamageVsWalls =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("damageVsWalls").getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].HealsPerSecond =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("healsPerSecond").getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].HealsPerAttack =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("healsPerAttack").getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].HP =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("hitpoints").getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].TrainingCost[0] =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("trainingGold").getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].TrainingCost[1] =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("trainingElixir").getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].TrainingCost[2] =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("trainingDarkElixir")
                        .getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].ResearchCost[0] =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("researchGold").getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].ResearchCost[1] =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("researchElixir").getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].ResearchCost[2] =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("researchDarkElixir")
                        .getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].ResearchTime =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("researchTime").getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].LaboratoryLevelRequired =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("laboratoryLevelRequired")
                        .getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].DamageUponDeath =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("damageUponDeath").getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].TimeSkill =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("timeSkill").getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].PercentSkill =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("percentSkill").getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].NumTarget =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("numTarget").getAsInt();
                }
                catch (Exception e)
                {
                }
                try
                {
                    Levels[i].SkillLevel =
                        TroopType.getAsJsonObject(String.valueOf(i)).getAsJsonPrimitive("skillLevel").getAsInt();
                }
                catch (Exception e)
                {
                }
            }
        }
        catch (Exception x)
        {
        }
    }
}
