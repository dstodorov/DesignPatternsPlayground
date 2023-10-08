package factory.cross_platform_gui_elements;

public abstract class Dialog {
    public void renderDialog() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
