public class FindMaximum {

    public Integer maximumNumber(Integer firstnumber, Integer secondnumber, Integer thirdnumber) {
        Integer maxnumber = firstnumber;
        if (secondnumber.compareTo(maxnumber) > 0) {
            maxnumber = secondnumber;
        }
        if (thirdnumber.compareTo(maxnumber) > 0) {
            maxnumber = thirdnumber;
        }
        return maxnumber;
    }

    public Double maximumFloat(Double firstfloat, Double secondfloat, Double thirdfloat) {
        Double maxfloat = firstfloat;
        if (secondfloat.compareTo(maxfloat) > 0) {
            maxfloat = secondfloat;
        }
        if (thirdfloat.compareTo(maxfloat) > 0) {
            maxfloat = thirdfloat;
        }
        return maxfloat;
    }

}
