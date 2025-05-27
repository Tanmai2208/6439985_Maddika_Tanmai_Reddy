document.querySelector('#registration-form').addEventListener('submit', function(e) {
    e.preventDefault();
    
    const form = e.target;
    const name = form.elements['name'].value;
    const email = form.elements['email'].value;
    const event = form.elements['event'].value;
    
    if (!name || !email || !event) {
        alert('Please fill in all fields');
        return;
    }
    
    console.log(`Registering ${name} (${email}) for ${event}`);
    form.reset();
    alert('Registration submitted!');
});