package ru.isenx.shopitemjava.domain;

public class GetShopItemUseCase {
    private ShopItemRepository mRepository;

    public GetShopItemUseCase(ShopItemRepository repository) {
        mRepository = repository;
    }

    public ShopItem getShopItem(int id) {
        return mRepository.getShopItem(id);
    }
}
