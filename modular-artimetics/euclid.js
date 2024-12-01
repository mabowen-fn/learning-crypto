function euclid(a, b) {
  while(b != 0) {
    remainder = a % b;
    a = b;
    b = remainder;
  }
  return a;
}

console.log(euclid(4, 8));
