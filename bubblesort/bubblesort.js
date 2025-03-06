function bubblesort(arr) {
    let len = arr.length;
    let sorted = false;

    while (!sorted) {
        sorted = true;
        for (let i = 0; i < len - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                [arr[i], arr[i + 1]] = ([arr[i + 1], arr[i]]);// Swap usando destructuring
                sorted = false;
            }
        }
    }
    return arr;
}

console.log(bubblesort([4,6,8,3,2,5,7,10]));