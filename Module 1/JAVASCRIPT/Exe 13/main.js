function registerUser(userData) {
    console.log('Starting registration process...');
    console.log('User data:', userData);
    
    try {
        console.log('Validating user data...');
        if (!userData.name || !userData.email) {
            throw new Error('Name and email are required');
        }
        
        console.log('Simulating server request...');
        // In a real app, this would be a fetch() call
        const response = { success: true };
        
        console.log('Registration completed successfully');
        return response;
    } catch (error) {
        console.error('Registration failed:', error);
        return { success: false, error: error.message };
    }
}

// Test cases
console.log("Test 1 - Valid registration:");
console.log(registerUser({ name: "Alice", email: "alice@example.com" }));

console.log("\nTest 2 - Invalid registration (missing email):");
console.log(registerUser({ name: "Bob" }));

// Debugging tips in comments:
/*
1. Use console.log() to track variable values
2. Use debugger statement to pause execution
3. Set breakpoints in browser dev tools
4. Check Network tab for API requests
5. Use try-catch to handle errors gracefully
*/