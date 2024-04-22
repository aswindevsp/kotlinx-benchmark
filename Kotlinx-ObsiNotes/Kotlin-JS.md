```kotlin
@State(Scope.Benchmark)  
class BenchmarkTest {  
    private val size = 10  
    private val list = ArrayList<Int>()  
  
    @Setup  
    fun prepare() {  
        for (i in 0..<size) {  
            list.add(i)  
        }  
    }  
  
    @TearDown  
    fun cleanup() {  
        list.clear()  
    }  
  
    @Benchmark  
    fun benchmarkMethod(): Int {  
        return list.sum()  
    }  
}

```

# Windows output: 

```
> Task :jsBenchmark
Running 'main' benchmarks for 'js'

ΓÇª org.example.BenchmarkTest.benchmarkMethod
Iteration #0: 86,956.5 ops/sec
Iteration #1: 1,32,30,691 ops/sec
Iteration #2: 1,99,69,729 ops/sec
Iteration #3: 2,09,24,996 ops/sec
Iteration #4: 2,06,07,687 ops/sec
Iteration #5: 1,96,44,937 ops/sec
Iteration #6: 2,00,11,679 ops/sec
Iteration #7: 2,00,03,429 ops/sec
Iteration #8: 1,99,74,519 ops/sec
Consumed blackhole value: 0
  Success:   ~ 2,00,48,451 ops/sec ┬▒1.5%

js summary:
Benchmark                       Mode  Cnt         Score        Error    Units
BenchmarkTest.benchmarkMethod  thrpt    5  20048450.504 ┬▒ 305034.642  ops/sec


[
  {
    "benchmark" : "org.example.BenchmarkTest.benchmarkMethod",
    "mode" : "thrpt",
    "warmupIterations" : 5,
    "warmupTime" : "10 sec",
    "measurementIterations" : 5,
    "measurementTime" : "10 sec",
    "params" : {
          
    },
    "advanced" : {
          
    },
    "primaryMetric" : {
       "score": 21973530.398504574,
       "scoreError": 179535.6872029185,
       "scoreConfidence" : [
          21793994.711301655,
          22153066.085707493
       ],
       "scorePercentiles" : {
          "0.00" : 21868022.965089165,
          "25.00" : 21874625.287221774,
          "50.00" : 21888216.08787879,
          "75.00" : 22115092.66510026,
          "90.00" : 22339592.898536325,
          "99.00" : 22339592.898536325,
          "99.90" : 22339592.898536325,
          "99.99" : 22339592.898536325,
          "100.00" : 22339592.898536325
       },
       "scoreUnit" : "ops/sec",
       "rawData" : [
           [
             21888216.08787879,
             21881227.609354384,
             21868022.965089165,
             22339592.898536325,
             21890592.431664195
           ]
       ]
    },
    "secondaryMetrics" : {
    }
  }
]

```

# Linux Output: 

```
> Task :jsBenchmark
Running 'main' benchmarks for 'js'

… org.example.BenchmarkTest.benchmarkMethod
Iteration #0: 78,132.3 ops/sec
Iteration #1: 8,577,087 ops/sec
Iteration #2: 9,741,338 ops/sec
Iteration #3: 9,746,235 ops/sec
Iteration #4: 9,754,349 ops/sec
Iteration #5: 9,754,166 ops/sec
Iteration #6: 9,776,091 ops/sec
Iteration #7: 9,747,836 ops/sec
Iteration #8: 9,770,141 ops/sec
Iteration #9: 9,773,985 ops/sec
Iteration #10: 9,759,475 ops/sec
Consumed blackhole value: 0
  Success:   ~ 9,761,121 ops/sec ±0.098%

js summary:
Benchmark                       Mode  Cnt        Score      Error    Units
BenchmarkTest.benchmarkMethod  thrpt    5  9761120.583 ± 9546.011  ops/sec



[
  {
    "benchmark" : "org.example.BenchmarkTest.benchmarkMethod",
    "mode" : "thrpt",
    "warmupIterations" : 5,
    "warmupTime" : "10 sec",
    "measurementIterations" : 5,
    "measurementTime" : "10 sec",
    "params" : {

    },
    "advanced" : {

    },
    "primaryMetric" : {
       "score": 9742721.141214693,
       "scoreError": 23348.780434597033,
       "scoreConfidence" : [
          9719372.360780096,
          9766069.92164929
       ],
       "scorePercentiles" : {
          "0.00" : 9700998.000402367,
          "25.00" : 9716673.45050429,
          "50.00" : 9752716.19997991,
          "75.00" : 9763771.302542483,
          "90.00" : 9765131.020240445,
          "99.00" : 9765131.020240445,
          "99.90" : 9765131.020240445,
          "99.99" : 9765131.020240445,
          "100.00" : 9765131.020240445
       },
       "scoreUnit" : "ops/sec",
       "rawData" : [
           [
             9700998.000402367,
             9732348.900606213,
             9762411.584844522,
             9752716.19997991,
             9765131.020240445
           ]
       ]
    },
    "secondaryMetrics" : {
    }
  }
]a
```