// Java Program for Converting byte
// array to a long value

class GFG {

    // A utility function that returns
    // long value from a byte array
    static long convertToLong(byte[] bytes)
    {
        long value = 0l;

        // Iterating through for loop
        for (byte b : bytes) {
            // Shifting previous value 8 bits to right and
            // add it with next value
            value = (value << 8) + (b & 255);
        }

        return value;
    }

    // Driver code
    public static void main(String[] args)
    {
        byte[] byte_array
                = new byte[] { (byte)0x1, (byte)0x2, (byte)0x3,
                (byte)0x4 };

        // Printing the required Byte Array
        System.out.print("Byte Array : ");
        for (int i = 0; i < byte_array.length; i++) {
            System.out.print(byte_array[i] + " ");
        }
        System.out.println();

        // Finding long value through the approach discussed
        long ans = convertToLong(byte_array);

        // Now compare OUTPUT_VALUE and value and you
        // will find both are equal
        System.out.println("Long value in hex string: "
                + Long.toHexString(ans));
    }
}
