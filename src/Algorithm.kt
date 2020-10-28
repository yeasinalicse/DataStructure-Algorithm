//fun main(args: Array<String>) {
//    val nums = arrayOf(1, 2, 3, 4, 5)
//    val algorithm = AllAlgorithm()
//    var searchValue = 5
//    var linearSearchResultValue: Int? = algorithm.linearSearchByValue(nums, searchValue)
//    var binaryResultvalue: Int? = algorithm.binarySearchByValue(nums, searchValue)
//
//
//    if (linearSearchResultValue != null) {
//        if (linearSearchResultValue >= 0) {
//            print("index -> " + linearSearchResultValue + ", Value-> " + nums[linearSearchResultValue])
//        } else {
//            print("Search Value not found !!!")
//        }
//    }
//
//}
//
class AllAlgorithm {
    fun linearSearchByValue(nums: Array<Int>, searchValue: Int): Int? {
        for (i in nums.indices) {
            if (nums[i] == searchValue) {
                return i
            }
        }
        return -1
    }


    fun binarySearchByValue(nums: Array<Int>, searchValue: Int): Int? {
        var firstLoop: Int?
        var secondLoop: Int?
        var minIndex: Int?
        var tempValue: Int?
        firstLoop =0;



        return -1
    }

    fun selectionShortBy0Value(nums: Array<Int>, searchValue: Int): Int? {
        var left: Int?
        var right: Int?
        var mid: Int?
        left = 0


        return -1
    }
}