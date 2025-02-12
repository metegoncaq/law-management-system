import java.util.Scanner;

/**
 * It's a utility class that contains methods for reading input from the console
 */
public final class Utils {
    private Utils(){}

    public static final String ROOT_DIR = getRootDirectoryPath();

    public static final String INVALID_INPUT = "Invalid input!";
    public static final String INVALID_CHOICE = "Invalid choice!";

    private static final Scanner scanner = new Scanner(System.in);

    public static int readIntegerInput() throws NumberFormatException {
        String line = scanner.nextLine();
        return Integer.parseInt(line);
    }

    public static String readStringInput() {
        return scanner.nextLine();
    }

    public static boolean readBooleanInput() {
        String line = scanner.nextLine();
        return Boolean.parseBoolean(line);
    }

    private static String getRootDirectoryPath() {
        final String workingDirectoryPath = System.getProperty("user.dir");
        final String rootDirectoryName = "law-management-system";

        int rdNameIndex = workingDirectoryPath.lastIndexOf(rootDirectoryName);
        int rdNameLastCharIndex = rdNameIndex + rootDirectoryName.length();

        return workingDirectoryPath.substring(0, rdNameLastCharIndex);
    }
}
