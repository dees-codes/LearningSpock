package ObjectHeirarchy;

import java.util.ArrayList;
import java.util.List;

public class AssetInventory {
//    private int AssetInventoryNumber;
    private List<Ship> ships = new ArrayList<>();

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }

//    public int getAssetInventoryNumber() {
//        return AssetInventoryNumber;
//    }
//
//    public void setAssetInventoryNumber(int assetInventoryNumber) {
//        AssetInventoryNumber = assetInventoryNumber;
//    }
}