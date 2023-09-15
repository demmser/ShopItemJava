package ru.isenx.shopitemjava.domain;

import java.util.List;

public interface ShopItemRepository {

    List<ShopItem> getShopList();

    ShopItem getShopItem(int id);

    void addShopItem(ShopItem shopItem);

    void deleteShopItem(ShopItem shopItem);

    void editShopItem(ShopItem shopItem);
}
