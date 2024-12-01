class ChineseRemainderTheorem {
  public static int[] euclidean(int a, int b) {
    if (b > a) {
      int[] coeffs = euclidean(b, a);
      int[] output = {coeffs[1], coeffs[0]};
      return output;
    }
  }
}
