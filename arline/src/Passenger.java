public class Passenger {

    private String firstName;
    private String lastname;
    private String departure;
    private String destination;
    private String noOfAdults;
    private String noOfChildren;
    private String bookingDate;
    private String bookingTime;
    private String flightClass;
    private String meal;

    public Passenger() {}


    public Passenger(String firstName, String lastname, String departure, String destination, String noOfAdults,
                     String noOfChildren, String bookingDate,String bookingTime, String flightClass, String meal) {

        this.firstName = firstName;
        this.lastname = lastname;
        this.departure = departure;
        this.destination = destination;
        this.noOfAdults = noOfAdults;
        this.noOfChildren = noOfChildren;
        this.bookingDate = bookingDate;
        this.bookingTime= bookingTime;
        this.flightClass = flightClass;
        this.meal=meal;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDeparture() {
        return departure;
    }


    public void setDeparture(String departure) {
        this.departure = departure;
    }


    public String getDestination() {
        return destination;
    }


    public void setDestination(String destination) {
        this.destination = destination;
    }


    public String getNoOfAdults() {
        return noOfAdults;
    }


    public void setNoOfAdults(String noOfAdults) {
        this.noOfAdults = noOfAdults;
    }


    public String getNoOfChildren() {
        return noOfChildren;
    }


    public void setNoOfChildren(String noOfChildren) {
        this.noOfChildren = noOfChildren;
    }


    public String getBookingDate() {
        return bookingDate;
    }


    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }



    public String getFlightClass() {
        return flightClass;
    }
    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }


    public String getMeal() {
        return meal;
    }
    public void setMeal(String meal) {
        this.meal = meal;
    }

}
