package ThoiLoan.Objects.Buildings;
import ThoiLoan.Objects.*;
import java.util.*;
public abstract class Barrack extends Building
{
    public byte TroopGroup;
    public ArrayList<int[]> TrainingQueue;
    public long StartTrainingTime;
    public Barrack(int level, int x, int y, java.util.Date finishBuildingOrUpgradeTime, int type,
                   ArrayList<int[]> trainingQueue, Date startTrainingTime)
    {
        super(level, x, y, finishBuildingOrUpgradeTime, type);
        TrainingQueue = trainingQueue;
        if (startTrainingTime != null)
        StartTrainingTime = startTrainingTime.getTime();
        Update_Training_Queue();
    }
    public boolean Check_Trainability(int TroopType)
    {
        return Level >= ThoiLoan.Config.TroopConfig.Type[TroopGroup][TroopType].BarracksLevelRequired;
    }
    public boolean Check_Training_Slot(int TroopType)
    {
        Update_Training_Queue();
        int CurrentQueueSize = 0;
        for (int i = 0; i < TrainingQueue.size(); i += 1)
        {
            CurrentQueueSize +=
                ThoiLoan.Config.TroopConfig.Type[TroopGroup][TrainingQueue.get(i)[0]].HousingSpace * TrainingQueue.get(i)[1];
        }
        return CurrentQueueSize + ThoiLoan.Config.TroopConfig.Type[TroopGroup][TroopType].HousingSpace <
               ((ThoiLoan.Config.Buildings.Upgrades.BarrackLevelConfig)ThoiLoan.Config.BuildingConfig.Types[Type].Levels[Level])
               .QueueLength;
    }
    public boolean CheckArmyCampSlot(int TroopType)
    {
        //TODO Implement this method
        return false;
//        int Capacity = 0;
//        for (int i = 0; i < Owner.BuildingList[8].size(); i++)
//        {
//            Capacity += ((ThoiLoan.Objects.Buildings.ArmyCamp)Owner.BuildingList[8].get(i)).GetCapacity();
//        }
//        int CurrentTroopAmount = 0;
//        for (int i = 0; i < Owner.TroopList.length; i += 1)
//            for (int j = 0; j < Owner.TroopList[i].length; j += 1)
//                CurrentTroopAmount += ThoiLoan.Config.Troop.Type[i][j].HousingSpace * Owner.TroopList[i][j];
//        return CurrentTroopAmount + ThoiLoan.Config.Troop.Type[TroopGroup][TroopType].HousingSpace < Capacity;
    }
    //    public void Start_Training(int Troop_Type);
    //    public void Cancel_Training(int Troop_Type);
    public void Update_Training_Queue()
    {
        if (TrainingQueue != null)
        {
            if (TrainingQueue.size() == 0)
                TrainingQueue = null;
            else if (TrainingQueue.get(0)[1] == 0)
                TrainingQueue.remove(0);
        }
    }
    public void Update_Troop_List()
    {
        //TODO Implement this method
    }
    public void FinishTrainingFirstTroop()
    {
        //TODO Implement this method
//        if (CheckArmyCampSlot(TrainingQueue.get(0)[0]))
//            Owner.TroopList[TroopGroup][TrainingQueue.get(0)[0]] += 1;
//        TrainingQueue.get(0)[1] -= 1;
//        Update_Training_Queue();
    }
    //    public boolean Check_Immediate_Finish_Training_Resource();
    //    public boolean Check_Immediate_Finish_Training_Slot();
    //    public void Immediate_Finish_Training();
}
