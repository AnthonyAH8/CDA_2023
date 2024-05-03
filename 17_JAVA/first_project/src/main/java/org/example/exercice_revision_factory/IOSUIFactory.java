package org.example.exercice_revision_factory;

public class IOSUIFactory extends MobileUIFactory{

    @Override
    public MobileButton createMobileButton() {
        return new IOSMobileButton();
    }

    @Override
    public Toolbar createToolbar() {
        return new IOSToolbar();
    }

}
