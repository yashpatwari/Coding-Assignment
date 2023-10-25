//B. Perform sorting of an array in descending order. 
function bubbleSortDescending(arr) {
    var n = arr.length;

    for (var i = 0; i < n - 1; i++) {
        for (var j = 0; j < n - i - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                // Swap arr[j] and arr[j + 1]
                var temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

// Prompt the user to enter comma-separated values and create an array
var input = prompt("Enter an array of values separated by commas:");
var userArray = input.split(',').map(Number);

// Call the sorting function
bubbleSortDescending(userArray);

// Display the sorted array
console.log("Sorted array in descending order: " + userArray.join(', '));
