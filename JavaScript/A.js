// Online Javascript Editor for free Write, Edit and Run your Javascript 
// code using JS Online compiler console.log("Welcome to Programiz!");
var sentence ="This is a sunny day"
// console.log(sentence) split those words and store in arrays
var arr=sentence.split(" ")

 console.log(arr);
//take every  word and reverse it
let final_sentence=""
for(let i=0;i<arr.length;i++){
    let word=arr[i];
//   console.log( reverse(word))
final_sentence+=reverse(word)+ " "
}
console.log(final_sentence.trim())
function reverse(word){
    let toreverse=word
    // console.log(word)
    let reverse=""
    for(let j=word.length;j>=0;j--){
        reverse+=word.charAt(j)
    }
    return reverse
}
