// add pageTitle
const pageTitle = "My Shopping List";

// add groceries
const groceries = ["milk", "cheese", "tomatoes", "celery", "meat", "oranges", "pop", "eggs", "cereal", "noodles"];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  let title = document.getElementById('title').textContent = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
   const groceryList = document.getElementById('groceries');
   groceries.forEach((item) => {
       const node = document.createElement('li');
//       console.log(item);
       node.innerText = item;
//       //groceryList.insertAdjacentElement('afterbegin', node);
//       //groceryList.insertAdjacentElement('beforeend', node);
//       //groceryList.insertAdjacentElement(node);
       groceryList.appendChild(node);
   });
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
