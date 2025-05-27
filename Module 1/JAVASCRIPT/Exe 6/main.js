const events = [
    { name: "Bake Sale", category: "food", seats: 50 },
    { name: "Jazz Night", category: "music", seats: 100 },
    { name: "Art Workshop", category: "art", seats: 20 }
];

// Add new event
events.push({ name: "Charity Run", category: "sports", seats: 200 });

// Filter music events
const musicEvents = events.filter(event => event.category === "music");
console.log("Music Events:", musicEvents);

// Map to display cards
const eventCards = events.map(event => 
    `${event.name} - ${event.category.toUpperCase()} (${event.seats} seats)`
);
console.log("Event Cards:", eventCards);