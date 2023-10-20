// var array=[1,2,3,4,5,6,7]
var array=[23,4345,32423,23423,232,4]
// console.log(array)

//just use the bubble sort and swap while next is greater than previous

for(let i=0;i<array.length;i++){
    for(let j=0;j<array.length;j++){
        if(array[j]<array[j+1]){
            //swap
            let temp=array[j]
            array[j]=array[j+1]
            array[j+1]=temp
        }
    }
    
}

console.log(array)
