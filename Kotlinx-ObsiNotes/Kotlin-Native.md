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
> Task :nativeBenchmark
Running 'main' benchmarks for 'native'

ΓÇª benchmarks.BenchmarkTest.benchmarkMethod
Warm-up #0: 1,691,030 ops/sec
Warm-up #1: 1,718,305 ops/sec
Warm-up #2: 1,704,898 ops/sec
Warm-up #3: 1,709,078 ops/sec
Warm-up #4: 1,682,881 ops/sec
Iteration #0: 1,806,385 ops/sec
Iteration #1: 1,759,935 ops/sec
Iteration #2: 1,659,546 ops/sec
Iteration #3: 1,718,867 ops/sec
Iteration #4: 1,749,906 ops/sec
  Success:   ~ 1,738,928 ops/sec ┬▒2.7%

native summary:
Benchmark                       Mode  Cnt        Score       Error    Units
BenchmarkTest.benchmarkMethod  thrpt    5  1738928.480 ┬▒ 47640.730  ops/sec
```
	
# Linux Output

```
> Task :nativeBenchmark
Running 'main' benchmarks for 'native'

… benchmarks.BenchmarkTest.benchmarkMethod
Warm-up #0: 4,079,576 ops/sec
Warm-up #1: 4,080,668 ops/sec
Warm-up #2: 4,085,502 ops/sec [1m 24s]
Warm-up #3: 4,109,227 ops/sec
Warm-up #4: 4,102,757 ops/sec
Iteration #0: 5,018,928 ops/sec
Iteration #1: 5,027,737 ops/sec
Iteration #2: 5,019,901 ops/sec
Iteration #3: 5,032,177 ops/sec
Iteration #4: 5,035,417 ops/sec
  Success:   ~ 5,026,832 ops/sec ±0.13%

native summary:
Benchmark                       Mode  Cnt        Score      Error    Units
BenchmarkTest.benchmarkMethod  thrpt    5  5026832.374 ± 6405.333  ops/sec
```
