package ru.isenx.shopitemjava.domain;

import java.util.List;

public class GetShopListUseCase {

    private ShopItemRepository mRepository;

    public GetShopListUseCase(ShopItemRepository repository) {
        mRepository = repository;
    }

    public List<ShopItem> getShopList() {
        return mRepository.getShopList();
    }
}
