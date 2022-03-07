package dev.marvinrosa;


import ui.MainMenu;

public class App
{
    public static void main( String[] args )
    {
        int optionMenu;
        MainMenu menu = new MainMenu();
        System.out.println(menu.showMainMenu());
        menu.AppMenu();
    }
}
