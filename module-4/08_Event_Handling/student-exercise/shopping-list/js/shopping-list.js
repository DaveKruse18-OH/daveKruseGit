let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.querySelector('ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.innerText = item.name;
    const checkCircle = document.createElement('i');
    checkCircle.setAttribute('class', 'far fa-check-circle');
    li.appendChild(checkCircle);
    ul.appendChild(li);
  });
}

function toggleItem(item) {
  const c = item.querySelector('i');
  //c.classList.add('completed');

  if (item.classList.contains('completed')) {
    item.classList.remove('completed');
    c.classList.remove('completed');
  } else {
    item.classList.add('completed');
    c.classList.add('completed');
  }
}

function toggleAll(ta) {
  const list = document.querySelectorAll('li');
  if (ta.innerText == "MARK ALL COMPLETE") {
    list.forEach((item) => {
      const c = item.querySelector('i');
      if (!item.classList.contains('completed')) {
        item.classList.add('completed');
        c.classList.add('completed');
      }
    });
    ta.innerText = "MARK ALL INCOMPLETE";
    return;
  }
  if (ta.innerText == "MARK ALL INCOMPLETE") {
    list.forEach((item) => {
      const c = item.querySelector('i');
      if (item.classList.contains('completed')) {
        item.classList.remove('completed');
        c.classList.remove('completed');
      }
    });
    ta.innerText = "MARK ALL COMPLETE";
    return;
  }
 
}

document.addEventListener('DOMContentLoaded', () => {
  setPageTitle();
  displayGroceries();


  const liList = document.querySelectorAll('li');
  liList.forEach((item) => {
    item.addEventListener('click', (event) => {
      
      toggleItem(item);

      
    });
  });


  //const liList = document.querySelectorAll('toggleAll');
  const ta = document.getElementById('toggleAll');
  ta.addEventListener('click', (event) => {
      
    toggleAll(ta);

      
  });


});
