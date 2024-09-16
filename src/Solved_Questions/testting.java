package Solved_Questions;

import java.util.*;

public class testting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first line (might contain some unrelated value)
        String skipLine = scanner.nextLine();  // Ignored in our case

        // Collect the actual binary input lines
        List<String> binaryHeader = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (!line.isEmpty()) {
                binaryHeader.add(line);
            }
        }

        // Check if there are exactly 3 input lines
        if (binaryHeader.size() != 3) {
            System.out.println("Invalid input");
        } else {
            // Parse the 3 lines
            String[] binaryArray = binaryHeader.toArray(new String[0]);
            List<String> result = Result.parseIPHeader(binaryArray);

            // Print the result
            for (String line : result) {
                System.out.println(line);
            }
        }

        scanner.close();
    }
}

class Result {
    public static List<String> parseIPHeader(String[] binaryHeader) {
        List<String> result = new ArrayList<>();

        // Extract Version (bits 0-3)
        String versionBits = binaryHeader[0].substring(0, 4);
        int version = Integer.parseInt(versionBits, 2);

        // Extract Protocol (bits 4-12)
        String protocolBits = binaryHeader[0].substring(4, 13);
        int protocolValue = Integer.parseInt(protocolBits, 2);
        String protocol = protocolValue == 6 ? "TCP" : protocolValue == 17 ? "UDP" : "Unknown";

        // Extract Time to Live (bits 13-20)
        String ttlBits = binaryHeader[0].substring(13, 21);
        int ttl = Integer.parseInt(ttlBits, 2);

        // Extract Packet Length (bits 21-31)
        String packetLengthBits = binaryHeader[0].substring(21, 32);
        int packetLength = Integer.parseInt(packetLengthBits, 2);

        // Extract Source IP Address (split 32 bits into 4 octets)
        String sourceBits = binaryHeader[1];
        String sourceIP = convertToIPAddress(sourceBits);

        // Extract Destination IP Address (split 32 bits into 4 octets)
        String destinationBits = binaryHeader[2];
        String destinationIP = convertToIPAddress(destinationBits);

        // Add formatted information to the result list
        result.add(version + "," + protocol + "," + ttl + "," + packetLength);
        result.add(sourceIP);
        result.add(destinationIP);

        return result;
    }

    // Helper method to convert a 32-bit binary string into an IP address
    private static String convertToIPAddress(String binaryString) {
        StringBuilder ip = new StringBuilder();
        for (int i = 0; i < 32; i += 8) {
            String octet = binaryString.substring(i, i + 8);
            ip.append(Integer.parseInt(octet, 2));
            if (i < 24) ip.append(".");
        }
        return ip.toString();
    }
}
