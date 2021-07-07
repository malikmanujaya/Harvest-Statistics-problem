object harvestStatgroup46 extends App{
  var array = Array.ofDim[Int](4,7)
  var maxweek = 0
  var maxday = 0
  var minweek = 0
  var minday = 0
  var total = 0
  var count = 0
  array(0)(0) = 10000
  array(0)(1) = 20000
  array(0)(2) = 30000
  array(0)(3) = 25000
  array(0)(4) = 50000
  array(0)(5) = 12500
  array(0)(6) = 21000
  array(1)(0) = 11000
  array(1)(1) = 23000
  array(1)(2) = 13000
  array(1)(3) = 45000
  array(1)(4) = 15000
  array(1)(5) = 17000
  array(1)(6) = 28000
  array(2)(0) = 32000
  array(2)(1) = 20000
  array(2)(2) = 22000
  array(2)(3) = 17500
  array(2)(4) = 11300
  array(2)(5) = 9200
  array(2)(6) = 22000
  array(3)(0) = 26000
  array(3)(1) = 17800
  array(3)(2) = 31000
  array(3)(3) = 40000
  array(3)(4) = 33000
  array(3)(5) = 28500
  array(3)(6) = 30500

  var max = array(0)(0)
  var min = array(0)(0)

  for(i<-0 to 3){
    for(j<-0 to 6){
      total+=array(i)(j)
      if(array(i)(j)>max){
        max=array(i)(j)
        maxweek = i
        maxday = j
      }
      if(array(i)(j)<min){
        min=array(i)(j)
        minweek = i
        minday = j
      }
      count=count+1
    }
  }

  print("The maximum harvest is "+max+" Rupees and it occurs in day "+maxday+" of week "+maxweek)
  print(".\n")
  print("The minimum harvest is : "+min+" Rupees and it occurs in day "+minday+" of week "+minweek)
  print(".\n")
  var range = max - min
  print("The range is : "+range)
  print(".\n")
  var avg = total/count
  print("The average is : "+avg)
  print(".\n")
}
