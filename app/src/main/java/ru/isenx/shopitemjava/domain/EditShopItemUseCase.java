package ru.isenx.shopitemjava.domain;

public class EditShopItemUseCase {

    private ShopItemRepository mRepository;

    public EditShopItemUseCase(ShopItemRepository repository) {
        mRepository = repository;
    }

    public void editShopItem(ShopItem shopItem) {
        mRepository.editShopItem(shopItem);
    }
}
