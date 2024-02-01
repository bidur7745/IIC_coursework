
document.addEventListener("DOMContentLoaded", function () {
    function handleFormSubmission(event) {
        event.preventDefault();
        const isFormSubmitted = true;
        if (isFormSubmitted) {
            alert("Thank you! Our customer support team will reach out to you shortly.");
        } else {
            alert("Oops! Something went wrong. Please try again.");
        }
    }

    const orderForm = document.querySelector(".order_main form");
    orderForm.addEventListener("submit", handleFormSubmission);
});

