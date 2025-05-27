class Event {
    constructor(name, date, seats, category) {
        this.name = name;
        this.date = date;
        this.seats = seats;
        this.category = category;
    }
    
    checkAvailability() {
        return this.seats > 0;
    }
}

Event.prototype.getDetails = function() {
    return `${this.name} on ${this.date}`;
};

const bakeSale = new Event("Bake Sale", "2023-12-15", 50, "food");
console.log(bakeSale.checkAvailability());
console.log(bakeSale.getDetails());
console.log(Object.entries(bakeSale));