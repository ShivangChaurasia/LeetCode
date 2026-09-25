/**
 * @param {number} num
 * @return {number}
 */
var numberOfSteps = function(num) {
    var count=0;
    while(num>0){
        if(num%2==0){
            count++;
            num/=2;
        }else{
            count++;
            num-=1;
        }
    }
    return count;
};