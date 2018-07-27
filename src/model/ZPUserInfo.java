package model;
import ThoiLoan.Config.*;
import ThoiLoan.Config.Buildings.Upgrades.*;
import ThoiLoan.Config.Buildings.Upgrades.Storages.*;
import ThoiLoan.Objects.*;
import ThoiLoan.Objects.Buildings.*;
import ThoiLoan.Objects.Buildings.Barracks.*;
import ThoiLoan.Objects.Buildings.Storages.*;
import ThoiLoan.Objects.Buildings.Storages.Resources.*;
import com.google.gson.*;
import java.util.*;
import util.database.*;
public class ZPUserInfo extends DataModel
{
    public int UID;
    public String Name;
    public PlayerMap Field;
    public int[] resource;
    public int G;
    public int Exp;
    public int VIPPoint;
    public ArrayList<TownHall> TownHallList;
    public ArrayList<GoldStorage> GoldStorageList;
    public ArrayList<ElixirStorage> ElixirStorageList;
    public ArrayList<DarkElixirStorage> DarkElixirStorageList;
    public ArrayList<GoldResource> GoldResourceList;
    public ArrayList<ElixirResource> ElixirResourceList;
    public ArrayList<DarkElixirResource> DarkElixirResourceList;
    public ArrayList<Laboratory> LaboratoryList;
    public ArrayList<ArmyCamp> ArmyCampList;
    public ArrayList<NormalBarrack> NormalBarrackList;
    public ArrayList<SpecialBarrack> SpecialBarrackList;
    public ArrayList<BuilderHut> BuilderHutList;
    public ArrayList[] BuildingList;
    public short[][] TroopList;
    public byte[][] TroopLevel;
    public ZPUserInfo(int uid, String name)
    {
        super();
        UID = uid;
        Name = name;
        Field = new PlayerMap(40);
        resource = new int[3];
        TroopList = new short[2][];
        TroopLevel = new byte[2][];
        for (int i = 0; i < TroopList.length; i += 1)
        {
            TroopList[i] = new short[TroopConfig.Type[i].length];
            TroopLevel[i] = new byte[TroopConfig.Type[i].length];
            for (int j = 1; j < TroopLevel[i].length; j += 1)
                TroopLevel[i][j] = 1;
        }
        TownHallList = new ArrayList();
        GoldStorageList = new ArrayList();
        ElixirStorageList = new ArrayList();
        DarkElixirStorageList = new ArrayList();
        GoldResourceList = new ArrayList();
        ElixirResourceList = new ArrayList();
        DarkElixirResourceList = new ArrayList();
        LaboratoryList = new ArrayList();
        ArmyCampList = new ArrayList();
        NormalBarrackList = new ArrayList();
        SpecialBarrackList = new ArrayList();
        BuilderHutList = new ArrayList();
        BuildingList = new ArrayList[] {
                TownHallList, GoldStorageList, ElixirStorageList, DarkElixirStorageList, GoldResourceList,
                ElixirResourceList, DarkElixirResourceList, LaboratoryList, ArmyCampList, NormalBarrackList,
                SpecialBarrackList, BuilderHutList
            };
        try
        {
            JsonObject Init = RawJsonConfig.NewPlayer.getAsJsonObject("player");
            G = Init.getAsJsonPrimitive("coin").getAsInt();
            resource[0] = Init.getAsJsonPrimitive("gold").getAsInt();
            resource[1] = Init.getAsJsonPrimitive("elixir").getAsInt();
            //Resource[2] = InitPlayer.getAsJsonPrimitive("darkElixir").getAsInt();
            Init = RawJsonConfig.NewPlayer.getAsJsonObject("map");
            JsonObject InitBuilding = Init.getAsJsonObject("TOW_1");
            int Type = 0;
            int X = InitBuilding.getAsJsonPrimitive("posX").getAsInt();
            int Y = InitBuilding.getAsJsonPrimitive("posY").getAsInt();
            TownHallList.add(new TownHall(1, X, Y, null, Type));
            Field.Fill(X, Y, BuildingConfig.Types[Type].Size);
            InitBuilding = Init.getAsJsonObject("AMC_1");
            Type = 8;
            X = InitBuilding.getAsJsonPrimitive("posX").getAsInt();
            Y = InitBuilding.getAsJsonPrimitive("posY").getAsInt();
            ArmyCampList.add(new ArmyCamp(1, X, Y, null, Type));
            Field.Fill(X, Y, BuildingConfig.Types[Type].Size);
            InitBuilding = Init.getAsJsonObject("RES_1");
            Type = 4;
            X = InitBuilding.getAsJsonPrimitive("posX").getAsInt();
            Y = InitBuilding.getAsJsonPrimitive("posY").getAsInt();
            GoldResourceList.add(new GoldResource(1, X, Y, null, Type, new java.util.Date()));
            Field.Fill(X, Y, BuildingConfig.Types[Type].Size);
            InitBuilding = Init.getAsJsonObject("BDH_1");
            Type = 11;
            X = InitBuilding.getAsJsonPrimitive("posX").getAsInt();
            Y = InitBuilding.getAsJsonPrimitive("posY").getAsInt();
            BuilderHutList.add(new BuilderHut(1, X, Y, null, Type));
            Field.Fill(X, Y, BuildingConfig.Types[Type].Size);
        }
        catch (Exception e)
        {
            System.out.print(new java.util.Date() + ": ");
            System.out.print(e + ": ");
            System.out.println("NewPlayer config loaded but not initialized successfully");
        }
    }
    void SendData()
    {
        // TODO Implement this method
    }
    public void UpdateData()
    {
        // TODO Implement this method
    }
    void GetData()
    {
        // TODO Implement this method
    }
    public void ForceLogout()
    {
        // TODO Implement this method
    }
    void LogOut()
    {
        // TODO Implement this method
    }
    boolean CheckUpgradability(int Type, int Slot)
    {
        return ((Building)BuildingList[Type].get(Slot)).CheckUpgradability();
    }
    boolean CheckUpgradeResource(int Type, int Slot)
    {
        UpdateLevel(Type, Slot);
        for (int i = 0; i < 3; i += 1)
            if (resource[i] <
                BuildingConfig.Types[Type].Levels[(((Building)BuildingList[Type].get(Slot))).Level + 1]
                .Cost[i])
                return false;
        return true;
    }
    public boolean CheckUpgradeHallRequirement(int Type, int Slot)
    {
        UpdateLevel(Type, Slot);
        return (TownHallList.get(0).Level >=
                BuildingConfig.Types[Type].Levels[(((Building)BuildingList[Type].get(Slot))).Level + 1]
                .TownHallLevelRequired);
    }
    boolean CheckBuildResource(int BuildingType)
    {
        if (BuildingType == BuildingList.length - 1)//BuilderHut
            return G >=
                   ((BuilderHutLevelConfig)BuildingConfig.Types[BuildingType]
                    .Levels[BuildingList[BuildingList.length - 1].size() + 1]).GCost;
        for (int i = 0; i < 3; i += 1)
            if (resource[i] < BuildingConfig.Types[BuildingType].Levels[1].Cost[i])
                return false;
        return true;
    }
    boolean CheckBuildHallRequirement(int BuildingType)
    {
        return BuildingList[BuildingType].size() <
               ((TownHallLevelConfig)BuildingConfig.Types[0].Levels[TownHallList.get(0).Level])
               .BuildingCapacity[BuildingType];
    }
    boolean CheckBuildAvailablePosition(int BuildingType, int X, int Y)
    {
        return Field.CheckAvaliableZone(BuildingConfig.Types[BuildingType].Size, X, Y);
    }
    void StartBuild(int BuildingType, int X, int Y)
    {
        if (CheckBuildHallRequirement(BuildingType))
            if (CheckBuildResource(BuildingType))
                if (CheckBuildAvailablePosition(BuildingType, X, Y))
                {
                    switch (BuildingType)
                    {
                        case 0:
                            BuildingList[BuildingType]
                                .add(new TownHall(0, X, Y, null, BuildingType));
                            break;
                        case 1:
                            BuildingList[BuildingType].add(new GoldStorage(0, X, Y, null, BuildingType));
                            break;
                        case 2:
                            BuildingList[BuildingType].add(new ElixirStorage(0, X, Y, null, BuildingType));
                            break;
                        case 3:
                            BuildingList[BuildingType].add(new DarkElixirStorage(0, X, Y, null, BuildingType));
                            break;
                        case 4:
                            BuildingList[BuildingType].add(new GoldResource(0, X, Y, null, BuildingType, null));
                            break;
                        case 5:
                            BuildingList[BuildingType].add(new ElixirResource(0, X, Y, null, BuildingType, null));
                            break;
                        case 6:
                            BuildingList[BuildingType].add(new DarkElixirResource(0, X, Y, null, BuildingType, null));
                            break;
                        case 7:
                            BuildingList[BuildingType]
                                .add(new Laboratory(0, X, Y, null, BuildingType, null));
                            break;
                        case 8:
                            BuildingList[BuildingType]
                                .add(new ArmyCamp(0, X, Y, null, BuildingType));
                            break;
                        case 9:
                            BuildingList[BuildingType].add(new NormalBarrack(0, X, Y, null, BuildingType, null, null));
                            break;
                        case 10:
                            BuildingList[BuildingType].add(new SpecialBarrack(0, X, Y, null, BuildingType, null, null));
                            break;
                        case 11:
                            BuildingList[BuildingType]
                                .add(new BuilderHut(0, X, Y, null, BuildingType));
                            break;
                    }
                    Field.Fill(X, Y, BuildingConfig.Types[BuildingType].Size);
                    StartUpgrade(BuildingType, BuildingList[BuildingType].size() - 1);
                }
    }
    void StartUpgrade(int Type, int Slot)
    {
        if (CheckUpgradability(Type, Slot))
            if (CheckUpgradeHallRequirement(Type, Slot))
                if (CheckUpgradeResource(Type, Slot))
                {
                    for (int i = 0; i < 3; i += 1)
                        resource[i] -=
                            BuildingConfig.Types[Type]
                            .Levels[((Building)((Building)BuildingList[Type].get(Slot))).Level + 1].Cost[i];
                    ((Building)BuildingList[Type].get(Slot)).StartUpgrade();
                }
    }
    void CancelUpgrade(int Type, int Slot)
    {
        UpdateLevel(Type, Slot);
        if (((Building)BuildingList[Type].get(Slot)).FinishBuildingOrUpgradeTime > 0)
        {
            for (int i = 0; i < 3; i += 1)
                resource[i] +=
                    BuildingConfig.Types[Type].Levels[((Building)BuildingList[Type].get(Slot)).Level + 1].Cost[i] / 2;
            ((Building)BuildingList[Type].get(Slot)).CancelUpgrade();
        }
        if (((Building)BuildingList[Type].get(Slot)).GetLevel() == 0)
            BuildingList[Type].remove(Slot);
    }
    void UpdateLevel(int Type, int Slot)
    {
        ((Building)BuildingList[Type].get(Slot)).UpdateLevel();
    }
    boolean CheckMoveAvailablePosition(int Type, int Slot, int X, int Y)
    {
        ThoiLoan.Objects.PlayerMap TempMap = new ThoiLoan.Objects.PlayerMap(Field);
        TempMap.Free(((Building)BuildingList[Type].get(Slot)).X, ((Building)BuildingList[Type].get(Slot)).Y,
                     BuildingConfig.Types[Type].Size);
        return TempMap.CheckAvaliableZone(X, Y, BuildingConfig.Types[Type].Size);
    }
    void MoveTo(int Type, int Slot, int X, int Y)
    {
        if (CheckMoveAvailablePosition(Type, Slot, X, Y))
        {
            Field.Free(((Building)BuildingList[Type].get(Slot)).X, ((Building)BuildingList[Type].get(Slot)).Y,
                       BuildingConfig.Types[Type].Size);
            ((Building)BuildingList[Type].get(Slot)).MoveTo(X, Y);
            Field.Fill(X, Y, BuildingConfig.Types[Type].Size);
        }
    }
    boolean CheckImmediateFinishUpgradeOrBuildResource(Building TargetBuilding)
    {
        // TODO Implement this method
        return false;
    }
    void ImmediateFinishUpgradeOrBuild(Building TargetBuilding)
    {
        // TODO Implement this method
    }
    int GetLevel(int Type, int Slot)
    {
        return ((Building)BuildingList[Type].get(Slot)).GetLevel();
    }
    public boolean CheckUserFullResource(int Type, int Slot)
    {
        int ResourceCapacity = 0;
        for (int i = 0; i < 4; i += 1)
            for (int j = 0; j < BuildingList[i].size(); j += 1)
                ResourceCapacity +=
                    ((Storage)BuildingList[i].get(j))
                    .GetCapacity()[((Resource)(((Building)BuildingList[Type].get(Slot)))).ResourceType];
        return resource[((Resource)(((Building)BuildingList[Type].get(Slot)))).ResourceType] < ResourceCapacity;
    }
    void Harvest(int BuildingType, int Slot)
    {
        if (CheckUserFullResource(BuildingType, Slot))
        {
            int Productivity = ((Resource)(BuildingList[BuildingType].get(Slot))).GetProductivity();
            int ResourceCapacity = 0;
            for (int i = 0; i < 4; i += 1)
                for (int j = 0; j < BuildingList[i].size(); j += 1)
                    ResourceCapacity +=
                        ((Storage)BuildingList[i].get(j))
                        .GetCapacity()[((Resource)(BuildingList[BuildingType].get(Slot))).ResourceType];
            int Capacity =
                ((Resource)(BuildingList[BuildingType].get(Slot)))
                .GetCapacity()[((Resource)(BuildingList[BuildingType].get(Slot))).ResourceType];
            int Product =
                (int)(Productivity *
                      (new java.util.Date().getTime() -
                       ((Resource)(BuildingList[BuildingType].get(Slot))).LastHarvestTime) / 1000 / 60 / 60);
            if (Product > Capacity)
                Product = Capacity;
            if (Product + resource[((Resource)(BuildingList[BuildingType].get(Slot))).ResourceType] < ResourceCapacity)
            {
                resource[((Resource)(BuildingList[BuildingType].get(Slot))).ResourceType] += Product;
                ((Resource)(BuildingList[BuildingType].get(Slot))).LastHarvestTime = new java.util.Date().getTime();
            }
            else
            {
                Product = Capacity - resource[((Resource)(BuildingList[BuildingType].get(Slot))).ResourceType];
                resource[((Resource)(BuildingList[BuildingType].get(Slot))).ResourceType] = Capacity;
                ((Resource)(BuildingList[BuildingType].get(Slot))).LastHarvestTime =
                    new java.util.Date().getTime() - Product / Productivity * 60 / 60 / 1000;
            }
            ((Resource)BuildingList[BuildingType].get(Slot)).Harvest();
        }
    }
    boolean CheckResearching()
    {
        return ((LaboratoryList.get(0))).CheckResearching();
    }
    public boolean CheckResearchResource(byte[] TroopType)
    {
        for (int i = 0; i < 3; i += 1)
            if (resource[i] <
                TroopConfig.Type[TroopType[0]][TroopType[1]].Levels[TroopLevel[TroopType[0]][TroopType[1]] + 1]
                .ResearchCost[i])
                return false;
        return true;
    }
    public boolean CheckResearchLimit(byte[] TroopType)
    {
        return TroopLevel[TroopType[0]][TroopType[1]] < TroopConfig.Type[TroopType[0]][TroopType[1]].Levels.length - 1;
    }
    public boolean CheckResearchLabRequirement(byte[] TroopType)
    {
        return LaboratoryList.get(0).Level >=
               TroopConfig.Type[TroopType[0]][TroopType[1]].Levels[TroopLevel[TroopType[0]][TroopType[1]] + 1]
               .LaboratoryLevelRequired;
    }
    void StartResearch(byte[] TroopType)
    {
        if (CheckResearchLimit(TroopType))
            if (!CheckResearching())
                if (CheckResearchLabRequirement(TroopType))
                    if (CheckResearchResource(TroopType))
                    {
                        for (int i = 0; i < 3; i += 1)
                            resource[i] -=
                                TroopConfig.Type[TroopType[0]][TroopType[1]]
                                .Levels[TroopLevel[TroopType[0]][TroopType[1]] + 1].ResearchCost[i];
                        ((Laboratory)(LaboratoryList.get(0))).ResearchingTroop = TroopType;
                        ((Laboratory)(LaboratoryList.get(0))).FinishResearchingTime =
                            new java.util.Date().getTime() +
                            TroopConfig.Type[TroopType[0]][TroopType[1]].Levels[TroopLevel[TroopType[0]][TroopType[1]] +
                            1].ResearchTime * 1000;
                    }
    }
    void CancelResearch()
    {
        if (CheckResearching())
        {
            for (int i = 0; i < 3; i += 1)
                resource[i] +=
                    TroopConfig.Type[((LaboratoryList.get(0)))
                    .ResearchingTroop[0]][((LaboratoryList.get(0)))
                    .ResearchingTroop[1]]
                    .Levels[TroopLevel[((LaboratoryList.get(0)))
                    .ResearchingTroop[0]][((LaboratoryList.get(0)))
                    .ResearchingTroop[1]] + 1].ResearchCost[i] / 2;
            ((LaboratoryList.get(0))).CancelResearch();
        }
    }
    void UpdateTroopLevel()
    {
        if (((LaboratoryList.get(0))).FinishResearchingTime == 0)
            if (((LaboratoryList.get(0))).FinishResearchingTime < new java.util.Date().getTime())
            {
                TroopLevel[((LaboratoryList.get(0)))
                    .ResearchingTroop[0]][((LaboratoryList.get(0)))
                    .ResearchingTroop[1]] += 1;
                ((LaboratoryList.get(0))).FinishResearchingTime = 0;
            }
    }
    boolean CheckImmediateFinishResearchResource()
    {
        // TODO Implement this method
        return false;
    }
    void ImmediateFinishResearch()
    {
        // TODO Implement this method
    }
    //    boolean CheckTrainability(Barrack TargetBarrack, int TroopType)
    //    {
    //        // TODO Implement this method
    //        return false;
    //    }
    //    boolean CheckTrainingSlot(Barrack TargetBarrack, int TroopType)
    //    {
    //        // TODO Implement this method
    //        return false;
    //    }
    boolean CheckCampSlot(int TroopType)
    {
        // TODO Implement this method
        return false;
    }
    //    void StartTraining(Barrack TargetBarrack, int TroopType)
    //    {
    //        // TODO Implement this method
    //    }
    //    void CancelTraining(Barrack TargetBarrack, int TroopType)
    //    {
    //        // TODO Implement this method
    //    }
    void UpdateTroopList()
    {
        // TODO Implement this method
    }
    boolean CheckImmediateFinishTrainingResource()
    {
        // TODO Implement this method
        return false;
    }
    boolean CheckImmediateFinishTrainingSlot()
    {
        // TODO Implement this method
        return false;
    }
    void ImmediateFinishTraining()
    {
        // TODO Implement this method
    }
}
