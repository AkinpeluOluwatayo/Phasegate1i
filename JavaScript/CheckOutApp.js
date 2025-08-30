const prompt = require("prompt-sync")();
function main() {
  addNew();
  backMenu();
}


function addNew() {
  const name = prompt("Dear customer what's your name: ");

}

function backMenu() {
  let input = [];

  let product = prompt("What do you want to buy: ");
  input.push(product);
  console.log(input);


  let pieces = prompt("How many pieces: ");
  input.push(pieces);
  console.log(input);

  console.log(`
    Add more items?  
    1. Yes  
    2. No
  `);

  let option = parseInt(prompt("Select Option: "));

  switch (option) {
    case 1:
      backMenu(); // recursion to add more
      break;
    case 2:
      let secondName = prompt("Enter your full name: ");
      console.log("Customer Name: " + secondName + " LEO KASTRO STORES");

      console.log(`
        You have been given a discount of 10%  
        MAIN BRANCH  
        LOCATION: 11, ISAAC ADENUGA STREET, AGILITY, MILE12  LAGOS.  
        TEL: 03293828343  
        Date: 28-AUG-25 8:48:11pm  
        ==============================================================
                        "ITEM","QTY","PRICE","TOTAL(NGN)"
      `);
      break;
    default:
      console.log("Invalid option. Try again.");
      backMenu();
      break;
  }
}


main();


