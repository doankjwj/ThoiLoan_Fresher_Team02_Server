package ThoiLoan.Config.Troops;
public abstract class BaseTroopConfig
{
    public int AttackType;
    public int AttackArea;
    public double AttackRadius;
    public int HousingSpace;
    public int TrainingTime;
    public int MoveSpeed;
    public double AttackSpeed;
    public int BarracksLevelRequired;
    public double AttackRange;
    public int FavoriteTarget;
    public int Cost;
    public int TimeDiscountPercent;
    public int TimeDiscountStart;
    public int TimeDiscountEnd;
    public int DmgScale;
    public double DeathDamageRadius;
    public ResearchTroopLevelConfig[] Levels;
}
