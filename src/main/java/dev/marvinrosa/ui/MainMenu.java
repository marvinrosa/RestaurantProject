package dev.marvinrosa.ui;

import java.util.Scanner;

public class MainMenu {

    private String titles;
    private final UIMenu menu = new UIMenu();
    private final Scanner scan = new Scanner(System.in);


    public String welcome(){
        return "Welcome to SOLID RESTAURANT" + "\n";
    }

    public String titlesMainMenu(){
        titles = "1. Check Menu " + "\n" +
                 "2. Cart " + "\n" +
                 "3. Generate File " + "\n" +
                 "4. Send email " + "\n" +
                 "5. Exit" + "\n" ;

        return titles;
    }

    public String titlesMainSubMenuCatalog(){
        titles = "1. Check Menu " + "\n" +
                 "2. Search Menu " + "\n" +
                 "3. Add Item " + "\n" +
                 "4. Return " + "\n" ;

        return titles;
    }

    public String titlesMainSubMenuCatalog2(){
        titles = "1. Check Menu " + "\n" +
                "2. Search Menu " + "\n" +
                "3. Add Item " + "\n" +
                "4. Return " + "\n" ;

        return titles;
    }

    public String titlesMainSubMenuCatalog3(){
        titles = "1. Check Menu " + "\n" +
                "2. Search Menu " + "\n" +
                "3. Add Item " + "\n" +
                "4. Return " + "\n" ;

        return titles;
    }

    public String titlesMainSubMenuCatalog4(){
        titles = "1. Check Menu " + "\n" +
                "2. Search Menu " + "\n" +
                "3. Add Item " + "\n" +
                "4. Return " + "\n" ;

        return titles;
    }

    public String selectOption(){
        return "Select an option: " + "\n";
    }

    public String showMainMenu(){
        return this.welcome() + this.titlesMainMenu() + this.selectOption();
    }

    public void AppMenu(){
        int optionMenu = 0;
        do{

            try{
                optionMenu = Integer.parseInt(scan.nextLine());
                menu.showUIMenu(optionMenu);
            }catch (NumberFormatException e){
                System.out.println("Please, try again with a number");
            }


        }while(optionMenu !=5);

    }
}
