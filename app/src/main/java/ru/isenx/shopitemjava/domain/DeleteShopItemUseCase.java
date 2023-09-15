package ru.isenx.shopitemjava.domain;

public class DeleteShopItemUseCase {

    private ShopItemRepository mRepository;

    public DeleteShopItemUseCase(ShopItemRepository repository) {
        mRepository = repository;
    }

    public void deleteShopItem(ShopItem shopItem) {
        mRepository.deleteShopItem(shopItem);
    }
}
