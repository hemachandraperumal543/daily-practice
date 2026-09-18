class Restaurant {
    String name;
    long restaurantContact;
    String restaurantAddress;
    float rating;
    Restaurant(String name, long restaurantContact,
               String restaurantAddress, float rating) {

        this.name = name;
        this.restaurantContact = restaurantContact;
        this.restaurantAddress = restaurantAddress;
        this.rating = rating;
    }
    public void displayRestaurantDetails() {
        System.out.println("Restaurant Name : " + name);
        System.out.println("Restaurant Contact : " + restaurantContact);
        System.out.println("Restaurant Address : " + restaurantAddress);
        System.out.println("Rating : " + rating);
    }
}
class Tester {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(
            "Food Palace",
            9876543210L,
            "Chennai",
            4.5f
        );
        restaurant.displayRestaurantDetails();
    }
}