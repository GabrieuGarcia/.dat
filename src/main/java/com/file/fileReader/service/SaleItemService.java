package com.file.fileReader.service;

import com.file.fileReader.model.SaleItem;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class SaleItemService {

    public List<SaleItem> buildSaleItemList(String[] infos) {

        List<SaleItem> saleItemList = new ArrayList<>();

        for(String item : infos) {

            String[] sItem = item.split(",");

            for(String saleItem : sItem) {

                String[] saleItemDivided = saleItem.split("-");
                SaleItem saleItem1 = new SaleItem();
                saleItem1.setId(saleItemDivided[0]);
                saleItem1.setQuantity(Integer.parseInt(saleItemDivided[1]));
                saleItem1.setItemPrice(new BigDecimal(saleItemDivided[2]));

                saleItemList.add(saleItem1);
            }
        }
        return saleItemList;
    }
}
