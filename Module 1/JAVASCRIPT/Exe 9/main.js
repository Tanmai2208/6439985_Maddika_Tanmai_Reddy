// Mock fetch function for demonstration
function mockFetch(url) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            if (url === 'https://mock-api.com/events') {
                resolve({
                    json: () => Promise.resolve([
                        { name: "Virtual Concert", date: "2023-12-20" },
                        { name: "Online Workshop", date: "2023-12-10" }
                    ])
                });
            } else {
                reject(new Error('404 Not Found'));
            }
        }, 1000);
    });
}

// Using .then() and .catch()
function fetchEvents() {
    console.log("Loading events...");
    mockFetch('https://mock-api.com/events')
        .then(response => response.json())
        .then(events => console.log('Fetched events:', events))
        .catch(error => console.error('Error:', error));
}

// Using async/await
async function fetchEventsAsync() {
    try {
        console.log("Loading events...");
        const response = await mockFetch('https://mock-api.com/events');
        const events = await response.json();
        console.log('Fetched events:', events);
    } catch (error) {
        console.error('Error:', error);
    }
}

fetchEvents();
fetchEventsAsync();