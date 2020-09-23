public class FindMaximum {
    public Integer maximumNumber(Integer firstnumber, Integer secondnumber, Integer thirdnumber){
        Integer maxnumber = firstnumber;
        if(secondnumber.compareTo(maxnumber)>0){
            maxnumber = secondnumber;
        }
        if(thirdnumber.compareTo(maxnumber)>0){
            maxnumber = thirdnumber;
        }
        return maxnumber;
    }

}
