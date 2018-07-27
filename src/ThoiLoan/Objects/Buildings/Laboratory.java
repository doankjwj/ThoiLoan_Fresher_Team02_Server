package ThoiLoan.Objects.Buildings;
import ThoiLoan.Objects.*;
import java.util.*;
public class Laboratory extends Building
{
    public byte[] ResearchingTroop;
    public long FinishResearchingTime;
    public Laboratory(int level, int x, int y, java.util.Date finishBuildingOrUpgradeTime, int type,
                      java.util.Date finishReseachingTime)
    {
        super(level, x, y, finishBuildingOrUpgradeTime, type);
        ResearchingTroop = new byte[2];
        if (finishReseachingTime != null)
            FinishResearchingTime = finishReseachingTime.getTime();
    }
    public boolean CheckResearching()
    {
        UpdateResearching();
        return FinishResearchingTime >0l;
    }
    public void CancelResearch()
    {
        if (CheckResearching())
            FinishResearchingTime = 0;
    }
    public void UpdateResearching()
    {
        if (FinishResearchingTime > 0)
            if (FinishResearchingTime < new java.util.Date().getTime())
            {
                FinishResearchingTime = 0;
            }
    }
    public boolean CheckImmediateFinishResearchResource()
    {
        // TODO Implement this method
        return false;
    }
    public void ImmediateFinishResearch()
    {
        // TODO Implement this method
    }
}
