// Add event listener to the search button
document.querySelector('.btn-outline-success').addEventListener('click', function(event) {
  event.preventDefault();
  var searchQuery = document.querySelector('.form-control').value;
  console.log('Searching for:', searchQuery);
  // Add your search logic here
});

// Add event listener to the dropdown menu
document.querySelector('.dropdown-toggle').addEventListener('click', function() {
  document.querySelector('.dropdown-menu').classList.toggle('show');
});