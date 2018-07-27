package ThoiLoan.Config;
import ThoiLoan.Config.Buildings.*;
public class BuildingConfig
{
    public static BaseBuildingConfig[] Types = {
        new ThoiLoan.Config.Buildings.Bases.Storages.TownHallConfig(), new ThoiLoan.Config.Buildings.Bases.Storages.GoldStorageConfig(),
        new ThoiLoan.Config.Buildings.Bases.Storages.ElixirStorageConfig(),
        new ThoiLoan.Config.Buildings.Bases.Storages.DarkElixirStorageConfig(),
        new ThoiLoan.Config.Buildings.Bases.Storages.Resources.GoldResourceConfig(),
        new ThoiLoan.Config.Buildings.Bases.Storages.Resources.ElixirResourceConfig(),
        new ThoiLoan.Config.Buildings.Bases.Storages.Resources.DarkElixirResourceConfig(),
        new ThoiLoan.Config.Buildings.Bases.LaboratoryConfig(), new ThoiLoan.Config.Buildings.Bases.ArmyCampConfig(),
        new ThoiLoan.Config.Buildings.Bases.Barracks.NormalBarrackConfig(), new ThoiLoan.Config.Buildings.Bases.Barracks.SpecialBarrackConfig(),
        new ThoiLoan.Config.Buildings.Bases.BuilderHutConfig()
    };
}
