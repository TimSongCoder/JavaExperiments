public class HexFormatDemo{
  public static void main(String[] args) {
    byte byteChar = 110;
    System.out.println(String.format("%02X", byteChar)); // Output --> 6E; 110/16=6with remainder14:)
  }
}
