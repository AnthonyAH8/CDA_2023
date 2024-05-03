package org.example.exercice_revision_factory;

public class MobileApplication {
    private Toolbar toolbar;
    private MobileButton mobileButton;
    private MobileUIFactory uiFactory;

    public MobileApplication(MobileUIFactory mobileUIFactory){
        uiFactory = mobileUIFactory;
        toolbar = uiFactory.createToolbar();
        mobileButton = uiFactory.createMobileButton();
    }
    public void renderApplication(){
        toolbar.renderToolbar();
        mobileButton.renderButton();
    }
}
