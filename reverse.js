function reverseWords(sentence) {
    let reversedSentence = '';
    let word = '';
    for (let i = 0; i < sentence.length; i++) {
        if (sentence[i] === ' ' || i === sentence.length - 1) {
            if (i === sentence.length - 1) {
            word += sentence[i];
            }
            for (let j = word.length - 1; j >= 0; j--) {
            reversedSentence += word[j];
            }
            if (i !== sentence.length - 1) {
            reversedSentence += ' ';
            }
            word = '';
         } else {
            word += sentence[i];
        }
    }
return reversedSentence;
}

const sentence = "i am robot hello world"
const reversedSentence = reverseWords(sentence);
console.log(reversedSentence);