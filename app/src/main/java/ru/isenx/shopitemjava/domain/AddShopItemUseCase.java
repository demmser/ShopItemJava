package ru.isenx.shopitemjava.domain;

public class AddShopItemUseCase {

    private ShopListRepository mRepository;

    public AddShopItemUseCase(ShopListRepository repository) {
        mRepository = repository;
    }

    public void addShopItem(ShopItem shopItem) {
        mRepository.addShopItem(shopItem);
    }
}
