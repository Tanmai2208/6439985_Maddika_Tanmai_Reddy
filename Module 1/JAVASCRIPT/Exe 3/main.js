const events = [
    { name: "Bake Sale", date: "2023-12-15", seats: 5 },
    { name: "Music Festival", date: "2023-11-20", seats: 0 },
    { name: "Art Workshop", date: "2023-12-01", seats: 10 },
    { name: "Charity Run", date: "2023-10-10", seats: 20 }
];

function displayValidEvents() {
    const today = new Date().toISOString().split('T')[0];
    
    events.forEach(event => {
        try {
            if (event.date >= today && event.seats > 0) {
                console.log(`${event.name} - ${event.date} (${event.seats} seats available)`);
            }
        } catch (error) {
            console.error(`Error processing event ${event.name}:`, error);
        }
    });
}

displayValidEvents();