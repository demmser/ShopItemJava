package ru.isenx.shopitemjava.domain;

public class EditShopItemUseCase {

    private ShopListRepository mRepository;

    public EditShopItemUseCase(ShopListRepository repository) {
        mRepository = repository;
    }

    public void editShopItem(ShopItem shopItem) {
        mRepository.editShopItem(shopItem);
    }
}
