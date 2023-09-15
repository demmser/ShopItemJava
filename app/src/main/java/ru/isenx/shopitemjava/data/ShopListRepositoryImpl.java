package ru.isenx.shopitemjava.data;

import java.util.ArrayList;
import java.util.List;

import ru.isenx.shopitemjava.domain.ShopItem;
import ru.isenx.shopitemjava.domain.ShopListRepository;

public class ShopListRepositoryImpl implements ShopListRepository {
    private List<ShopItem> mShopItems = new ArrayList<>();
    private int autoincrement = 0;

    @Override
    public List<ShopItem> getShopList() {
        return mShopItems = new ArrayList<>();
    }

    @Override
    public ShopItem getShopItem(int id) {
        return mShopItems.get(id);
    }

    @Override
    public void addShopItem(ShopItem shopItem) {
        if (shopItem.getId() == ShopItem.UNDEFINED_ID) {
            shopItem.setId(autoincrement++);
        }
        mShopItems.add(shopItem);
    }

    @Override
    public void deleteShopItem(ShopItem shopItem) {
        mShopItems.remove(shopItem);
    }

    @Override
    public void editShopItem(ShopItem shopItem) {
        ShopItem oldElement = getShopItem(shopItem.getId());
        mShopItems.remove(oldElement);
        addShopItem(shopItem);
    }
}
