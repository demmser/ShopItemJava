package ru.isenx.shopitemjava.domain;

public class AddShopItemUseCase {

    private ShopItemRepository mRepository;

    public AddShopItemUseCase(ShopItemRepository repository) {
        mRepository = repository;
    }

    public void addShopItem(ShopItem shopItem) {
        mRepository.addShopItem(shopItem);
    }
}
