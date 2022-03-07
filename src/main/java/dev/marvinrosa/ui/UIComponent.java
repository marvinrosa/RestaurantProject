package dev.marvinrosa.ui;

public interface UIComponent<T> {

    public T showUIMenu(int optionMenu);
    public T showUISubMenu(int optionMenu);
}
