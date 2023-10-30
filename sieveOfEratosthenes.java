function sieveOfEratosthenes(n) {
    // Create an array to mark prime numbers
    const isPrime = new Array(n + 1).fill(true);

    // 0 and 1 are not prime numbers
    isPrime[0] = isPrime[1] = false;

    // Mark non-prime numbers
    for (let p = 2; p * p <= n; p++) {
        if (isPrime[p]) {
            for (let i = p * p; i <= n; i += p) {
                isPrime[i] = false;
            }
        }
    }

    // Create an array to store the prime numbers
    const primes = [];
    for (let i = 2; i <= n; i++) {
        if (isPrime[i]) {
            primes.push(i);
        }
    }

    return primes;
}

const n = 100; // Change this to the desired upper limit
const primeNumbers = sieveOfEratosthenes(n);
console.log(`Prime numbers up to ${n}:`);
console.log(primeNumbers);
