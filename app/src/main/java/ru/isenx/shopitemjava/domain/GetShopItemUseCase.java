package ru.isenx.shopitemjava.domain;

public class GetShopItemUseCase {
    private ShopListRepository mRepository;

    public GetShopItemUseCase(ShopListRepository repository) {
        mRepository = repository;
    }

    public ShopItem getShopItem(int id) {
        return mRepository.getShopItem(id);
    }
}
