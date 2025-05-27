let eventsList = [];

function addEvent(name, date, seats, category) {
    eventsList.push({ name, date, seats, category });
}

function registerUser(eventName) {
    const event = eventsList.find(e => e.name === eventName);
    if (event && event.seats > 0) {
        event.seats--;
        return true;
    }
    return false;
}

function createCategoryTracker() {
    const registrationsByCategory = {};
    
    return function(category) {
        registrationsByCategory[category] = (registrationsByCategory[category] || 0) + 1;
        return registrationsByCategory[category];
    };
}

const trackRegistration = createCategoryTracker();

function filterEvents(filterFn) {
    return eventsList.filter(filterFn);
}

// Example usage
addEvent("Bake Sale", "2023-12-15", 50, "food");
addEvent("Music Night", "2023-12-20", 100, "music");

console.log(filterEvents(event => event.category === "music"));
trackRegistration("music");
console.log("Total music registrations:", trackRegistration("music"));