// Default parameters
function createEvent(name, date = new Date().toISOString().split('T')[0], seats = 50) {
    return { name, date, seats };
}

// Destructuring
const event = { name: "Bake Sale", date: "2023-12-15", seats: 50 };
const { name: eventName, seats: availableSeats } = event;
console.log(eventName, availableSeats);

// Spread operator
const originalEvents = [{ name: "Event 1" }, { name: "Event 2" }];
const eventsCopy = [...originalEvents];
const updatedEvents = [...originalEvents, { name: "Event 3" }];
console.log(updatedEvents);

// Template literals
console.log(`Event ${eventName} has ${availableSeats} seats available`);