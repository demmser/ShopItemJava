package ru.isenx.shopitemjava.domain;

public class DeleteShopItemUseCase {

    private ShopListRepository mRepository;

    public DeleteShopItemUseCase(ShopListRepository repository) {
        mRepository = repository;
    }

    public void deleteShopItem(ShopItem shopItem) {
        mRepository.deleteShopItem(shopItem);
    }
}
