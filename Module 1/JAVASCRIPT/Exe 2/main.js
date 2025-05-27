const eventName = "Community Bake Sale";
const eventDate = "2023-12-15";
let availableSeats = 50;

function registerForEvent() {
    if (availableSeats > 0) {
        availableSeats--;
        console.log(`Registered for ${eventName} on ${eventDate}. Seats left: ${availableSeats}`);
    } else {
        console.log("Sorry, no seats available for this event.");
    }
}

console.log(`Event: ${eventName}, Date: ${eventDate}, Seats: ${availableSeats}`);
registerForEvent();