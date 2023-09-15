package ru.isenx.shopitemjava.domain;

import java.util.List;

public class GetShopListUseCase {

    private ShopListRepository mRepository;

    public GetShopListUseCase(ShopListRepository repository) {
        mRepository = repository;
    }

    public List<ShopItem> getShopList() {
        return mRepository.getShopList();
    }
}
