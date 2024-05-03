package org.example.exercice_revision_factory;

public class AndroidUIFactory extends MobileUIFactory{

    @Override
    public MobileButton createMobileButton() {
        return new AndroidMobileButton();
    }

    @Override
    public Toolbar createToolbar() {
        return new AndroidToolbar();
    }

}
