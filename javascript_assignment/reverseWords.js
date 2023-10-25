//A. Take a sentence as an input and reverse every word in that sentence.
//a. Example - This is a sunny day > shiT si a ynnus yad. 
function reverseWordsInSentence(sentence) {
    let words = sentence.split(' ');
    let reversedWords = [];

    for (let word of words) {
        let reversedWord = '';
        for (let i = word.length - 1; i >= 0; i--) {
            reversedWord += word[i];
        }
        reversedWords.push(reversedWord);
    }

    let reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

const inputSentence = prompt("Enter a sentence:");
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log("Reversed Sentence: " + reversedSentence);
