// Mock fetch for demonstration
function mockFetch(url, options) {
    return new Promise((resolve) => {
        setTimeout(() => {
            console.log("POST data:", JSON.parse(options.body));
            resolve({
                ok: true,
                json: () => Promise.resolve({ success: true, message: "Registration complete" })
            });
        }, 1500);
    });
}

async function submitRegistration(formData) {
    try {
        console.log("Submitting registration...");
        const response = await mockFetch('https://mock-api.com/register', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(formData)
        });
        
        const result = await response.json();
        
        if (response.ok) {
            console.log('Success:', result.message);
        } else {
            console.log('Error:', result.message);
        }
    } catch (error) {
        console.error('Network error:', error);
    }
}

// Example usage
submitRegistration({
    name: "John Doe",
    email: "john@example.com",
    event: "bake-sale"
});