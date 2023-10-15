function submitForm() {
    // Retrieve values from the form
    let firstName = document.getElementById("firstName").value;
    let lastName = document.getElementById("lastName").value;
    let dob = document.getElementById("dob").value;
    let country = document.getElementById("country").value;
    let gender = document.querySelector('input[type="checkbox"]:checked');
    let profession = document.getElementById("profession").value;
    let email = document.getElementById("email").value;
    let phone = document.getElementById("phone").value;

    
    let popupContent = `
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Country:</strong> ${country}</p>
        <p><strong>Gender:</strong> ${gender ? gender.value : 'Not selected'}</p>
        <p><strong>Profession:</strong> ${profession}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Mobile Number:</strong> ${phone}</p>
    `;
    document.getElementById("popup-content").innerHTML = popupContent;
    document.getElementById("popup").style.display = "flex";
}

function resetForm() {
    document.getElementById("surveyForm").reset();
}

function closePopup() {
    document.getElementById("popup").style.display = "blue";
}
