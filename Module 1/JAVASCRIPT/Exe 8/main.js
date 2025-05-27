document.addEventListener('DOMContentLoaded', () => {
    // Register button click
    document.addEventListener('click', function(e) {
        if (e.target.classList.contains('register-btn')) {
            const eventName = e.target.getAttribute('data-event');
            alert(`Registered for ${eventName}!`);
        }
    });
    
    // Category filter
    const categoryFilter = document.querySelector('#category-filter');
    categoryFilter.addEventListener('change', function(e) {
        console.log(`Filtering by category: ${e.target.value}`);
    });
    
    // Quick search
    const searchInput = document.querySelector('#event-search');
    searchInput.addEventListener('keydown', function(e) {
        if (e.key === 'Enter') {
            console.log(`Searching for: ${e.target.value}`);
        }
    });
});