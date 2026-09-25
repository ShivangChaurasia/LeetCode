/**
 * @param {number} num
 * @return {number}
 */

var addDigits = function(num) {
    if(num<10){
        return num;
    }
    
    var sum = 0;
    while(num>0){
        var n1 = num%10;
        sum+=n1;
        num= Math.floor(num/10);
    }

    return addDigits(sum);
};