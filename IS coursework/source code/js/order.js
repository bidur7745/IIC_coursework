// calling message section using id 
var modal = document.getElementById("myModal");

// calling the button tha open this message 
var btns = document.querySelectorAll(".product_btn");


var span = document.getElementsByClassName("close")[0];

// Function to show the message
function showModal() {
  modal.style.display = "block";
  
  // Automatically hide the modal after 3 seconds 
  setTimeout(function() { 
    modal.style.display = "none";
  }, 900);
}

// When the user clicks on the button, open the message
for (var i = 0; i < btns.length; i++) {
  btns[i].addEventListener("click", showModal);
}

// When the user clicks on x, the message disapprear
span.addEventListener("click", function () {
  modal.style.display = "none";
});

// When the user clicks anywhere outside of the message, close it
window.addEventListener("click", function (event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
});
