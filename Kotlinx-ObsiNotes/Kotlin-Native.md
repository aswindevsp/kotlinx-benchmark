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
> Task :mainBenchmark
Running 'main' benchmarks for 'main'

∩┐╜ org.jetbrains.kotlinx.benchmark.examples.BenchmarkTest.benchmarkMethod

Warm-up 1: 84306147.313 ops/s
Warm-up 2: 89055892.507 ops/s
Warm-up 3: 98447470.422 ops/s
Warm-up 4: 99010974.012 ops/s
Warm-up 5: 98372004.876 ops/s
Iteration 1: 98956735.837 ops/s
Iteration 2: 97590669.757 ops/s
Iteration 3: 98853542.853 ops/s
Iteration 4: 98529852.735 ops/s
Iteration 5: 98217122.116 ops/s

  Success: 98429584.659 ∩┐╜(99.9%) 2123623.273 ops/s [Average]
  (min, avg, max) = (97590669.757, 98429584.659, 98956735.837), stdev = 551498.220
  CI (99.9%): [96305961.386, 100553207.933] (assumes normal distribution)


main summary:
Benchmark                       Mode  Cnt         Score         Error  Units
BenchmarkTest.benchmarkMethod  thrpt    5  98429584.659 ∩┐╜ 2123623.273  ops/s

```

