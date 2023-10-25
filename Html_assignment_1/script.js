let displayValue = '';

function appendToDisplay(value) {
    displayValue += value;
    document.getElementById('display').value = displayValue;
}

function resetDisplay() {
    displayValue = '';
    document.getElementById('display').value = displayValue;
}

function calculateResult() {
    let numbers = displayValue.split(/[-+*/]/);
    let operators = displayValue.replace(/[0-9.]/g, '').split('');
    let result = parseFloat(numbers[0]);

    for (let i = 0; i < operators.length; i++) {
        let number = parseFloat(numbers[i + 1]);

        if (operators[i] === '+') {
            result += number;
        } else if (operators[i] === '-') {
            result -= number;
        } else if (operators[i] === '*') {
            result *= number;
        } else if (operators[i] === '/') {
            if (number !== 0) {
                result /= number;
            } else {
                alert("Cannot divide by zero!");
                resetDisplay();
                return;
            }
        }
    }

    document.getElementById('display').value = result;
    displayValue = result.toString();
}
