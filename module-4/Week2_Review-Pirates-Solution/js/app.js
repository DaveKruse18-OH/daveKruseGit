/*
* Add Events and functions to move the Ship and Win the game
*/
// Creates the Grid -- this should only occur after the DOM loads

document.addEventListener('DOMContentLoaded', () => {

    createGrid();

    document.querySelector('body').addEventListener('keyup', (event) => {

        if (event.key == 'ArrowRight') {
            //move ship right
            moveShipRight();
        }
        if (event.key == 'ArrowLeft') {
            //move ship left
            moveShipLeft();
        }
        if (event.key == 'ArrowDown') {
            //move shipdown
            moveShipDown();
        }
        if (event.key == 'ArrowUp') {
            //move ship up
            moveShipUp();
        }

    });

    document.getElementById('resetButton').addEventListener('click', (event)=>{
        resetGame();
        event.preventDefault();
    });



})

function moveShipRight() {
    const ship = getShipLocation();
    const right = ship.nextElementSibling;



    //check that right is not null AND no pirates
    if (right != null && !right.classList.contains('pirate')) {

       if (isWin(right)) {
           win();
       }
       else {
          ship.classList.remove('boat');
          right.classList.add('boat');
       } 
    }
 }
 
 function moveShipLeft() {
    const ship = getShipLocation();
    const left = ship.previousElementSibling;

    //check that left is not null AND no pirates 
    if (left != null && !left.classList.contains('pirate')) {
       ship.classList.remove('boat');
       left.classList.add('boat');
    }
 }

 function moveShipUp() {
    const ship = getShipLocation();

    let up = null;
    if (ship.parentElement.previousElementSibling != null) {
        const index = Array.from(ship.parentNode.children).indexOf(ship);
        up = ship.parentElement.previousElementSibling.childNodes[index];
    }

    //now check for up = null AND that there are no pirates
    if (up != null && !up.classList.contains('pirate')) {
       ship.classList.remove('boat');
       up.classList.add('boat');
    }


 }

 function moveShipDown() {
    const ship = getShipLocation();
    
    let down = null;
    if (ship.parentElement.nextElementSibling != null) {
        const index = Array.from(ship.parentNode.children).indexOf(ship);
        down = ship.parentElement.nextElementSibling.childNodes[index];
    }

    //now check for down = null AND that there are no pirates
    if (down != null && !down.classList.contains('pirate')) {

        if (isWin(down)) {
            win();
        }
        else {
           ship.classList.remove('boat');
           down.classList.add('boat');
        }
    }   


 }

function isWin(nextElement) {
   if (nextElement.classList.contains('treasure')) {
       return true;
   }

   return false;
}

function win() {
    const announce = document.querySelector('.announce');
    announce.classList.add('winText');
    announce.textContent = "You Win!";
    getShipLocation().classList.remove('boat');
}

function getShipLocation() {
    return document.getElementById('frame').querySelector('.boat');
}




/**
 * Reset the Game
 */
function resetGame() {

    const ship = getShipLocation();
    if (ship != null) {
        ship.classList.remove('boat');
    }

    const announce = document.querySelector('.announce');
    announce.textContent = "Play!";

    const frame = document.getElementById('frame');
    frame.firstElementChild.firstElementChild.classList.add('boat');

    if (frame.lastElementChild.lastElementChild.classList.contains('pirate')) {
        frame.lastElementChild.lastElementChild.classList.remove('pirate');
    }
    frame.lastElementChild.lastElementChild.classList.add('treasure');
}

/**
 * Creates the game grid
 */
function createGrid() {

    const frame = document.getElementById('frame');

    // Add Code to create the game grid
    for (let i = 0; i < 10 ; i++) {
        buildRow(frame); 
    }
    resetGame();
}

/**
 * Builds the grid rows
 * @param {element} frame 
 */
function buildRow(frame) {
   // Add code to create rows
    const row = document.createElement('div');  // <div>
    row.classList.add('row');   // <div class='row'>
    //row.setAttribute('class', 'row');  /yet another way
    frame.appendChild(row);
    
    for (let i = 0; i < 10 ; i++) {
        buildSquare(row, i); 
    }    
}

/**
 * Builds the grid squares 
 * @param {element} row 
 * @param {int} count 
 */
function buildSquare(row, count) {
   // Add code to create the grid Squares
   const square = document.createElement('div');  //<div>
   square.classList.add('square');    //<div class="square">

    // Randomly creates pirates, but not on the first elemment
    if (count > 1) {
        if ((Math.floor(Math.random() * 100) + 1) > 85) {
            // Add the pirates here
            square.classList.add('pirate'); 
        } 
    }

    row.appendChild(square);
    
}



