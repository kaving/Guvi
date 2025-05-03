// How would you implement a shuffle() ?

// When passed with an array, it should modify the array inline to generate a randomly picked permutation at the same probability.

// for an array like this:

// const arr = [1, 2, 3, 4]
// there would be possibly 4! = 24 permutations

// [1, 2, 3, 4]
// [1, 2, 4, 3]
// [1, 3, 2, 4]
// [1, 3, 4, 2]
// [1, 4, 2, 3]
// [1, 4, 3, 2]
// [2, 1, 3, 4]
// [2, 1, 4, 3]
// [2, 3, 1, 4]
// [2, 3, 4, 1]
// [2, 4, 1, 3]
// [2, 4, 3, 1]
// [3, 1, 2, 4]
// [3, 1, 4, 2]
// [3, 2, 1, 4]
// [3, 2, 4, 1]
// [3, 4, 1, 2]
// [3, 4, 2, 1]
// [4, 1, 2, 3]
// [4, 1, 3, 2]
// [4, 2, 1, 3]
// [4, 2, 3, 1]
// [4, 3, 1, 2]
// [4, 3, 2, 1]
// your shuffle() should transform the array in one of the above array, at the same 1/24 probability.  // walmart question
const arr = [1, 2, 3, 4, 5];
function shuffle(){
    for(let i=arr.length-1;i>0;i--){
        const randIdx=Math.floor(Math.random()*(i+1));
        const storedItem=arr[i];
        arr[i]=arr[randIdx];
        arr[randIdx]=storedItem;
    }
return arr;
}

shuffle()// -> [1

// Example usage:

shuffle(arr);
console.log(arr); // The array is now shuffled in place
shuffle(arr);
console.log(arr); // The array is now shuffled in place
shuffle(arr);
console.log(arr); // The array is now shuffled in place
shuffle(arr);
console.log(arr); // The array is now shuffled in place