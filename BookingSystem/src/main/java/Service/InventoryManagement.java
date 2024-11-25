package Service;

import DTO.InventoryDTO;

public class InventoryManagement {

    public boolean addInventory(InventoryDTO inventoryDTO){
        //check sku and save into database;
        return true;
    }

    public boolean check(Long sku){
        //query InventoryOder table ,use mock data
        InventoryDTO inventoryDTO = new InventoryDTO();
        inventoryDTO.setSku(12345L);
        inventoryDTO.setQuantity(100L);
        if(inventoryDTO==null||inventoryDTO.getQuantity()==0){
            throw new RuntimeException("sku is 0");
        }
        return true;
    }

}
