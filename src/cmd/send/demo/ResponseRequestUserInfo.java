package cmd.send.demo;
import ThoiLoan.Objects.*;
import ThoiLoan.Objects.Buildings.Storages.*;
import bitzero.server.extensions.data.BaseMsg;
import cmd.CmdDefine;
import java.nio.ByteBuffer;
import model.ZPUserInfo;
public class ResponseRequestUserInfo extends BaseMsg
{
    public ZPUserInfo info;
    public ResponseRequestUserInfo(ZPUserInfo _info)
    {
        super(CmdDefine.GET_USER_INFO);
        info = _info;
    }
    @Override
    public byte[] createData()
    {
        info.UpdateData();
        ByteBuffer bf = makeBuffer();        
        //TownHall
        bf.put(info.TownHallList.get(0).X);
        bf.put(info.TownHallList.get(0).Y);
        bf.put(info.TownHallList.get(0).Level);
        bf.putLong(info.TownHallList.get(0).FinishBuildingOrUpgradeTime);
        //Storages
        bf.put((byte)(info.GoldStorageList.size()));
        for (int j = 0; j < info.GoldStorageList.size(); j += 1)
        {
            bf.put(info.GoldStorageList.get(j).X);
            bf.put(info.GoldStorageList.get(j).Y);
            bf.put(info.GoldStorageList.get(j).Level);
            bf.putLong(info.GoldStorageList.get(j).FinishBuildingOrUpgradeTime);
        }
        bf.put((byte)(info.ElixirStorageList.size()));
        for (int j = 0; j < info.ElixirStorageList.size(); j += 1)
        {
            bf.put(info.ElixirStorageList.get(j).X);
            bf.put(info.ElixirStorageList.get(j).Y);
            bf.put(info.ElixirStorageList.get(j).Level);
            bf.putLong(info.ElixirStorageList.get(j).FinishBuildingOrUpgradeTime);
        }
        bf.put((byte)(info.DarkElixirStorageList.size()));
        for (int j = 0; j < info.DarkElixirStorageList.size(); j += 1)
        {
            bf.put(info.DarkElixirStorageList.get(j).X);
            bf.put(info.DarkElixirStorageList.get(j).Y);
            bf.put(info.DarkElixirStorageList.get(j).Level);
            bf.putLong(info.DarkElixirStorageList.get(j).FinishBuildingOrUpgradeTime);
        }
        //Resource
        bf.put((byte)(info.GoldResourceList.size()));
        for (int j = 0; j < info.GoldResourceList.size(); j += 1)
        {
            bf.put(info.GoldResourceList.get(j).X);
            bf.put(info.GoldResourceList.get(j).Y);
            bf.put(info.GoldResourceList.get(j).Level);
            bf.putLong(info.GoldResourceList.get(j).LastHarvestTime);
        }
        bf.put((byte)(info.ElixirResourceList.size()));
        for (int j = 0; j < info.ElixirResourceList.size(); j += 1)
        {
            bf.put(info.ElixirResourceList.get(j).X);
            bf.put(info.ElixirResourceList.get(j).Y);
            bf.put(info.ElixirResourceList.get(j).Level);
            bf.putLong(info.ElixirResourceList.get(j).LastHarvestTime);
        }
        bf.put((byte)(info.DarkElixirResourceList.size()));
        for (int j = 0; j < info.DarkElixirResourceList.size(); j += 1)
        {
            bf.put(info.DarkElixirResourceList.get(j).X);
            bf.put(info.DarkElixirResourceList.get(j).Y);
            bf.put(info.DarkElixirResourceList.get(j).Level);
            bf.putLong(info.DarkElixirResourceList.get(j).LastHarvestTime);
        }
        //Laboratory
        bf.put((byte)info.LaboratoryList.size());
        if (info.LaboratoryList.size() > 0)
        {
            bf.put(info.LaboratoryList.get(0).X);
            bf.put(info.LaboratoryList.get(0).Y);
            bf.put(info.LaboratoryList.get(0).Level);
            if (info.LaboratoryList.get(0).FinishBuildingOrUpgradeTime > 0)
                bf.putLong(info.LaboratoryList.get(0).FinishBuildingOrUpgradeTime);
            else
            {
                bf.putLong(0);
                if (info.LaboratoryList.get(0).FinishResearchingTime > 0)
                {
                    bf.putLong(info.LaboratoryList.get(0).FinishResearchingTime);
                    bf.put((byte)(info.LaboratoryList.get(0).ResearchingTroop[1] +
                                  (info.LaboratoryList.get(0).ResearchingTroop[0] * 12 -
                                   1)));//byte[2]{[13],[7]} => byte[18]
                }
                else
                    bf.putLong(0);
            }
        }
        //ArmyCamp
        bf.put((byte)info.ArmyCampList.size());
        for (int j = 0; j < info.ArmyCampList.size(); j += 1)
        {
            bf.put(info.ArmyCampList.get(0).X);
            bf.put(info.ArmyCampList.get(0).Y);
            bf.put(info.ArmyCampList.get(0).Level);
            if (info.ArmyCampList.get(0).FinishBuildingOrUpgradeTime > 0)
                bf.putLong(info.ArmyCampList.get(0).FinishBuildingOrUpgradeTime);
            else
                bf.putLong(0);
        }
        //Barrack
        bf.put((byte)info.NormalBarrackList.size());
        for (int j = 0; j < info.NormalBarrackList.size(); j += 1)
        {
            bf.put(info.NormalBarrackList.get(j).X);
            bf.put(info.NormalBarrackList.get(j).Y);
            bf.put(info.NormalBarrackList.get(j).Level);
            if (info.NormalBarrackList.get(j).FinishBuildingOrUpgradeTime > 0)
                bf.putLong(info.NormalBarrackList.get(j).FinishBuildingOrUpgradeTime);
            else
            {
                bf.putLong(0);
                if (info.NormalBarrackList.get(j).StartTrainingTime > 0)
                {
                    bf.putLong(info.NormalBarrackList.get(j).StartTrainingTime);
                    int TrainingQueueSize = info.NormalBarrackList.get(j).TrainingQueue.size();
                    bf.put((byte)(TrainingQueueSize));
                    for (int k = 0; k < TrainingQueueSize; k += 1)
                    {
                        bf.put((byte)(info.NormalBarrackList.get(j).TrainingQueue.get(k)[0] - 1 +
                                      (info.NormalBarrackList.get(j).TroopGroup * 12)));
                        bf.putShort((short)(info.NormalBarrackList.get(j).TrainingQueue.get(k)[1]));
                    }
                }
                else
                    bf.putLong(0);
            }
        }
        bf.put((byte)info.SpecialBarrackList.size());
        for (int j = 0; j < info.SpecialBarrackList.size(); j += 1)
        {
            bf.put(info.SpecialBarrackList.get(j).X);
            bf.put(info.SpecialBarrackList.get(j).Y);
            bf.put(info.SpecialBarrackList.get(j).Level);
            if (info.SpecialBarrackList.get(j).FinishBuildingOrUpgradeTime > 0)
                bf.putLong(info.SpecialBarrackList.get(j).FinishBuildingOrUpgradeTime);
            else
            {
                bf.putLong(0);
                if (info.SpecialBarrackList.get(j).StartTrainingTime > 0)
                {
                    bf.putLong(info.SpecialBarrackList.get(j).StartTrainingTime);
                    int TrainingQueueSize = info.SpecialBarrackList.get(j).TrainingQueue.size();
                    bf.put((byte)(TrainingQueueSize));
                    for (int k = 0; k < TrainingQueueSize; k += 1)
                    {
                        bf.put((byte)(info.SpecialBarrackList.get(j).TrainingQueue.get(k)[0] - 1 +
                                      (info.SpecialBarrackList.get(j).TroopGroup * 12)));
                        bf.putShort((short)(info.SpecialBarrackList.get(j).TrainingQueue.get(k)[1]));
                    }
                }
                else
                    bf.putLong(0);
            }
        }
        bf.put((byte)info.BuilderHutList.size());
        for (int j = 0; j < info.BuilderHutList.size(); j += 1)
        {
            bf.put(info.BuilderHutList.get(0).X);
            bf.put(info.BuilderHutList.get(0).Y);
        }
        putStr(bf, info.Name);
        bf.putInt(info.Exp);
        bf.putInt(info.VIPPoint);
        bf.putInt(info.G);
        bf.putInt(info.resource[0]);
        bf.putInt(info.resource[1]);
        bf.putInt(info.resource[2]);
        for (int i = 0; i < info.TroopList.length; i += 1)
            for (int j = 1; j < info.TroopList[i].length; j += 1)//Khong co Type ARM_0 or DAR_0
            {
                bf.put(info.TroopLevel[i][j]);
                bf.putShort(info.TroopList[i][j]);
            }        
        return packBuffer(bf);
    }
}
