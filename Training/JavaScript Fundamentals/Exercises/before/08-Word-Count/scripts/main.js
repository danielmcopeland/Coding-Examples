function wordCount(string) {
    let words = string.split(' ');
    return words.length;
}

let s1 = "Don't go chasing waterfalls.";
let s2 = "this is a sample sentence?";
let s3 = "check this one";
console.log(wordCount(s1));
console.log(wordCount(s2));
console.log(wordCount(s3));