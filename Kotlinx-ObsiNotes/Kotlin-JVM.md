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


# Windows Result: 

```
> Task :mainBenchmark
Running 'main' benchmarks for 'main'

∩┐╜ org.jetbrains.kotlinx.benchmark.examples.BenchmarkTest.benchmarkMethod

Warm-up 1: 78575592.378 ops/s
Warm-up 2: 83868868.254 ops/s
Warm-up 3: 94644127.941 ops/s
Warm-up 4: 95152785.903 ops/s
Warm-up 5: 95970515.666 ops/s
Iteration 1: 93393987.688 ops/s
Iteration 2: 95251383.994 ops/s
Iteration 3: 93161782.708 ops/s
Iteration 4: 92501164.640 ops/s
Iteration 5: 96609128.145 ops/s

  Success: 94183489.435 ∩┐╜(99.9%) 6535195.163 ops/s [Average]
  (min, avg, max) = (92501164.640, 94183489.435, 96609128.145), stdev = 1697169.430
  CI (99.9%): [87648294.272, 100718684.598] (assumes normal distribution)


main summary:
Benchmark                       Mode  Cnt         Score         Error  Units
BenchmarkTest.benchmarkMethod  thrpt    5  94183489.435 ∩┐╜ 6535195.163  ops/s

```

# Linux Result:

```
> Task :mainBenchmark
Running 'main' benchmarks for 'main'

… org.jetbrains.kotlinx.benchmark.examples.BenchmarkTest.benchmarkMethod

Warm-up 1: 43495443.705 ops/s
Warm-up 2: 44793914.338 ops/s
Warm-up 3: 51253788.722 ops/s
Warm-up 4: 51357176.416 ops/s
Warm-up 5: 51333665.564 ops/s
Iteration 1: 51395355.584 ops/s
Iteration 2: 51430696.500 ops/s
Iteration 3: 51399596.068 ops/s
Iteration 4: 51396827.898 ops/s
Iteration 5: 51413971.018 ops/s

  Success: 51407289.413 ±(99.9%) 57874.508 ops/s [Average]
  (min, avg, max) = (51395355.584, 51407289.413, 51430696.500), stdev = 15029.826
  CI (99.9%): [51349414.905, 51465163.922] (assumes normal distribution)


main summary:
Benchmark                       Mode  Cnt         Score       Error  Units
BenchmarkTest.benchmarkMethod  thrpt    5  51407289.413 ± 57874.508  ops/s
```
