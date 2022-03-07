package ui;

import model.Product;

public class UIMenu implements UIComponent, NavigationInterface {


    @Override
    public Object showUISubMenu(int optionMenu) {

        switch (optionMenu){
            case 1:
                 this.checkMenu();
                 break;
            case 2:
                this.searchItem(); // Cart
                break;
            case 3:
                this.addItem();   // Pay
                break;
            case 4:
                 this.viewItem(); // SendEmail
                break;
            default:
                return "It's not available option. Contact App's Administrator";
       }

      return 1;
    }

    @Override
    public Object showUIMenu(int optionMenu) {

        switch (optionMenu){
            case 1:
                this.checkMenu();
                break;
            case 2:
                this.cart();
                break;
            case 3:
                this.pay();
                break;
            case 4:
                this.sendEmail();
                break;
            case 5:
                this.sendEmail();
                break;
            default:
                return "It's not available option. Contact App's Administrator";
        }

        return 1;
    }

    /**
     * Main Menu
     */

    @Override
    public void checkMenu() {
        System.out.println("Catalog");
    }

    @Override
    public void cart() {
        System.out.println("Cart");
    }

    @Override
    public void pay() {
        System.out.println("Pay");
    }

    @Override
    public void sendEmail() {
        System.out.println("Send Email");
    }

    /**
     * Handle Menu
     */
    @Override
    public void searchItem() {
        System.out.println("SearchItem");
    }

    @Override
    public void viewItem() {
        System.out.println("ViewItem");
    }

    @Override
    public void addItem() {
        System.out.println("ViewItem");
    }


}
