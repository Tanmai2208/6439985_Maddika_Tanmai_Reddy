document.addEventListener('DOMContentLoaded', () => {
    const eventsContainer = document.querySelector('#events-container');
    
    const events = [
        { name: "Bake Sale", date: "2023-12-15", seats: 5 },
        { name: "Music Festival", date: "2023-11-20", seats: 10 }
    ];
    
    function renderEvents() {
        eventsContainer.innerHTML = '';
        
        events.forEach(event => {
            const card = document.createElement('div');
            card.className = 'event-card';
            
            card.innerHTML = `
                <h3>${event.name}</h3>
                <p>Date: ${event.date}</p>
                <p>Seats: ${event.seats}</p>
                <button class="register-btn" data-event="${event.name}">Register</button>
            `;
            
            eventsContainer.appendChild(card);
        });
    }
    
    renderEvents();
});